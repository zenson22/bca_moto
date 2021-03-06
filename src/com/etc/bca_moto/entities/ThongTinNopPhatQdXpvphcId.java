package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ThongTinNopPhatQdXpvphcId
 */
@Embeddable
public class ThongTinNopPhatQdXpvphcId implements java.io.Serializable {

	private Long id;
	private String soQuyetDinh;
	private String tenNguoiNvp;
	private Date ngayLapQd;
	private Date ngayHieuLuc;
	private String gplx;
	private String kiemDinh;
	private String bienKiemSoat;
	private Long tongMucPhat;
	private Long diaDanhHcId;
	private Long donViTraGiayTo;
	private Date thoiGian;
	private String soBienLai;
	private String ngayThanhToan;
	private Long noiNopPhatId;
	private Long trangThai;
	private Long nguoiTao;

	public ThongTinNopPhatQdXpvphcId() {
	}

	@Column(name = "ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "SO_QUYET_DINH", columnDefinition = "VARCHAR2", length = 30)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Column(name = "NGAY_LAP_QD", columnDefinition = "DATE", length = 7)
	public Date getNgayLapQd() {
		return this.ngayLapQd;
	}

	public void setNgayLapQd(Date ngayLapQd) {
		this.ngayLapQd = ngayLapQd;
	}

	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 100)
	public String getGplx() {
		return this.gplx;
	}

	public void setGplx(String gplx) {
		this.gplx = gplx;
	}

	@Column(name = "KIEM_DINH", columnDefinition = "VARCHAR2", length = 50)
	public String getKiemDinh() {
		return this.kiemDinh;
	}

	public void setKiemDinh(String kiemDinh) {
		this.kiemDinh = kiemDinh;
	}

