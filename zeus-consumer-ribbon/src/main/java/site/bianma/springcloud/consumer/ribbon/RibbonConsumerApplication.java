package site.bianma.springcloud.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon消费者
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
