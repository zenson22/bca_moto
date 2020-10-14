package com.etc.bca_moto.entities;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.etc.bca_moto.dal.AuthUserDAO;
import com.xdev.dal.DAO;
import com.xdev.security.authentication.CredentialsUsernamePassword;
import com.xdev.util.Caption;

/**
 * AuthUser
 */
@DAO(daoClass = AuthUserDAO.class)
@Caption("{%loginId}")
@Entity
@Table(name = "AUTH_USER", schema = "BCA_MOTO")
public class AuthUser implements java.io.Serializable, CredentialsUsernamePassword  {

	private long id;
	private String loginId;
	private String userName;
	private String password;
	private String department;
	private String organisation;
	private String phoneNumber;
	private String emailId;
	private Date validFromDate;
	private Date validToDate;
	private String status;
	private String description;
	private String usersId;
	private Date entryDate;
	private String macanbo;
	private String soHieu;
	private String chucVu;
	private Long donViCsgtId;
	private Long donViCapTrenId;
	private String capBac;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String dienThoaiDd;
	private String ghiChu;
	private Long capBacId;
	private Long chucVuId;
	private String nickName;
	private String refreshTokenId;
	private Date ngaySinh;
	public AuthUser() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	@Caption("LoginId")
	@Column(name = "LOGIN_ID", columnDefinition = "VARCHAR2", length = 50)
	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(final String loginId) {
		this.loginId = loginId;
	}

	@Caption("UserName")
	@Column(name = "USER_NAME", columnDefinition = "NVARCHAR2", length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}

	@Caption("Password")
	@Column(name = "PASSWORD", columnDefinition = "VARCHAR2")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	@Caption("Department")
	@Column(name = "DEPARTMENT", columnDefinition = "VARCHAR2", length = 50)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

	@Caption("Organisation")
	@Column(name = "ORGANISATION", columnDefinition = "VARCHAR2", length = 50)
	public String getOrganisation() {
		return this.organisation;
	}

	public void setOrganisation(final String organisation) {
		this.organisation = organisation;
	}

	@Caption("PhoneNumber")
	@Column(name = "PHONE_NUMBER", columnDefinition = "VARCHAR2", length = 50)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Caption("EmailId")
	@Column(name = "EMAIL_ID", columnDefinition = "VARCHAR2", length = 50)
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(final String emailId) {
		this.emailId = emailId;
	}

	@Caption("ValidFromDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_FROM_DATE", columnDefinition = "DATE", length = 7)
	public Date getValidFromDate() {
		return this.validFromDate;
	}

	public void setValidFromDate(final Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	@Caption("ValidToDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_TO_DATE", columnDefinition = "DATE", length = 7)
	public Date getValidToDate() {
		return this.validToDate;
	}

	public void setValidToDate(final Date validToDate) {
		this.validToDate = validToDate;
	}

	@Caption("Status")
	@Column(name = "STATUS", columnDefinition = "VARCHAR2", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@Caption("Description")
	@Column(name = "DESCRIPTION", columnDefinition = "VARCHAR2", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Caption("UsersId")
	@Column(name = "USERS_ID", columnDefinition = "VARCHAR2", length = 50)
	public String getUsersId() {
		return this.usersId;
	}

	public void setUsersId(final String usersId) {
		this.usersId = usersId;
	}

	@Caption("EntryDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "ENTRY_DATE", columnDefinition = "DATE", length = 7)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(final Date entryDate) {
		this.entryDate = entryDate;
	}

	@Caption("Macanbo")
	@Column(name = "MACANBO", columnDefinition = "VARCHAR2", length = 100)
	public String getMacanbo() {
		return this.macanbo;
	}

	public void setMacanbo(final String macanbo) {
		this.macanbo = macanbo;
	}

	@Caption("SoHieu")
	@Column(name = "SO_HIEU", columnDefinition = "VARCHAR2", length = 20)
	public String getSoHieu() {
		return this.soHieu;
	}

	public void setSoHieu(final String soHieu) {
		this.soHieu = soHieu;
	}

	@Caption("ChucVu")
	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 50)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(final String chucVu) {
		this.chucVu = chucVu;
	}

	@Caption("DonViCsgtId")
	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(final Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Caption("DonViCapTrenId")
	@Column(name = "DON_VI_CAP_TREN_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCapTrenId() {
		return this.donViCapTrenId;
	}

	public void setDonViCapTrenId(final Long donViCapTrenId) {
		this.donViCapTrenId = donViCapTrenId;
	}

	@Caption("CapBac")
	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 50)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(final String capBac) {
		this.capBac = capBac;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(final Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(final Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(final Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(final Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("DienThoaiDd")
	@Column(name = "DIEN_THOAI_DD", columnDefinition = "VARCHAR2", length = 20)
	public String getDienThoaiDd() {
		return this.dienThoaiDd;
	}

	public void setDienThoaiDd(final String dienThoaiDd) {
		this.dienThoaiDd = dienThoaiDd;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(final String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("CapBacId")
	@Column(name = "CAP_BAC_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCapBacId() {
		return this.capBacId;
	}

	public void setCapBacId(final Long capBacId) {
		this.capBacId = capBacId;
	}

	@Caption("ChucVuId")
	@Column(name = "CHUC_VU_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getChucVuId() {
		return this.chucVuId;
	}

	public void setChucVuId(final Long chucVuId) {
		this.chucVuId = chucVuId;
	}

	@Caption("NickName")
	@Column(name = "NICK_NAME", columnDefinition = "NVARCHAR2", length = 100)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(final String nickName) {
		this.nickName = nickName;
	}

	@Caption("RefreshTokenId")
	@Column(name = "REFRESH_TOKEN_ID", columnDefinition = "VARCHAR2", length = 200)
	public String getRefreshTokenId() {
		return this.refreshTokenId;
	}

	public void setRefreshTokenId(final String refreshTokenId) {
		this.refreshTokenId = refreshTokenId;
	}

	@Caption("NgaySinh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH", columnDefinition = "DATE", length = 7)
	public Date getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(final Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	@Override
	public String username() {
		return this.getLoginId();
	}

	@Override
	public byte[] password() {
		return this.getPassword().getBytes(StandardCharsets.UTF_8);
	}

}