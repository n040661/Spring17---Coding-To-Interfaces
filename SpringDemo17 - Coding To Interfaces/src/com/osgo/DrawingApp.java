package com.osgo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// Triangle triangle = (Triangle) context.getBean("triangle");
		// triangle.draw();
		// Circle circle = (Circle) context.getBean("circle");
		// circle.draw();
		// Shape shape = (Shape) context.getBean("triangle");			// coding to interface
		Shape shape = (Shape) context.getBean("circle");
		// Shape shape = (Shape) context.getBean("shape");
		shape.draw();
		
	} // end method main

} // end Class DrawingApp
