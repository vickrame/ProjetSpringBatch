package com.spring.batch.configuration.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.batch.configuration.dto.ModelDTO;
import com.spring.batch.configuration.model.Model;
import com.spring.batch.configuration.transformer.ModelTransformer;

@Component
public class CustomProcessor implements ItemProcessor<Model, ModelDTO> {

	private ModelTransformer modelTransform;

	@Override
	public ModelDTO process(final Model model) throws Exception {
		// TODO Auto-generated method stub
		if (modelTransform == null) {
			modelTransform = new ModelTransformer();
		}
		ModelDTO dto = null;
		if (model != null) {
			// modelTransform.setModel(model);

			dto = modelTransform.transformModelToDTO(model);

		}
		return dto;
	}

	/**
	 * @return the modelTransform
	 */
	public ModelTransformer getModelTransform() {
		return modelTransform;
	}

	/**
	 * @param modelTransform
	 *            the modelTransform to set
	 */
	@Autowired
	@Qualifier("modelTransform")
	public void setModelTransform(ModelTransformer modelTransform) {
		this.modelTransform = modelTransform;
	}

}
