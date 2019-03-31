package site.bianma.springcloud.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户服务
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:16
 */
@FeignClient(name = "provider", fallback = UserServiceFallback.class)
public interface UserService {
	@RequestMapping("/users")
	String hello(@RequestParam String name);
}
