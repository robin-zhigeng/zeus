package site.bianma.springcloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign消费者
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:14
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
}
