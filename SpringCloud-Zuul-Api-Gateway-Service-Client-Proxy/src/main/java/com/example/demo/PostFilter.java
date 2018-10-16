package com.example.demo;
 
import com.netflix.zuul.ZuulFilter;
 
public class PostFilter extends ZuulFilter {
 
  @Override
  public String filterType() {
	  System.out.println("PostFilter - filterType - Inside Response Filter");
    return "post";
  }
 
  @Override
  public int filterOrder() {
	  System.out.println("PostFilter - filterOrder - Inside Response Filter");
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
	  System.out.println("PostFilter - shouldFilter - Inside Response Filter");
	  return true;
  }
 
  @Override
  public Object run() {
   System.out.println("PostFilter - run - Inside Response Filter");
 
    return null;
  }
}