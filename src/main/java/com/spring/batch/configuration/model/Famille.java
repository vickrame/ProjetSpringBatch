package com.spring.batch.configuration.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "famille")
public class Famille implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3728973870633429935L;

	private String nom;

	private Parent parent;
	// private Enfants enfants;

	@XmlElementWrapper(name = "enfants")
	@XmlElement(name = "enfant", type = Enfant.class)
	private List<Enfant> enfants;

	/**
	 * @return the parent
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Famille() {
		super();
		// TODO Auto-generated constructor stub
	}

	// /**
	// * @return the enfants
	// */
	// public Enfants getEnfants() {
	// return enfants;
	// }

	// /**
	// * @param enfants
	// * the enfants to set
	// */
	// public void setEnfants(Enfants enfants) {
	// this.enfants = enfants;
	// }

	/**
	 * @return the nom
	 */
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
		builder.append("Famille [nom=").append(nom).append(", parent=")
				.append(parent).append(", enfants=").append(enfants)
				.append("]");
		return builder.toString();
	}

}