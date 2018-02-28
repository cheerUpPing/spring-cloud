package elon.controller.other_service_hystric;

import elon.entity.User;
import elon.other_service.UserService;
import org.springframework.stereotype.Component;

/**
 * 调用其他服务的断路由
 */
@Component
public class UserServiceHystric implements UserService {
    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setName("sorry" + name);
        return user;
    }
}
