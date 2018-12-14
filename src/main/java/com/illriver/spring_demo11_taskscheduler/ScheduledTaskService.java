package com.illriver.spring_demo11_taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 计划任务执行类
 * @author Pactera
 *
 */
@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每五秒执行一次 "+ dateFormat.format(new Date()));
		
	}
	
	@Scheduled(cron = "0 28 11 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间 "+dateFormat.format(new Date())+"执行");
	}
}
