package elon.controller;

import elon.entity.Order;
import elon.entity.User;
import elon.other_service.OrderService;
import elon.other_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 调用其他模块的服务
 */
@Controller
@RequestMapping("/consume")
public class ConsumeController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    /**
     * 调用service-a-provice模块的服务
     *
     * @param name
     * @return
     */
    @RequestMapping("/getUserFromOther")
    @ResponseBody
    public User getUserFromOther(String name) {
        User user = userService.getUserByName(name);
        return user;
    }

    /**
     * 调用service-a-provice模块的服务
     *
     * @param orderId
     * @return
     */
    @RequestMapping("/getOrderFromOther")
    @ResponseBody
    public Order getOrderFromOther(String orderId) {
        Order order = orderService.getOrderById(orderId);
        return order;
    }
}
