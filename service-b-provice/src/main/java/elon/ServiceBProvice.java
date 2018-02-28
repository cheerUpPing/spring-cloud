package elon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceBProvice {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBProvice.class);
        System.out.println("服务提供者B启动完成...");
    }
}
