package com.dubbo.liuxin;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-provider.xml"});
    	
    	context.start();
    	System.out.println("启动提供端服务");
    	
    	
    	System.in.read();
    	
    }
}
