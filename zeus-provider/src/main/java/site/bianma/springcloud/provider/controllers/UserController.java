package site.bianma.springcloud.provider.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 用户
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 10:58
 */
@RestController
@RequestMapping("/users")
public class UserController {
	@RequestMapping(method = RequestMethod.GET)
	public String hello(@RequestParam String name) {
		try {
			Thread.sleep(new Random().nextInt(2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello, " + name;
	}
}
