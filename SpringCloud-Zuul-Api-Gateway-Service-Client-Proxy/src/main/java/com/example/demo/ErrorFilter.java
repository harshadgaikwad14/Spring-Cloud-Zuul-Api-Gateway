package com.example.demo;
 
import com.netflix.zuul.ZuulFilter;
 
public class ErrorFilter extends ZuulFilter {
 
  @Override
  public String filterType() {
	  
	  System.out.println("ErrorFilter- filterType - Inside Route Filter");
    return "error";
  }
 
  @Override
  public int filterOrder() {
	  System.out.println("ErrorFilter- filterOrder - Inside Route Filter");
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
	  System.out.println("ErrorFilter- shouldFilter - Inside Route Filter");
    return true;
  }
 
  @Override
  public Object run() {
	  System.out.println("ErrorFilter- run - Inside Route Filter"); 
    return null;
  }
}