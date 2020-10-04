package com.etc.bca_moto.ui;

import com.etc.bca_moto.entities.AuthUser;
import com.etc.bca_moto.entities.AuthUser_;
import com.etc.bca_moto.entities.QdCuongCheKhauTruTienTuTk07;
import com.etc.bca_moto.entities.QdCuongCheKhauTruTienTuTk07_;
/*import com.etc.bca_moto.entities.auth.AuthUser;
import com.etc.bca_moto.entities.auth.AuthUser_;*/
import com.vaadin.data.Property;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevFieldGroup;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.combobox.XdevComboBox;

public class TaoMoiQD07View extends XdevView {

	/**
	 * 
	 */
	public TaoMoiQD07View() {
		super();
		this.initUI();
		
		this.fieldGroup.setItemDataSource(new QdCuongCheKhauTruTienTuTk07());
		//UI.getCurrent().getSession().setAttribute("TaoMoiQD07View", new TaoMoiQD07View());
		QdCuongCheKhauTruTienTuTk07 QD07 = new QdCuongCheKhauTruTienTuTk07();
		final Object attribute = UI.getCurrent().getSession().getAttribute("TaoMoiQD07View");
		if(attribute.toString()=="")
		 {
			this.fieldGroup.setItemDataSource(new QdCuongCheKhauTruTienTuTk07());
			this.txtSoTienKhauTru.setValue(null);
		 }
		 else
		 {
			final Object attributeEdit = UI.getCurrent().getSession().getAttribute("SuaQD07View");
			QD07 = (QdCuongCheKhauTruTienTuTk07) attributeEdit;
			if(QD07!=null)
			{
//				final LocalDateTime now = LocalDateTime.now();
//				final Date date = new Date();
//				this.fieldGroup.getItemDataSource().getBean().setNgaySua(date);
				PutDataFromSelection(QD07);
			}
		 }
		
		
		
	}
	private void PutDataFromSelection(  final QdCuongCheKhauTruTienTuTk07 QD07) {
		try {
			this.fieldGroup.setItemDataSource(QD07);
//			  final long sqd07 = this.fieldGroup.getItemDataSource().getBean().getId();
		} catch (final Exception e) {
			// TODO: handle exception
			System.out.print(e.toString());
			Notification.show("KHÔNG THỂ TẢI DỮ LIỆU BIÊN BẢN!");
		}
	}
	

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #button}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_buttonClick(final Button.ClickEvent event) {
		try{
			this.fieldGroup.save();
			Notification.show("LƯU THÀNH CÔNG");
		}
		catch(final Exception e){
			Notification.show(e.toString());
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cmbCanBo}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmbCanBo_valueChange(final Property.ValueChangeEvent event) {
		this.txtTenCQChuQuan.setValue(this.cmbCanBo.getSelectedItem().getBean().getDonViCanhsatGt().getTenCoquanChuquan());
		this.txtTenDonVi.setValue(this.cmbCanBo.getSelectedItem().getBean().getDonViCanhsatGt().getTenDonVi());
		this.txtTenCanBo.setValue(this.cmbCanBo.getSelectedItem().getBean().getUserName());
		this.txtCapBacChucVu.setValue(this.cmbCanBo.getSelectedItem().getBean().getCapBac()+", "+this.cmbCanBo.getSelectedItem().getBean().getChucVu());
		this.txtDonvi.setValue(this.cmbCanBo.getSelectedItem().getBean().getDonViCanhsatGt().getTenDonVi());
		this.txtDiaDanhHC.setValue(this.cmbCanBo.getSelectedItem().getBean().getDonViCanhsatGt().getDiaDanhHanhChinh().getTen());
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #button2}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	long sqd07 = 0;
//	private void button2_buttonClick(final Button.ClickEvent event) {
//		this.sqd07 = this.fieldGroup.getItemDataSource().getBean().getId();
//
//		if (this.sqd07 == 0) {
//			Notification.show("VUI LÒNG LƯU QUYẾT ĐỊNH");
//			return;
//		}
//
//		final Window w = new Window();
//		w.center();
//		w.setWidth(1000, UNITS_PIXELS);
//		w.setHeight(600, UNITS_PIXELS);
//		w.setResizable(false);
//		w.setClosable(true);
//		final long sobb = this.sqd07;
//		w.setCaption("QUYẾT ĐỊNH CƯỠNG CHẾ KHẤU TRỪ");
//		UI.getCurrent().getSession().setAttribute("OutPut07PreView", sobb);
//		w.setContent(new OutPut07PreView());
//		UI.getCurrent().addWindow(w);
//	}

	/**
	 * Event handler delegate method for the {@link TextField}
	 * {@link #txtTaiKhoanThu}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtTaiKhoanThu_valueChange(final Property.ValueChangeEvent event) {
		this.txtTaiKhoanThu2.setValue(this.txtTaiKhoanThu.getValue());
	}

	/**
	 * Event handler delegate method for the {@link TextField}
	 * {@link #txtTenNganHang}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtTenNganHang_valueChange(final Property.ValueChangeEvent event) {
		this.txtTenNganHang2.setValue(this.txtTenNganHang.getValue());
		this.txtTenNganHang3.setValue(this.txtTenNganHang.getValue());
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #button2}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button2_buttonClick(final Button.ClickEvent event) {
		this.sqd07 = this.fieldGroup.getItemDataSource().getBean().getId();
		
				if (this.sqd07 == 0) {
					Notification.show("VUI LÒNG LƯU QUYẾT ĐỊNH");
					return;
				}
		
				final Window w = new Window();
				w.center();
				w.setWidth(1000, Unit.PIXELS);
				w.setHeight(600, Unit.PIXELS);
				w.setResizable(false);
				w.setClosable(true);
				final long sobb = this.sqd07;
				w.setCaption("QUYẾT ĐỊNH CƯỠNG CHẾ KHẤU TRỪ");
				UI.getCurrent().getSession().setAttribute("OutPut07PreView", sobb);
				w.setContent(new OutPut07PreView());
				UI.getCurrent().addWindow(w);
	}

	/**
	 * Event handler delegate method for the {@link TextField}
	 * {@link #txtSoTaiKhoanNVp}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtSoTaiKhoanNVp_valueChange(final Property.ValueChangeEvent event) {
		this.txtTutaiKhoan.setValue(this.txtSoTaiKhoanNVp.getValue());
	}
	/**
	 * Event handler delegate method for the {@link TextField} {@link #txtTenNVP}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtTenNVP_valueChange(final Property.ValueChangeEvent event) {
		this.txtTenNVP2.setValue(this.txtTenNVP.getValue());
		this.txtTenNVP3.setValue(this.txtTenNVP.getValue());
		this.txtOngBaToChuc4.setValue(this.txtTenNVP.getValue());
	}
	/**
	 * Event handler delegate method for the {@link TextField} {@link #txtSoVPHC1}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtSoVPHC1_valueChange(final Property.ValueChangeEvent event) {
		this.txtSoVPHC2.setValue(this.txtSoVPHC1.getValue());
		this.txtQuyetDinhXPHCSO3.setValue(this.txtSoVPHC1.getValue());
	}
	/**
	 * Event handler delegate method for the {@link PopupDateField}
	 * {@link #pdfNgayRaQDXPHC}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void pdfNgayRaQDXPHC_valueChange(final Property.ValueChangeEvent event) {
		this.pdfNgayRaQDXPHC2.setValue(this.pdfNgayRaQDXPHC.getValue());
		this.pdfNgayLapQDXPHC3.setValue(this.pdfNgayRaQDXPHC.getValue());
	}
	/**
	 * Event handler delegate method for the {@link TextField}
	 * {@link #txtNguoiKyQDXPHC}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtNguoiKyQDXPHC_valueChange(final Property.ValueChangeEvent event) {
		this.txtNguoiKyQDXPHC2.setValue(this.txtNguoiKyQDXPHC.getValue());
		this.txtNguoiKy3.setValue(this.txtNguoiKyQDXPHC.getValue());
	}
	/**
	 * Event handler delegate method for the {@link TextField}
	 * {@link #txtNganHangNVP}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void txtNganHangNVP_valueChange(final Property.ValueChangeEvent event) {
		this.txtTenNganHangNVP2.setValue(this.txtNganHangNVP.getValue());
		this.txtTenNganHangNVP3.setValue(this.txtNganHangNVP.getValue());
		this.txtTenNganHangNVP4.setValue(this.txtNganHangNVP.getValue());
	}
	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new GridLayout();
		this.gridLayout4 = new XdevGridLayout();
		this.button = new XdevButton();
		this.button2 = new XdevButton();
		this.gridLayout2 = new GridLayout();
		this.absoluteLayout = new AbsoluteLayout();
		this.txtTenCQChuQuan = new TextField();
		this.txtTenDonVi = new TextField();
		this.txtSoQuyetDinh = new TextField();
		this.label = new Label();
		this.label2 = new Label();
		this.label3 = new Label();
		this.pdfNgayLapQD = new PopupDateField();
		this.txtDiaDanhHC = new TextField();
		this.gridLayout3 = new GridLayout();
		this.absoluteLayout2 = new AbsoluteLayout();
		this.label4 = new Label();
		this.label5 = new Label();
		this.label6 = new Label();
		this.label7 = new Label();
		this.label9 = new Label();
		this.txtSoQuyetDinhCuongChe = new TextField();
		this.pdfNgayQDCuongChe = new PopupDateField();
		this.label8 = new Label();
		this.label10 = new Label();
		this.txtSoVPHC1 = new TextField();
		this.pdfNgayRaQDXPHC = new PopupDateField();
		this.label11 = new Label();
		this.txtNguoiKyQDXPHC = new TextField();
		this.label12 = new Label();
		this.txtTenCanBo = new TextField();
		this.label13 = new Label();
		this.txtCapBacChucVu = new TextField();
		this.label14 = new Label();
		this.txtDonvi = new TextField();
		this.label15 = new Label();
		this.label16 = new Label();
		this.pdfNgayRaQDXPHC2 = new PopupDateField();
		this.label17 = new Label();
		this.txtNguoiKyQDXPHC2 = new TextField();
		this.label18 = new Label();
		this.label19 = new Label();
		this.txtTenNVP = new TextField();
		this.label20 = new Label();
		this.label21 = new Label();
		this.txtQuocTich = new TextField();
		this.label22 = new Label();
		this.txtNgheNghiepNVP = new TextField();
		this.label23 = new Label();
		this.txtDiaChiNVP = new TextField();
		this.label24 = new Label();
		this.txtSoCMT = new TextField();
		this.label25 = new Label();
		this.pdfNgayCapCMT = new PopupDateField();
		this.label26 = new Label();
		this.txtNoiCapCMT = new TextField();
		this.label27 = new Label();
		this.label29 = new Label();
		this.label32 = new Label();
		this.label38 = new Label();
		this.txtTutaiKhoan = new TextField();
		this.label39 = new Label();
		this.txtTaiKhoanThu = new TextField();
		this.label40 = new Label();
		this.txtTenNganHang = new TextField();
		this.label41 = new Label();
		this.txtSoNgay = new TextField();
		this.label42 = new Label();
		this.label43 = new Label();
		this.txtTenNVP3 = new TextField();
		this.label44 = new Label();
		this.txtTenNganHangNVP3 = new TextField();
		this.label45 = new Label();
		this.label46 = new Label();
		this.txtTaiKhoanThu2 = new TextField();
		this.label47 = new Label();
		this.txtTenNganHang2 = new TextField();
		this.label48 = new Label();
		this.pdfNgayHieuLucQd = new PopupDateField();
		this.label49 = new Label();
		this.label50 = new Label();
		this.label51 = new Label();
		this.txtOngBaToChuc4 = new TextField();
		this.label52 = new Label();
		this.label53 = new Label();
		this.label54 = new Label();
		this.txtTenNganHangNVP4 = new TextField();
		this.label55 = new Label();
		this.txtTenNganHang3 = new TextField();
		this.label56 = new Label();
		this.txtToChucThucHien = new TextField();
		this.label57 = new Label();
		this.form = new XdevGridLayout();
		this.fieldGroup = new XdevFieldGroup<>(QdCuongCheKhauTruTienTuTk07.class);
		this.txtSoVPHC2 = new TextField();
		this.txtSoTaiKhoanNVp = new TextField();
		this.txtSoTienKhauTru = new TextField();
		this.cmbCanBo = new XdevComboBox<>();
		this.txtNgaySinhNvp = new TextField();
		this.label58 = new Label();
		this.label59 = new Label();
		this.label60 = new Label();
		this.txtQuyetDinhXPHCSO3 = new TextField();
		this.label61 = new Label();
		this.pdfNgayLapQDXPHC3 = new PopupDateField();
		this.txtNguoiKy3 = new TextField();
		this.label28 = new Label();
		this.label30 = new Label();
		this.txtNganHangNVP = new TextField();
		this.label31 = new Label();
		this.txtSoTienKhauTruBangChu = new TextField();
		this.label33 = new Label();
		this.label62 = new Label();
		this.label34 = new Label();
		this.txtTenNVP2 = new TextField();
		this.label63 = new Label();
		this.txtTenNganHangNVP2 = new TextField();
	
		this.gridLayout.setMargin(new MarginInfo(true));
		this.button.setCaption("LƯU");
		this.button2.setCaption("IN");
		this.gridLayout2.setMargin(new MarginInfo(true));
		this.txtTenCQChuQuan.setNullRepresentation("");
		this.txtTenCQChuQuan
				.setInputPrompt("...............................................................................");
		this.txtTenCQChuQuan.setStyleName("content-bold");
		this.txtTenCQChuQuan.setPrimaryStyleName("v-textfield-borderless");
		this.txtTenDonVi.setNullRepresentation("");
		this.txtTenDonVi.setInputPrompt("...............................................................................");
		this.txtTenDonVi.setStyleName("content-bold");
		this.txtTenDonVi.setPrimaryStyleName("v-textfield-borderless");
		this.txtSoQuyetDinh.setNullRepresentation("");
		this.txtSoQuyetDinh
				.setInputPrompt("...............................................................................");
		this.txtSoQuyetDinh.setStyleName("content-bold");
		this.txtSoQuyetDinh.setPrimaryStyleName("v-textfield-borderless");
		this.label.setValue("/QĐ-THMPQĐXP");
		this.label2.setStyleName("content-bold");
		this.label2.setValue("<center>CỘNG HOÀ XÃ HỘI CHỦ NGHĨA VIỆT NAM");
		this.label2.setContentMode(ContentMode.HTML);
		this.label3.setStyleName("content-bold");
		this.label3.setValue("<center>Độc lập - Tự do - Hạnh phúc");
		this.label3.setContentMode(ContentMode.HTML);
		this.pdfNgayLapQD.setDateFormat("dd/MM/yyyy");
		this.txtDiaDanhHC.setNullRepresentation("");
		this.txtDiaDanhHC.setInputPrompt("...............................................................................");
		this.txtDiaDanhHC.setStyleName("content-bold");
		this.txtDiaDanhHC.setPrimaryStyleName("v-textfield-borderless");
		this.label4.setStyleName("content-bold");
		this.label4.setValue("<center>QUYẾT ĐỊNH</center>");
		this.label4.setContentMode(ContentMode.HTML);
		this.label5.setStyleName("content-bold");
		this.label5.setValue("<center>Cưỡng chế khấu trừ tiền từ tài khoản</center>");
		this.label5.setContentMode(ContentMode.HTML);
		this.label6.setValue("Căn cứ Điều 86, Điều 87 Luật xử lý vi phạm hành chính;");
		this.label6.setContentMode(ContentMode.HTML);
		this.label7.setValue(
				"Căn cứ Điều 15 Nghị định số 166/2013/NĐ-CP ngày 12/11/2013 của Chính phủ quy định về cưỡng chế thi hành quyết định xử phạt vi phạm hành chính;");
		this.label7.setContentMode(ContentMode.HTML);
		this.label9.setValue(
				"Căn cứ Quyết định về việc giao quyền cưỡng chế thi hành quyết định xử phạt vi phạm hành chính số ");
		this.label9.setContentMode(ContentMode.HTML);
		this.txtSoQuyetDinhCuongChe.setNullRepresentation("");
		this.txtSoQuyetDinhCuongChe.setInputPrompt(
				"...........................................................................................");
		this.txtSoQuyetDinhCuongChe.setStyleName("content-bold");
		this.txtSoQuyetDinhCuongChe.setPrimaryStyleName("v-textfield-borderless");
		this.pdfNgayQDCuongChe.setDateFormat("dd/MM/yyyy");
		this.label8.setValue("(nếu có);");
		this.label10.setValue("Để bảo đảm thi hành Quyết định xử phạt vi phạm hành chính số:");
		this.label10.setContentMode(ContentMode.HTML);
		this.txtSoVPHC1.setNullRepresentation("");
		this.txtSoVPHC1.setInputPrompt(
				"............................................................................................................");
		this.txtSoVPHC1.setStyleName("content-bold");
		this.txtSoVPHC1.setPrimaryStyleName("v-textfield-borderless");
		this.pdfNgayRaQDXPHC.setDateFormat("dd/MM/yyyy");
		this.label11.setValue("ngày");
		this.txtNguoiKyQDXPHC.setNullRepresentation("");
		this.txtNguoiKyQDXPHC.setInputPrompt(
				"..........................................................................................");
		this.txtNguoiKyQDXPHC.setStyleName("content-bold");
		this.txtNguoiKyQDXPHC.setPrimaryStyleName("v-textfield-borderless");
		this.label12.setValue("Tôi:");
		this.txtTenCanBo.setNullRepresentation("");
		this.txtTenCanBo.setInputPrompt("...............................................................................");
		this.txtTenCanBo.setStyleName("content-bold");
		this.txtTenCanBo.setPrimaryStyleName("v-textfield-borderless");
		this.label13.setValue("Cấp bậc, chức vụ:");
		this.txtCapBacChucVu.setNullRepresentation("");
		this.txtCapBacChucVu
				.setInputPrompt("...............................................................................");
		this.txtCapBacChucVu.setStyleName("content-bold");
		this.txtCapBacChucVu.setPrimaryStyleName("v-textfield-borderless");
		this.label14.setValue("Đơn vị:");
		this.txtDonvi.setNullRepresentation("");
		this.txtDonvi.setInputPrompt("...............................................................................");
		this.txtDonvi.setStyleName("content-bold");
		this.txtDonvi.setPrimaryStyleName("v-textfield-borderless");
		this.label15.setStyleName("content-bold");
		this.label15.setValue("<center>QUYẾT ĐỊNH</center>");
		this.label15.setContentMode(ContentMode.HTML);
		this.label16.setValue(
				"<b>Điều 1. </b>Cưỡng chế khấu trừ tiền từ tài khoản để thi hành Quyết định xử phạt vi phạm hành chính số");
		this.label16.setContentMode(ContentMode.HTML);
		this.pdfNgayRaQDXPHC2.setDateFormat("dd/MM/yyyy");
		this.label17.setValue("<center>do");
		this.label17.setContentMode(ContentMode.HTML);
		this.txtNguoiKyQDXPHC2.setNullRepresentation("");
		this.txtNguoiKyQDXPHC2
				.setInputPrompt("...............................................................................");
		this.txtNguoiKyQDXPHC2.setStyleName("content-bold");
		this.txtNguoiKyQDXPHC2.setPrimaryStyleName("v-textfield-borderless");
		this.label18.setValue("ký, đối với:");
		this.label19.setValue("Ông(Bà)/Tổ chức(Tên tổ chức, người đại diện theo pháp luật:");
		this.label19.setContentMode(ContentMode.HTML);
		this.txtTenNVP.setNullRepresentation("");
		this.txtTenNVP.setInputPrompt(
				".....................................................................................................................................................");
		this.txtTenNVP.setStyleName("content-bold");
		this.txtTenNVP.setPrimaryStyleName("v-textfield-borderless");
		this.label20.setValue("Sinh ngày:");
		this.label21.setValue("Quốc tịch:");
		this.txtQuocTich.setNullRepresentation("");
		this.txtQuocTich.setInputPrompt("...............................................................................");
		this.txtQuocTich.setStyleName("content-bold");
		this.txtQuocTich.setPrimaryStyleName("v-textfield-borderless");
		this.label22.setValue("Nghề nghiệp/Lĩnh vực hoạt động hoặc Mã số doanh nghiệp:");
		this.label22.setContentMode(ContentMode.HTML);
		this.txtNgheNghiepNVP.setNullRepresentation("");
		this.txtNgheNghiepNVP.setInputPrompt(
				".....................................................................................................................................................");
		this.txtNgheNghiepNVP.setStyleName("content-bold");
		this.txtNgheNghiepNVP.setPrimaryStyleName("v-textfield-borderless");
		this.label23.setValue("Nơi ở hiện tại/Địa chỉ trụ sở:");
		this.label23.setContentMode(ContentMode.HTML);
		this.txtDiaChiNVP.setNullRepresentation("");
		this.txtDiaChiNVP.setInputPrompt(
				"......................................................................................................................................................................................................................");
		this.txtDiaChiNVP.setStyleName("content-bold");
		this.txtDiaChiNVP.setPrimaryStyleName("v-textfield-borderless");
		this.label24.setValue("CMND hoặc CCCD hoặc hộ chiếu/GCN đăng ký hoặc GP thành lập số:");
		this.label24.setContentMode(ContentMode.HTML);
		this.txtSoCMT.setNullRepresentation("");
		this.txtSoCMT.setInputPrompt(
				".....................................................................................................................................................");
		this.txtSoCMT.setStyleName("content-bold");
		this.txtSoCMT.setPrimaryStyleName("v-textfield-borderless");
		this.label25.setValue("Ngày cấp:");
		this.pdfNgayCapCMT.setDateFormat("dd/MM/yyyy");
		this.label26.setValue("Nơi cấp:");
		this.txtNoiCapCMT.setNullRepresentation("");
		this.txtNoiCapCMT.setInputPrompt("...............................................................................");
		this.txtNoiCapCMT.setStyleName("content-bold");
		this.txtNoiCapCMT.setPrimaryStyleName("v-textfield-borderless");
		this.label27.setValue("Số tài khoản:");
		this.label29.setValue("- Số tiền bị khấu trừ:");
		this.label32.setValue("Lý do khấu trừ: Không tự nguyện chấp hành Quyết định xử phạt vi phạm hành chính số:");
		this.label32.setContentMode(ContentMode.HTML);
		this.label38.setValue("chuyển tiền từ tài khoản:");
		this.txtTutaiKhoan.setNullRepresentation("");
		this.txtTutaiKhoan
				.setInputPrompt("...............................................................................");
		this.txtTutaiKhoan.setStyleName("content-bold");
		this.txtTutaiKhoan.setPrimaryStyleName("v-textfield-borderless");
		this.label39.setValue("vào tài khoản:");
		this.txtTaiKhoanThu.setNullRepresentation("");
		this.txtTaiKhoanThu
				.setInputPrompt("...............................................................................");
		this.txtTaiKhoanThu.setStyleName("content-bold");
		this.txtTaiKhoanThu.setPrimaryStyleName("v-textfield-borderless");
		this.label40.setValue("của:");
		this.txtTenNganHang.setNullRepresentation("");
		this.txtTenNganHang.setInputPrompt(
				"....................................................................................................");
		this.txtTenNganHang.setStyleName("content-bold");
		this.txtTenNganHang.setPrimaryStyleName("v-textfield-borderless");
		this.label41.setValue("trong thời hạn ");
		this.txtSoNgay.setNullRepresentation("");
		this.txtSoNgay.setInputPrompt("...............................................................................");
		this.txtSoNgay.setStyleName("content-bold");
		this.txtSoNgay.setPrimaryStyleName("v-textfield-borderless");
		this.label42.setValue("ngày, kể từ ngày nhận được Quyết định này.");
		this.label43.setValue("- Trường hợp Ông(Bà)/Tổ chức");
		this.txtTenNVP3.setNullRepresentation("");
		this.txtTenNVP3.setInputPrompt(
				"............................................................................................................................................");
		this.txtTenNVP3.setStyleName("content-bold");
		this.txtTenNVP3.setPrimaryStyleName("v-textfield-borderless");
		this.label44.setValue("không tự nguyện thực hiện trong thời hạn quy định thì");
		this.txtTenNganHangNVP3.setNullRepresentation("");
		this.txtTenNganHangNVP3
				.setInputPrompt("...............................................................................");
		this.txtTenNganHangNVP3.setStyleName("content-bold");
		this.txtTenNganHangNVP3.setPrimaryStyleName("v-textfield-borderless");
		this.label45.setValue(
				"có trách nhiệm trích chuyển từ tài khoản của cá nhân/tổ chức bị cưỡng chế số tiền bị khấu trừ nêu trên đến ");
		this.label46.setValue("tài khoản:");
		this.txtTaiKhoanThu2.setNullRepresentation("");
		this.txtTaiKhoanThu2
				.setInputPrompt("...............................................................................");
		this.txtTaiKhoanThu2.setStyleName("content-bold");
		this.txtTaiKhoanThu2.setPrimaryStyleName("v-textfield-borderless");
		this.label47.setValue("của");
		this.txtTenNganHang2.setNullRepresentation("");
		this.txtTenNganHang2.setInputPrompt(
				".................................................................................................................................................");
		this.txtTenNganHang2.setStyleName("content-bold");
		this.txtTenNganHang2.setPrimaryStyleName("v-textfield-borderless");
		this.label48.setValue("<b>Điều 2.</b> Quyết định này có hiệu lực thi hành kể từ ngày");
		this.label48.setContentMode(ContentMode.HTML);
		this.pdfNgayHieuLucQd.setDateFormat("dd/MM/yyyy");
		this.label49.setValue("<b>Điều 3. </b>Quyết định này được:");
		this.label49.setContentMode(ContentMode.HTML);
		this.label50.setValue(
				"1. Giao cho Ông(Bà)/Tổ chức bị áp dụng biện pháp cưỡng chế thi hành quyết định xử phạt vi phạm hành chính có tên tại Điều 1 để chấp hành Quyết định. Ông(Bà)/Tổ chức phải thực hiện Quyết định này và phải chịu mọi chi phí về việc tổ chức thực hiện cưỡng chế.");
		this.label50.setContentMode(ContentMode.HTML);
		this.label51.setValue("Ông(Bà)/Tổ chức:");
		this.label51.setContentMode(ContentMode.HTML);
		this.txtOngBaToChuc4.setNullRepresentation("");
		this.txtOngBaToChuc4
				.setInputPrompt("...............................................................................");
		this.txtOngBaToChuc4.setStyleName("content-bold");
		this.txtOngBaToChuc4.setPrimaryStyleName("v-textfield-borderless");
		this.label52.setValue("có quyền khiếu nại hoặc khởi kiện hành chính đối với Quyết định này theo quy định của ");
		this.label52.setContentMode(ContentMode.HTML);
		this.label53.setValue("pháp luật.");
		this.label53.setContentMode(ContentMode.HTML);
		this.label54.setValue("2. Gửi cho:");
		this.label54.setContentMode(ContentMode.HTML);
		this.txtTenNganHangNVP4.setNullRepresentation("");
		this.txtTenNganHangNVP4
				.setInputPrompt("...............................................................................");
		this.txtTenNganHangNVP4.setStyleName("content-bold");
		this.txtTenNganHangNVP4.setPrimaryStyleName("v-textfield-borderless");
		this.label55.setValue("để chuyển số tiền bị khấu trừ đến tài khoản của");
		this.label55.setContentMode(ContentMode.HTML);
		this.txtTenNganHang3.setNullRepresentation("");
		this.txtTenNganHang3.setInputPrompt(
				"....................................................................................................");
		this.txtTenNganHang3.setStyleName("content-bold");
		this.txtTenNganHang3.setPrimaryStyleName("v-textfield-borderless");
		this.label56.setValue("3. Gửi cho");
		this.label56.setContentMode(ContentMode.HTML);
		this.txtToChucThucHien.setNullRepresentation("");
		this.txtToChucThucHien
				.setInputPrompt("...............................................................................");
		this.txtToChucThucHien.setStyleName("content-bold");
		this.txtToChucThucHien.setPrimaryStyleName("v-textfield-borderless");
		this.label57.setValue("để tổ chức thực hiện Quyết định này./.");
		this.label57.setContentMode(ContentMode.HTML);
		this.fieldGroup.bind(this.txtTenCQChuQuan, QdCuongCheKhauTruTienTuTk07_.tenCoQuanCapTren.getName());
		this.fieldGroup.bind(this.txtTenDonVi, QdCuongCheKhauTruTienTuTk07_.tenDonVi.getName());
		this.fieldGroup.bind(this.txtSoQuyetDinh, QdCuongCheKhauTruTienTuTk07_.soQuyetDinh.getName());
		this.fieldGroup.bind(this.pdfNgayLapQD, QdCuongCheKhauTruTienTuTk07_.ngayLapQuyetDinh.getName());
		this.fieldGroup.bind(this.txtDiaDanhHC, QdCuongCheKhauTruTienTuTk07_.diaDiemLapQd.getName());
		this.fieldGroup.bind(this.txtSoQuyetDinhCuongChe, QdCuongCheKhauTruTienTuTk07_.soCanCuQdGqcc.getName());
		this.fieldGroup.bind(this.pdfNgayQDCuongChe, QdCuongCheKhauTruTienTuTk07_.ngayCuongChe.getName());
		this.fieldGroup.bind(this.txtSoVPHC1, QdCuongCheKhauTruTienTuTk07_.soQdXphc.getName());
		this.fieldGroup.bind(this.pdfNgayRaQDXPHC, QdCuongCheKhauTruTienTuTk07_.ngayQdXphc.getName());
		this.fieldGroup.bind(this.txtNguoiKyQDXPHC, QdCuongCheKhauTruTienTuTk07_.nguoiKy.getName());
		this.fieldGroup.bind(this.txtTenCanBo, QdCuongCheKhauTruTienTuTk07_.canBoRaQd.getName());
		this.fieldGroup.bind(this.txtCapBacChucVu, QdCuongCheKhauTruTienTuTk07_.capbacChucvu.getName());
		this.fieldGroup.bind(this.txtDonvi, QdCuongCheKhauTruTienTuTk07_.tenDV2.getName());
		this.fieldGroup.bind(this.txtTenNVP, QdCuongCheKhauTruTienTuTk07_.tenNvp.getName());
		this.fieldGroup.bind(this.txtQuocTich, QdCuongCheKhauTruTienTuTk07_.quoctichNvp.getName());
		this.fieldGroup.bind(this.txtNgaySinhNvp, QdCuongCheKhauTruTienTuTk07_.ngaysinhNvp.getName());
		this.fieldGroup.bind(this.txtNgheNghiepNVP, QdCuongCheKhauTruTienTuTk07_.nghenghiepNvp.getName());
		this.fieldGroup.bind(this.txtDiaChiNVP, QdCuongCheKhauTruTienTuTk07_.diachiNvp.getName());
		this.fieldGroup.bind(this.txtSoCMT, QdCuongCheKhauTruTienTuTk07_.soCmndNvp.getName());
		this.fieldGroup.bind(this.pdfNgayCapCMT, QdCuongCheKhauTruTienTuTk07_.ngayCapCmnd.getName());
		this.fieldGroup.bind(this.txtNoiCapCMT, QdCuongCheKhauTruTienTuTk07_.noiCapCmnd.getName());
		this.fieldGroup.bind(this.txtSoTaiKhoanNVp, QdCuongCheKhauTruTienTuTk07_.soTaiKhoanNvp.getName());
		this.fieldGroup.bind(this.txtNganHangNVP, QdCuongCheKhauTruTienTuTk07_.nganHangNvp.getName());
		this.fieldGroup.bind(this.txtSoTienKhauTru, QdCuongCheKhauTruTienTuTk07_.soTienKhauTru.getName());
		this.fieldGroup.bind(this.txtSoTienKhauTruBangChu, QdCuongCheKhauTruTienTuTk07_.soTienBangChu.getName());
		this.fieldGroup.bind(this.txtTaiKhoanThu, QdCuongCheKhauTruTienTuTk07_.soTkKhoBac.getName());
		this.fieldGroup.bind(this.txtTenNganHang, QdCuongCheKhauTruTienTuTk07_.tenDiaChiNganHangThuTien.getName());
		this.fieldGroup.bind(this.txtSoNgay, QdCuongCheKhauTruTienTuTk07_.thoiHan.getName());
		this.fieldGroup.bind(this.txtToChucThucHien, QdCuongCheKhauTruTienTuTk07_.tenDonViThiHanhQd.getName());
		this.fieldGroup.bind(this.pdfNgayHieuLucQd, QdCuongCheKhauTruTienTuTk07_.ngayHieuLuc.getName());
		this.txtSoVPHC2.setNullRepresentation("");
		this.txtSoVPHC2.setInputPrompt(
				"..................................................................................................................................");
		this.txtSoVPHC2.setStyleName("content-bold");
		this.txtSoVPHC2.setPrimaryStyleName("v-textfield-borderless");
		this.txtSoTaiKhoanNVp.setNullRepresentation("");
		this.txtSoTaiKhoanNVp.setInputPrompt(
				"................................................................................................................................................................................................................................................................");
		this.txtSoTaiKhoanNVp.setStyleName("content-bold");
		this.txtSoTaiKhoanNVp.setPrimaryStyleName("v-textfield-borderless");
		this.txtSoTienKhauTru.setNullRepresentation("");
		this.txtSoTienKhauTru.setInputPrompt(
				"..........................................................................................................................................................................................................................");
		this.txtSoTienKhauTru.setStyleName("content-bold");
		this.txtSoTienKhauTru.setPrimaryStyleName("v-textfield-borderless");
		this.cmbCanBo.setItemCaptionFromAnnotation(false);
		this.cmbCanBo.setContainerDataSource(AuthUser.class, false);
		this.cmbCanBo.setItemCaptionPropertyId(AuthUser_.userName.getName());
		this.txtNgaySinhNvp.setNullRepresentation("");
		this.txtNgaySinhNvp
				.setInputPrompt("...............................................................................");
		this.txtNgaySinhNvp.setStyleName("content-bold");
		this.txtNgaySinhNvp.setPrimaryStyleName("v-textfield-borderless");
		this.label58.setValue("ký;");
		this.label59.setValue("ngày");
		this.label60.setValue("ngày");
		this.txtQuyetDinhXPHCSO3.setNullRepresentation("");
		this.txtQuyetDinhXPHCSO3.setInputPrompt(
				".........................................................................................");
		this.txtQuyetDinhXPHCSO3.setStyleName("content-bold");
		this.txtQuyetDinhXPHCSO3.setPrimaryStyleName("v-textfield-borderless");
		this.label61.setValue("do");
		this.pdfNgayLapQDXPHC3.setDateFormat("dd/MM/yyyy");
		this.txtNguoiKy3.setNullRepresentation("");
		this.txtNguoiKy3.setInputPrompt(
				"....................................................................................................");
		this.txtNguoiKy3.setStyleName("content-bold");
		this.txtNguoiKy3.setPrimaryStyleName("v-textfield-borderless");
		this.label28.setValue("do");
		this.label30.setValue("tại:");
		this.txtNganHangNVP.setNullRepresentation("");
		this.txtNganHangNVP.setInputPrompt(
				"................................................................................................................................................................................................................................................................");
		this.txtNganHangNVP.setStyleName("content-bold");
		this.txtNganHangNVP.setPrimaryStyleName("v-textfield-borderless");
		this.label31.setValue("(Bằng chữ:");
		this.txtSoTienKhauTruBangChu.setNullRepresentation("");
		this.txtSoTienKhauTruBangChu.setInputPrompt(
				"................................................................................................................................................................................................................................................................");
		this.txtSoTienKhauTruBangChu.setStyleName("content-bold");
		this.txtSoTienKhauTruBangChu.setPrimaryStyleName("v-textfield-borderless");
		this.label33.setValue(")");
		this.label62.setValue("ký;");
		this.label34.setValue("- Ông(Bà)/Tổ chức:");
		this.txtTenNVP2.setNullRepresentation("");
		this.txtTenNVP2.setInputPrompt(
				"....................................................................................................");
		this.txtTenNVP2.setStyleName("content-bold");
		this.txtTenNVP2.setPrimaryStyleName("v-textfield-borderless");
		this.label63.setValue("có trách nhiệm yêu cầu");
		this.txtTenNganHangNVP2.setNullRepresentation("");
		this.txtTenNganHangNVP2.setInputPrompt(
				"....................................................................................................");
		this.txtTenNganHangNVP2.setStyleName("content-bold");
		this.txtTenNganHangNVP2.setPrimaryStyleName("v-textfield-borderless");
	
		this.gridLayout4.setColumns(3);
		this.gridLayout4.setRows(2);
		this.button.setWidth(77, Unit.PIXELS);
		this.button.setHeight(40, Unit.PIXELS);
		this.gridLayout4.addComponent(this.button, 0, 0);
		this.button2.setWidth(77, Unit.PIXELS);
		this.button2.setHeight(40, Unit.PIXELS);
		this.gridLayout4.addComponent(this.button2, 1, 0);
		final CustomComponent gridLayout4_hSpacer = new CustomComponent();
		gridLayout4_hSpacer.setSizeFull();
		this.gridLayout4.addComponent(gridLayout4_hSpacer, 2, 0, 2, 0);
		this.gridLayout4.setColumnExpandRatio(2, 1.0F);
		final CustomComponent gridLayout4_vSpacer = new CustomComponent();
		gridLayout4_vSpacer.setSizeFull();
		this.gridLayout4.addComponent(gridLayout4_vSpacer, 0, 1, 1, 1);
		this.gridLayout4.setRowExpandRatio(1, 1.0F);
		this.txtTenCQChuQuan.setWidth(260, Unit.PIXELS);
		this.txtTenCQChuQuan.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTenCQChuQuan, "left:10px; top:0px");
		this.txtTenDonVi.setWidth(260, Unit.PIXELS);
		this.txtTenDonVi.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtTenDonVi, "left:10px; top:24px");
		this.txtSoQuyetDinh.setWidth(260, Unit.PIXELS);
		this.txtSoQuyetDinh.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtSoQuyetDinh, "left:10px; top:48px");
		this.label.setWidth(17, Unit.PERCENTAGE);
		this.label.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label, "left:269px; top:48px");
		this.label2.setWidth(87, Unit.PERCENTAGE);
		this.label2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label2, "left:670px; top:0px");
		this.label3.setWidth(87, Unit.PERCENTAGE);
		this.label3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label3, "left:670px; top:24px");
		this.pdfNgayLapQD.setWidth(150, Unit.PIXELS);
		this.pdfNgayLapQD.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.pdfNgayLapQD, "left:816px; top:58px");
		this.txtDiaDanhHC.setWidth(200, Unit.PIXELS);
		this.txtDiaDanhHC.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtDiaDanhHC, "left:607px; top:58px");
		this.gridLayout2.setColumns(2);
		this.gridLayout2.setRows(2);
		this.absoluteLayout.setWidth(1000, Unit.PIXELS);
		this.absoluteLayout.setHeight(120, Unit.PIXELS);
		this.gridLayout2.addComponent(this.absoluteLayout, 0, 0);
		final CustomComponent gridLayout2_hSpacer = new CustomComponent();
		gridLayout2_hSpacer.setSizeFull();
		this.gridLayout2.addComponent(gridLayout2_hSpacer, 1, 0, 1, 0);
		this.gridLayout2.setColumnExpandRatio(1, 1.0F);
		final CustomComponent gridLayout2_vSpacer = new CustomComponent();
		gridLayout2_vSpacer.setSizeFull();
		this.gridLayout2.addComponent(gridLayout2_vSpacer, 0, 1, 0, 1);
		this.gridLayout2.setRowExpandRatio(1, 1.0F);
		this.label4.setWidth(17, Unit.PERCENTAGE);
		this.label4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label4, "left:431px; top:21px");
		this.label5.setWidth(432, Unit.PIXELS);
		this.label5.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label5, "left:274px; top:45px");
		this.label6.setWidth(47, Unit.PERCENTAGE);
		this.label6.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label6, "left:10px; top:79px");
		this.label7.setWidth(986, Unit.PIXELS);
		this.label7.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label7, "left:10px; top:103px");
		this.label9.setWidth(630, Unit.PIXELS);
		this.label9.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label9, "left:10px; top:127px");
		this.txtSoQuyetDinhCuongChe.setWidth(351, Unit.PIXELS);
		this.txtSoQuyetDinhCuongChe.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoQuyetDinhCuongChe, "left:645px; top:127px");
		this.pdfNgayQDCuongChe.setWidth(150, Unit.PIXELS);
		this.pdfNgayQDCuongChe.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.pdfNgayQDCuongChe, "left:44px; top:151px");
		this.label8.setWidth(57, Unit.PIXELS);
		this.label8.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label8, "left:193px; top:151px");
		this.label10.setWidth(410, Unit.PIXELS);
		this.label10.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label10, "left:10px; top:175px");
		this.txtSoVPHC1.setWidth(356, Unit.PIXELS);
		this.txtSoVPHC1.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoVPHC1, "left:421px; top:175px");
		this.pdfNgayRaQDXPHC.setWidth(150, Unit.PIXELS);
		this.pdfNgayRaQDXPHC.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.pdfNgayRaQDXPHC, "left:815px; top:175px");
		this.label11.setWidth(35, Unit.PIXELS);
		this.label11.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label11, "left:10px; top:151px");
		this.txtNguoiKyQDXPHC.setWidth(340, Unit.PIXELS);
		this.txtNguoiKyQDXPHC.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNguoiKyQDXPHC, "left:30px; top:199px");
		this.label12.setWidth(30, Unit.PIXELS);
		this.label12.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label12, "left:10px; top:223px");
		this.txtTenCanBo.setWidth(200, Unit.PIXELS);
		this.txtTenCanBo.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenCanBo, "left:39px; top:223px");
		this.label13.setWidth(120, Unit.PIXELS);
		this.label13.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label13, "left:278px; top:223px");
		this.txtCapBacChucVu.setWidth(220, Unit.PIXELS);
		this.txtCapBacChucVu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtCapBacChucVu, "left:397px; top:223px");
		this.label14.setWidth(50, Unit.PIXELS);
		this.label14.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label14, "left:616px; top:223px");
		this.txtDonvi.setWidth(310, Unit.PIXELS);
		this.txtDonvi.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtDonvi, "left:665px; top:223px");
		this.label15.setWidth(17, Unit.PERCENTAGE);
		this.label15.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label15, "left:431px; top:268px");
		this.label16.setWidth(630, Unit.PIXELS);
		this.label16.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label16, "left:10px; top:302px");
		this.pdfNgayRaQDXPHC2.setWidth(150, Unit.PIXELS);
		this.pdfNgayRaQDXPHC2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.pdfNgayRaQDXPHC2, "left:10px; top:326px");
		this.label17.setWidth(28, Unit.PIXELS);
		this.label17.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label17, "left:159px; top:326px");
		this.txtNguoiKyQDXPHC2.setWidth(300, Unit.PIXELS);
		this.txtNguoiKyQDXPHC2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNguoiKyQDXPHC2, "left:190px; top:326px");
		this.label18.setWidth(78, Unit.PIXELS);
		this.label18.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label18, "left:489px; top:326px");
		this.label19.setWidth(390, Unit.PIXELS);
		this.label19.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label19, "left:10px; top:350px");
		this.txtTenNVP.setWidth(599, Unit.PIXELS);
		this.txtTenNVP.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNVP, "left:397px; top:350px");
		this.label20.setWidth(78, Unit.PIXELS);
		this.label20.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label20, "left:10px; top:374px");
		this.label21.setWidth(78, Unit.PIXELS);
		this.label21.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label21, "left:273px; top:374px");
		this.txtQuocTich.setWidth(220, Unit.PIXELS);
		this.txtQuocTich.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtQuocTich, "left:350px; top:374px");
		this.label22.setWidth(390, Unit.PIXELS);
		this.label22.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label22, "left:10px; top:398px");
		this.txtNgheNghiepNVP.setWidth(599, Unit.PIXELS);
		this.txtNgheNghiepNVP.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNgheNghiepNVP, "left:397px; top:398px");
		this.label23.setWidth(180, Unit.PIXELS);
		this.label23.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label23, "left:10px; top:422px");
		this.txtDiaChiNVP.setWidth(807, Unit.PIXELS);
		this.txtDiaChiNVP.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtDiaChiNVP, "left:189px; top:422px");
		this.label24.setWidth(450, Unit.PIXELS);
		this.label24.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label24, "left:10px; top:446px");
		this.txtSoCMT.setWidth(536, Unit.PIXELS);
		this.txtSoCMT.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoCMT, "left:460px; top:446px");
		this.label25.setWidth(78, Unit.PIXELS);
		this.label25.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label25, "left:10px; top:470px");
		this.pdfNgayCapCMT.setWidth(150, Unit.PIXELS);
		this.pdfNgayCapCMT.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.pdfNgayCapCMT, "left:87px; top:470px");
		this.label26.setWidth(78, Unit.PIXELS);
		this.label26.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label26, "left:273px; top:470px");
		this.txtNoiCapCMT.setWidth(220, Unit.PIXELS);
		this.txtNoiCapCMT.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNoiCapCMT, "left:350px; top:470px");
		this.label27.setWidth(88, Unit.PIXELS);
		this.label27.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label27, "left:10px; top:494px");
		this.label29.setWidth(128, Unit.PIXELS);
		this.label29.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label29, "left:10px; top:518px");
		this.label32.setWidth(550, Unit.PIXELS);
		this.label32.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label32, "left:10px; top:542px");
		this.label38.setWidth(160, Unit.PIXELS);
		this.label38.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label38, "left:10px; top:614px");
		this.txtTutaiKhoan.setWidth(140, Unit.PIXELS);
		this.txtTutaiKhoan.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTutaiKhoan, "left:168px; top:614px");
		this.label39.setWidth(90, Unit.PIXELS);
		this.label39.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label39, "left:310px; top:614px");
		this.txtTaiKhoanThu.setWidth(220, Unit.PIXELS);
		this.txtTaiKhoanThu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTaiKhoanThu, "left:399px; top:614px");
		this.label40.setWidth(30, Unit.PIXELS);
		this.label40.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label40, "left:617px; top:614px");
		this.txtTenNganHang.setWidth(350, Unit.PIXELS);
		this.txtTenNganHang.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNganHang, "left:646px; top:614px");
		this.label41.setWidth(90, Unit.PIXELS);
		this.label41.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label41, "left:10px; top:638px");
		this.txtSoNgay.setWidth(40, Unit.PIXELS);
		this.txtSoNgay.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoNgay, "left:97px; top:638px");
		this.label42.setWidth(282, Unit.PIXELS);
		this.label42.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label42, "left:136px; top:638px");
		this.label43.setWidth(200, Unit.PIXELS);
		this.label43.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label43, "left:10px; top:662px");
		this.txtTenNVP3.setWidth(445, Unit.PIXELS);
		this.txtTenNVP3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNVP3, "left:209px; top:662px");
		this.label44.setWidth(340, Unit.PIXELS);
		this.label44.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label44, "left:656px; top:662px");
		this.txtTenNganHangNVP3.setWidth(290, Unit.PIXELS);
		this.txtTenNganHangNVP3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNganHangNVP3, "left:10px; top:686px");
		this.label45.setWidth(679, Unit.PIXELS);
		this.label45.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label45, "left:298px; top:686px");
		this.label46.setWidth(70, Unit.PIXELS);
		this.label46.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label46, "left:10px; top:710px");
		this.txtTaiKhoanThu2.setWidth(310, Unit.PIXELS);
		this.txtTaiKhoanThu2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTaiKhoanThu2, "left:81px; top:710px");
		this.label47.setWidth(30, Unit.PIXELS);
		this.label47.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label47, "left:389px; top:710px");
		this.txtTenNganHang2.setWidth(78, Unit.PERCENTAGE);
		this.txtTenNganHang2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNganHang2, "left:418px; top:710px");
		this.label48.setWidth(350, Unit.PIXELS);
		this.label48.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label48, "left:10px; top:734px");
		this.pdfNgayHieuLucQd.setWidth(150, Unit.PIXELS);
		this.pdfNgayHieuLucQd.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.pdfNgayHieuLucQd, "left:361px; top:734px");
		this.label49.setWidth(350, Unit.PIXELS);
		this.label49.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label49, "left:10px; top:758px");
		this.label50.setWidth(986, Unit.PIXELS);
		this.label50.setHeight(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label50, "left:10px; top:782px");
		this.label51.setWidth(120, Unit.PIXELS);
		this.label51.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label51, "left:10px; top:831px");
		this.txtOngBaToChuc4.setWidth(283, Unit.PIXELS);
		this.txtOngBaToChuc4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtOngBaToChuc4, "left:129px; top:831px");
		this.label52.setWidth(564, Unit.PIXELS);
		this.label52.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label52, "left:413px; top:831px");
		this.label53.setWidth(100, Unit.PIXELS);
		this.label53.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label53, "left:0px; top:855px");
		this.label54.setWidth(100, Unit.PIXELS);
		this.label54.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label54, "left:10px; top:879px");
		this.txtTenNganHangNVP4.setWidth(310, Unit.PIXELS);
		this.txtTenNganHangNVP4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNganHangNVP4, "left:109px; top:879px");
		this.label55.setWidth(306, Unit.PIXELS);
		this.label55.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label55, "left:418px; top:879px");
		this.txtTenNganHang3.setWidth(266, Unit.PIXELS);
		this.txtTenNganHang3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNganHang3, "left:730px; top:879px");
		this.label56.setWidth(100, Unit.PIXELS);
		this.label56.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label56, "left:10px; top:903px");
		this.txtToChucThucHien.setWidth(310, Unit.PIXELS);
		this.txtToChucThucHien.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtToChucThucHien, "left:109px; top:903px");
		this.label57.setWidth(306, Unit.PIXELS);
		this.label57.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label57, "left:418px; top:903px");
		this.form.setWidth(30, Unit.PIXELS);
		this.form.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.form, "left:259px; top:971px");
		this.txtSoVPHC2.setWidth(351, Unit.PIXELS);
		this.txtSoVPHC2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoVPHC2, "left:645px; top:302px");
		this.txtSoTaiKhoanNVp.setWidth(290, Unit.PIXELS);
		this.txtSoTaiKhoanNVp.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoTaiKhoanNVp, "left:100px; top:494px");
		this.txtSoTienKhauTru.setWidth(250, Unit.PIXELS);
		this.txtSoTienKhauTru.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoTienKhauTru, "left:138px; top:518px");
		this.cmbCanBo.setWidth(35, Unit.PIXELS);
		this.cmbCanBo.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cmbCanBo, "left:240px; top:223px");
		this.txtNgaySinhNvp.setWidth(180, Unit.PIXELS);
		this.txtNgaySinhNvp.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNgaySinhNvp, "left:87px; top:374px");
		this.label58.setWidth(5, Unit.PERCENTAGE);
		this.label58.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label58, "left:372px; top:199px");
		this.label59.setWidth(38, Unit.PIXELS);
		this.label59.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label59, "left:777px; top:175px");
		this.label60.setWidth(48, Unit.PIXELS);
		this.label60.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label60, "left:948px; top:542px");
		this.txtQuyetDinhXPHCSO3.setWidth(380, Unit.PIXELS);
		this.txtQuyetDinhXPHCSO3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtQuyetDinhXPHCSO3, "left:565px; top:542px");
		this.label61.setWidth(18, Unit.PIXELS);
		this.label61.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label61, "left:160px; top:566px");
		this.pdfNgayLapQDXPHC3.setWidth(150, Unit.PIXELS);
		this.pdfNgayLapQDXPHC3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.pdfNgayLapQDXPHC3, "left:10px; top:566px");
		this.txtNguoiKy3.setWidth(346, Unit.PIXELS);
		this.txtNguoiKy3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNguoiKy3, "left:180px; top:566px");
		this.label28.setWidth(20, Unit.PIXELS);
		this.label28.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label28, "left:10px; top:199px");
		this.label30.setWidth(28, Unit.PIXELS);
		this.label30.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label30, "left:392px; top:494px");
		this.txtNganHangNVP.setWidth(577, Unit.PIXELS);
		this.txtNganHangNVP.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtNganHangNVP, "left:419px; top:494px");
		this.label31.setWidth(78, Unit.PIXELS);
		this.label31.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label31, "left:392px; top:518px");
		this.txtSoTienKhauTruBangChu.setWidth(500, Unit.PIXELS);
		this.txtSoTienKhauTruBangChu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtSoTienKhauTruBangChu, "left:474px; top:518px");
		this.label33.setWidth(18, Unit.PIXELS);
		this.label33.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label33, "left:978px; top:518px");
		this.label62.setWidth(18, Unit.PIXELS);
		this.label62.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label62, "left:528px; top:566px");
		this.label34.setWidth(128, Unit.PIXELS);
		this.label34.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label34, "left:10px; top:590px");
		this.txtTenNVP2.setWidth(346, Unit.PIXELS);
		this.txtTenNVP2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNVP2, "left:140px; top:590px");
		this.label63.setWidth(150, Unit.PIXELS);
		this.label63.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label63, "left:490px; top:590px");
		this.txtTenNganHangNVP2.setWidth(350, Unit.PIXELS);
		this.txtTenNganHangNVP2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtTenNganHangNVP2, "left:646px; top:590px");
		this.gridLayout3.setColumns(2);
		this.gridLayout3.setRows(2);
		this.absoluteLayout2.setWidth(1000, Unit.PIXELS);
		this.absoluteLayout2.setHeight(1200, Unit.PIXELS);
		this.gridLayout3.addComponent(this.absoluteLayout2, 0, 0);
		final CustomComponent gridLayout3_hSpacer = new CustomComponent();
		gridLayout3_hSpacer.setSizeFull();
		this.gridLayout3.addComponent(gridLayout3_hSpacer, 1, 0, 1, 0);
		this.gridLayout3.setColumnExpandRatio(1, 1.0F);
		final CustomComponent gridLayout3_vSpacer = new CustomComponent();
		gridLayout3_vSpacer.setSizeFull();
		this.gridLayout3.addComponent(gridLayout3_vSpacer, 0, 1, 0, 1);
		this.gridLayout3.setRowExpandRatio(1, 1.0F);
		this.gridLayout.setColumns(2);
		this.gridLayout.setRows(4);
		this.gridLayout4.setWidth(1000, Unit.PIXELS);
		this.gridLayout4.setHeight(70, Unit.PIXELS);
		this.gridLayout.addComponent(this.gridLayout4, 0, 0);
		this.gridLayout2.setWidth(1000, Unit.PIXELS);
		this.gridLayout2.setHeight(110, Unit.PIXELS);
		this.gridLayout.addComponent(this.gridLayout2, 0, 1);
		this.gridLayout3.setWidth(1000, Unit.PIXELS);
		this.gridLayout3.setHeight(1200, Unit.PIXELS);
		this.gridLayout.addComponent(this.gridLayout3, 0, 2);
		final CustomComponent gridLayout_hSpacer = new CustomComponent();
		gridLayout_hSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_hSpacer, 1, 0, 1, 2);
		this.gridLayout.setColumnExpandRatio(1, 1.0F);
		final CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 3, 0, 3);
		this.gridLayout.setRowExpandRatio(3, 1.0F);
		this.gridLayout.setWidth(100, Unit.PERCENTAGE);
		this.gridLayout.setHeight(1200, Unit.PIXELS);
		this.setContent(this.gridLayout);
		this.setSizeFull();
	
		this.button.addClickListener(event -> this.button_buttonClick(event));
		this.button2.addClickListener(event -> this.button2_buttonClick(event));
		this.txtSoVPHC1.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtSoVPHC1_valueChange(event);
			}
		});
		this.pdfNgayRaQDXPHC.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.pdfNgayRaQDXPHC_valueChange(event);
			}
		});
		this.txtNguoiKyQDXPHC.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtNguoiKyQDXPHC_valueChange(event);
			}
		});
		this.txtTenNVP.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtTenNVP_valueChange(event);
			}
		});
		this.txtTaiKhoanThu.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtTaiKhoanThu_valueChange(event);
			}
		});
		this.txtTenNganHang.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtTenNganHang_valueChange(event);
			}
		});
		this.txtSoTaiKhoanNVp.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtSoTaiKhoanNVp_valueChange(event);
			}
		});
		this.cmbCanBo.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.cmbCanBo_valueChange(event);
			}
		});
		this.txtNganHangNVP.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				TaoMoiQD07View.this.txtNganHangNVP_valueChange(event);
			}
		});
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button, button2;
	private XdevComboBox<AuthUser> cmbCanBo;
	private TextField txtTenCQChuQuan, txtTenDonVi, txtSoQuyetDinh, txtDiaDanhHC, txtSoQuyetDinhCuongChe, txtSoVPHC1,
			txtNguoiKyQDXPHC, txtTenCanBo, txtCapBacChucVu, txtDonvi, txtNguoiKyQDXPHC2, txtTenNVP, txtQuocTich,
			txtNgheNghiepNVP, txtDiaChiNVP, txtSoCMT, txtNoiCapCMT, txtTutaiKhoan, txtTaiKhoanThu, txtTenNganHang,
			txtSoNgay, txtTenNVP3, txtTenNganHangNVP3, txtTaiKhoanThu2, txtTenNganHang2, txtOngBaToChuc4,
			txtTenNganHangNVP4, txtTenNganHang3, txtToChucThucHien, txtSoVPHC2, txtSoTaiKhoanNVp, txtSoTienKhauTru,
			txtNgaySinhNvp, txtQuyetDinhXPHCSO3, txtNguoiKy3, txtNganHangNVP, txtSoTienKhauTruBangChu, txtTenNVP2,
			txtTenNganHangNVP2;
	private Label label, label2, label3, label4, label5, label6, label7, label9, label8, label10, label11, label12, label13,
			label14, label15, label16, label17, label18, label19, label20, label21, label22, label23, label24, label25,
			label26, label27, label29, label32, label38, label39, label40, label41, label42, label43, label44, label45,
			label46, label47, label48, label49, label50, label51, label52, label53, label54, label55, label56, label57,
			label58, label59, label60, label61, label28, label30, label31, label33, label62, label34, label63;
	private XdevGridLayout gridLayout4, form;
	private XdevFieldGroup<QdCuongCheKhauTruTienTuTk07> fieldGroup;
	private PopupDateField pdfNgayLapQD, pdfNgayQDCuongChe, pdfNgayRaQDXPHC, pdfNgayRaQDXPHC2, pdfNgayCapCMT,
			pdfNgayHieuLucQd, pdfNgayLapQDXPHC3;
	private GridLayout gridLayout, gridLayout2, gridLayout3;
	private AbsoluteLayout absoluteLayout, absoluteLayout2;
	// </generated-code>

}
