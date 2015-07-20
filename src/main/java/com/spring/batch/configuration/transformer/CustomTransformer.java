package com.spring.batch.configuration.transformer;

import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

public abstract class CustomTransformer<T, Y> {

	private BoundMapperFacade<T, Y> mapper = null;
	private ClassMapBuilder<T, Y> classMapper = null;

	protected CustomTransformer(Class<T> model, Class<Y> dto) {
		final MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();

		classMapper = mapperFactory.classMap(model, dto);
		customClassMapper();
		mapper = mapperFactory.getMapperFacade(model, dto);
	}

	protected abstract void customClassMapper();

	/**
	 * @return the classMapper
	 */
	public ClassMapBuilder<T, Y> getClassMapper() {
		return classMapper;
	}

	/**
	 * @param classMapper
	 *            the classMapper to set
	 */
	public void setClassMapper(ClassMapBuilder<T, Y> classMapper) {
		this.classMapper = classMapper;
	}

	/**
	 * @return the mapper
	 */
	public BoundMapperFacade<T, Y> getMapper() {
		return mapper;
	}

	/**
	 * @param mapper
	 *            the mapper to set
	 */
	public void setMapper(BoundMapperFacade<T, Y> mapper) {
		this.mapper = mapper;
	}

}
