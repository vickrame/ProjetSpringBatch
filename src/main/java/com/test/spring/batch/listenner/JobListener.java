/**
 * 
 */
package com.test.spring.batch.listenner;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @author vickrame
 *
 */
public class JobListener implements JobExecutionListener {

	public void afterJob(JobExecution arg0) {
		System.out.println("Apres");

	}

	public void beforeJob(JobExecution arg0) {
		System.out.println("Avant");
	}

}
