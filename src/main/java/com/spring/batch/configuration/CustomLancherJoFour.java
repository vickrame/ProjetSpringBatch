/**
 * 
 */
package com.spring.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vickrame
 *
 */
// @ComponentScan(basePackages = { "com.spring.batch.configuration",
// "com.spring.batch.configuration.dto",
// "com.spring.batch.configuration.process",
// "com.spring.batch.configuration.transformer" })
public class CustomLancherJoFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] springConfig = { "config/job/xml/mongo/JobLectureFichierMongo.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(
				springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("reportJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");
	}

}
