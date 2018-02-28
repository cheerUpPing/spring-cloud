package elon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
//表明可以消费服务
@EnableFeignClients
@EnableHystrix
//启用断路由监控
@EnableHystrixDashboard
public class ServiceConsume {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsume.class);
        System.out.println("服务消费者启动完成...");
    }
}
