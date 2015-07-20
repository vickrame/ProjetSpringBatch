/**
 * 
 */
package com.spring.batch.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author vickrame
 *
 */
@ComponentScan
// @EnableAutoConfiguration
public class LancherMain {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(
				ConfigurationLancher.class, args);

		// SpringApplication.run(LancherMain.class, args);
		// System.exit(SpringApplication.exit(SpringApplication.run(
		// ConfigurationLancher.class, args)));
	}
}
