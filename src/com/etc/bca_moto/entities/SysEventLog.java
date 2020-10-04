package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.SysEventLogDAO;
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
 * SysEventLog
 */
@DAO(daoClass = SysEventLogDAO.class)
@Caption("{%userName}")
@Entity
@Table(name = "SYS_EVENT_LOG", schema = "BCA_MOTO")
public class SysEventLog implements java.io.Serializable {

	private long id;
	private String userName;
	private String ipAddress;
	private String methodType;
	private String eventType;
	private Date dateCreated;
	private String nameObject;
	private String objOldData;
	private String objNewData;
	private String url;
	private String msgResult;
	private String apiType;
	private String valueKey;

	public SysEventLog() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("UserName")
	@Column(name = "USER_NAME", columnDefinition = "VARCHAR2", length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Caption("IpAddress")
	@Column(name = "IP_ADDRESS", columnDefinition = "VARCHAR2", length = 200)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Caption("MethodType")
	@Column(name = "METHOD_TYPE", columnDefinition = "VARCHAR2", length = 20)
	public String getMethodType() {
		return this.methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	@Caption("EventType")
	@Column(name = "EVENT_TYPE", columnDefinition = "VARCHAR2", length = 20)
	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Caption("DateCreated")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CREATED", columnDefinition = "TIMESTAMP(6)")
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Caption("NameObject")
	@Column(name = "NAME_OBJECT", columnDefinition = "VARCHAR2", length = 20)
	public String getNameObject() {
		return this.nameObject;
	}

	public void setNameObject(String nameObject) {
		this.nameObject = nameObject;
	}

	@Caption("ObjOldData")
	@Column(name = "OBJ_OLD_DATA", columnDefinition = "VARCHAR2", length = 2000)
	public String getObjOldData() {
		return this.objOldData;
	}

	public void setObjOldData(String objOldData) {
		this.objOldData = objOldData;
	}

	@Caption("ObjNewData")
	@Column(name = "OBJ_NEW_DATA", columnDefinition = "VARCHAR2", length = 2000)
	public String getObjNewData() {
		return this.objNewData;
	}

	public void setObjNewData(String objNewData) {
		this.objNewData = objNewData;
	}

	@Caption("Url")
	@Column(name = "URL", columnDefinition = "VARCHAR2", length = 500)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Caption("MsgResult")
	@Column(name = "MSG_RESULT", columnDefinition = "VARCHAR2", length = 20)
	public String getMsgResult() {
		return this.msgResult;
	}

	public void setMsgResult(String msgResult) {
		this.msgResult = msgResult;
	}

	@Caption("ApiType")
	@Column(name = "API_TYPE", columnDefinition = "VARCHAR2", length = 20)
	public String getApiType() {
		return this.apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	@Caption("ValueKey")
	@Column(name = "VALUE_KEY", columnDefinition = "VARCHAR2", length = 2000)
	public String getValueKey() {
		return this.valueKey;
	}

	public void setValueKey(String valueKey) {
		this.valueKey = valueKey;
	}

}
