package elon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
//配置服务器
@EnableConfigServer
@EnableEurekaClient
public class CfgServer {
    public static void main(String[] args) {
        SpringApplication.run(CfgServer.class);
        System.out.println("配置服务器已经启动...");
    }
}
