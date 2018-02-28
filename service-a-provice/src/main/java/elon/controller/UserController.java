package elon.controller;

import elon.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//指示Config客户端在服务器参数刷新时，也刷新注入的属性值
//@RefreshScope
@Controller
@RequestMapping("/user")
public class UserController {

    @Value("${application_name}")
    String application_name;

    @RequestMapping("/getUserByName")
    @ResponseBody
    public User getUserByName(String name) {
        User user = new User();
        user.setApplication_name(application_name);
        user.setName(name);
        user.setSex(1);
        user.setAge(22);
        return user;
    }

}
