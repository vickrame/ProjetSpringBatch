/**
 * 
 */
package com.spring.batch.configuration.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author vickrame
 *
 */
@XmlRootElement(name = "enfant")
public class Enfant {

	private String nom;

	public Enfant() {

	}

	/**
	 * @return the nom
	 */
	@XmlElement(name = "nom")
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enfant [nom=").append(nom).append("]");
		return builder.toString();
	}

}
