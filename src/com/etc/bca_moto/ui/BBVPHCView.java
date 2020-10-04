package com.etc.bca_moto.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.StreamResource;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.xdev.ui.PopupWindow;
import com.xdev.ui.XdevFieldGroup;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.combobox.XdevComboBox;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class BBVPHCView extends XdevView {

	private static BBVPHCView instance = null;

	/**
	 * 
	 */
	public BBVPHCView() {
		super();
		this.initUI();
		// this.fieldGroup.setItemDataSource(new BienbanVphc());
	}

	public void setTextArea(final StringBuffer sbf) {
		this.taNdVPHC.setValue(sbf.toString());
	}

	public static BBVPHCView getInstance() {
		if (instance == null) {
			instance = new BBVPHCView();
		}
		return instance;
	}

	/**
	 * Event handler delegate method for the {@link Button}
	 * {@link #btnNhapSoBB}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnNhapSoBB_buttonClick(final Button.ClickEvent event) {
		this.txtFiledNhapSoBB.setVisible(!this.txtFiledNhapSoBB.isVisible());
		if (this.txtFiledNhapSoBB.isVisible()) {
			this.btnNhapSoBB.setIcon(FontAwesome.CARET_RIGHT);
		} else {
			this.btnNhapSoBB.setIcon(FontAwesome.CARET_LEFT);
		}
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #brnSave}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void brnSave_buttonClick(final Button.ClickEvent event) {
		this.fieldGroup.save();
		System.out.println("Success!!!");
	}

	public static Connection getConnection() {
		final String URL = "jdbc:oracle:thin:@10.0.3.202:1521:orcl";
		final String username = "TVIS_PROD";
		final String password = "Etcadmin1";
		try {
			return DriverManager.getConnection(URL, username, password);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnPrint}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnPrint_buttonClick(final Button.ClickEvent event) {

		final Connection conn = getConnection();
		JasperReport jpReport = null;
		JasperPrint jasperPrint = null;
		final String path = System.getProperty("java.class.path").split("\\.")[0];
		try {
			jpReport = JasperCompileManager.compileReport(
					path + "ReportExample\\WebContent\\WEB-INF\\resources\\reports\\Mau_Bien_Ban_So_04.jrxml");
			// Preparing parameters
			final Map<String, Object> parameters = new HashMap<>();
			parameters.put("id", this.txtFiledNhapSoBB.getValue());
			parameters.put("cbId", this.txtFieldCanCu.getValue());
			jasperPrint = JasperFillManager.fillReport(jpReport, parameters, conn);
			conn.close();
		} catch (JRException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] b = null;
		try {
			b = JasperExportManager.exportReportToPdf(jasperPrint);
		} catch (final JRException e) {
			e.printStackTrace();
		}
		final InputStream stream = new ByteArrayInputStream(b);
		final StreamResource.StreamSource source = new StreamResource.StreamSource() {
			@Override
			public InputStream getStream() {
				return stream;
			}
		};
		final StreamResource resource = new StreamResource(source, "Mau_Bao_Cao_So_04.pdf");
		Page.getCurrent().open(resource, "_blank", false);
	}

	/**
	 * Event handler delegate method for the {@link Button}
	 * {@link #btnChonTVPTGT}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnChonTVPTGT_buttonClick(final Button.ClickEvent event) {
		final OptionTVPTGTView tvptgtView = OptionTVPTGTView.getInstance();
		PopupWindow.For(tvptgtView)
				.caption(
						"<div style='boder:0px;background-color:#0E82CF;width:100%;height:auto;color:white;padding:0px 0px;'><b>Thêm nội dung<b></div>")
				.modal(true).width(900, Unit.PIXELS).show().setCaptionAsHtml(true);

		/*
		 * final Window w = new Window(); w.center(); w.setWidth(900,
		 * Unit.PIXELS); w.setHeightUndefined(); w.setClosable(true);
		 * w.setModal(true); w.setContent(tvptgtView); //w.setCaption("");
		 * w.setCaptionAsHtml(true); //w.setPrimaryStyleName("v-title");
		 * 
		 * UI.getCurrent().addWindow(w);
		 */
	}

	/**
	 * Event handler delegate method for the {@link Button} {@link #btnShow}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnShow_buttonClick(final Button.ClickEvent event) {
		if (this.txtFiledNhapSoBB.isVisible()) {
			this.btnNhapSoBB.setIcon(FontAwesome.CARET_DOWN);
		} else {
			this.btnNhapSoBB.setIcon(FontAwesome.CARET_UP);
		}
	}

	/**
	 * Event handler delegate method for the {@link Button}
	 * {@link #btnChonHVVP}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnChonHVVP_buttonClick(final Button.ClickEvent event) {
		final OptionHVVP hvvp = OptionHVVP.getInstance();
		PopupWindow.For(hvvp)
				.caption(
						"<div style='boder:0px;background-color:#0E82CF;width:100%;height:auto;color:white;padding:0px 0px;'><b>CHỌN HÀNH VI VI PHẠM<b></div>")
				.modal(true).width(900, Unit.PIXELS).show().setCaptionAsHtml(true);
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new GridLayout();
		this.absoluteLayout = new AbsoluteLayout();
		this.brnSave = new Button();
		this.btnPrint = new Button();
		this.absoluteLayout2 = new AbsoluteLayout();
		this.label = new Label();
		this.label2 = new Label();
		this.label3 = new Label();
		this.label4 = new Label();
		this.comboBox = new XdevComboBox<>();
		this.label6 = new Label();
		this.label7 = new Label();
		this.txtFieldHoursNL = new TextField();
		this.txtFieldMinuteNL = new TextField();
		this.label8 = new Label();
		this.popupDateFieldNL = new PopupDateField();
		this.label9 = new Label();
		this.txtFieldNoiLapBB = new TextField();
		this.label10 = new Label();
		this.label11 = new Label();
		this.label12 = new Label();
		this.label13 = new Label();
		this.cbChucVu = new XdevComboBox<>();
		this.cbDonViCSGT = new XdevComboBox<>();
		this.cbNguoiChungKien = new XdevComboBox<>();
		this.label14 = new Label();
		this.label15 = new Label();
		this.label16 = new Label();
		this.label17 = new Label();
		this.cbQuocTich = new XdevComboBox<>();
		this.cbNgheNghiep = new XdevComboBox<>();
		this.label18 = new Label();
		this.popupDateFieldCCCD = new PopupDateField();
		this.label19 = new Label();
		this.txtFieldTenCB = new TextField();
		this.btnNhapSoBB = new Button();
		this.label20 = new Label();
		this.txtFiledNhapSoBB = new TextField();
		this.label21 = new Label();
		this.taNdVPHC = new TextArea();
		this.taTVPTGT = new TextArea();
		this.label22 = new Label();
		this.txtFieldTenNgBiLapBBYC = new TextField();
		this.label23 = new Label();
		this.txtFieldHourMeet = new TextField();
		this.txtFieldMinuteMeet = new TextField();
		this.popupDateFieldMeet = new PopupDateField();
		this.label24 = new Label();
		this.label25 = new Label();
		this.label26 = new Label();
		this.label27 = new Label();
		this.txtFieldMinute7 = new TextField();
		this.txtFieldHour3 = new TextField();
		this.popupDateField4 = new PopupDateField();
		this.txtFieldNoiOHienTai = new TextField();
		this.txtFieldCanCu = new TextField();
		this.txtFieldDoBngBiLapBB = new TextField();
		this.txtFieldSDT = new TextField();
		this.txtFieldCCCD = new TextField();
		this.txtFieldNoiCapCCCD = new TextField();
		this.txtFieldTenNguoiBiLapBB = new TextField();
		this.form = new XdevGridLayout();
		this.fieldGroup = new XdevFieldGroup<>(CustomComponent.class);
		this.btnChonHVVP = new Button();
		this.btnChonTVPTGT = new Button();
		this.txtFieldNoiCapCCCD2 = new TextField();
		this.btnShow = new Button();

		this.setPrimaryStyleName("v-font-ct");
		this.gridLayout.setPrimaryStyleName("v-gridlayout-scroll");
		this.gridLayout.setCaptionAsHtml(true);
		this.absoluteLayout.setCaption("");
		this.absoluteLayout.setCaptionAsHtml(true);
		this.brnSave.setIcon(FontAwesome.SAVE);
		this.brnSave.setCaption("Lưu");
		this.brnSave.setPrimaryStyleName("v-btnLuu");
		this.btnPrint.setIcon(FontAwesome.PRINT);
		this.btnPrint.setCaption("In");
		this.btnPrint.setPrimaryStyleName("v-btnPrint");
		this.label.setValue("<b>CỤC CẢNH SÁT GIAO THÔNG</b><br>PHÒNG CẢNH SÁT GIAO THÔNG<br>Số:<br>Nhập số BB:");
		this.label.setContentMode(ContentMode.HTML);
		this.label2.setPrimaryStyleName("v-label-ct");
		this.label2.setValue("<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br> Độc lập - Tự do - Hạnh phúc</b>");
		this.label2.setContentMode(ContentMode.HTML);
		this.label3.setPrimaryStyleName("v-label-ct");
		this.label3.setValue("<b>BIÊN BẢN VI PHẠM HÀNH CHÍNH</b>");
		this.label3.setContentMode(ContentMode.HTML);
		this.label4.setValue("Căn cứ &emsp;<b style=\"color:red;\">*</b>");
		this.label4.setContentMode(ContentMode.HTML);
		this.comboBox.setItemCaptionFromAnnotation(false);
		this.comboBox.setStyleName("borderless");
		this.label6.setValue("Hồi<b style=\"color:red;\">*</b>");
		this.label6.setContentMode(ContentMode.HTML);
		this.label7.setValue("Giờ<b style=\"color:red;\">*</b>");
		this.label7.setContentMode(ContentMode.HTML);
		this.txtFieldHoursNL.setColumns(5);
		this.txtFieldHoursNL.setInputPrompt(".............................................");
		this.txtFieldHoursNL.setStyleName("borderless");
		this.txtFieldMinuteNL.setInputPrompt("................");
		this.txtFieldMinuteNL.setStyleName("borderless");
		this.label8.setValue("phút, ngày<b style=\"color:red\">*</b>");
		this.label8.setContentMode(ContentMode.HTML);
		this.popupDateFieldNL.setDateFormat("dd/MM/yyyy");
		this.label9.setValue("Tại: <b style=\"color:red\">*</b>");
		this.label9.setContentMode(ContentMode.HTML);
		this.txtFieldNoiLapBB.setInputPrompt("........................................");
		this.txtFieldNoiLapBB.setStyleName("borderless");
		this.label10.setValue("Chúng tôi gồm:");
		this.label11.setValue("1.<b style=\"color:red;\">*</b>");
		this.label11.setContentMode(ContentMode.HTML);
		this.label12.setValue("2. Với sự chứng kiếm của:");
		this.label13.setValue("Tiến hành lập biên bản về vi phạm hành chính (VPHC) đối với Ông(Bà):");
		this.cbChucVu.setCaption("");
		this.cbChucVu.setItemCaptionFromAnnotation(false);
		this.cbChucVu.setFilteringMode(FilteringMode.OFF);
		this.cbChucVu.setInputPrompt("Chọn gì đi ");
		this.cbChucVu.setItemCaptionPropertyId("id");
		this.cbDonViCSGT.setItemCaptionFromAnnotation(false);
		this.cbDonViCSGT.setInputPrompt("Chọn một giá trị");
		this.cbDonViCSGT.setItemCaptionPropertyId("id");
		this.cbNguoiChungKien.setItemCaptionFromAnnotation(false);
		this.cbNguoiChungKien.setStyleName("borderless");
		this.cbNguoiChungKien.setItemCaptionPropertyId("id");
		this.label14.setValue(
				"Sinh ngày: &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Quốc tịch:&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Nghề nhiệp:");
		this.label14.setContentMode(ContentMode.HTML);
		this.label15.setValue("Nơi ở hiện tại: &emsp;<b style=\"color:red\">*</b>");
		this.label15.setContentMode(ContentMode.HTML);
		this.label16.setValue("CMND hoặc CCCD hoặc hộ chiếu:");
		this.label17.setValue("Ngày cấp:");
		this.cbQuocTich.setRequired(true);
		this.cbQuocTich.setItemCaptionFromAnnotation(false);
		this.cbQuocTich.setStyleName("borderless");
		this.cbNgheNghiep.setRequired(true);
		this.cbNgheNghiep.setStyleName("borderless");
		this.label18.setValue("Số điện thoại:");
		this.label19.setValue("Nơi cấp: ");
		this.txtFieldTenCB.setInputPrompt("......................................................");
		this.txtFieldTenCB.setStyleName("borderless");
		this.btnNhapSoBB.setIcon(FontAwesome.CARET_LEFT);
		this.btnNhapSoBB.setCaption("");
		this.btnNhapSoBB.setPrimaryStyleName("v-btnLeft");
		this.label20.setValue(
				"Nội dung VPHC (ghi rõ thời gian, địa điểm xảy ra vi phạm; hành vi vi phạm hành chính tại Điểm, Khoản, Điều của Nghị định về xử phạt VPHC trong lĩnh vực cụ thể và các tình tiết có liên quan):");
		this.label20.setContentMode(ContentMode.HTML);
		this.txtFiledNhapSoBB.setInputPrompt("....................................................");
		this.txtFiledNhapSoBB.setStyleName("borderless");
		this.txtFiledNhapSoBB.setVisible(false);
		this.label21.setValue(
				"Ý kiến của người vi phạm hoặc đại diện tổ chức vi phạm:<br>Tang vật, phương tiện VPHC, giấy tờ bị tạm giữ (nếu có):");
		this.label21.setContentMode(ContentMode.HTML);
		this.taNdVPHC.setRows(2);
		this.taTVPTGT.setRows(2);
		this.label22.setValue("Ngoài ra, chúng tôi không tạm giữ thêm thứ gì khác.<br>Yêu cầu Ông(Bà):<br>tại<br>");
		this.label22.setContentMode(ContentMode.HTML);
		this.txtFieldTenNgBiLapBBYC.setInputPrompt("....................................");
		this.txtFieldTenNgBiLapBBYC.setStyleName("borderless");
		this.label23.setValue(
				"có mặt lúc &emsp;<b style=\"color:red;\">*</b>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;giờ &emsp;<b style=\"color:red;\">*</b>&emsp;&emsp;&emsp;&emsp;&emsp;phút, ngày &emsp;<b style=\"color:red\">*</b>");
		this.label23.setContentMode(ContentMode.HTML);
		this.txtFieldHourMeet.setColumns(5);
		this.txtFieldHourMeet.setInputPrompt("................");
		this.txtFieldHourMeet.setStyleName("borderless");
		this.txtFieldMinuteMeet.setInputPrompt(".......................");
		this.txtFieldMinuteMeet.setStyleName("borderless");
		this.label24.setValue("để giải quyết vụ việc vi phạm.");
		this.label24.setContentMode(ContentMode.HTML);
		this.label25.setValue(
				"Trong thời hạn &emsp;&emsp;&emsp;&emsp;&emsp; ngày làm việc, kể từ ngày lập biên bản này, Ông(Bà)<br>là cá nhân vi phạm/đại diện tổ chức vi phạm có quyền gửi văn bản yêu cầu được giải trình trực tiếp/văn bản giải trình đến Ông(Bà):");
		this.label25.setContentMode(ContentMode.HTML);
		this.label26.setValue("để thực hiện quyền giải trình.");
		this.label27.setValue(
				"Biên bản lập xong hồi <b style=\"color:red;\">*</b> &emsp;&emsp;&emsp;&emsp;&emsp; giờ &emsp;&emsp;&emsp;&emsp;&emsp; phút, ngày &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; gồm 01 tờ, được lập thành 02 bản có nội dung, giá trị như nhau; 01 bản giao cho người vi phạm hoặc đại diện tổ chức vi phạm, 01 bản gửi cho cha, mẹ hoặc người giám hộ của người chưa thành niên vi phạm (nếu có), 01 bản lưu hồ sơ cơquan xử lý vi phạm hành chính và đọc lại cho những người có tên trong biên bản cùng nghe công nhận là đúng và cùng ký tên dưới đây.");
		this.label27.setContentMode(ContentMode.HTML);
		this.txtFieldMinute7.setColumns(5);
		this.txtFieldMinute7.setInputPrompt("....................");
		this.txtFieldMinute7.setStyleName("borderless");
		this.txtFieldHour3.setInputPrompt("................");
		this.txtFieldHour3.setStyleName("borderless");
		this.txtFieldNoiOHienTai.setInputPrompt(".............................................");
		this.txtFieldNoiOHienTai.setStyleName("borderless");
		this.txtFieldCanCu.setColumns(5);
		this.txtFieldCanCu.setInputPrompt(".............................................");
		this.txtFieldCanCu.setStyleName("borderless");
		this.txtFieldDoBngBiLapBB.setInputPrompt("......../......./.......");
		this.txtFieldDoBngBiLapBB.setStyleName("borderless");
		this.txtFieldSDT.setInputPrompt(".............................................");
		this.txtFieldSDT.setStyleName("borderless");
		this.txtFieldCCCD.setIcon(null);
		this.txtFieldCCCD.setInputPrompt(".............................................");
		this.txtFieldCCCD.setStyleName("borderless");
		this.txtFieldNoiCapCCCD.setInputPrompt(".............................................");
		this.txtFieldNoiCapCCCD.setStyleName("borderless");
		this.txtFieldTenNguoiBiLapBB.setCaption("");
		this.txtFieldTenNguoiBiLapBB.setInputPrompt("......................................................");
		this.txtFieldTenNguoiBiLapBB.setStyleName("borderless");
		this.fieldGroup.bind(this.popupDateFieldNL, "ngayLap");
		this.fieldGroup.bind(this.cbDonViCSGT, "donViCsgt");
		this.fieldGroup.bind(this.cbChucVu, "tcNguoiVipham");
		this.fieldGroup.bind(this.txtFiledNhapSoBB, "soBan");
		this.fieldGroup.bind(this.popupDateFieldMeet, "ngayGiaiquyet");
		this.fieldGroup.bind(this.txtFieldNoiLapBB, "diadiemLap");
		this.fieldGroup.bind(this.txtFieldHoursNL, "trangthaiXuly");
		this.fieldGroup.bind(this.taNdVPHC, "ghichuHanhvi");
		this.fieldGroup.bind(this.txtFieldNoiOHienTai, "diadiemGiaiquyet");
		this.fieldGroup.bind(this.popupDateFieldCCCD, "ngayTao");
		this.btnChonHVVP.setIcon(FontAwesome.PLUS_CIRCLE);
		this.btnChonHVVP.setCaption("Chọn hành vi vi phạm");
		this.btnChonHVVP.setPrimaryStyleName("v-btnLeft");
		this.btnChonTVPTGT.setIcon(FontAwesome.PLUS_CIRCLE);
		this.btnChonTVPTGT.setCaption("Chọn TV/PT/GT bị tạm giữ");
		this.btnChonTVPTGT.setPrimaryStyleName("v-btnLeft");
		this.txtFieldNoiCapCCCD2.setInputPrompt(
				"........................................................................................................");
		this.txtFieldNoiCapCCCD2.setStyleName("borderless");
		this.btnShow.setIcon(FontAwesome.CARET_DOWN);
		this.btnShow.setCaption("");
		this.btnShow.setPrimaryStyleName("v-btnLeft");

		this.brnSave.setWidth(80, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.brnSave, "left:360px; top:10px");
		this.btnPrint.setWidth(80, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.btnPrint, "left:465px; top:10px");
		this.label.setWidth(30, Unit.PERCENTAGE);
		this.label.setHeight(100, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label, "left:50px; top:10px");
		this.label2.setWidth(400, Unit.PIXELS);
		this.label2.setHeight(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label2, "left:849px; top:10px");
		this.label3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label3, "left:50px; top:115px");
		this.label4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label4, "left:50px; top:140px");
		this.comboBox.setWidth(40, Unit.PIXELS);
		this.comboBox.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.comboBox, "left:140px; top:140px");
		this.label6.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label6, "left:50px; top:170px");
		this.label7.setWidth(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label7, "left:180px; top:170px");
		this.txtFieldHoursNL.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldHoursNL, "left:100px; top:170px");
		this.txtFieldMinuteNL.setWidth(50, Unit.PIXELS);
		this.txtFieldMinuteNL.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldMinuteNL, "left:230px; top:170px");
		this.label8.setWidth(100, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label8, "left:280px; top:170px");
		this.popupDateFieldNL.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.popupDateFieldNL, "left:380px; top:170px");
		this.label9.setWidth(50, Unit.PIXELS);
		this.label9.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label9, "left:50px; top:200px");
		this.txtFieldNoiLapBB.setWidth(150, Unit.PIXELS);
		this.txtFieldNoiLapBB.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldNoiLapBB, "left:100px; top:200px");
		this.label10.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label10, "left:50px; top:230px");
		this.absoluteLayout2.addComponent(this.label11, "left:50px; top:260px");
		this.label12.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label12, "left:50px; top:290px");
		this.label13.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label13, "left:50px; top:320px");
		this.cbChucVu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cbChucVu, "left:300px; top:260px");
		this.cbDonViCSGT.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cbDonViCSGT, "left:530px; top:260px");
		this.cbNguoiChungKien.setWidth(100, Unit.PIXELS);
		this.cbNguoiChungKien.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cbNguoiChungKien, "left:300px; top:290px");
		this.label14.setWidth(100, Unit.PERCENTAGE);
		this.label14.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label14, "left:50px; top:350px");
		this.label15.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label15, "left:50px; top:380px");
		this.label16.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label16, "left:50px; top:410px");
		this.label17.setWidth(100, Unit.PIXELS);
		this.label17.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label17, "left:50px; top:440px");
		this.cbQuocTich.setWidth(40, Unit.PIXELS);
		this.cbQuocTich.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cbQuocTich, "left:450px; top:350px");
		this.cbNgheNghiep.setWidth(40, Unit.PIXELS);
		this.cbNgheNghiep.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cbNgheNghiep, "left:800px; top:350px");
		this.absoluteLayout2.addComponent(this.label18, "left:500px; top:410px");
		this.popupDateFieldCCCD.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.popupDateFieldCCCD, "left:150px; top:440px");
		this.label19.setWidth(100, Unit.PIXELS);
		this.label19.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label19, "left:400px; top:440px");
		this.txtFieldTenCB.setWidth(150, Unit.PIXELS);
		this.txtFieldTenCB.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldTenCB, "left:100px; top:260px");
		this.btnNhapSoBB.setWidth(50, Unit.PIXELS);
		this.btnNhapSoBB.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.btnNhapSoBB, "left:170px; top:77px");
		this.label20.setHeight(60, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label20, "left:50px; top:470px");
		this.txtFiledNhapSoBB.setWidth(150, Unit.PIXELS);
		this.txtFiledNhapSoBB.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFiledNhapSoBB, "left:230px; top:80px");
		this.label21.setHeight(60, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label21, "left:50px; top:580px");
		this.taNdVPHC.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout2.addComponent(this.taNdVPHC, "left:50px; top:530px");
		this.taTVPTGT.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout2.addComponent(this.taTVPTGT, "left:50px; top:640px");
		this.label22.setHeight(75, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label22, "left:50px; top:690px");
		this.txtFieldTenNgBiLapBBYC.setWidth(150, Unit.PIXELS);
		this.txtFieldTenNgBiLapBBYC.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldTenNgBiLapBBYC, "left:180px; top:710px");
		this.label23.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label23, "left:600px; top:710px");
		this.txtFieldHourMeet.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldHourMeet, "left:710px; top:710px");
		this.txtFieldMinuteMeet.setWidth(50, Unit.PIXELS);
		this.txtFieldMinuteMeet.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldMinuteMeet, "left:857px; top:710px");
		this.popupDateFieldMeet.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.popupDateFieldMeet, "left:1048px; top:710px");
		this.label24.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label24, "left:556px; top:740px");
		this.label25.setHeight(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label25, "left:50px; top:765px");
		this.label26.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label26, "left:406px; top:815px");
		this.label27.setHeight(75, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label27, "left:50px; top:840px");
		this.txtFieldMinute7.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldMinute7, "left:209px; top:840px");
		this.txtFieldHour3.setWidth(50, Unit.PIXELS);
		this.txtFieldHour3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldHour3, "left:329px; top:840px");
		this.popupDateField4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.popupDateField4, "left:485px; top:840px");
		this.txtFieldNoiOHienTai.setWidth(150, Unit.PIXELS);
		this.txtFieldNoiOHienTai.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldNoiOHienTai, "left:200px; top:380px");
		this.txtFieldCanCu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldCanCu, "left:190px; top:140px");
		this.txtFieldDoBngBiLapBB.setWidth(120, Unit.PIXELS);
		this.txtFieldDoBngBiLapBB.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldDoBngBiLapBB, "left:130px; top:350px");
		this.txtFieldSDT.setWidth(150, Unit.PIXELS);
		this.txtFieldSDT.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldSDT, "left:620px; top:410px");
		this.txtFieldCCCD.setWidth(150, Unit.PIXELS);
		this.txtFieldCCCD.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldCCCD, "left:310px; top:410px");
		this.txtFieldNoiCapCCCD.setWidth(150, Unit.PIXELS);
		this.txtFieldNoiCapCCCD.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldNoiCapCCCD, "left:520px; top:440px");
		this.txtFieldTenNguoiBiLapBB.setWidth(150, Unit.PIXELS);
		this.txtFieldTenNguoiBiLapBB.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldTenNguoiBiLapBB, "left:580px; top:320px");
		this.form.setWidth(30, Unit.PIXELS);
		this.form.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.form, "left:738px; top:34px");
		this.btnChonHVVP.setWidth(200, Unit.PIXELS);
		this.btnChonHVVP.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.btnChonHVVP, "left:600px; top:492px");
		this.btnChonTVPTGT.setWidth(200, Unit.PIXELS);
		this.btnChonTVPTGT.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.btnChonTVPTGT, "left:500px; top:605px");
		this.txtFieldNoiCapCCCD2.setWidth(50, Unit.PERCENTAGE);
		this.txtFieldNoiCapCCCD2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtFieldNoiCapCCCD2, "left:470px; top:580px");
		this.btnShow.setWidth(50, Unit.PIXELS);
		this.btnShow.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.btnShow, "left:1203px; top:586px");
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(3);
		this.absoluteLayout.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout.setHeight(50, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout, 0, 0);
		this.absoluteLayout2.setWidth(1300, Unit.PIXELS);
		this.absoluteLayout2.setHeight(1000, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout2, 0, 1);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		final CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 2, 0, 2);
		this.gridLayout.setRowExpandRatio(2, 1.0F);
		this.gridLayout.setWidth(1920, Unit.PIXELS);
		this.gridLayout.setHeight(-1, Unit.PIXELS);
		this.setContent(this.gridLayout);
		this.setSizeFull();

		this.brnSave.addClickListener(event -> this.brnSave_buttonClick(event));
		this.btnPrint.addClickListener(event -> this.btnPrint_buttonClick(event));
		this.btnNhapSoBB.addClickListener(event -> this.btnNhapSoBB_buttonClick(event));
		this.btnChonHVVP.addClickListener(event -> this.btnChonHVVP_buttonClick(event));
		this.btnChonTVPTGT.addClickListener(event -> this.btnChonTVPTGT_buttonClick(event));
		this.btnShow.addClickListener(event -> this.btnShow_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private TextArea taNdVPHC, taTVPTGT;
	private Button brnSave, btnPrint, btnNhapSoBB, btnChonHVVP, btnChonTVPTGT, btnShow;
	private TextField txtFieldHoursNL, txtFieldMinuteNL, txtFieldNoiLapBB, txtFieldTenCB, txtFiledNhapSoBB,
			txtFieldTenNgBiLapBBYC, txtFieldHourMeet, txtFieldMinuteMeet, txtFieldMinute7, txtFieldHour3,
			txtFieldNoiOHienTai, txtFieldCanCu, txtFieldDoBngBiLapBB, txtFieldSDT, txtFieldCCCD, txtFieldNoiCapCCCD,
			txtFieldTenNguoiBiLapBB, txtFieldNoiCapCCCD2;
	private Label label, label2, label3, label4, label6, label7, label8, label9, label10, label11, label12, label13,
			label14, label15, label16, label17, label18, label19, label20, label21, label22, label23, label24, label25,
			label26, label27;
	private XdevGridLayout form;
	private XdevComboBox<CustomComponent> comboBox, cbChucVu, cbDonViCSGT, cbNguoiChungKien, cbQuocTich, cbNgheNghiep;
	private PopupDateField popupDateFieldNL, popupDateFieldCCCD, popupDateFieldMeet, popupDateField4;
	private GridLayout gridLayout;
	private AbsoluteLayout absoluteLayout, absoluteLayout2;
	private XdevFieldGroup<CustomComponent> fieldGroup;
	// </generated-code>

}
