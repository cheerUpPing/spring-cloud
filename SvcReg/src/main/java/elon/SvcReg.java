package elon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//spingboot项目必加的注解
@SpringBootApplication
//表明是服务注册中心
@EnableEurekaServer
public class SvcReg {

    public static void main(String[] args) {
        SpringApplication.run(SvcReg.class);
        System.out.println("服务注册中心启动完成...");
    }
}
