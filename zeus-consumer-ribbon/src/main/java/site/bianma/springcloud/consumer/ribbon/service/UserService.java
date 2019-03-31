package site.bianma.springcloud.consumer.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 用户服务
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:16
 */
@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;

	public String hello(String name) {
		return restTemplate.getForObject("http://provider/users?name=" + name, String.class);
	}
}
