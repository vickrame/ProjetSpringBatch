package com.spring.batch.configuration.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.mongodb.core.mapping.Document;

@XmlRootElement(name = "root")
@Document(collection = "dataTableF")
public class FamillesRoot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3728973870633429935L;

	private List<Famille> familles;

	/**
	 * 
	 * @return the familles
	 */
	@XmlElementWrapper(name = "familles")
	@XmlElement(name = "famille", type = Famille.class)
	public List<Famille> getFamilles() {
		return familles;
	}

	public FamillesRoot() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param familles
	 *            the familles to set
	 */
	public void setFamilles(List<Famille> familles) {
		this.familles = familles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FamillesRoot [familles=").append(familles).append("]");
		return builder.toString();
	}

}