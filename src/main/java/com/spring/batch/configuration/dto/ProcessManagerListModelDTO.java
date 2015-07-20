/**
 * 
 */
package com.spring.batch.configuration.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vickrame
 *
 */
// @Component
public class ProcessManagerListModelDTO {

	public static List<ModelDTO> listemItem = new ArrayList<ModelDTO>();

	public static void alimente(ModelDTO item) {

		listemItem.add(item);
	}

	public static List<ModelDTO> returnList() {
		return listemItem;
	}

	public static ModelDTO getItem(int index) {
		return listemItem.get(index);
	}
}
