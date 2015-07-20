/**
 * 
 */
package com.spring.batch.configuration.model;

import java.io.Serializable;

/**
 * @author vickrame
 *
 */
public class Parent implements Serializable {

	private Pere pere;

	private Mere mere;

	/**
	 * @return the pere
	 */
	public Pere getPere() {
		return pere;
	}

	/**
	 * @param pere
	 *            the pere to set
	 */
	public void setPere(Pere pere) {
		this.pere = pere;
	}

	/**
	 * @return the mere
	 */
	public Mere getMere() {
		return mere;
	}

	/**
	 * @param mere
	 *            the mere to set
	 */
	public void setMere(Mere mere) {
		this.mere = mere;
	}

	public Parent() {
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
		builder.append("Parent [pere=").append(pere).append(", mere=")
				.append(mere).append("]");
		return builder.toString();
	}

}
