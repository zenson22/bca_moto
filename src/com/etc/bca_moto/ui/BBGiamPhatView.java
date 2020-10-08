package com.etc.bca_moto.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.etc.bca_moto.dal.AuthUserDAO;
import com.etc.bca_moto.dal.DonViCanhsatGtDAO;
import com.etc.bca_moto.dal.QdGiamMienTienPhat04DAO;
import com.etc.bca_moto.entities.AuthUser;
import com.etc.bca_moto.entities.AuthUser_;
import com.etc.bca_moto.entities.DonViCanhsatGt;
import com.etc.bca_moto.entities.QdGiamMienTienPhat04;
import com.etc.bca_moto.entities.QdGiamMienTienPhat04_;
import com.vaadin.data.Property;
import com.vaadin.event.FieldEvents;
import com.vaadin.server.Page;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.UI;
import com.xdev.dal.DAOs;
import com.xdev.ui.XdevAbsoluteLayout;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevFieldGroup;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevTextField;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.combobox.XdevComboBox;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class BBGiamPhatView extends XdevView {

	/**
	 * 
	 */
	private static BBGiamPhatView bbGiamPhatView = null;

	public static BBGiamPhatView getInstance() {
		if (bbGiamPhatView == null) {
			bbGiamPhatView = new BBGiamPhatView();
		}
		return bbGiamPhatView;
	}
	private final Object ouputView = UI.getCurrent().getSession().getAttribute("OutPutViewReport04");
	
	public BBGiamPhatView() {
		super();
		this.initUI();
		//final Object ouputView = UI.getCurrent().getSession().getAttribute("OutPutViewReport04");
		if(this.ouputView!=null){
			this.fieldGroup.setItemDataSource((QdGiamMienTienPhat04) this.ouputView);
			final AuthUser authUser = DAOs.get(AuthUserDAO.class).find(Long.parseLong(this.txtCanBoId.getValue()));
			this.cbAuthen.setValue(authUser);
			this.txtDonVi.setValue(this.txtDvCSGT.getValue());
			this.txtCoQuanChuQuan.setValue(DAOs.get(DonViCanhsatGtDAO.class).
					find(this.cbAuthen.getSelectedItem().getBean().getDonViCsgtId()).getTenCoquanChuquan());
			this.txtVphcKy2.setValue(this.txtVphcKy.getValue());this.txtNgViPham2.setValue(this.txtNgViPham.getValue());
			this.pdfQdVphc2.setValue(this.pdfCcQdVphc.getValue());
			this.txtQdVPHC2.setValue(this.txtQdVPHC.getValue());
			this.txtNguoiRaQd.setValue(authUser.getUserName());
		} else {
			this.fieldGroup.setItemDataSource(new QdGiamMienTienPhat04());
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdPrint}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	@SuppressWarnings("deprecation")
	private void cmdPrint_buttonClick(final Button.ClickEvent event) {
		long id = 0;
		if(this.ouputView != null){
			id = ((QdGiamMienTienPhat04)this.ouputView).getId();
		}
		final Connection conn = BBVPHCView.getConnection();
		JasperReport jpReport = null;
		JasperPrint jasperPrint = null;
		final String path = System.getProperty("java.class.path").split("\\.")[0];
		try {
			jpReport = JasperCompileManager.compileReport(
					path + "BCA_MOTO\\WebContent\\WEB-INF\\resources\\Output_Report_04.jrxml");
			// Preparing parameters
			final Map<String, Object> parameters = new HashMap<>();
			if(id==0){
				parameters.put("id", DAOs.get(QdGiamMienTienPhat04DAO.class).getMaxId().get(0));
			}
			else{
				parameters.put("id", id);
			}
			jasperPrint = JasperFillManager.fillReport(jpReport, parameters, conn);
			conn.close();
		} catch (final JRException | SQLException e) {
			e.printStackTrace();
		}
		byte[] b = null;
		try {
			b = JasperExportManager.exportReportToPdf(jasperPrint);
		} catch (final JRException e) {
			e.printStackTrace();
		}
		final InputStream stream = new ByteArrayInputStream(b);
		final StreamResource.StreamSource source = new StreamSource(){
			@Override
			public InputStream getStream() {
				return stream;
			}
		};
		final StreamResource resource = new StreamResource(source, "Bao_Cao_So_04.pdf");
		Page.getCurrent().open(resource, "_blank", false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdSave}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdSave_buttonClick(final Button.ClickEvent event) {
		if (this.txtSoQd.isEmpty()) {
			this.txtSoQd.focus();
			Notification.show("Thế quên t ak");
		} else {
			this.fieldGroup.save();
			Notification.show("Oki", Type.WARNING_MESSAGE);
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbAuthen}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbAuthen_valueChange(final Property.ValueChangeEvent event) {
		this.txtCapBac.setValue(this.cbAuthen.getSelectedItem().getBean().getCapBac());
		this.txtCanBoId.setValue(this.cbAuthen.getSelectedItem().getBean().getId()+"");
		final DonViCanhsatGt donViCanhsatGt = DAOs.get(DonViCanhsatGtDAO.class).
				find(this.cbAuthen.getSelectedItem().getBean().getDonViCsgtId());
		this.txtDvCSGT.setValue(donViCanhsatGt.getTenDonVi());
		this.txtDvCSGTId.setValue(this.cbAuthen.getSelectedItem().getBean().getDonViCsgtId()+"");
		this.txtCoQuanChuQuan.setValue(donViCanhsatGt.getTenCoquanChuquan());
		this.txtDonVi.setValue(this.txtDvCSGT.getValue());
	}

	/**
	 * Event handler delegate method for the {@link XdevTextField}
	 * {@link #txtQdVPHC}.
	 *
	 * @see FieldEvents.TextChangeListener#textChange(FieldEvents.TextChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtQdVPHC_textChange(final FieldEvents.TextChangeEvent event) {
		this.txtQdVPHC2.setValue(this.txtQdVPHC.getValue());
	}

	/**
	 * Event handler delegate method for the {@link PopupDateField}
	 * {@link #pdfCcQdVphc}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void pdfCcQdVphc_valueChange(final Property.ValueChangeEvent event) {
		this.pdfQdVphc2.setValue(this.pdfCcQdVphc.getValue());
	}

	/**
	 * Event handler delegate method for the {@link XdevTextField}
	 * {@link #txtVphcKy}.
	 *
	 * @see FieldEvents.TextChangeListener#textChange(FieldEvents.TextChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtVphcKy_textChange(final FieldEvents.TextChangeEvent event) {
		this.txtVphcKy2.setValue(this.txtVphcKy.getValue());
	}

	/**
	 * Event handler delegate method for the {@link XdevTextField}
	 * {@link #txtNgViPham}.
	 *
	 * @see FieldEvents.TextChangeListener#textChange(FieldEvents.TextChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtNgViPham_textChange(final FieldEvents.TextChangeEvent event) {
		this.txtNgViPham2.setValue(this.txtNgViPham.getValue());
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new GridLayout();
		this.absoluteLayout2 = new XdevAbsoluteLayout();
		this.cmdPrint = new XdevButton();
		this.cmdSave = new XdevButton();
		this.absoluteLayoutTitle = new AbsoluteLayout();
		this.lblQuocHieu = new Label();
		this.txtCoQuanChuQuan = new XdevTextField();
		this.txtDonVi = new XdevTextField();
		this.txtSoQd = new XdevTextField();
		this.label = new Label();
		this.label2 = new Label();
		this.label3 = new Label();
		this.label4 = new Label();
		this.label5 = new Label();
		this.label7 = new Label();
		this.txtDdhc = new XdevTextField();
		this.pdfNgayTao = new PopupDateField();
		this.form = new XdevGridLayout();
		this.fieldGroup = new XdevFieldGroup<>(QdGiamMienTienPhat04.class);
		this.absoluteLayout = new AbsoluteLayout();
		this.label6 = new Label();
		this.label8 = new Label();
		this.label9 = new Label();
		this.label10 = new Label();
		this.label11 = new Label();
		this.pdfCcQdVphc = new PopupDateField();
		this.label12 = new Label();
		this.label13 = new Label();
		this.label14 = new Label();
		this.label15 = new Label();
		this.label16 = new Label();
		this.pdfHoanTH = new PopupDateField();
		this.pdfGqXpVphc = new PopupDateField();
		this.label17 = new Label();
		this.label18 = new Label();
		this.pdfXetDonGM = new PopupDateField();
		this.label19 = new Label();
		this.label20 = new Label();
		this.label21 = new Label();
		this.label22 = new Label();
		this.label23 = new Label();
		this.label24 = new Label();
		this.label25 = new Label();
		this.label26 = new Label();
		this.pdfQdVphc2 = new PopupDateField();
		this.label27 = new Label();
		this.label28 = new Label();
		this.label29 = new Label();
		this.label30 = new Label();
		this.label31 = new Label();
		this.label32 = new Label();
		this.label33 = new Label();
		this.label34 = new Label();
		this.label35 = new Label();
		this.label37 = new Label();
		this.label38 = new Label();
		this.label36 = new Label();
		this.label39 = new Label();
		this.label40 = new Label();
		this.lblQuocHieu2 = new Label();
		this.label41 = new Label();
		this.txtQdVPHC = new XdevTextField();
		this.txtHoanTH = new XdevTextField();
		this.txtDvCSGTId = new XdevTextField();
		this.cbAuthen = new XdevComboBox<>();
		this.txtCapBac = new XdevTextField();
		this.txtDvCSGT = new XdevTextField();
		this.txtNgViPham = new XdevTextField();
		this.txtTienDuocGiamSo = new XdevTextField();
		this.txtTienSauGiamSo = new XdevTextField();
		this.txtTienDuocGiamChu = new XdevTextField();
		this.txtTienSauGiamChu = new XdevTextField();
		this.txtLydoGiamMien = new XdevTextField();
		this.txtTvNhanLai = new XdevTextField();
		this.txtNgViPham2 = new XdevTextField();
		this.txtToChucThucHien = new XdevTextField();
		this.txtNguoiRaQd = new XdevTextField();
		this.txtCanBoId = new XdevTextField();
		this.txtVphcKy = new XdevTextField();
		this.txtHoanTHKy = new XdevTextField();
		this.txtCoQuanXN = new XdevTextField();
		this.txtQdVPHC2 = new XdevTextField();
		this.txtVphcKy2 = new XdevTextField();
		this.txtGqXuPhatVphcSo = new XdevTextField();
	
		this.setPrimaryStyleName("v-font-ct");
		this.gridLayout.setSpacing(true);
		this.gridLayout.setMargin(new MarginInfo(true, false, false, false));
		this.cmdPrint.setCaption("In");
		this.cmdPrint.setPrimaryStyleName("v-btnPrint");
		this.cmdSave.setCaption("Lưu");
		this.cmdSave.setPrimaryStyleName("v-btnLuu");
		this.lblQuocHieu.setPrimaryStyleName("v-label-ct");
		this.lblQuocHieu.setValue("<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br> Độc lập - Tự do - Hạnh phúc</b>");
		this.lblQuocHieu.setContentMode(ContentMode.HTML);
		this.txtCoQuanChuQuan.setInputPrompt(".............................");
		this.txtCoQuanChuQuan.setStyleName("borderless");
		this.txtDonVi.setInputPrompt(".............................");
		this.txtDonVi.setStyleName("borderless");
		this.txtSoQd.setInputPrompt(".............................");
		this.txtSoQd.setStyleName("borderless");
		this.label.setValue("(1)");
		this.label.setContentMode(ContentMode.HTML);
		this.label2.setValue("(2)");
		this.label2.setContentMode(ContentMode.HTML);
		this.label3.setValue("Số:");
		this.label3.setContentMode(ContentMode.HTML);
		this.label4.setPrimaryStyleName("v-label-ct");
		this.label4.setValue(
				"<b>QUYẾT ĐỊNH<br>Giảm/Miễn tiền phạt vi phạm hành chính</b><hr style=\"width:100px;text-align:center;margin-top:-3px;\">");
		this.label4.setContentMode(ContentMode.HTML);
		this.label5.setValue("/QĐ-GMTP");
		this.label5.setContentMode(ContentMode.HTML);
		this.label7.setValue(" ,ngày");
		this.label7.setContentMode(ContentMode.HTML);
		this.txtDdhc.setInputPrompt("........................................");
		this.txtDdhc.setStyleName("borderless");
		this.pdfNgayTao.setDateFormat("dd/MM/yyyy");
		this.fieldGroup.bind(this.txtCoQuanChuQuan, QdGiamMienTienPhat04_.coQuanChuQuan.getName());
		this.fieldGroup.bind(this.txtSoQd, QdGiamMienTienPhat04_.soQuyetDinh.getName());
		this.fieldGroup.bind(this.txtQdVPHC, QdGiamMienTienPhat04_.canCuQdVphcSo.getName());
		this.fieldGroup.bind(this.txtVphcKy, QdGiamMienTienPhat04_.vphcKy.getName());
		this.fieldGroup.bind(this.pdfCcQdVphc, QdGiamMienTienPhat04_.canCuQdVphcNgay.getName());
		this.fieldGroup.bind(this.txtHoanTH, QdGiamMienTienPhat04_.canCuQdHoanThSo.getName());
		this.fieldGroup.bind(this.pdfHoanTH, QdGiamMienTienPhat04_.canCuQdHoanThNgay.getName());
		this.fieldGroup.bind(this.txtHoanTHKy, QdGiamMienTienPhat04_.hoanThKy.getName());
		this.fieldGroup.bind(this.txtCanBoId, QdGiamMienTienPhat04_.canBoRaQdId.getName());
		this.fieldGroup.bind(this.txtCapBac, QdGiamMienTienPhat04_.capBacChucVu.getName());
		this.fieldGroup.bind(this.txtDvCSGT, QdGiamMienTienPhat04_.donVi.getName());
		this.fieldGroup.bind(this.txtTienDuocGiamSo, QdGiamMienTienPhat04_.tienPhatDuocGiamBangSo.getName());
		this.fieldGroup.bind(this.txtTienDuocGiamChu, QdGiamMienTienPhat04_.tienPhatDuocGiamBangChu.getName());
		this.fieldGroup.bind(this.txtTienSauGiamSo, QdGiamMienTienPhat04_.tienPhatSauGiamBangSo.getName());
		this.fieldGroup.bind(this.txtTienSauGiamChu, QdGiamMienTienPhat04_.tienPhatSauGiamBangChu.getName());
		this.fieldGroup.bind(this.txtLydoGiamMien, QdGiamMienTienPhat04_.lyDoGiam.getName());
		this.fieldGroup.bind(this.txtTvNhanLai, QdGiamMienTienPhat04_.tangVatNhanLai.getName());
		this.fieldGroup.bind(this.txtNgViPham, QdGiamMienTienPhat04_.tenNguoiNvp.getName());
		this.fieldGroup.bind(this.txtToChucThucHien, QdGiamMienTienPhat04_.phoiHopThucHienQd.getName());
		this.fieldGroup.bind(this.txtCoQuanXN, QdGiamMienTienPhat04_.coQuanXn.getName());
		this.fieldGroup.bind(this.pdfNgayTao, QdGiamMienTienPhat04_.ngayTaoQuyetDinh.getName());
		this.fieldGroup.bind(this.pdfXetDonGM, QdGiamMienTienPhat04_.ngayXetDon.getName());
		this.fieldGroup.bind(this.txtGqXuPhatVphcSo, QdGiamMienTienPhat04_.canCuQdGqSo.getName());
		this.fieldGroup.bind(this.pdfGqXpVphc, QdGiamMienTienPhat04_.canCuQdGqNgay.getName());
		this.fieldGroup.bind(this.txtDdhc, QdGiamMienTienPhat04_.diaDanhHc.getName());
		this.label6.setValue(
				"Căn cứ Điều 77 Luật xử lý vi phạm hành chính;<br>Căn cứ Quyết định xử phạt vi phạm hành chính số:");
		this.label6.setContentMode(ContentMode.HTML);
		this.label8.setValue("Căn cứ Quyết định hoãn thi hành quyết định phạt tiền số");
		this.label9.setValue("do:");
		this.label10.setValue("ký;");
		this.label11.setValue("ngày");
		this.label11.setContentMode(ContentMode.HTML);
		this.pdfCcQdVphc.setDateFormat("dd/MM/yyyy");
		this.label12.setValue("ngày");
		this.label13.setValue("ký (nếu có);");
		this.label13.setContentMode(ContentMode.HTML);
		this.label14.setValue("ngày");
		this.label15.setValue("(nếu có);");
		this.label16.setValue("Căn cứ Quyết định về việc giao quyền xử phạt vi phạm hành chính số");
		this.pdfHoanTH.setDateFormat("dd/MM/yyyy");
		this.pdfGqXpVphc.setDateFormat("dd/MM/yyyy");
		this.label17.setValue("do:");
		this.label18.setValue("Xét đơn đề nghị giảm/miễn tiền phạt vi phạm hành chính ngày");
		this.pdfXetDonGM.setDateFormat("dd/MM/yyyy");
		this.label19.setValue("của Ông(Bà)");
		this.label19.setContentMode(ContentMode.HTML);
		this.label20.setValue("được<sup>(4)</sup>");
		this.label20.setContentMode(ContentMode.HTML);
		this.label21.setValue("xác nhận;");
		this.label22.setValue("Tôi:");
		this.label23.setValue("Cấp bậc, chức vụ: ");
		this.label24.setValue("Đơn vị:");
		this.label25.setPrimaryStyleName("v-label-ct");
		this.label25.setValue("<b>QUYẾT ĐỊNH:<br>");
		this.label25.setContentMode(ContentMode.HTML);
		this.label26.setValue(
				"<b>Điều 1.</b> Giảm/Miễn tiền phạt vi phạm hành chính tại Quyết định xử phạt vi phạm hành chính số");
		this.label26.setContentMode(ContentMode.HTML);
		this.pdfQdVphc2.setDateFormat("dd/MM/yyyy");
		this.pdfQdVphc2.setEnabled(false);
		this.label27.setValue("ngày");
		this.label28.setValue("do:");
		this.label29.setValue("ký.");
		this.label30.setValue("Số tiền phạt mà Ông(Bà)");
		this.label31.setValue("được giảm/miễn là:");
		this.label32.setValue("đồng (Bằng chữ:");
		this.label33.setValue(").");
		this.label34.setValue("Số tiền sau khi giảm/miễn Ông(Bà) phải nộp là:");
		this.label35.setValue("(Bằng chữ:");
		this.label37.setValue(").");
		this.label38.setValue("đồng");
		this.label36.setValue(
				"Lý do giảm/miễn:<br>Ông(Bà) được nhận lại<sup>(5)</sup><br><b>Điều 2.</b> Quyết định này có hiệu lực thi hành kể từ ngày ký.<br> <b>Điều 3.</b> Quyết định này được: <br>1. Giao cho Ông(Bà)<br> 2. Gửi cho<sup>(6)</sup>");
		this.label36.setContentMode(ContentMode.HTML);
		this.label39.setValue("để chấp hành Quyết định.");
		this.label40.setValue("để tổ chức thực hiện Quyết định này./.");
		this.lblQuocHieu2.setPrimaryStyleName("v-label-ct");
		this.lblQuocHieu2.setValue("<b>NGƯỜI RA QUYẾT ĐỊNH</b><br><i>(Ký, đóng dấu, ghi rõ chức vụ, họ tên)</i>");
		this.lblQuocHieu2.setContentMode(ContentMode.HTML);
		this.label41.setValue("<b>Nơi nhận:</b><br> - Như Điều 3;<br>- Lưu Hồ sơ. ");
		this.label41.setContentMode(ContentMode.HTML);
		this.txtQdVPHC.setInputPrompt(
				"..............................................................................................................");
		this.txtQdVPHC.setStyleName("borderless");
		this.txtHoanTH.setInputPrompt(
				"..............................................................................................................................................................................................................................................");
		this.txtHoanTH.setStyleName("borderless");
		this.txtDvCSGTId.setColumns(5);
		this.txtDvCSGTId.setInputPrompt(".............................");
		this.txtDvCSGTId.setStyleName("borderless");
		this.txtDvCSGTId.setEnabled(false);
		this.txtDvCSGTId.setVisible(false);
		this.cbAuthen.setItemCaptionFromAnnotation(false);
		this.cbAuthen.setInputPrompt("Phải chọn");
		this.cbAuthen.setContainerDataSource(AuthUser.class, DAOs.get(AuthUserDAO.class).findAll());
		this.cbAuthen.setItemCaptionPropertyId(AuthUser_.userName.getName());
		this.txtCapBac.setInputPrompt(".............................");
		this.txtCapBac.setStyleName("borderless");
		this.txtCapBac.setEnabled(false);
		this.txtDvCSGT.setInputPrompt(".............................");
		this.txtDvCSGT.setStyleName("borderless");
		this.txtDvCSGT.setEnabled(false);
		this.txtNgViPham.setInputPrompt("................................................................................");
		this.txtNgViPham.setStyleName("borderless");
		this.txtTienDuocGiamSo
				.setInputPrompt("................................................................................");
		this.txtTienDuocGiamSo.setStyleName("borderless");
		this.txtTienSauGiamSo.setInputPrompt(
				"................................................................................................................................................................................................");
		this.txtTienSauGiamSo.setStyleName("borderless");
		this.txtTienDuocGiamChu
				.setInputPrompt("................................................................................");
		this.txtTienDuocGiamChu.setStyleName("borderless");
		this.txtTienSauGiamChu.setInputPrompt(
				"..................................................................................................................................................................................................................................................");
		this.txtTienSauGiamChu.setStyleName("borderless");
		this.txtLydoGiamMien.setInputPrompt(
				".........................................................................................................................");
		this.txtLydoGiamMien.setStyleName("borderless");
		this.txtTvNhanLai.setInputPrompt(
				".........................................................................................................................");
		this.txtTvNhanLai.setStyleName("borderless");
		this.txtNgViPham2.setInputPrompt(
				".....................................................................................................................................................................................................................................");
		this.txtNgViPham2.setStyleName("borderless");
		this.txtToChucThucHien.setInputPrompt(
				"..........................................................................................................................................................................................................................................");
		this.txtToChucThucHien.setStyleName("borderless");
		this.txtNguoiRaQd.setInputPrompt(
				".........................................................................................................................");
		this.txtNguoiRaQd.setStyleName("borderless");
		this.txtCanBoId.setColumns(5);
		this.txtCanBoId.setInputPrompt(".............................");
		this.txtCanBoId.setStyleName("borderless");
		this.txtCanBoId.setEnabled(false);
		this.txtCanBoId.setVisible(false);
		this.txtVphcKy.setInputPrompt(
				".........................................................................................................................................................................................................................");
		this.txtVphcKy.setStyleName("borderless");
		this.txtHoanTHKy.setInputPrompt(
				".....................................................................................................................................................................................................");
		this.txtHoanTHKy.setStyleName("borderless");
		this.txtCoQuanXN.setInputPrompt(
				".....................................................................................................................................................................................................");
		this.txtCoQuanXN.setStyleName("borderless");
		this.txtQdVPHC2.setInputPrompt(
				"..........................................................................................................................................................");
		this.txtQdVPHC2.setStyleName("borderless");
		this.txtQdVPHC2.setEnabled(false);
		this.txtVphcKy2.setInputPrompt(
				".....................................................................................................................................................................................................");
		this.txtVphcKy2.setStyleName("borderless");
		this.txtVphcKy2.setEnabled(false);
		this.txtGqXuPhatVphcSo.setInputPrompt(
				"..............................................................................................................................................................................................................................................");
		this.txtGqXuPhatVphcSo.setStyleName("borderless");
		this.txtGqXuPhatVphcSo.setEnabled(false);
		this.txtGqXuPhatVphcSo.setVisible(false);
	
		this.cmdPrint.setWidth(100, Unit.PIXELS);
		this.cmdPrint.setHeight(40, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cmdPrint, "left:450px; top:20px");
		this.cmdSave.setWidth(100, Unit.PIXELS);
		this.cmdSave.setHeight(40, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cmdSave, "left:280px; top:20px");
		this.lblQuocHieu.setWidth(400, Unit.PIXELS);
		this.lblQuocHieu.setHeight(50, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.lblQuocHieu, "left:597px; top:40px");
		this.txtCoQuanChuQuan.setWidth(150, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.txtCoQuanChuQuan, "left:28px; top:52px");
		this.txtDonVi.setWidth(150, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.txtDonVi, "left:28px; top:87px");
		this.txtSoQd.setWidth(120, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.txtSoQd, "left:58px; top:122px");
		this.label.setWidth(30, Unit.PIXELS);
		this.label.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label, "left:200px; top:57px");
		this.label2.setWidth(30, Unit.PIXELS);
		this.label2.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label2, "left:200px; top:92px");
		this.label3.setWidth(30, Unit.PIXELS);
		this.label3.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label3, "left:28px; top:127px");
		this.absoluteLayoutTitle.addComponent(this.label4, "left:0px; top:165px");
		this.label5.setWidth(100, Unit.PIXELS);
		this.label5.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label5, "left:200px; top:127px");
		this.label7.setWidth(70, Unit.PIXELS);
		this.label7.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label7, "left:699px; top:115px");
		this.txtDdhc.setWidth(100, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.txtDdhc, "left:594px; top:109px");
		this.absoluteLayoutTitle.addComponent(this.pdfNgayTao, "left:783px; top:109px");
		this.form.setWidth(30, Unit.PIXELS);
		this.form.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.form, "left:399px; top:82px");
		this.label6.setWidth(350, Unit.PIXELS);
		this.label6.setHeight(50, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label6, "left:70px; top:0px");
		this.label8.setWidth(380, Unit.PIXELS);
		this.label8.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label8, "left:70px; top:80px");
		this.label9.setWidth(30, Unit.PIXELS);
		this.label9.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label9, "left:30px; top:50px");
		this.label10.setWidth(30, Unit.PIXELS);
		this.label10.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label10, "left:1027px; top:51px");
		this.label11.setWidth(30, Unit.PIXELS);
		this.label11.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label11, "left:836px; top:20px");
		this.absoluteLayout.addComponent(this.pdfCcQdVphc, "left:871px; top:15px");
		this.label12.setWidth(50, Unit.PIXELS);
		this.label12.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label12, "left:30px; top:110px");
		this.label13.setWidth(100, Unit.PIXELS);
		this.label13.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label13, "left:928px; top:110px");
		this.label14.setWidth(50, Unit.PIXELS);
		this.label14.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label14, "left:30px; top:170px");
		this.label15.setWidth(100, Unit.PIXELS);
		this.label15.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label15, "left:928px; top:170px");
		this.label16.setWidth(470, Unit.PIXELS);
		this.label16.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label16, "left:70px; top:140px");
		this.absoluteLayout.addComponent(this.pdfHoanTH, "left:88px; top:104px");
		this.absoluteLayout.addComponent(this.pdfGqXpVphc, "left:88px; top:166px");
		this.label17.setWidth(30, Unit.PIXELS);
		this.label17.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label17, "left:282px; top:110px");
		this.label18.setWidth(100, Unit.PERCENTAGE);
		this.label18.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label18, "left:70px; top:200px");
		this.absoluteLayout.addComponent(this.pdfXetDonGM, "left:480px; top:193px");
		this.label19.setWidth(100, Unit.PIXELS);
		this.label19.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label19, "left:899px; top:199px");
		this.label20.setWidth(60, Unit.PIXELS);
		this.label20.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label20, "left:183px; top:230px");
		this.label21.setWidth(100, Unit.PIXELS);
		this.label21.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label21, "left:981px; top:228px");
		this.label22.setWidth(40, Unit.PIXELS);
		this.label22.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label22, "left:70px; top:261px");
		this.label23.setWidth(120, Unit.PIXELS);
		this.label23.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label23, "left:409px; top:260px");
		this.label24.setWidth(70, Unit.PIXELS);
		this.label24.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label24, "left:723px; top:261px");
		this.absoluteLayout.addComponent(this.label25, "left:0px; top:322px");
		this.label26.setWidth(100, Unit.PERCENTAGE);
		this.label26.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label26, "left:71px; top:355px");
		this.absoluteLayout.addComponent(this.pdfQdVphc2, "left:188px; top:384px");
		this.label27.setWidth(50, Unit.PIXELS);
		this.label27.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label27, "left:130px; top:390px");
		this.label28.setWidth(30, Unit.PIXELS);
		this.label28.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label28, "left:382px; top:390px");
		this.label29.setWidth(30, Unit.PIXELS);
		this.label29.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label29, "left:1000px; top:388px");
		this.label30.setWidth(200, Unit.PIXELS);
		this.label30.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label30, "left:72px; top:430px");
		this.label31.setWidth(150, Unit.PIXELS);
		this.label31.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label31, "left:30px; top:460px");
		this.label32.setWidth(110, Unit.PIXELS);
		this.label32.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label32, "left:555px; top:455px");
		this.label33.setWidth(30, Unit.PIXELS);
		this.label33.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label33, "left:1217px; top:454px");
		this.label34.setWidth(330, Unit.PIXELS);
		this.label34.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label34, "left:72px; top:490px");
		this.label35.setWidth(100, Unit.PIXELS);
		this.label35.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label35, "left:30px; top:520px");
		this.label37.setWidth(30, Unit.PIXELS);
		this.label37.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label37, "left:1217px; top:518px");
		this.label38.setWidth(50, Unit.PIXELS);
		this.label38.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label38, "left:1197px; top:488px");
		this.label36.setWidth(100, Unit.PERCENTAGE);
		this.label36.setHeight(150, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label36, "left:72px; top:550px");
		this.label39.setWidth(200, Unit.PIXELS);
		this.label39.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label39, "left:1051px; top:645px");
		this.label40.setWidth(250, Unit.PIXELS);
		this.label40.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label40, "left:1001px; top:675px");
		this.lblQuocHieu2.setWidth(350, Unit.PIXELS);
		this.lblQuocHieu2.setHeight(50, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.lblQuocHieu2, "left:854px; top:706px");
		this.label41.setWidth(100, Unit.PIXELS);
		this.label41.setHeight(100, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label41, "left:30px; top:700px");
		this.txtQdVPHC.setWidth(400, Unit.PIXELS);
		this.txtQdVPHC.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtQdVPHC, "left:433px; top:20px");
		this.txtHoanTH.setWidth(800, Unit.PIXELS);
		this.txtHoanTH.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtHoanTH, "left:450px; top:80px");
		this.absoluteLayout.addComponent(this.txtDvCSGTId, "left:976px; top:258px");
		this.cbAuthen.setWidth(270, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.cbAuthen, "left:120px; top:260px");
		this.txtCapBac.setWidth(150, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtCapBac, "left:538px; top:256px");
		this.txtDvCSGT.setWidth(150, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtDvCSGT, "left:803px; top:256px");
		this.txtNgViPham.setWidth(500, Unit.PIXELS);
		this.txtNgViPham.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtNgViPham, "left:271px; top:430px");
		this.txtTienDuocGiamSo.setWidth(300, Unit.PIXELS);
		this.txtTienDuocGiamSo.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTienDuocGiamSo, "left:200px; top:460px");
		this.txtTienSauGiamSo.setWidth(750, Unit.PIXELS);
		this.txtTienSauGiamSo.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTienSauGiamSo, "left:411px; top:494px");
		this.txtTienDuocGiamChu.setWidth(500, Unit.PIXELS);
		this.txtTienDuocGiamChu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTienDuocGiamChu, "left:680px; top:460px");
		this.txtTienSauGiamChu.setWidth(1000, Unit.PIXELS);
		this.txtTienSauGiamChu.setHeight(35, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTienSauGiamChu, "left:145px; top:520px");
		this.txtLydoGiamMien.setWidth(600, Unit.PIXELS);
		this.txtLydoGiamMien.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtLydoGiamMien, "left:200px; top:550px");
		this.txtTvNhanLai.setWidth(600, Unit.PIXELS);
		this.txtTvNhanLai.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTvNhanLai, "left:250px; top:575px");
		this.txtNgViPham2.setWidth(800, Unit.PIXELS);
		this.txtNgViPham2.setHeight(35, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtNgViPham2, "left:220px; top:645px");
		this.txtToChucThucHien.setWidth(800, Unit.PIXELS);
		this.txtToChucThucHien.setHeight(35, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtToChucThucHien, "left:170px; top:670px");
		this.txtNguoiRaQd.setWidth(300, Unit.PIXELS);
		this.txtNguoiRaQd.setHeight(40, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtNguoiRaQd, "left:900px; top:780px");
		this.absoluteLayout.addComponent(this.txtCanBoId, "left:1080px; top:257px");
		this.txtVphcKy.setWidth(900, Unit.PIXELS);
		this.txtVphcKy.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtVphcKy, "left:100px; top:54px");
		this.txtHoanTHKy.setWidth(500, Unit.PIXELS);
		this.txtHoanTHKy.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtHoanTHKy, "left:350px; top:110px");
		this.txtCoQuanXN.setWidth(500, Unit.PIXELS);
		this.txtCoQuanXN.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtCoQuanXN, "left:321px; top:229px");
		this.txtQdVPHC2.setWidth(550, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtQdVPHC2, "left:700px; top:348px");
		this.txtVphcKy2.setWidth(550, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtVphcKy2, "left:420px; top:390px");
		this.txtGqXuPhatVphcSo.setWidth(700, Unit.PIXELS);
		this.txtGqXuPhatVphcSo.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtGqXuPhatVphcSo, "left:550px; top:140px");
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(3);
		this.absoluteLayout2.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout2.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout2, 0, 0);
		this.absoluteLayoutTitle.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayoutTitle.setHeight(250, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayoutTitle, 0, 1);
		this.absoluteLayout.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout.setHeight(850, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout, 0, 2);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		this.gridLayout.setWidth(1280, Unit.PIXELS);
		this.gridLayout.setHeight(-1, Unit.PIXELS);
		this.setContent(this.gridLayout);
		this.setWidth(1280, Unit.PIXELS);
		this.setHeight(-1, Unit.PIXELS);
	
		this.cmdPrint.addClickListener(event -> this.cmdPrint_buttonClick(event));
		this.cmdSave.addClickListener(event -> this.cmdSave_buttonClick(event));
		this.pdfCcQdVphc.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				BBGiamPhatView.this.pdfCcQdVphc_valueChange(event);
			}
		});
		this.txtQdVPHC.addTextChangeListener(event -> this.txtQdVPHC_textChange(event));
		this.cbAuthen.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				BBGiamPhatView.this.cbAuthen_valueChange(event);
			}
		});
		this.txtNgViPham.addTextChangeListener(event -> this.txtNgViPham_textChange(event));
		this.txtVphcKy.addTextChangeListener(event -> this.txtVphcKy_textChange(event));
	} // </generated-code>
	// <generated-code name="variables">
	private XdevButton cmdPrint, cmdSave;
	private XdevFieldGroup<QdGiamMienTienPhat04> fieldGroup;
	private XdevComboBox<AuthUser> cbAuthen;
	private XdevAbsoluteLayout absoluteLayout2;
	private Label lblQuocHieu, label, label2, label3, label4, label5, label7, label6, label8, label9, label10, label11,
			label12, label13, label14, label15, label16, label17, label18, label19, label20, label21, label22, label23,
			label24, label25, label26, label27, label28, label29, label30, label31, label32, label33, label34, label35,
			label37, label38, label36, label39, label40, lblQuocHieu2, label41;
	private XdevTextField txtCoQuanChuQuan, txtDonVi, txtSoQd, txtDdhc, txtQdVPHC, txtHoanTH, txtDvCSGTId, txtCapBac,
			txtDvCSGT, txtNgViPham, txtTienDuocGiamSo, txtTienSauGiamSo, txtTienDuocGiamChu, txtTienSauGiamChu,
			txtLydoGiamMien, txtTvNhanLai, txtNgViPham2, txtToChucThucHien, txtNguoiRaQd, txtCanBoId, txtVphcKy, txtHoanTHKy,
			txtCoQuanXN, txtQdVPHC2, txtVphcKy2, txtGqXuPhatVphcSo;
	private XdevGridLayout form;
	private PopupDateField pdfNgayTao, pdfCcQdVphc, pdfHoanTH, pdfGqXpVphc, pdfXetDonGM, pdfQdVphc2;
	private GridLayout gridLayout;
	private AbsoluteLayout absoluteLayoutTitle, absoluteLayout;
	// </generated-code>

}
