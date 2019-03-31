package site.bianma.springcloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 10:30
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
	}
}
