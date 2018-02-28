package elon.controller.other_service_hystric;

import elon.entity.Order;
import elon.other_service.OrderService;
import org.springframework.stereotype.Component;

/**
 * 调用其他服务的断路由
 */
@Component
public class OrderServiceHystric implements OrderService {
    @Override
    public Order getOrderById(String orderId) {
        Order order = new Order();
        order.setRemark("sorry" + orderId);
        return order;
    }
}
