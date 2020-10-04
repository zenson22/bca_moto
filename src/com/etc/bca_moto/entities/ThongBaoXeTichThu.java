package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ThongBaoXeTichThuDAO;
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
 * ThongBaoXeTichThu
 */
@DAO(daoClass = ThongBaoXeTichThuDAO.class)
@Caption("{%coQuan}")
@Entity
@Table(name = "THONG_BAO_XE_TICH_THU", schema = "BCA_MOTO")
public class ThongBaoXeTichThu implements java.io.Serializable {

	private long id;
	private String coQuan;
	private String noiDung;
	private Date ngay;
	private Long donViId;
	private Long tinhTrang;
	private String motoId;

	public ThongBaoXeTichThu() {
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

	@Caption("CoQuan")
	@Column(name = "CO_QUAN", columnDefinition = "VARCHAR2", length = 1020)
	public String getCoQuan() {
		return this.coQuan;
	}

	public void setCoQuan(String coQuan) {
		this.coQuan = coQuan;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2", length = 1020)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("Ngay")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY", columnDefinition = "DATE", length = 7)
	public Date getNgay() {
		return this.ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	@Caption("DonViId")
	@Column(name = "DON_VI_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViId() {
		return this.donViId;
	}

	public void setDonViId(Long donViId) {
		this.donViId = donViId;
	}

	@Caption("TinhTrang")
	@Column(name = "TINH_TRANG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(Long tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Caption("MotoId")
	@Column(name = "MOTO_ID", columnDefinition = "VARCHAR2", length = 25)
	public String getMotoId() {
		return this.motoId;
	}

	public void setMotoId(String motoId) {
		this.motoId = motoId;
	}

}
