package com.etc.bca_moto.ui;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.etc.bca_moto.dal.CanBoDAO;
import com.etc.bca_moto.dal.DonViCanhsatGtDAO;
import com.etc.bca_moto.entities.CanBo;
import com.etc.bca_moto.entities.CanBo_;
import com.etc.bca_moto.entities.QdGiamMienTienPhat04;
import com.vaadin.data.Property;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PopupDateField;
import com.xdev.dal.DAOs;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevFieldGroup;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevTextField;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.combobox.XdevComboBox;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

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

	public void setFiedGroupData(final QdGiamMienTienPhat04 qdgm){
		//this.fieldGroup.setItemDataSource(qdgm);
	}
	
	public BBGiamPhatView() {
		super();
		this.initUI();
		//this.fieldGroup.setItemDataSource(new QdGiamMien());
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdPrint}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdPrint_buttonClick(final Button.ClickEvent event) {
		final Connection conn = BBVPHCView.getConnection();
		JasperReport jsReport = null;
		JasperPrint jasperPrint = null;
		final String report_Rescore = "E:/Data/Java/rapid/ReportExample/WebContent/WEB-INF/resources/reports/Mau_Bien_Ban_So_04.jrxml";
		try {
			jsReport = JasperCompileManager.compileReport(report_Rescore);
			// Preparing parameters
			final Map<String, Object> parameters = new HashMap<>();
			parameters.put("id", this.txtThree.getValue());
			parameters.put("cbId", this.txtTwo.getValue());
			
			jasperPrint = JasperFillManager.fillReport(jsReport, parameters, conn);
			conn.close();
			
		} catch (final JRException | SQLException e) {
			e.printStackTrace();
		}
		JasperViewer.viewReport(jasperPrint);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdSave}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdSave_buttonClick(final Button.ClickEvent event) {
		if (this.txtThree.isEmpty()) {
			this.txtThree.focus();
			Notification.show("Thế quên t ak");
		} else {
			//this.fieldGroup.save();
			Notification.show("Oki", Type.WARNING_MESSAGE);
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbQdVPHC}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbQdVPHC_valueChange(final Property.ValueChangeEvent event) {
		this.txtQdVPHC.setValue(this.cbQdVPHC.getSelectedItem().getBean().getId() + "");
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbQdHoanThiHanh}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbQdHoanThiHanh_valueChange(final Property.ValueChangeEvent event) {
		this.txtHoanTH.setValue(this.cbQdHoanThiHanh.getSelectedItem().getBean().getId() + "");
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbCanBo}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbCanBo_valueChange(final Property.ValueChangeEvent event) {
		this.txtCapBac.setValue(this.cbCanBo.getSelectedItem().getBean().getCapBac());
		
		this.txtDvCSGT.setValue(DAOs.get(DonViCanhsatGtDAO.class).
				find(this.cbCanBo.getSelectedItem().getBean().getDonViCsgtId()).getTenDonVi());
		this.txtDvCSGTId.setValue(DAOs.get(DonViCanhsatGtDAO.class).
				find(this.cbCanBo.getSelectedItem().getBean().getDonViCsgtId()).getId()+"");
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new GridLayout();
		this.absoluteLayoutTitle = new AbsoluteLayout();
		this.lblQuocHieu = new Label();
		this.txtOne = new XdevTextField();
		this.txtTwo = new XdevTextField();
		this.txtThree = new XdevTextField();
		this.label = new Label();
		this.label2 = new Label();
		this.label3 = new Label();
		this.label4 = new Label();
		this.label5 = new Label();
		this.label7 = new Label();
		this.txtAddress = new XdevTextField();
		this.popupDateFieldNgayLap = new PopupDateField();
		this.cmdPrint = new XdevButton();
		this.cmdSave = new XdevButton();
		this.form = new XdevGridLayout();
		this.fieldGroup = new XdevFieldGroup<>(QdGiamMienTienPhat04.class);
		this.absoluteLayout = new AbsoluteLayout();
		this.label6 = new Label();
		this.label8 = new Label();
		this.label9 = new Label();
		this.label10 = new Label();
		this.label11 = new Label();
		this.popupDateFieldNgayXuPhatVPHC = new PopupDateField();
		this.label12 = new Label();
		this.label13 = new Label();
		this.label14 = new Label();
		this.label15 = new Label();
		this.label16 = new Label();
		this.popupDateFieldHoanTHQD = new PopupDateField();
		this.popupDateFieldNgayGQXP = new PopupDateField();
		this.label17 = new Label();
		this.label18 = new Label();
		this.popupDateFieldXetDon = new PopupDateField();
		this.label19 = new Label();
		this.label20 = new Label();
		this.label21 = new Label();
		this.label22 = new Label();
		this.label23 = new Label();
		this.label24 = new Label();
		this.label25 = new Label();
		this.label26 = new Label();
		this.popupDateFieldHoanTHQD2 = new PopupDateField();
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
		this.cbQdVPHC = new XdevComboBox<>();
		this.cbQdHoanThiHanh = new XdevComboBox<>();
		this.txtQdVPHC = new XdevTextField();
		this.txtHoanTH = new XdevTextField();
		this.txtDvCSGTId = new XdevTextField();
		this.cbCanBo = new XdevComboBox<>();
		this.txtCapBac = new XdevTextField();
		this.txtDvCSGT = new XdevTextField();
	
		this.setPrimaryStyleName("v-font-ct");
		this.gridLayout.setPrimaryStyleName("v-gridlayout-scroll");
		this.lblQuocHieu.setPrimaryStyleName("v-label-ct");
		this.lblQuocHieu.setValue("<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br> Độc lập - Tự do - Hạnh phúc</b>");
		this.lblQuocHieu.setContentMode(ContentMode.HTML);
		this.txtOne.setColumns(5);
		this.txtOne.setInputPrompt(".............................");
		this.txtOne.setStyleName("borderless");
		this.txtTwo.setColumns(5);
		this.txtTwo.setInputPrompt(".............................");
		this.txtTwo.setStyleName("borderless");
		this.txtThree.setColumns(5);
		this.txtThree.setInputPrompt(".............................");
		this.txtThree.setStyleName("borderless");
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
		this.label7.setValue("(3)&emsp; &emsp; &emsp; ,ngày");
		this.label7.setContentMode(ContentMode.HTML);
		this.txtAddress.setInputPrompt("........................................");
		this.txtAddress.setStyleName("borderless");
		this.popupDateFieldNgayLap.setDateFormat("dd/MM/yyyy");
		this.cmdPrint.setCaption("In");
		this.cmdPrint.setPrimaryStyleName("v-btnPrint");
		this.cmdSave.setCaption("Lưu");
		this.cmdSave.setPrimaryStyleName("v-btnLuu");
		this.label6.setValue(
				"Căn cứ Điều 77 Luật xử lý vi phạm hành chính;<br>Căn cứ Quyết định xử phạt vi phạm hành chính số:");
		this.label6.setContentMode(ContentMode.HTML);
		this.label8.setValue("Căn cứ Quyết định hoãn thi hành quyết định phạt tiền số");
		this.label9.setValue("do:");
		this.label10.setValue("ký;");
		this.label11.setValue("ngày");
		this.label11.setContentMode(ContentMode.HTML);
		this.popupDateFieldNgayXuPhatVPHC.setDateFormat("dd/MM/yyyy");
		this.label12.setValue("ngày");
		this.label13.setValue("ký (nếu có);");
		this.label13.setContentMode(ContentMode.HTML);
		this.label14.setValue("ngày");
		this.label15.setValue("(nếu có);");
		this.label16.setValue("Căn cứ Quyết định về việc giao quyền xử phạt vi phạm hành chính số");
		this.popupDateFieldHoanTHQD.setDateFormat("dd/MM/yyyy");
		this.popupDateFieldNgayGQXP.setDateFormat("dd/MM/yyyy");
		this.label17.setValue("do:");
		this.label18.setValue("Xét đơn đề nghị giảm/miễn tiền phạt vi phạm hành chính ngày");
		this.popupDateFieldXetDon.setDateFormat("dd/MM/yyyy");
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
		this.popupDateFieldHoanTHQD2.setDateFormat("dd/MM/yyyy");
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
		this.cbQdVPHC.setItemCaptionFromAnnotation(false);
		this.cbQdVPHC.setInputPrompt("Chọn đê");
		this.cbQdVPHC.setItemCaptionPropertyId("so");
		this.cbQdHoanThiHanh.setItemCaptionFromAnnotation(false);
		this.cbQdHoanThiHanh.setInputPrompt(" Không chọn -> lỗi");
		this.cbQdHoanThiHanh.setItemCaptionPropertyId("so");
		this.txtQdVPHC.setColumns(5);
		this.txtQdVPHC.setInputPrompt(".............................");
		this.txtQdVPHC.setStyleName("borderless");
		this.txtQdVPHC.setEnabled(false);
		this.txtQdVPHC.setVisible(false);
		this.txtHoanTH.setColumns(5);
		this.txtHoanTH.setInputPrompt(".............................");
		this.txtHoanTH.setStyleName("borderless");
		this.txtHoanTH.setEnabled(false);
		this.txtHoanTH.setVisible(false);
		this.txtDvCSGTId.setColumns(5);
		this.txtDvCSGTId.setInputPrompt(".............................");
		this.txtDvCSGTId.setStyleName("borderless");
		this.txtDvCSGTId.setEnabled(false);
		this.txtDvCSGTId.setVisible(false);
		this.cbCanBo.setItemCaptionFromAnnotation(false);
		this.cbCanBo.setInputPrompt("Phải chọn");
		this.cbCanBo.setContainerDataSource(CanBo.class, DAOs.get(CanBoDAO.class).findAll());
		this.cbCanBo.setItemCaptionPropertyId(CanBo_.tenCanBo.getName());
		this.txtCapBac.setInputPrompt(".............................");
		this.txtCapBac.setStyleName("borderless");
		this.txtCapBac.setEnabled(false);
		this.txtDvCSGT.setInputPrompt(".............................");
		this.txtDvCSGT.setStyleName("borderless");
		this.txtDvCSGT.setEnabled(false);
	
		this.lblQuocHieu.setWidth(400, Unit.PIXELS);
		this.lblQuocHieu.setHeight(50, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.lblQuocHieu, "left:822px; top:50px");
		this.absoluteLayoutTitle.addComponent(this.txtOne, "left:28px; top:52px");
		this.absoluteLayoutTitle.addComponent(this.txtTwo, "left:28px; top:87px");
		this.absoluteLayoutTitle.addComponent(this.txtThree, "left:58px; top:122px");
		this.label.setWidth(30, Unit.PIXELS);
		this.label.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label, "left:108px; top:57px");
		this.label2.setWidth(30, Unit.PIXELS);
		this.label2.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label2, "left:108px; top:92px");
		this.label3.setWidth(30, Unit.PIXELS);
		this.label3.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label3, "left:28px; top:127px");
		this.absoluteLayoutTitle.addComponent(this.label4, "left:0px; top:165px");
		this.label5.setWidth(100, Unit.PIXELS);
		this.label5.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label5, "left:138px; top:127px");
		this.label7.setWidth(150, Unit.PIXELS);
		this.label7.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.label7, "left:835px; top:115px");
		this.txtAddress.setWidth(100, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.txtAddress, "left:795px; top:109px");
		this.absoluteLayoutTitle.addComponent(this.popupDateFieldNgayLap, "left:984px; top:109px");
		this.absoluteLayoutTitle.addComponent(this.cmdPrint, "left:416px; top:41px");
		this.absoluteLayoutTitle.addComponent(this.cmdSave, "left:339px; top:41px");
		this.form.setWidth(30, Unit.PIXELS);
		this.form.setHeight(30, Unit.PIXELS);
		this.absoluteLayoutTitle.addComponent(this.form, "left:600px; top:82px");
		this.label6.setWidth(100, Unit.PERCENTAGE);
		this.label6.setHeight(50, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label6, "left:70px; top:0px");
		this.label8.setWidth(100, Unit.PERCENTAGE);
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
		this.absoluteLayout.addComponent(this.label11, "left:780px; top:20px");
		this.absoluteLayout.addComponent(this.popupDateFieldNgayXuPhatVPHC, "left:815px; top:15px");
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
		this.label16.setWidth(100, Unit.PERCENTAGE);
		this.label16.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label16, "left:70px; top:140px");
		this.absoluteLayout.addComponent(this.popupDateFieldHoanTHQD, "left:88px; top:104px");
		this.absoluteLayout.addComponent(this.popupDateFieldNgayGQXP, "left:88px; top:166px");
		this.label17.setWidth(30, Unit.PIXELS);
		this.label17.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label17, "left:282px; top:110px");
		this.label18.setWidth(100, Unit.PERCENTAGE);
		this.label18.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label18, "left:70px; top:200px");
		this.absoluteLayout.addComponent(this.popupDateFieldXetDon, "left:480px; top:193px");
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
		this.absoluteLayout.addComponent(this.label23, "left:361px; top:259px");
		this.label24.setWidth(70, Unit.PIXELS);
		this.label24.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label24, "left:675px; top:260px");
		this.absoluteLayout.addComponent(this.label25, "left:0px; top:322px");
		this.label26.setWidth(100, Unit.PERCENTAGE);
		this.label26.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label26, "left:71px; top:355px");
		this.absoluteLayout.addComponent(this.popupDateFieldHoanTHQD2, "left:188px; top:384px");
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
		this.label32.setWidth(150, Unit.PIXELS);
		this.label32.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label32, "left:400px; top:460px");
		this.label33.setWidth(30, Unit.PIXELS);
		this.label33.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label33, "left:1012px; top:463px");
		this.label34.setWidth(330, Unit.PIXELS);
		this.label34.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label34, "left:72px; top:490px");
		this.label35.setWidth(100, Unit.PIXELS);
		this.label35.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label35, "left:30px; top:520px");
		this.label37.setWidth(30, Unit.PIXELS);
		this.label37.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label37, "left:1012px; top:524px");
		this.label38.setWidth(50, Unit.PIXELS);
		this.label38.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label38, "left:1012px; top:494px");
		this.label36.setWidth(100, Unit.PERCENTAGE);
		this.label36.setHeight(150, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label36, "left:72px; top:550px");
		this.label39.setWidth(200, Unit.PIXELS);
		this.label39.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label39, "left:900px; top:640px");
		this.label40.setWidth(250, Unit.PIXELS);
		this.label40.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label40, "left:832px; top:670px");
		this.lblQuocHieu2.setWidth(400, Unit.PIXELS);
		this.lblQuocHieu2.setHeight(50, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.lblQuocHieu2, "left:854px; top:706px");
		this.label41.setWidth(100, Unit.PIXELS);
		this.label41.setHeight(100, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label41, "left:30px; top:700px");
		this.absoluteLayout.addComponent(this.cbQdVPHC, "left:520px; top:0px");
		this.absoluteLayout.addComponent(this.cbQdHoanThiHanh, "left:520px; top:73px");
		this.absoluteLayout.addComponent(this.txtQdVPHC, "left:401px; top:0px");
		this.absoluteLayout.addComponent(this.txtHoanTH, "left:730px; top:80px");
		this.absoluteLayout.addComponent(this.txtDvCSGTId, "left:928px; top:257px");
		this.absoluteLayout.addComponent(this.cbCanBo, "left:139px; top:259px");
		this.txtCapBac.setWidth(150, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtCapBac, "left:490px; top:255px");
		this.txtDvCSGT.setWidth(150, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtDvCSGT, "left:755px; top:255px");
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(3);
		this.absoluteLayoutTitle.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayoutTitle.setHeight(250, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayoutTitle, 0, 0);
		this.absoluteLayout.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout.setHeight(800, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout, 0, 1);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		final CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 2, 0, 2);
		this.gridLayout.setRowExpandRatio(2, 1.0F);
		this.gridLayout.setWidth(1300, Unit.PIXELS);
		this.gridLayout.setHeight(100, Unit.PERCENTAGE);
		this.setContent(this.gridLayout);
		this.setSizeFull();
	
		this.cmdPrint.addClickListener(event -> this.cmdPrint_buttonClick(event));
		this.cmdSave.addClickListener(event -> this.cmdSave_buttonClick(event));
		this.cbQdVPHC.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				BBGiamPhatView.this.cbQdVPHC_valueChange(event);
			}
		});
		this.cbQdHoanThiHanh.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				BBGiamPhatView.this.cbQdHoanThiHanh_valueChange(event);
			}
		});
		this.cbCanBo.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				BBGiamPhatView.this.cbCanBo_valueChange(event);
			}
		});
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton cmdPrint, cmdSave;
	private XdevFieldGroup<QdGiamMienTienPhat04> fieldGroup;
	private XdevComboBox<CanBo> cbCanBo;
	private Label lblQuocHieu, label, label2, label3, label4, label5, label7, label6, label8, label9, label10, label11,
			label12, label13, label14, label15, label16, label17, label18, label19, label20, label21, label22, label23,
			label24, label25, label26, label27, label28, label29, label30, label31, label32, label33, label34, label35,
			label37, label38, label36, label39, label40, lblQuocHieu2, label41;
	private XdevTextField txtOne, txtTwo, txtThree, txtAddress, txtQdVPHC, txtHoanTH, txtDvCSGTId, txtCapBac, txtDvCSGT;
	private XdevGridLayout form;
	private PopupDateField popupDateFieldNgayLap, popupDateFieldNgayXuPhatVPHC, popupDateFieldHoanTHQD,
			popupDateFieldNgayGQXP, popupDateFieldXetDon, popupDateFieldHoanTHQD2;
	private XdevComboBox<CustomComponent> cbQdVPHC, cbQdHoanThiHanh;
	private GridLayout gridLayout;
	private AbsoluteLayout absoluteLayoutTitle, absoluteLayout;
	// </generated-code>

}
