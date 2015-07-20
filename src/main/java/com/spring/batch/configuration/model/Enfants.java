package com.spring.batch.configuration.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Enfants implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6340065137995778111L;

	private List<Enfant> enfants;

	/**
	 * @return the enfants
	 */
	@XmlElement(name = "enfants")
	public List<Enfant> getEnfants() {
		return enfants;
	}

	/**
	 * @param enfants
	 *            the enfants to set
	 */
	public void setEnfants(List<Enfant> enfants) {
		this.enfants = enfants;
	}
}
