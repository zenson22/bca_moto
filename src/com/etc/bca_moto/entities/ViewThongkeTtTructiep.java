package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewThongkeTtTructiepDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewThongkeTtTructiep
 */
@DAO(daoClass = ViewThongkeTtTructiepDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_THONGKE_TT_TRUCTIEP", schema = "BCA_MOTO")
public class ViewThongkeTtTructiep implements java.io.Serializable {

	private ViewThongkeTtTructiepId id;

	public ViewThongkeTtTructiep() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQuyetDinh", column = @Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngayLapQd", column = @Column(name = "NGAY_LAP_QD", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayHieuLuc", column = @Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "soBienLai", column = @Column(name = "SO_BIEN_LAI", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngayThanhToan", column = @Column(name = "NGAY_THANH_TOAN", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "noiNopPhatId", column = @Column(name = "NOI_NOP_PHAT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "bienKiemSoat", column = @Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tongMucPhat", column = @Column(name = "TONG_MUC_PHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTraGiayTo", column = @Column(name = "DON_VI_TRA_GIAY_TO", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "thoiGian", column = @Column(name = "THOI_GIAN", columnDefinition = "TIMESTAMP(6)")) })
	public ViewThongkeTtTructiepId getId() {
		return this.id;
	}

	public void setId(ViewThongkeTtTructiepId id) {
		this.id = id;
	}

}
