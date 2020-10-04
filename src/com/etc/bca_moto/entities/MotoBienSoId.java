package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoBienSoId
 */
@Embeddable
public class MotoBienSoId implements java.io.Serializable {

	private long id;
	private String dauBienTheoTinh;
	private String seriChu;
	private String dauBienQuocGia;
	private String seriSo;
	private String mauBien;
	private boolean dangkyTam;
	private long canboTaobiensoId;
	private Date ngayTaobienso;
	private boolean daCap;
	private Long canboNghiepvuId;
	private boolean nghiepVu;
	private Date ngayNghiepvu;
	private Long canboThuhoiId;
	private boolean thuHoi;
	private Date ngayThuhoi;
	private Long canboPhanphoiId;
	private Date ngayPhanphoi;
	private Long phanphoiDiemdkId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long dauBienQuocGiaid;
	private Long motoSeriChuid;
	private String bienDayDu;
	private Long congVanId;
	private Long biensoQuocgiaId;
	private String ghiChu;
	private String bienSoTrunc;

	public MotoBienSoId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
	}

	@Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 16)
	public String getDauBienQuocGia() {
		return this.dauBienQuocGia;
	}

	public void setDauBienQuocGia(String dauBienQuocGia) {
		this.dauBienQuocGia = dauBienQuocGia;
	}

	@Column(name = "SERI_SO", nullable = false, columnDefinition = "VARCHAR2", length = 4)
	public String getSeriSo() {
		return this.seriSo;
	}

	public void setSeriSo(String seriSo) {
		this.seriSo = seriSo;
	}

	@Column(name = "MAU_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 120)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isDangkyTam() {
		return this.dangkyTam;
	}

	public void setDangkyTam(boolean dangkyTam) {
		this.dangkyTam = dangkyTam;
	}

	@Column(name = "CANBO_TAOBIENSO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanboTaobiensoId() {
		return this.canboTaobiensoId;
	}

	public void setCanboTaobiensoId(long canboTaobiensoId) {
		this.canboTaobiensoId = canboTaobiensoId;
	}

	@Column(name = "NGAY_TAOBIENSO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTaobienso() {
		return this.ngayTaobienso;
	}

	public void setNgayTaobienso(Date ngayTaobienso) {
		this.ngayTaobienso = ngayTaobienso;
	}

	@Column(name = "DA_CAP", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isDaCap() {
		return this.daCap;
	}

	public void setDaCap(boolean daCap) {
		this.daCap = daCap;
	}

	@Column(name = "CANBO_NGHIEPVU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanboNghiepvuId() {
		return this.canboNghiepvuId;
	}

	public void setCanboNghiepvuId(Long canboNghiepvuId) {
		this.canboNghiepvuId = canboNghiepvuId;
	}

	@Column(name = "NGHIEP_VU", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isNghiepVu() {
		return this.nghiepVu;
	}

	public void setNghiepVu(boolean nghiepVu) {
		this.nghiepVu = nghiepVu;
	}

	@Column(name = "NGAY_NGHIEPVU", columnDefinition = "DATE", length = 7)
	public Date getNgayNghiepvu() {
		return this.ngayNghiepvu;
	}

	public void setNgayNghiepvu(Date ngayNghiepvu) {
		this.ngayNghiepvu = ngayNghiepvu;
	}

	@Column(name = "CANBO_THUHOI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanboThuhoiId() {
		return this.canboThuhoiId;
	}

	public void setCanboThuhoiId(Long canboThuhoiId) {
		this.canboThuhoiId = canboThuhoiId;
	}

	@Column(name = "THU_HOI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isThuHoi() {
		return this.thuHoi;
	}

	public void setThuHoi(boolean thuHoi) {
		this.thuHoi = thuHoi;
	}

	@Column(name = "NGAY_THUHOI", columnDefinition = "DATE", length = 7)
	public Date getNgayThuhoi() {
		return this.ngayThuhoi;
	}

	public void setNgayThuhoi(Date ngayThuhoi) {
		this.ngayThuhoi = ngayThuhoi;
	}

	@Column(name = "CANBO_PHANPHOI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanboPhanphoiId() {
		return this.canboPhanphoiId;
	}

	public void setCanboPhanphoiId(Long canboPhanphoiId) {
		this.canboPhanphoiId = canboPhanphoiId;
	}

	@Column(name = "NGAY_PHANPHOI", columnDefinition = "DATE", length = 7)
	public Date getNgayPhanphoi() {
		return this.ngayPhanphoi;
	}

	public void setNgayPhanphoi(Date ngayPhanphoi) {
		this.ngayPhanphoi = ngayPhanphoi;
	}

	@Column(name = "PHANPHOI_DIEMDK_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getPhanphoiDiemdkId() {
		return this.phanphoiDiemdkId;
	}

	public void setPhanphoiDiemdkId(Long phanphoiDiemdkId) {
		this.phanphoiDiemdkId = phanphoiDiemdkId;
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

	@Column(name = "DAU_BIEN_QUOC_GIAID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDauBienQuocGiaid() {
		return this.dauBienQuocGiaid;
	}

	public void setDauBienQuocGiaid(Long dauBienQuocGiaid) {
		this.dauBienQuocGiaid = dauBienQuocGiaid;
	}

	@Column(name = "MOTO_SERI_CHUID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoSeriChuid() {
		return this.motoSeriChuid;
	}

	public void setMotoSeriChuid(Long motoSeriChuid) {
		this.motoSeriChuid = motoSeriChuid;
	}

	@Column(name = "BIEN_DAY_DU", columnDefinition = "VARCHAR2", length = 60)
	public String getBienDayDu() {
		return this.bienDayDu;
	}

	public void setBienDayDu(String bienDayDu) {
		this.bienDayDu = bienDayDu;
	}

	@Column(name = "CONG_VAN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCongVanId() {
		return this.congVanId;
	}

	public void setCongVanId(Long congVanId) {
		this.congVanId = congVanId;
	}

	@Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getBiensoQuocgiaId() {
		return this.biensoQuocgiaId;
	}

	public void setBiensoQuocgiaId(Long biensoQuocgiaId) {
		this.biensoQuocgiaId = biensoQuocgiaId;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 20)
	public String getBienSoTrunc() {
		return this.bienSoTrunc;
	}

	public void setBienSoTrunc(String bienSoTrunc) {
		this.bienSoTrunc = bienSoTrunc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoBienSoId))
			return false;
		MotoBienSoId castOther = (MotoBienSoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
						|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
								&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getDauBienQuocGia() == castOther.getDauBienQuocGia())
						|| (this.getDauBienQuocGia() != null && castOther.getDauBienQuocGia() != null
								&& this.getDauBienQuocGia().equals(castOther.getDauBienQuocGia())))
				&& ((this.getSeriSo() == castOther.getSeriSo()) || (this.getSeriSo() != null
						&& castOther.getSeriSo() != null && this.getSeriSo().equals(castOther.getSeriSo())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& (this.isDangkyTam() == castOther.isDangkyTam())
				&& (this.getCanboTaobiensoId() == castOther.getCanboTaobiensoId())
				&& ((this.getNgayTaobienso() == castOther.getNgayTaobienso())
						|| (this.getNgayTaobienso() != null && castOther.getNgayTaobienso() != null
								&& this.getNgayTaobienso().equals(castOther.getNgayTaobienso())))
				&& (this.isDaCap() == castOther.isDaCap())
				&& ((this.getCanboNghiepvuId() == castOther.getCanboNghiepvuId())
						|| (this.getCanboNghiepvuId() != null && castOther.getCanboNghiepvuId() != null
								&& this.getCanboNghiepvuId().equals(castOther.getCanboNghiepvuId())))
				&& (this.isNghiepVu() == castOther.isNghiepVu())
				&& ((this.getNgayNghiepvu() == castOther.getNgayNghiepvu())
						|| (this.getNgayNghiepvu() != null && castOther.getNgayNghiepvu() != null
								&& this.getNgayNghiepvu().equals(castOther.getNgayNghiepvu())))
				&& ((this.getCanboThuhoiId() == castOther.getCanboThuhoiId())
						|| (this.getCanboThuhoiId() != null && castOther.getCanboThuhoiId() != null
								&& this.getCanboThuhoiId().equals(castOther.getCanboThuhoiId())))
				&& (this.isThuHoi() == castOther.isThuHoi())
				&& ((this.getNgayThuhoi() == castOther.getNgayThuhoi()) || (this.getNgayThuhoi() != null
						&& castOther.getNgayThuhoi() != null && this.getNgayThuhoi().equals(castOther.getNgayThuhoi())))
				&& ((this.getCanboPhanphoiId() == castOther.getCanboPhanphoiId())
						|| (this.getCanboPhanphoiId() != null && castOther.getCanboPhanphoiId() != null
								&& this.getCanboPhanphoiId().equals(castOther.getCanboPhanphoiId())))
				&& ((this.getNgayPhanphoi() == castOther.getNgayPhanphoi())
						|| (this.getNgayPhanphoi() != null && castOther.getNgayPhanphoi() != null
								&& this.getNgayPhanphoi().equals(castOther.getNgayPhanphoi())))
				&& ((this.getPhanphoiDiemdkId() == castOther.getPhanphoiDiemdkId())
						|| (this.getPhanphoiDiemdkId() != null && castOther.getPhanphoiDiemdkId() != null
								&& this.getPhanphoiDiemdkId().equals(castOther.getPhanphoiDiemdkId())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getDauBienQuocGiaid() == castOther.getDauBienQuocGiaid())
						|| (this.getDauBienQuocGiaid() != null && castOther.getDauBienQuocGiaid() != null
								&& this.getDauBienQuocGiaid().equals(castOther.getDauBienQuocGiaid())))
				&& ((this.getMotoSeriChuid() == castOther.getMotoSeriChuid())
						|| (this.getMotoSeriChuid() != null && castOther.getMotoSeriChuid() != null
								&& this.getMotoSeriChuid().equals(castOther.getMotoSeriChuid())))
				&& ((this.getBienDayDu() == castOther.getBienDayDu()) || (this.getBienDayDu() != null
						&& castOther.getBienDayDu() != null && this.getBienDayDu().equals(castOther.getBienDayDu())))
				&& ((this.getCongVanId() == castOther.getCongVanId()) || (this.getCongVanId() != null
						&& castOther.getCongVanId() != null && this.getCongVanId().equals(castOther.getCongVanId())))
				&& ((this.getBiensoQuocgiaId() == castOther.getBiensoQuocgiaId())
						|| (this.getBiensoQuocgiaId() != null && castOther.getBiensoQuocgiaId() != null
								&& this.getBiensoQuocgiaId().equals(castOther.getBiensoQuocgiaId())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getBienSoTrunc() == castOther.getBienSoTrunc())
						|| (this.getBienSoTrunc() != null && castOther.getBienSoTrunc() != null
								&& this.getBienSoTrunc().equals(castOther.getBienSoTrunc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getDauBienQuocGia() == null ? 0 : this.getDauBienQuocGia().hashCode());
		result = 37 * result + (getSeriSo() == null ? 0 : this.getSeriSo().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (this.isDangkyTam() ? 1 : 0);
		result = 37 * result + (int) this.getCanboTaobiensoId();
		result = 37 * result + (getNgayTaobienso() == null ? 0 : this.getNgayTaobienso().hashCode());
		result = 37 * result + (this.isDaCap() ? 1 : 0);
		result = 37 * result + (getCanboNghiepvuId() == null ? 0 : this.getCanboNghiepvuId().hashCode());
		result = 37 * result + (this.isNghiepVu() ? 1 : 0);
		result = 37 * result + (getNgayNghiepvu() == null ? 0 : this.getNgayNghiepvu().hashCode());
		result = 37 * result + (getCanboThuhoiId() == null ? 0 : this.getCanboThuhoiId().hashCode());
		result = 37 * result + (this.isThuHoi() ? 1 : 0);
		result = 37 * result + (getNgayThuhoi() == null ? 0 : this.getNgayThuhoi().hashCode());
		result = 37 * result + (getCanboPhanphoiId() == null ? 0 : this.getCanboPhanphoiId().hashCode());
		result = 37 * result + (getNgayPhanphoi() == null ? 0 : this.getNgayPhanphoi().hashCode());
		result = 37 * result + (getPhanphoiDiemdkId() == null ? 0 : this.getPhanphoiDiemdkId().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getDauBienQuocGiaid() == null ? 0 : this.getDauBienQuocGiaid().hashCode());
		result = 37 * result + (getMotoSeriChuid() == null ? 0 : this.getMotoSeriChuid().hashCode());
		result = 37 * result + (getBienDayDu() == null ? 0 : this.getBienDayDu().hashCode());
		result = 37 * result + (getCongVanId() == null ? 0 : this.getCongVanId().hashCode());
		result = 37 * result + (getBiensoQuocgiaId() == null ? 0 : this.getBiensoQuocgiaId().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getBienSoTrunc() == null ? 0 : this.getBienSoTrunc().hashCode());
		return result;
	}

}
