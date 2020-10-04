package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DonviKhobacDAO;
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
 * DonviKhobac
 */
@DAO(daoClass = DonviKhobacDAO.class)
@Caption("{%nguoiTao}")
@Entity
@Table(name = "DONVI_KHOBAC", schema = "BCA_MOTO")
public class DonviKhobac implements java.io.Serializable {

	private long id;
	private long donviCsgtId;
	private long khobacId;
	private long macDinh;
	private long diadanhHcId;
	private String nguoiTao;
	private Date ngayTao;
	private String nguoiSua;
	private Date ngaySua;

	public DonviKhobac() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("DonviCsgtId")
	@Column(name = "DONVI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getDonviCsgtId() {
		return this.donviCsgtId;
	}

	public void setDonviCsgtId(long donviCsgtId) {
		this.donviCsgtId = donviCsgtId;
	}

	@Caption("KhobacId")
	@Column(name = "KHOBAC_ID", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getKhobacId() {
		return this.khobacId;
	}

	public void setKhobacId(long khobacId) {
		this.khobacId = khobacId;
	}

	@Caption("MacDinh")
	@Column(name = "MAC_DINH", nullable = false, columnDefinition = "NUMBER", precision = 5, scale = 0)
	public long getMacDinh() {
		return this.macDinh;
	}

	public void setMacDinh(long macDinh) {
		this.macDinh = macDinh;
	}

	@Caption("DiadanhHcId")
	@Column(name = "DIADANH_HC_ID", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getDiadanhHcId() {
		return this.diadanhHcId;
	}

	public void setDiadanhHcId(long diadanhHcId) {
		this.diadanhHcId = diadanhHcId;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 300)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 300)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

}
