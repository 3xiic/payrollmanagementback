package co.edu.unbosque.payrollmanagementback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="config_parameters")
public class ConfigParamaterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_param_id", unique = true)
	private int vnParamId;
	@Column(name = "vn_param_key")
	private int vnParamKey;
	@Column(name = "vn_param_value")
	private int vnParamValue;
	@Column(name = "vc_description")
	private String vcDescription;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	
	public ConfigParamaterEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vnParamId
	 * @param vnParamKey
	 * @param vnParamValue
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public ConfigParamaterEntity(int vnParamId, int vnParamKey, int vnParamValue, String vcDescription, String vcCreatedAt,
			String vcUpdatedAt) {
		super();
		this.vnParamId = vnParamId;
		this.vnParamKey = vnParamKey;
		this.vnParamValue = vnParamValue;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}

	/**
	 * @return the vnParamId
	 */
	public int getVnParamId() {
		return vnParamId;
	}

	/**
	 * @param vnParamId the vnParamId to set
	 */
	public void setVnParamId(int vnParamId) {
		this.vnParamId = vnParamId;
	}

	/**
	 * @return the vnParamKey
	 */
	public int getVnParamKey() {
		return vnParamKey;
	}

	/**
	 * @param vnParamKey the vnParamKey to set
	 */
	public void setVnParamKey(int vnParamKey) {
		this.vnParamKey = vnParamKey;
	}

	/**
	 * @return the vnParamValue
	 */
	public int getVnParamValue() {
		return vnParamValue;
	}

	/**
	 * @param vnParamValue the vnParamValue to set
	 */
	public void setVnParamValue(int vnParamValue) {
		this.vnParamValue = vnParamValue;
	}

	/**
	 * @return the vcDescription
	 */
	public String getVcDescription() {
		return vcDescription;
	}

	/**
	 * @param vcDescription the vcDescription to set
	 */
	public void setVcDescription(String vcDescription) {
		this.vcDescription = vcDescription;
	}

	/**
	 * @return the vcCreatedAt
	 */
	public String getVcCreatedAt() {
		return vcCreatedAt;
	}

	/**
	 * @param vcCreatedAt the vcCreatedAt to set
	 */
	public void setVcCreatedAt(String vcCreatedAt) {
		this.vcCreatedAt = vcCreatedAt;
	}

	/**
	 * @return the vcUpdatedAt
	 */
	public String getVcUpdatedAt() {
		return vcUpdatedAt;
	}

	/**
	 * @param vcUpdatedAt the vcUpdatedAt to set
	 */
	public void setVcUpdatedAt(String vcUpdatedAt) {
		this.vcUpdatedAt = vcUpdatedAt;
	}
	
	
}
