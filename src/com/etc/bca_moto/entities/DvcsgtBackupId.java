package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DvcsgtBackupId
 */
@Embeddable
public class DvcsgtBackupId implements java.io.Serializable {

	private long id;
	private Long dvCsgtCaptrenId;
	private Long diaDanhHanhChinhId;
	private String maDonVi;
	private String tenDonVi;
	private String diaChi;
	private String tenCoquanChuquan;
	private String tenCoquanLap;
	private String tenDaydu;
	private String dienThoai;
	private String fax;
	private String email;
	private String ghiChu;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Boolean trangThai;
	private Boolean capDonVi;
	private Long sapXep;
	private Boolean linhVuc;
	private String maThamchieu;
	private String tenViettat;
	private Long coQuan;

	public DvcsgtBackupId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "DV_CSGT_CAPTREN_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDvCsgtCaptrenId() {
		return this.dvCsgtCaptrenId;
	}

	public void setDvCsgtCaptrenId(Long dvCsgtCaptrenId) {
		this.dvCsgtCaptrenId = dvCsgtCaptrenId;
	}

	@Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHanhChinhId() {
		return this.diaDanhHanhChinhId;
	}

	public void setDiaDanhHanhChinhId(Long diaDanhHanhChinhId) {
		this.diaDanhHanhChinhId = diaDanhHanhChinhId;
	}

	@Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "TEN_COQUAN_CHUQUAN", columnDefinition = "VARCHAR2")
	public String getTenCoquanChuquan() {
		return this.tenCoquanChuquan;
	}

	public void setTenCoquanChuquan(String tenCoquanChuquan) {
		this.tenCoquanChuquan = tenCoquanChuquan;
	}

	@Column(name = "TEN_COQUAN_LAP", columnDefinition = "VARCHAR2")
	public String getTenCoquanLap() {
		return this.tenCoquanLap;
	}

	public void setTenCoquanLap(String tenCoquanLap) {
		this.tenCoquanLap = tenCoquanLap;
	}

	@Column(name = "TEN_DAYDU", columnDefinition = "VARCHAR2", length = 500)
	public String getTenDaydu() {
		return this.tenDaydu;
	}

	public void setTenDaydu(String tenDaydu) {
		this.tenDaydu = tenDaydu;
	}

	@Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2")
	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	@Column(name = "FAX", columnDefinition = "VARCHAR2")
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "EMAIL", columnDefinition = "VARCHAR2")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(Boolean capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSapXep() {
		return this.sapXep;
	}

	public void setSapXep(Long sapXep) {
		this.sapXep = sapXep;
	}

	@Column(name = "LINH_VUC", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLinhVuc() {
		return this.linhVuc;
	}

	public void setLinhVuc(Boolean linhVuc) {
		this.linhVuc = linhVuc;
	}

	@Column(name = "MA_THAMCHIEU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThamchieu() {
		return this.maThamchieu;
	}

	public void setMaThamchieu(String maThamchieu) {
		this.maThamchieu = maThamchieu;
	}

	@Column(name = "TEN_VIETTAT", columnDefinition = "VARCHAR2", length = 500)
	public String getTenViettat() {
		return this.tenViettat;
	}

	public void setTenViettat(String tenViettat) {
		this.tenViettat = tenViettat;
	}

	@Column(name = "CO_QUAN", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getCoQuan() {
		return this.coQuan;
	}

	public void setCoQuan(Long coQuan) {
		this.coQuan = coQuan;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DvcsgtBackupId))
			return false;
		DvcsgtBackupId castOther = (DvcsgtBackupId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getDvCsgtCaptrenId() == castOther.getDvCsgtCaptrenId())
						|| (this.getDvCsgtCaptrenId() != null && castOther.getDvCsgtCaptrenId() != null
								&& this.getDvCsgtCaptrenId().equals(castOther.getDvCsgtCaptrenId())))
				&& ((this.getDiaDanhHanhChinhId() == castOther.getDiaDanhHanhChinhId())
						|| (this.getDiaDanhHanhChinhId() != null && castOther.getDiaDanhHanhChinhId() != null
								&& this.getDiaDanhHanhChinhId().equals(castOther.getDiaDanhHanhChinhId())))
				&& ((this.getMaDonVi() == castOther.getMaDonVi()) || (this.getMaDonVi() != null
						&& castOther.getMaDonVi() != null && this.getMaDonVi().equals(castOther.getMaDonVi())))
				&& ((this.getTenDonVi() == castOther.getTenDonVi()) || (this.getTenDonVi() != null
						&& castOther.getTenDonVi() != null && this.getTenDonVi().equals(castOther.getTenDonVi())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getTenCoquanChuquan() == castOther.getTenCoquanChuquan())
						|| (this.getTenCoquanChuquan() != null && castOther.getTenCoquanChuquan() != null
								&& this.getTenCoquanChuquan().equals(castOther.getTenCoquanChuquan())))
				&& ((this.getTenCoquanLap() == castOther.getTenCoquanLap())
						|| (this.getTenCoquanLap() != null && castOther.getTenCoquanLap() != null
								&& this.getTenCoquanLap().equals(castOther.getTenCoquanLap())))
				&& ((this.getTenDaydu() == castOther.getTenDaydu()) || (this.getTenDaydu() != null
						&& castOther.getTenDaydu() != null && this.getTenDaydu().equals(castOther.getTenDaydu())))
				&& ((this.getDienThoai() == castOther.getDienThoai()) || (this.getDienThoai() != null
						&& castOther.getDienThoai() != null && this.getDienThoai().equals(castOther.getDienThoai())))
				&& ((this.getFax() == castOther.getFax()) || (this.getFax() != null && castOther.getFax() != null
						&& this.getFax().equals(castOther.getFax())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getNguoiTaoId() == castOther.getNguoiTaoId()) || (this.getNguoiTaoId() != null
						&& castOther.getNguoiTaoId() != null && this.getNguoiTaoId().equals(castOther.getNguoiTaoId())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSuaId() == castOther.getNguoiSuaId()) || (this.getNguoiSuaId() != null
						&& castOther.getNguoiSuaId() != null && this.getNguoiSuaId().equals(castOther.getNguoiSuaId())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getCapDonVi() == castOther.getCapDonVi()) || (this.getCapDonVi() != null
						&& castOther.getCapDonVi() != null && this.getCapDonVi().equals(castOther.getCapDonVi())))
				&& ((this.getSapXep() == castOther.getSapXep()) || (this.getSapXep() != null
						&& castOther.getSapXep() != null && this.getSapXep().equals(castOther.getSapXep())))
				&& ((this.getLinhVuc() == castOther.getLinhVuc()) || (this.getLinhVuc() != null
						&& castOther.getLinhVuc() != null && this.getLinhVuc().equals(castOther.getLinhVuc())))
				&& ((this.getMaThamchieu() == castOther.getMaThamchieu())
						|| (this.getMaThamchieu() != null && castOther.getMaThamchieu() != null
								&& this.getMaThamchieu().equals(castOther.getMaThamchieu())))
				&& ((this.getTenViettat() == castOther.getTenViettat()) || (this.getTenViettat() != null
						&& castOther.getTenViettat() != null && this.getTenViettat().equals(castOther.getTenViettat())))
				&& ((this.getCoQuan() == castOther.getCoQuan()) || (this.getCoQuan() != null
						&& castOther.getCoQuan() != null && this.getCoQuan().equals(castOther.getCoQuan())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getDvCsgtCaptrenId() == null ? 0 : this.getDvCsgtCaptrenId().hashCode());
		result = 37 * result + (getDiaDanhHanhChinhId() == null ? 0 : this.getDiaDanhHanhChinhId().hashCode());
		result = 37 * result + (getMaDonVi() == null ? 0 : this.getMaDonVi().hashCode());
		result = 37 * result + (getTenDonVi() == null ? 0 : this.getTenDonVi().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getTenCoquanChuquan() == null ? 0 : this.getTenCoquanChuquan().hashCode());
		result = 37 * result + (getTenCoquanLap() == null ? 0 : this.getTenCoquanLap().hashCode());
		result = 37 * result + (getTenDaydu() == null ? 0 : this.getTenDaydu().hashCode());
		result = 37 * result + (getDienThoai() == null ? 0 : this.getDienThoai().hashCode());
		result = 37 * result + (getFax() == null ? 0 : this.getFax().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNguoiTaoId() == null ? 0 : this.getNguoiTaoId().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSuaId() == null ? 0 : this.getNguoiSuaId().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getCapDonVi() == null ? 0 : this.getCapDonVi().hashCode());
		result = 37 * result + (getSapXep() == null ? 0 : this.getSapXep().hashCode());
		result = 37 * result + (getLinhVuc() == null ? 0 : this.getLinhVuc().hashCode());
		result = 37 * result + (getMaThamchieu() == null ? 0 : this.getMaThamchieu().hashCode());
		result = 37 * result + (getTenViettat() == null ? 0 : this.getTenViettat().hashCode());
		result = 37 * result + (getCoQuan() == null ? 0 : this.getCoQuan().hashCode());
		return result;
	}

}
