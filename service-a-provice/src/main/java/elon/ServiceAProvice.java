package elon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAProvice {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAProvice.class);
        System.out.println("服务提供者A启动完成...");
    }

    //默认从properties文件里面加载内容
    //这个方法可有可无,只是为了验证可以从属性文件中获取信息
    @Autowired
    void setEnviroment(Environment env) {
        String name = env.getProperty("application_name");
        System.out.println("默认从properties文件中读取属性,application_name=" + name);
    }
}