	@Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 50)
	public String getBienKiemSoat() {
		return this.bienKiemSoat;
	}

	public void setBienKiemSoat(String bienKiemSoat) {
		this.bienKiemSoat = bienKiemSoat;
	}

	@Column(name = "TONG_MUC_PHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTongMucPhat() {
		return this.tongMucPhat;
	}

	public void setTongMucPhat(Long tongMucPhat) {
		this.tongMucPhat = tongMucPhat;
	}

	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Column(name = "DON_VI_TRA_GIAY_TO", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViTraGiayTo() {
		return this.donViTraGiayTo;
	}

	public void setDonViTraGiayTo(Long donViTraGiayTo) {
		this.donViTraGiayTo = donViTraGiayTo;
	}

	@Column(name = "THOI_GIAN", columnDefinition = "TIMESTAMP(6)")
	public Date getThoiGian() {
		return this.thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	@Column(name = "SO_BIEN_LAI", columnDefinition = "VARCHAR2", length = 100)
	public String getSoBienLai() {
		return this.soBienLai;
	}

	public void setSoBienLai(String soBienLai) {
		this.soBienLai = soBienLai;
	}

	@Column(name = "NGAY_THANH_TOAN", columnDefinition = "VARCHAR2", length = 100)
	public String getNgayThanhToan() {
		return this.ngayThanhToan;
	}

	public void setNgayThanhToan(String ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}

	@Column(name = "NOI_NOP_PHAT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNoiNopPhatId() {
		return this.noiNopPhatId;
	}

	public void setNoiNopPhatId(Long noiNopPhatId) {
		this.noiNopPhatId = noiNopPhatId;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ThongTinNopPhatQdXpvphcId))
			return false;
		ThongTinNopPhatQdXpvphcId castOther = (ThongTinNopPhatQdXpvphcId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getSoQuyetDinh() == castOther.getSoQuyetDinh())
						|| (this.getSoQuyetDinh() != null && castOther.getSoQuyetDinh() != null
								&& this.getSoQuyetDinh().equals(castOther.getSoQuyetDinh())))
				&& ((this.getTenNguoiNvp() == castOther.getTenNguoiNvp())
						|| (this.getTenNguoiNvp() != null && castOther.getTenNguoiNvp() != null
								&& this.getTenNguoiNvp().equals(castOther.getTenNguoiNvp())))
				&& ((this.getNgayLapQd() == castOther.getNgayLapQd()) || (this.getNgayLapQd() != null
						&& castOther.getNgayLapQd() != null && this.getNgayLapQd().equals(castOther.getNgayLapQd())))
				&& ((this.getNgayHieuLuc() == castOther.getNgayHieuLuc())
						|| (this.getNgayHieuLuc() != null && castOther.getNgayHieuLuc() != null
								&& this.getNgayHieuLuc().equals(castOther.getNgayHieuLuc())))
				&& ((this.getGplx() == castOther.getGplx()) || (this.getGplx() != null && castOther.getGplx() != null
						&& this.getGplx().equals(castOther.getGplx())))
				&& ((this.getKiemDinh() == castOther.getKiemDinh()) || (this.getKiemDinh() != null
						&& castOther.getKiemDinh() != null && this.getKiemDinh().equals(castOther.getKiemDinh())))
				&& ((this.getBienKiemSoat() == castOther.getBienKiemSoat())
						|| (this.getBienKiemSoat() != null && castOther.getBienKiemSoat() != null
								&& this.getBienKiemSoat().equals(castOther.getBienKiemSoat())))
				&& ((this.getTongMucPhat() == castOther.getTongMucPhat())
						|| (this.getTongMucPhat() != null && castOther.getTongMucPhat() != null
								&& this.getTongMucPhat().equals(castOther.getTongMucPhat())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getDonViTraGiayTo() == castOther.getDonViTraGiayTo())
						|| (this.getDonViTraGiayTo() != null && castOther.getDonViTraGiayTo() != null
								&& this.getDonViTraGiayTo().equals(castOther.getDonViTraGiayTo())))
				&& ((this.getThoiGian() == castOther.getThoiGian()) || (this.getThoiGian() != null
						&& castOther.getThoiGian() != null && this.getThoiGian().equals(castOther.getThoiGian())))
				&& ((this.getSoBienLai() == castOther.getSoBienLai()) || (this.getSoBienLai() != null
						&& castOther.getSoBienLai() != null && this.getSoBienLai().equals(castOther.getSoBienLai())))
				&& ((this.getNgayThanhToan() == castOther.getNgayThanhToan())
						|| (this.getNgayThanhToan() != null && castOther.getNgayThanhToan() != null
								&& this.getNgayThanhToan().equals(castOther.getNgayThanhToan())))
				&& ((this.getNoiNopPhatId() == castOther.getNoiNopPhatId())
						|| (this.getNoiNopPhatId() != null && castOther.getNoiNopPhatId() != null
								&& this.getNoiNopPhatId().equals(castOther.getNoiNopPhatId())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getSoQuyetDinh() == null ? 0 : this.getSoQuyetDinh().hashCode());
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgayLapQd() == null ? 0 : this.getNgayLapQd().hashCode());
		result = 37 * result + (getNgayHieuLuc() == null ? 0 : this.getNgayHieuLuc().hashCode());
		result = 37 * result + (getGplx() == null ? 0 : this.getGplx().hashCode());
		result = 37 * result + (getKiemDinh() == null ? 0 : this.getKiemDinh().hashCode());
		result = 37 * result + (getBienKiemSoat() == null ? 0 : this.getBienKiemSoat().hashCode());
		result = 37 * result + (getTongMucPhat() == null ? 0 : this.getTongMucPhat().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getDonViTraGiayTo() == null ? 0 : this.getDonViTraGiayTo().hashCode());
		result = 37 * result + (getThoiGian() == null ? 0 : this.getThoiGian().hashCode());
		result = 37 * result + (getSoBienLai() == null ? 0 : this.getSoBienLai().hashCode());
		result = 37 * result + (getNgayThanhToan() == null ? 0 : this.getNgayThanhToan().hashCode());
		result = 37 * result + (getNoiNopPhatId() == null ? 0 : this.getNoiNopPhatId().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		return result;
	}

}
