/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "service_log", schema = "cattle")
public interface ServiceLog extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.service_log.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.service_log.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.service_log.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.service_log.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.service_log.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.service_log.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.service_log.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.service_log.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.service_log.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.service_log.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.service_log.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.service_log.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.service_log.end_time</code>.
	 */
	public void setEndTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.service_log.end_time</code>.
	 */
	@javax.persistence.Column(name = "end_time")
	public java.util.Date getEndTime();

	/**
	 * Setter for <code>cattle.service_log.event_type</code>.
	 */
	public void setEventType(java.lang.String value);

	/**
	 * Getter for <code>cattle.service_log.event_type</code>.
	 */
	@javax.persistence.Column(name = "event_type", length = 255)
	public java.lang.String getEventType();

	/**
	 * Setter for <code>cattle.service_log.service_id</code>.
	 */
	public void setServiceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.service_log.service_id</code>.
	 */
	@javax.persistence.Column(name = "service_id", precision = 19)
	public java.lang.Long getServiceId();

	/**
	 * Setter for <code>cattle.service_log.instance_id</code>.
	 */
	public void setInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.service_log.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	public java.lang.Long getInstanceId();

	/**
	 * Setter for <code>cattle.service_log.transaction_id</code>.
	 */
	public void setTransactionId(java.lang.String value);

	/**
	 * Getter for <code>cattle.service_log.transaction_id</code>.
	 */
	@javax.persistence.Column(name = "transaction_id", length = 255)
	public java.lang.String getTransactionId();

	/**
	 * Setter for <code>cattle.service_log.sub_log</code>.
	 */
	public void setSubLog(java.lang.Boolean value);

	/**
	 * Getter for <code>cattle.service_log.sub_log</code>.
	 */
	@javax.persistence.Column(name = "sub_log", nullable = false, precision = 1)
	public java.lang.Boolean getSubLog();

	/**
	 * Setter for <code>cattle.service_log.level</code>.
	 */
	public void setLevel(java.lang.String value);

	/**
	 * Getter for <code>cattle.service_log.level</code>.
	 */
	@javax.persistence.Column(name = "level", length = 255)
	public java.lang.String getLevel();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ServiceLog
	 */
	public void from(io.cattle.platform.core.model.ServiceLog from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ServiceLog
	 */
	public <E extends io.cattle.platform.core.model.ServiceLog> E into(E into);
}