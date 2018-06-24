package com.kohls.dely.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ast_dely1")
@Entity
public class AstDely {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="DELY_ID")
    Long delyId;
	
	@Column(name = "DELY_LIFECYCLE_CDE")
	String  delyLifeCycleCde;
	
	@Column(name = "ORD_EVNT_ID")
	Long orgEventId;

  /*  @Column(name = "OTB_DATE")
    Date otbDate;
    
    @Column(name = "LAST_OPTIMIZE_DATE")
    Date lastOptimizeDtae;*/

	public Long getDelyId() {
		return delyId;
	}

	public void setDelyId(Long delyId) {
		this.delyId = delyId;
	}

	public String getDelyLifeCycleCde() {
		return delyLifeCycleCde;
	}

	public void setDelyLifeCycleCde(String delyLifeCycleCde) {
		this.delyLifeCycleCde = delyLifeCycleCde;
	}

	public Long getOrgEventId() {
		return orgEventId;
	}

	public void setOrgEventId(Long orgEventId) {
		this.orgEventId = orgEventId;
	}

	/*public Date getOtbDate() {
		return otbDate;
	}

	public void setOtbDate(Date otbDate) {
		this.otbDate = otbDate;
	}

	public Date getLastOptimizeDtae() {
		return lastOptimizeDtae;
	}

	public void setLastOptimizeDtae(Date lastOptimizeDtae) {
		this.lastOptimizeDtae = lastOptimizeDtae;
	}*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
