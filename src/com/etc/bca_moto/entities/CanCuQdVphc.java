package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CanCuQdVphcDAO;
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
 * CanCuQdVphc
 */
@DAO(daoClass = CanCuQdVphcDAO.class)
@Caption("{%tenCanCu}")
@Entity
@Table(name = "CAN_CU_QD_VPHC", schema = "BCA_MOTO")
public class CanCuQdVphc implements java.io.Serializable {

	private long id;
	private String tenCanCu;
	private Long luatThamChieuId;
	private String noiDung;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private String ngaySua;
	private Long qdSuDung;
	private String note;

	public CanCuQdVphc() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("TenCanCu")
	@Column(name = "TEN_CAN_CU", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getTenCanCu() {
		return this.tenCanCu;
	}

	public void setTenCanCu(String tenCanCu) {
		this.tenCanCu = tenCanCu;
	}

	@Caption("LuatThamChieuId")
	@Column(name = "LUAT_THAM_CHIEU_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLuatThamChieuId() {
		return this.luatThamChieuId;
	}

	public void setLuatThamChieuId(Long luatThamChieuId) {
		this.luatThamChieuId = luatThamChieuId;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2")
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
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
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NgaySua")
	@Column(name = "NGAY_SUA", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(String ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("QdSuDung")
	@Column(name = "QD_SU_DUNG", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQdSuDung() {
		return this.qdSuDung;
	}

	public void setQdSuDung(Long qdSuDung) {
		this.qdSuDung = qdSuDung;
	}

	@Caption("Note")
	@Column(name = "NOTE", columnDefinition = "VARCHAR2")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
