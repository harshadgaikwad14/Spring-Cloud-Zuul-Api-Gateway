package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulApiGatewayServiceClientProxyApplication {
	
/*	
 * Service1 Url : http://localhost:8889/SpringCloud-Zuul-Api-Gateway-Service1/getService1
 * Service2 Url : http://localhost:8889/SpringCloud-Zuul-Api-Gateway-Service2/getService2
 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApiGatewayServiceClientProxyApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
