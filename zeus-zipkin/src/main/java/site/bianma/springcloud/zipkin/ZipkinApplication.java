package site.bianma.springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * 链路追踪服务器
 *
 * @author liangrun
 * @version 1.0
 * @create 2019-03-31 11:47
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
