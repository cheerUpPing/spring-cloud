package elon.controller;

import elon.entity.Order;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/getOrderById")
    @ResponseBody
    public Order getOrderById(String orderId){
        Order order = new Order();
        order.setId(StringUtils.isEmpty(orderId)?0:Integer.parseInt(orderId));
        order.setPrice(200.0);
        order.setTime(new Date());
        order.setRemark("今天提交了一个订单");
        return order;
    }

}
