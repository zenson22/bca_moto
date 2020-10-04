package com.etc.bca_moto.entities;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DelMotoId
 */
@Embeddable
public class DelMotoId implements java.io.Serializable {

	private long id;
	private String soMay;
	private String soKhung;
	private Long nuocSx;
	private Long namSx;
	private String dungTich;
	private String congSuat;
	private Date nienHanSuDung;
	private Long songuoiDuocphepcho;
	private byte[] anhMoto;
	private String nguonGoc;
	private String soChungTu;
	private Date ngaycapChungtu;
	private String coquanCapchungtu;
	private String loaiNhienLieu;
	private Long mauXe;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private String trangThai;
	private String noiBao;
	private Date ngayBao;
	private String ghiChu;
	private Long nhanhieuLoaixeId;
	private String soLoai;
	private Long maLoaiXeId;
	private String diaChi;
	private String hinhThucXuLy;
	private Long maGiaoDich;
	private Long duLieuCu;
	private Date thoiGianXuLy;
	private String noiDung;
	private Long donViCsgtId;
	private Boolean soTruc;

	public DelMotoId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 120)
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 120)
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Column(name = "NUOC_SX", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNuocSx() {
		return this.nuocSx;
	}

	public void setNuocSx(Long nuocSx) {
		this.nuocSx = nuocSx;
	}

	@Column(name = "NAM_SX", columnDefinition = "NUMBER", precision = 4, scale = 0)
	public Long getNamSx() {
		return this.namSx;
	}

	public void setNamSx(Long namSx) {
		this.namSx = namSx;
	}

	@Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2", length = 120)
	public String getDungTich() {
		return this.dungTich;
	}

	public void setDungTich(String dungTich) {
		this.dungTich = dungTich;
	}

	@Column(name = "CONG_SUAT", columnDefinition = "VARCHAR2", length = 120)
	public String getCongSuat() {
		return this.congSuat;
	}

	public void setCongSuat(String congSuat) {
		this.congSuat = congSuat;
	}

	@Column(name = "NIEN_HAN_SU_DUNG", columnDefinition = "DATE", length = 7)
	public Date getNienHanSuDung() {
		return this.nienHanSuDung;
	}

	public void setNienHanSuDung(Date nienHanSuDung) {
		this.nienHanSuDung = nienHanSuDung;
	}

	@Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getSonguoiDuocphepcho() {
		return this.songuoiDuocphepcho;
	}

	public void setSonguoiDuocphepcho(Long songuoiDuocphepcho) {
		this.songuoiDuocphepcho = songuoiDuocphepcho;
	}

	@Column(name = "ANH_MOTO", columnDefinition = "BLOB")
	public byte[] getAnhMoto() {
		return this.anhMoto;
	}

	public void setAnhMoto(byte[] anhMoto) {
		this.anhMoto = anhMoto;
	}

	@Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 120)
	public String getNguonGoc() {
		return this.nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	@Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 80)
	public String getSoChungTu() {
		return this.soChungTu;
	}

	public void setSoChungTu(String soChungTu) {
		this.soChungTu = soChungTu;
	}

	@Column(name = "NGAYCAP_CHUNGTU", columnDefinition = "DATE", length = 7)
	public Date getNgaycapChungtu() {
		return this.ngaycapChungtu;
	}

	public void setNgaycapChungtu(Date ngaycapChungtu) {
		this.ngaycapChungtu = ngaycapChungtu;
	}

	@Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 200)
	public String getCoquanCapchungtu() {
		return this.coquanCapchungtu;
	}

	public void setCoquanCapchungtu(String coquanCapchungtu) {
		this.coquanCapchungtu = coquanCapchungtu;
	}

	@Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiNhienLieu() {
		return this.loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Column(name = "MAU_XE", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMauXe() {
		return this.mauXe;
	}

	public void setMauXe(Long mauXe) {
		this.mauXe = mauXe;
	}

	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 120)
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "NOI_BAO", columnDefinition = "VARCHAR2", length = 200)
	public String getNoiBao() {
		return this.noiBao;
	}

	public void setNoiBao(String noiBao) {
		this.noiBao = noiBao;
	}

	@Column(name = "NGAY_BAO", columnDefinition = "DATE", length = 7)
	public Date getNgayBao() {
		return this.ngayBao;
	}

	public void setNgayBao(Date ngayBao) {
		this.ngayBao = ngayBao;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNhanhieuLoaixeId() {
		return this.nhanhieuLoaixeId;
	}

	public void setNhanhieuLoaixeId(Long nhanhieuLoaixeId) {
		this.nhanhieuLoaixeId = nhanhieuLoaixeId;
	}

	@Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")
	public String getSoLoai() {
		return this.soLoai;
	}

	public void setSoLoai(String soLoai) {
		this.soLoai = soLoai;
	}

	@Column(name = "MA_LOAI_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMaLoaiXeId() {
		return this.maLoaiXeId;
	}

	public void setMaLoaiXeId(Long maLoaiXeId) {
		this.maLoaiXeId = maLoaiXeId;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 1020)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "HINH_THUC_XU_LY", columnDefinition = "VARCHAR2", length = 1020)
	public String getHinhThucXuLy() {
		return this.hinhThucXuLy;
	}

	public void setHinhThucXuLy(String hinhThucXuLy) {
		this.hinhThucXuLy = hinhThucXuLy;
	}

	@Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMaGiaoDich() {
		return this.maGiaoDich;
	}

	public void setMaGiaoDich(Long maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	@Column(name = "DU_LIEU_CU", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDuLieuCu() {
		return this.duLieuCu;
	}

	public void setDuLieuCu(Long duLieuCu) {
		this.duLieuCu = duLieuCu;
	}

	@Column(name = "THOI_GIAN_XU_LY", columnDefinition = "DATE", length = 7)
	public Date getThoiGianXuLy() {
		return this.thoiGianXuLy;
	}

	public void setThoiGianXuLy(Date thoiGianXuLy) {
		this.thoiGianXuLy = thoiGianXuLy;
	}

	@Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2", length = 1020)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "SO_TRUC", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getSoTruc() {
		return this.soTruc;
	}

	public void setSoTruc(Boolean soTruc) {
		this.soTruc = soTruc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DelMotoId))
			return false;
		DelMotoId castOther = (DelMotoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoMay() == castOther.getSoMay()) || (this.getSoMay() != null
						&& castOther.getSoMay() != null && this.getSoMay().equals(castOther.getSoMay())))
				&& ((this.getSoKhung() == castOther.getSoKhung()) || (this.getSoKhung() != null
						&& castOther.getSoKhung() != null && this.getSoKhung().equals(castOther.getSoKhung())))
				&& ((this.getNuocSx() == castOther.getNuocSx()) || (this.getNuocSx() != null
						&& castOther.getNuocSx() != null && this.getNuocSx().equals(castOther.getNuocSx())))
				&& ((this.getNamSx() == castOther.getNamSx()) || (this.getNamSx() != null
						&& castOther.getNamSx() != null && this.getNamSx().equals(castOther.getNamSx())))
				&& ((this.getDungTich() == castOther.getDungTich()) || (this.getDungTich() != null
						&& castOther.getDungTich() != null && this.getDungTich().equals(castOther.getDungTich())))
				&& ((this.getCongSuat() == castOther.getCongSuat()) || (this.getCongSuat() != null
						&& castOther.getCongSuat() != null && this.getCongSuat().equals(castOther.getCongSuat())))
				&& ((this.getNienHanSuDung() == castOther.getNienHanSuDung())
						|| (this.getNienHanSuDung() != null && castOther.getNienHanSuDung() != null
								&& this.getNienHanSuDung().equals(castOther.getNienHanSuDung())))
				&& ((this.getSonguoiDuocphepcho() == castOther.getSonguoiDuocphepcho())
						|| (this.getSonguoiDuocphepcho() != null && castOther.getSonguoiDuocphepcho() != null
								&& this.getSonguoiDuocphepcho().equals(castOther.getSonguoiDuocphepcho())))
				&& ((this.getAnhMoto() == castOther.getAnhMoto()) || (this.getAnhMoto() != null
						&& castOther.getAnhMoto() != null && Arrays.equals(this.getAnhMoto(), castOther.getAnhMoto())))
				&& ((this.getNguonGoc() == castOther.getNguonGoc()) || (this.getNguonGoc() != null
						&& castOther.getNguonGoc() != null && this.getNguonGoc().equals(castOther.getNguonGoc())))
				&& ((this.getSoChungTu() == castOther.getSoChungTu()) || (this.getSoChungTu() != null
						&& castOther.getSoChungTu() != null && this.getSoChungTu().equals(castOther.getSoChungTu())))
				&& ((this.getNgaycapChungtu() == castOther.getNgaycapChungtu())
						|| (this.getNgaycapChungtu() != null && castOther.getNgaycapChungtu() != null
								&& this.getNgaycapChungtu().equals(castOther.getNgaycapChungtu())))
				&& ((this.getCoquanCapchungtu() == castOther.getCoquanCapchungtu())
						|| (this.getCoquanCapchungtu() != null && castOther.getCoquanCapchungtu() != null
								&& this.getCoquanCapchungtu().equals(castOther.getCoquanCapchungtu())))
				&& ((this.getLoaiNhienLieu() == castOther.getLoaiNhienLieu())
						|| (this.getLoaiNhienLieu() != null && castOther.getLoaiNhienLieu() != null
								&& this.getLoaiNhienLieu().equals(castOther.getLoaiNhienLieu())))
				&& ((this.getMauXe() == castOther.getMauXe()) || (this.getMauXe() != null
						&& castOther.getMauXe() != null && this.getMauXe().equals(castOther.getMauXe())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getNoiBao() == castOther.getNoiBao()) || (this.getNoiBao() != null
						&& castOther.getNoiBao() != null && this.getNoiBao().equals(castOther.getNoiBao())))
				&& ((this.getNgayBao() == castOther.getNgayBao()) || (this.getNgayBao() != null
						&& castOther.getNgayBao() != null && this.getNgayBao().equals(castOther.getNgayBao())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getNhanhieuLoaixeId() == castOther.getNhanhieuLoaixeId())
						|| (this.getNhanhieuLoaixeId() != null && castOther.getNhanhieuLoaixeId() != null
								&& this.getNhanhieuLoaixeId().equals(castOther.getNhanhieuLoaixeId())))
				&& ((this.getSoLoai() == castOther.getSoLoai()) || (this.getSoLoai() != null
						&& castOther.getSoLoai() != null && this.getSoLoai().equals(castOther.getSoLoai())))
				&& ((this.getMaLoaiXeId() == castOther.getMaLoaiXeId()) || (this.getMaLoaiXeId() != null
						&& castOther.getMaLoaiXeId() != null && this.getMaLoaiXeId().equals(castOther.getMaLoaiXeId())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getHinhThucXuLy() == castOther.getHinhThucXuLy())
						|| (this.getHinhThucXuLy() != null && castOther.getHinhThucXuLy() != null
								&& this.getHinhThucXuLy().equals(castOther.getHinhThucXuLy())))
				&& ((this.getMaGiaoDich() == castOther.getMaGiaoDich()) || (this.getMaGiaoDich() != null
						&& castOther.getMaGiaoDich() != null && this.getMaGiaoDich().equals(castOther.getMaGiaoDich())))
				&& ((this.getDuLieuCu() == castOther.getDuLieuCu()) || (this.getDuLieuCu() != null
						&& castOther.getDuLieuCu() != null && this.getDuLieuCu().equals(castOther.getDuLieuCu())))
				&& ((this.getThoiGianXuLy() == castOther.getThoiGianXuLy())
						|| (this.getThoiGianXuLy() != null && castOther.getThoiGianXuLy() != null
								&& this.getThoiGianXuLy().equals(castOther.getThoiGianXuLy())))
				&& ((this.getNoiDung() == castOther.getNoiDung()) || (this.getNoiDung() != null
						&& castOther.getNoiDung() != null && this.getNoiDung().equals(castOther.getNoiDung())))
				&& ((this.getDonViCsgtId() == castOther.getDonViCsgtId())
						|| (this.getDonViCsgtId() != null && castOther.getDonViCsgtId() != null
								&& this.getDonViCsgtId().equals(castOther.getDonViCsgtId())))
				&& ((this.getSoTruc() == castOther.getSoTruc()) || (this.getSoTruc() != null
						&& castOther.getSoTruc() != null && this.getSoTruc().equals(castOther.getSoTruc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoMay() == null ? 0 : this.getSoMay().hashCode());
		result = 37 * result + (getSoKhung() == null ? 0 : this.getSoKhung().hashCode());
		result = 37 * result + (getNuocSx() == null ? 0 : this.getNuocSx().hashCode());
		result = 37 * result + (getNamSx() == null ? 0 : this.getNamSx().hashCode());
		result = 37 * result + (getDungTich() == null ? 0 : this.getDungTich().hashCode());
		result = 37 * result + (getCongSuat() == null ? 0 : this.getCongSuat().hashCode());
		result = 37 * result + (getNienHanSuDung() == null ? 0 : this.getNienHanSuDung().hashCode());
		result = 37 * result + (getSonguoiDuocphepcho() == null ? 0 : this.getSonguoiDuocphepcho().hashCode());
		result = 37 * result + (getAnhMoto() == null ? 0 : Arrays.hashCode(this.getAnhMoto()));
		result = 37 * result + (getNguonGoc() == null ? 0 : this.getNguonGoc().hashCode());
		result = 37 * result + (getSoChungTu() == null ? 0 : this.getSoChungTu().hashCode());
		result = 37 * result + (getNgaycapChungtu() == null ? 0 : this.getNgaycapChungtu().hashCode());
		result = 37 * result + (getCoquanCapchungtu() == null ? 0 : this.getCoquanCapchungtu().hashCode());
		result = 37 * result + (getLoaiNhienLieu() == null ? 0 : this.getLoaiNhienLieu().hashCode());
		result = 37 * result + (getMauXe() == null ? 0 : this.getMauXe().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getNoiBao() == null ? 0 : this.getNoiBao().hashCode());
		result = 37 * result + (getNgayBao() == null ? 0 : this.getNgayBao().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNhanhieuLoaixeId() == null ? 0 : this.getNhanhieuLoaixeId().hashCode());
		result = 37 * result + (getSoLoai() == null ? 0 : this.getSoLoai().hashCode());
		result = 37 * result + (getMaLoaiXeId() == null ? 0 : this.getMaLoaiXeId().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getHinhThucXuLy() == null ? 0 : this.getHinhThucXuLy().hashCode());
		result = 37 * result + (getMaGiaoDich() == null ? 0 : this.getMaGiaoDich().hashCode());
		result = 37 * result + (getDuLieuCu() == null ? 0 : this.getDuLieuCu().hashCode());
		result = 37 * result + (getThoiGianXuLy() == null ? 0 : this.getThoiGianXuLy().hashCode());
		result = 37 * result + (getNoiDung() == null ? 0 : this.getNoiDung().hashCode());
		result = 37 * result + (getDonViCsgtId() == null ? 0 : this.getDonViCsgtId().hashCode());
		result = 37 * result + (getSoTruc() == null ? 0 : this.getSoTruc().hashCode());
		return result;
	}

}
