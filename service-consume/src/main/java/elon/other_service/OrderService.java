package elon.other_service;

import elon.controller.other_service_hystric.OrderServiceHystric;
import elon.entity.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 这里是调用其他模块的服务(传说中的微服务)
 * 加入了断路由
 */
@FeignClient(value = "service-b", fallback = OrderServiceHystric.class)
public interface OrderService {
    /**
     * 注解@RequestParam一定要,否则会造成参数丢失
     *
     * @param orderId
     * @return
     */
    @RequestMapping("/order/getOrderById")
    Order getOrderById(@RequestParam(value = "orderId") String orderId);
}
