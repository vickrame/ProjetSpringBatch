/**
 * 
 */
package com.spring.batch.configuration.processor;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.configuration.dto.ModelDTO;

/**
 * @author vickrame
 *
 */
public class CustomValidModelProcessor implements
		ItemProcessor<ModelDTO, ModelDTO> {

	@Override
	public ModelDTO process(ModelDTO item) throws Exception {
		ModelDTO ret = null;
		doJob(item);
		return ret;
	}

	private void doJob(ModelDTO item) {

	}

}
