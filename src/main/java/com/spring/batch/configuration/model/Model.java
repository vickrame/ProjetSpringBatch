/**
 * 
 */
package com.spring.batch.configuration.model;

/**
 * @author vickrame
 *
 */
public class Model extends AbstractModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2158451872238913906L;

	private String idModel;

	// private Date dateDebut;
	//
	// private Date dateFin;

	private String commentaire;

	// private int numeroPiccs;

	public Model() {

	}

	/**
	 * @return the idModel
	 */
	public String getIdModel() {
		return idModel;
	}

	/**
	 * @param idModel
	 *            the idModel to set
	 */
	public void setIdModel(String idModel) {
		this.idModel = idModel;
	}

	// /**
	// * @return the dateDebut
	// */
	// public Date getDateDebut() {
	// return dateDebut;
	// }
	//
	// /**
	// * @param dateDebut
	// * the dateDebut to set
	// */
	// public void setDateDebut(Date dateDebut) {
	// this.dateDebut = dateDebut;
	// }

	// /**
	// * @return the dateFin
	// */
	// public Date getDateFin() {
	// return dateFin;
	// }
	//
	// /**
	// * @param dateFin
	// * the dateFin to set
	// */
	// public void setDateFin(Date dateFin) {
	// this.dateFin = dateFin;
	// }

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire
	 *            the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Model [idModel=").append(idModel)
				.append(", commentaire=").append(commentaire).append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idModel == null) ? 0 : idModel.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		if (idModel == null) {
			if (other.idModel != null)
				return false;
		} else if (!idModel.equals(other.idModel))
			return false;
		return true;
	}

	// /**
	// * @return the numeroPiccs
	// */
	// public int getNumeroPiccs() {
	// return numeroPiccs;
	// }
	//
	// /**
	// * @param numeroPiccs
	// * the numeroPiccs to set
	// */
	// public void setNumeroPiccs(int numeroPiccs) {
	// this.numeroPiccs = numeroPiccs;
	// }

}
