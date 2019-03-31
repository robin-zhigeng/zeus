package site.bianma.springcloud.consumer.feign.service;

import org.springframework.stereotype.Component;

/**
 * 用户服务降级
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:26
 */
@Component
public class UserServiceFallback implements UserService {
	@Override
	public String hello(String name) {
		return "sorry, " + name;
	}
}
