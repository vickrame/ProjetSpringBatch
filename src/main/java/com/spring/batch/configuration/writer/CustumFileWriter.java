package com.spring.batch.configuration.writer;

import java.util.List;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemWriter;

import com.spring.batch.configuration.dto.ModelDTO;
import com.spring.batch.configuration.dto.ProcessManagerListModelDTO;

public class CustumFileWriter implements ItemWriter<ModelDTO> {

	private StepExecution stepExecution;

	// @Autowired
	// @Qualifier("recorder")
	// private ProcessManagerListModelDTO recorder;

	@BeforeStep
	public void saveStepExecution(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}

	@Override
	public void write(List<? extends ModelDTO> items) throws Exception {
		System.out.println("ecriture de combien ? " + items.size());

		ExecutionContext executionContext = stepExecution.getExecutionContext();

		// List<ModelDTO> listModelDTO = new ArrayList<ModelDTO>();
		for (ModelDTO modelDTO : items) {
			System.out.println(modelDTO.getIdDTO());
			executionContext.put("item", modelDTO);
			// listModelDTO.add(modelDTO);
			ProcessManagerListModelDTO.alimente(modelDTO);
		}

	}

}
