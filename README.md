# Spring Cloud脚手架项目
### 项目结构
```
zeus // 父工程
├── zeus-consumer-feign // Feign客户端
├── zeus-consumer-ribbon // Ribbon客户端
├── zeus-gateway // 新网关
├── zeus-provider // 服务提供者
├── zeus-registry // 注册中心
├── zeus-zipkin // 链路追踪
├── zeus-zuul // Zuul网关
```

### 启动顺序
> #### 1.注册中心
>
> 绑定Host：
> ```
> 127.0.0.1 peer1
> 127.0.0.1 peer2
> ```
> 启动服务：
> ```
> java -jar zeus-registry.jar --spring.profiles.active=peer1
> java -jar zeus-registry.jar --spring.profiles.active=peer2
> ```
> 访问地址：
> ```
> http://peer1:8801/
> http://peer2:8802/
> ```
> #### 2. 启动链路追踪Zipkin服务器
> 启动服务：
> ```
> java -jar zeus-zipkin.jar
> ```
> 访问地址：
> ```
> http://localhost:9001
> ```
> #### 3. 启动提供者服务
> ```
> java -jar zeus-provider.jar --spring.profiles.active=8001
> java -jar zeus-provider.jar --spring.profiles.active=8002
> ```
> #### 4. 启动消费者
> ```
> java -jar zeus-consumer-feign.jar
> java -jar zeus-consumer-ribbon.jar
> ```
> #### 5. 启动网关
> ```
> java -jar zeus-zuul.jar
> java -jar zeus-gateway.jar
> ```
> #### 6. 访问服务
> ```
> http://localhost:8005/api-a/users?name=xiaoming1 // 走Zuul网关
> http://localhost:8006/api-b/users?name=xiaoming1 // 走Gateway网关
> ```
