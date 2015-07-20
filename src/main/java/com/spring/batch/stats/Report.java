/**
 * 
 */
package com.spring.batch.stats;

import java.util.Date;
import java.util.List;

/**
 * @author vickrame
 *
 */
public class Report {

	private Date dateDebut;
	private Date Fin;

	private List<ReportJob> jobReport;

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut
	 *            the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return Fin;
	}

	/**
	 * @param fin
	 *            the fin to set
	 */
	public void setFin(Date fin) {
		Fin = fin;
	}

	/**
	 * @return the jobReport
	 */
	public List<ReportJob> getJobReport() {
		return jobReport;
	}

	/**
	 * @param jobReport
	 *            the jobReport to set
	 */
	public void setJobReport(List<ReportJob> jobReport) {
		this.jobReport = jobReport;
	}

}
