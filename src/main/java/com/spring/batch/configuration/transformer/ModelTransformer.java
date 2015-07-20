/**
 * 
 */
package com.spring.batch.configuration.transformer;

import org.springframework.stereotype.Component;

import com.spring.batch.configuration.dto.ModelDTO;
import com.spring.batch.configuration.model.Model;

/**
 * @author vickrame
 *
 */
@Component
public class ModelTransformer extends CustomTransformer<Model, ModelDTO> {

	// private Model model;
	// private ModelDTO dto;

	public ModelTransformer() {
		super(Model.class, ModelDTO.class);
	}

	// public ModelTransformer(Model model, ModelDTO dto) {
	// super(Model.class, ModelDTO.class);
	//
	// this.model = model;
	// this.dto = dto;
	// }

	@Override
	protected void customClassMapper() {
		getClassMapper().field("idModel", "idDTO").register();
	}

	public ModelDTO transformModelToDTO(final Model model) {
		return getMapper().map(model);
	}

	public Model transformDTOToModel(final ModelDTO dto) {
		return getMapper().mapReverse(dto);
	}

	// /**
	// * @return the model
	// */
	// public Model getModel() {
	// return model;
	// }
	//
	// /**
	// * @param model
	// * the model to set
	// */
	// public void setModel(Model model) {
	// this.model = model;
	// }
	//
	// /**
	// * @return the dto
	// */
	// public ModelDTO getDto() {
	// return dto;
	// }
	//
	// /**
	// * @param dto
	// * the dto to set
	// */
	// public void setDto(ModelDTO dto) {
	// this.dto = dto;
	// }
}
