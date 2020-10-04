package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoHosoId
 */
@Embeddable
public class MotoHosoId implements java.io.Serializable {

	private long id;
	private String soTailieu;
	private Date ngayThang;
	private String trichYeu;
	private Short soTrang;
	private long motoDangky;
	private Long stt;

	public MotoHosoId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_TAILIEU", columnDefinition = "VARCHAR2", length = 1020)
	public String getSoTailieu() {
		return this.soTailieu;
	}

	public void setSoTailieu(String soTailieu) {
		this.soTailieu = soTailieu;
	}

	@Column(name = "NGAY_THANG", columnDefinition = "DATE", length = 7)
	public Date getNgayThang() {
		return this.ngayThang;
	}

	public void setNgayThang(Date ngayThang) {
		this.ngayThang = ngayThang;
	}

	@Column(name = "TRICH_YEU", columnDefinition = "VARCHAR2", length = 1020)
	public String getTrichYeu() {
		return this.trichYeu;
	}

	public void setTrichYeu(String trichYeu) {
		this.trichYeu = trichYeu;
	}

	@Column(name = "SO_TRANG", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getSoTrang() {
		return this.soTrang;
	}

	public void setSoTrang(Short soTrang) {
		this.soTrang = soTrang;
	}

	@Column(name = "MOTO_DANGKY", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getMotoDangky() {
		return this.motoDangky;
	}

	public void setMotoDangky(long motoDangky) {
		this.motoDangky = motoDangky;
	}

	@Column(name = "STT", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getStt() {
		return this.stt;
	}

	public void setStt(Long stt) {
		this.stt = stt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoHosoId))
			return false;
		MotoHosoId castOther = (MotoHosoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoTailieu() == castOther.getSoTailieu()) || (this.getSoTailieu() != null
						&& castOther.getSoTailieu() != null && this.getSoTailieu().equals(castOther.getSoTailieu())))
				&& ((this.getNgayThang() == castOther.getNgayThang()) || (this.getNgayThang() != null
						&& castOther.getNgayThang() != null && this.getNgayThang().equals(castOther.getNgayThang())))
				&& ((this.getTrichYeu() == castOther.getTrichYeu()) || (this.getTrichYeu() != null
						&& castOther.getTrichYeu() != null && this.getTrichYeu().equals(castOther.getTrichYeu())))
				&& ((this.getSoTrang() == castOther.getSoTrang()) || (this.getSoTrang() != null
						&& castOther.getSoTrang() != null && this.getSoTrang().equals(castOther.getSoTrang())))
				&& (this.getMotoDangky() == castOther.getMotoDangky())
				&& ((this.getStt() == castOther.getStt()) || (this.getStt() != null && castOther.getStt() != null
						&& this.getStt().equals(castOther.getStt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoTailieu() == null ? 0 : this.getSoTailieu().hashCode());
		result = 37 * result + (getNgayThang() == null ? 0 : this.getNgayThang().hashCode());
		result = 37 * result + (getTrichYeu() == null ? 0 : this.getTrichYeu().hashCode());
		result = 37 * result + (getSoTrang() == null ? 0 : this.getSoTrang().hashCode());
		result = 37 * result + (int) this.getMotoDangky();
		result = 37 * result + (getStt() == null ? 0 : this.getStt().hashCode());
		return result;
	}

}
