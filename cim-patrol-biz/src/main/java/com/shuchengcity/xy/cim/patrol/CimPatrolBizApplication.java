package com.shuchengcity.xy.cim.patrol;

import com.shuchengcity.xy.common.feign.annotation.EnableXyFeignClients;
import com.shuchengcity.xy.common.security.annotation.EnableXyResourceServer;
import com.shuchengcity.xy.common.swagger.annotation.EnableOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiMing
 * <p>
 * 项目启动类
 */
@EnableOpenApi("cim-patrol")
@EnableXyFeignClients
@EnableDiscoveryClient
@EnableXyResourceServer
@SpringBootApplication
public class CimPatrolBizApplication {
    public static void main(String[] args) {
        SpringApplication.run(CimPatrolBizApplication.class, args);
    }
}
