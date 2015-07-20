/**
 * 
 */
package com.spring.batch.configuration.model.mongo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.spring.batch.configuration.model.Famille;

/**
 * @author vickrame
 *
 */
@Document(collection = "dataTableF")
public class FamilleRootMongo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1917476495731434300L;

	@Id
	private String id;

	private List<Famille> familles;

	/**
	 * @return the familles
	 */
	public List<Famille> getFamilles() {
		return familles;
	}

	/**
	 * @param familles
	 *            the familles to set
	 */
	public void setFamilles(List<Famille> familles) {
		this.familles = familles;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}
