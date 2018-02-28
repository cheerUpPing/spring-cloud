package elon.other_service;

import elon.controller.other_service_hystric.UserServiceHystric;
import elon.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 这里是调用其他模块的服务(传说中的微服务)
 * 加入了断路由
 */
@FeignClient(value = "service-a", fallback = UserServiceHystric.class)
public interface UserService {
    /**
     * 注解@RequestParam一定要,否则会造成参数丢失
     *
     * @param name
     * @return
     */
    @RequestMapping("/user/getUserByName")
    User getUserByName(@RequestParam(value = "name") String name);
}
