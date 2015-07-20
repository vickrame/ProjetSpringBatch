/**
 * 
 */
package com.spring.batch.configuration.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author vickrame
 *
 */
public class Pere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2094450270169187010L;

	private String nom;

	/**
	 * @return the nom
	 */
	@XmlAttribute(name = "prenom")
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Pere() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pere [nom=").append(nom).append("]");
		return builder.toString();
	}

}
