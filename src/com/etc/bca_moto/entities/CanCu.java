package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CanCuDAO;
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
 * CanCu
 */
@DAO(daoClass = CanCuDAO.class)
@Caption("{%tenCanCu}")
@Entity
@Table(name = "CAN_CU", schema = "BCA_MOTO")
public class CanCu implements java.io.Serializable {

	private long id;
	private String tenCanCu;
	private long trangThai;
	private String ndQuyDinhThamChieu;
	private Long idQuyDinhThamChieu;
	private String nguoiTao;
	private Date ngayTao;
	private String nguoiSua;
	private Date ngaySua;
	private String ghiChu;

	public CanCu() {
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
	@Column(name = "TEN_CAN_CU", nullable = false, columnDefinition = "VARCHAR2", length = 300)
	public String getTenCanCu() {
		return this.tenCanCu;
	}

	public void setTenCanCu(String tenCanCu) {
		this.tenCanCu = tenCanCu;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NdQuyDinhThamChieu")
	@Column(name = "ND_QUY_DINH_THAM_CHIEU", columnDefinition = "VARCHAR2", length = 500)
	public String getNdQuyDinhThamChieu() {
		return this.ndQuyDinhThamChieu;
	}

	public void setNdQuyDinhThamChieu(String ndQuyDinhThamChieu) {
		this.ndQuyDinhThamChieu = ndQuyDinhThamChieu;
	}

	@Caption("IdQuyDinhThamChieu")
	@Column(name = "ID_QUY_DINH_THAM_CHIEU", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIdQuyDinhThamChieu() {
		return this.idQuyDinhThamChieu;
	}

	public void setIdQuyDinhThamChieu(Long idQuyDinhThamChieu) {
		this.idQuyDinhThamChieu = idQuyDinhThamChieu;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 50)
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
	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 50)
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

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
