package site.bianma.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import site.bianma.springcloud.zuul.filter.AccessFilter;

/**
 * Zuul
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:33
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
