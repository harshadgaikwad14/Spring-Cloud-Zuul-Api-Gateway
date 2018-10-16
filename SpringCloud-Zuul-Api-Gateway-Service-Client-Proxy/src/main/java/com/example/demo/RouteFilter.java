package com.example.demo;
 
import com.netflix.zuul.ZuulFilter;
 
public class RouteFilter extends ZuulFilter {
 
  @Override
  public String filterType() {
	  System.out.println("RouteFilter - filterType ");
    return "route";
  }
 
  @Override
  public int filterOrder() {
	  System.out.println("RouteFilter - filterOrder ");
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
	  System.out.println("RouteFilter - shouldFilter ");
    return true;
  }
 
  @Override
  public Object run() {
	  System.out.println("RouteFilter - run ");
    return null;
  }
}