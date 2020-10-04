package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuditDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Audit
 */
@DAO(daoClass = AuditDAO.class)
@Caption("{%ip}")
@Entity
@Table(name = "AUDITS", schema = "BCA_MOTO")
public class Audit implements java.io.Serializable {

	private long id;
	private Long thamSoTcId;
	private String ip;
	private String tableName;
	private Long tableId;
	private String operation;
	private String oldValue;
	private String newValue;
	private Long userId;
	private Date entryDate;

	public Audit() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("ThamSoTcId")
	@Column(name = "THAM_SO_TC_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getThamSoTcId() {
		return this.thamSoTcId;
	}

	public void setThamSoTcId(Long thamSoTcId) {
		this.thamSoTcId = thamSoTcId;
	}

	@Caption("Ip")
	@Column(name = "IP", columnDefinition = "VARCHAR2", length = 50)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Caption("TableName")
	@Column(name = "TABLE_NAME", columnDefinition = "VARCHAR2", length = 50)
	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Caption("TableId")
	@Column(name = "TABLE_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getTableId() {
		return this.tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	@Caption("Operation")
	@Column(name = "OPERATION", columnDefinition = "VARCHAR2", length = 50)
	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Caption("OldValue")
	@Column(name = "OLD_VALUE", columnDefinition = "VARCHAR2", length = 2000)
	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	@Caption("NewValue")
	@Column(name = "NEW_VALUE", columnDefinition = "VARCHAR2", length = 2000)
	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Caption("UserId")
	@Column(name = "USER_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Caption("EntryDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "ENTRY_DATE", columnDefinition = "DATE", length = 7)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

}
