package com.illriver.spring_demo11_taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 * @author Pactera
 *
 */
@Configuration
@ComponentScan("com.illriver.spring_demo11_taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
	
}
