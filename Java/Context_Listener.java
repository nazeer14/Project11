package com.pack1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class Context_Listener implements ServletContextListener,ServletContextAttributeListener
{
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		System.out.println("Context Object Initialized");
		ServletContext context=sce.getServletContext();
		System.out.println("Application is deployed into : "+context.getServerInfo());
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		System.out.println("Context Object Destroyed");
	}
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae)
	{
		System.out.println("Attribute added to context object");
		String aName=scae.getName();
		System.out.println("Attribue name : "+aName);
	}
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae)
	{
		System.out.println("Attribute removed to context object");
	}
	

}
