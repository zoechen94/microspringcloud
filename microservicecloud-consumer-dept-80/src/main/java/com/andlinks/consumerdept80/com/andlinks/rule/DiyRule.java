package com.andlinks.consumerdept80.com.andlinks.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 先复制官网随机的Rule,然后自己动手修改，
 * 实现每一台服务轮训5次
 * ps:说是轮训，其实看的不是轮训的Rule，而是模仿RandomRule，替换其中的随机，利用算法完成
 */
public class DiyRule extends AbstractLoadBalancerRule {
    int total = 0;//总共有多少次负载，每执行一遍接口都是+1
    int current = 0;//初始0，代表当前有几个提供服务，轮训5次以后+1，但是本次项目中只有1，2，3台服务，所以每次到3要回归0

    public DiyRule() {
    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while (server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }
                if (total % 5 == 0) {
                    current++;
                    total = 0;
                    if (current % 3 == 0) {
                        current = 0;
                    }
                }
                total++;

                server = (Server) upList.get(current);
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
