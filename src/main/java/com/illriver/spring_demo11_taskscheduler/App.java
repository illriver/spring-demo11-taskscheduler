package com.illriver.spring_demo11_taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
	@SuppressWarnings("unused")
	public static void main( String[] args ){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
