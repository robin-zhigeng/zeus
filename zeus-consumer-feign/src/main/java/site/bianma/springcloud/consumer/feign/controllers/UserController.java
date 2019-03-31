package site.bianma.springcloud.consumer.feign.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.bianma.springcloud.consumer.feign.service.UserService;

/**
 * 用户服务
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:15
 */
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String hello(@RequestParam String name) {
		return userService.hello(name);
	}
}
