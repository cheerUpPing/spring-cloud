package elon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
//表明是服务网关
@EnableZuulProxy
public class ZuulGate {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGate.class);
        System.out.println("服务网关启动完成...");
    }
}
