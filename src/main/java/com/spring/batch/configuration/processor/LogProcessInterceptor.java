/**
 * 
 */
package com.spring.batch.configuration.processor;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.configuration.model.FamillesRoot;
import com.spring.batch.configuration.model.mongo.FamilleRootMongo;

/**
 * @author vickrame
 *
 */
public class LogProcessInterceptor implements
		ItemProcessor<FamilleRootMongo, FamillesRoot> {

	@Override
	public FamillesRoot process(FamilleRootMongo item) throws Exception {
		System.err.println("trace " + item.toString());
		FamillesRoot i = new FamillesRoot();
		i.setFamilles(item.getFamilles());
		System.err.println("trace " + i);
		return (item.getFamilles() != null) ? i : null;
	}

}
