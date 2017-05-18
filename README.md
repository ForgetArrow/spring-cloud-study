# spring-cloud-study


---
[TOC]

---

## 1. 一个基本的Spring boot应用：hello boot

## 2. 分布式配置管理服务端
+ 创建分布式配置文件存放仓库：cloud-config-repo；
+ 创建Spring Cloud配置服务器：cloud-config-server，将仓库中的配置文件转换为rest接口数据；
+ 创建一个服务使用该远程配置

## 3.Spring Cloud Netflix组件
- 1）Eureka，服务的注册和发现：提供了一个服务注册中心、服务发现的客户端及查看所有注册服务的界面；
- 2）Zuul，网关：所有客户端请求通过网关访问服务，自身也在注册中心注册；
- 3）Ribbon，负载均衡：Zuul网关将客户端请求发送给某一服务的应用时，如果该服务启动多个实例，则会通过Ribbon使用负载均衡策略发送给某一服务实例，Ribbon从Eureka注册中心获得服务和实例的列表，而不是发送每个请求时再从注册中心获得；
- 4）Feign，服务客户端：服务之间如果要相互访问，可以使用RestTemplate或FeignClient访问；
- 5）Hystrix，监控和断路器：在服务接口上添加Hystrix标签，可以实现对这个接口的监控和断路器功能，开启监控的服务会提供一个servlet接口“/hystrix.stream”，如果要监控这个服务某一方法的运行统计，在方法上加 @HystrixCommand标签；
- 6）Hystrix Dashboard，监控面板：提供界面监控各个服务商服务掉用耗时等，查看监控信息就是在Hystrix Dashboard上输入某个服务的监控“http://serviceIp:port/hystrix.stream”，就可以用图标的方式查看运行监控情况；
- 7）Turbine，监控聚合：使用Hystrix监控时，需要打开每一个服务实例查看监控信息，Turbine把所有服务实例的监控信息聚合到一个地方统一查看