package com.spring.batch.configuration.custom.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.batch.configuration.dto.ModelDTO;
import com.spring.batch.configuration.dto.ProcessManagerListModelDTO;

public class CustomTasklet implements Tasklet {

	private StepExecution stepExecution;

	private ProcessManagerListModelDTO recorder;

	@BeforeStep
	public void saveStepExecution(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {

		System.err.println("GOOOOOOOOOOOOOOO");
		ModelDTO dto = ProcessManagerListModelDTO.getItem(0);

		StepContext context = chunkContext.getStepContext();
		context.getStepExecution().getExecutionContext().containsKey("item");
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the recorder
	 */
	public ProcessManagerListModelDTO getRecorder() {
		return recorder;
	}

	/**
	 * @param recorder
	 *            the recorder to set
	 */
	@Autowired
	@Qualifier("recorder")
	public void setRecorder(ProcessManagerListModelDTO recorder) {
		this.recorder = recorder;
	}

}
