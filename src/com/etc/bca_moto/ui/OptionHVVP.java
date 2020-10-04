package com.etc.bca_moto.ui;

import com.etc.bca_moto.dal.HanhViViPhamDAO;
import com.etc.bca_moto.dal.NghiDinhCpDAO;
import com.etc.bca_moto.dal.PhuongTienTggtDAO;
import com.etc.bca_moto.entities.HanhViViPham;
import com.etc.bca_moto.entities.HanhViViPham_;
import com.etc.bca_moto.entities.NghiDinhCp;
import com.etc.bca_moto.entities.NghiDinhCp_;
import com.etc.bca_moto.entities.PhuongTienTggt;
import com.vaadin.data.Property;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.xdev.dal.DAOs;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.combobox.XdevComboBox;

public class OptionHVVP extends XdevView {

	/**
	 * 
	 */
	private static StringBuffer sbf = null;
	
	public OptionHVVP() {
		super();
		this.initUI();
		this.absoluteLayout3.setVisible(false);
		this.absoluteLayout4.setVisible(false);
		this.absoluteLayout5.setVisible(false);
		this.absoluteLayout6.setVisible(false);
		this.absoluteLayout2.setVisible(false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #btnDelete2}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnDelete2_buttonClick(final Button.ClickEvent event) {
		this.absoluteLayout2.setVisible(false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #btnDelete4}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnDelete4_buttonClick(final Button.ClickEvent event) {
		this.absoluteLayout4.setVisible(false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #btnDelete5}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnDelete5_buttonClick(final Button.ClickEvent event) {
		this.absoluteLayout5.setVisible(false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #btnDelete6}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnDelete6_buttonClick(final Button.ClickEvent event) {
		this.absoluteLayout6.setVisible(false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #btnDelete3}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnDelete3_buttonClick(final Button.ClickEvent event) {
		this.absoluteLayout3.setVisible(false);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #btnAdd}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnAdd_buttonClick(final Button.ClickEvent event) {
		if (!this.absoluteLayout3.isVisible()) {
			this.absoluteLayout3.setVisible(true);
		} else if (!this.absoluteLayout6.isVisible()) {
			this.absoluteLayout6.setVisible(true);
		} else if (!this.absoluteLayout5.isVisible()) {
			this.absoluteLayout5.setVisible(true);
		} else if (!this.absoluteLayout4.isVisible()) {
			this.absoluteLayout4.setVisible(true);
		} else if (!this.absoluteLayout2.isVisible()) {
			this.absoluteLayout2.setVisible(true);
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbHVVP}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbHVVP_valueChange(final Property.ValueChangeEvent event) {
		final String[] str = DAOs.get(HanhViViPhamDAO.class).find(this.cbHVVP.getSelectedItem().getBean().getId())
				.getTomTat().split("\\.");
		this.txtDiem.setValue(str[2].substring(0, 1));
		this.txtKhoan.setValue(str[1]);
		this.txtDieu.setValue(str[0]);
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbHVVP3}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbHVVP3_valueChange(final Property.ValueChangeEvent event) {
		final String[] str = new HanhViViPhamDAO().find(this.cbHVVP3.getSelectedItem().getBean().getId())
				.getTomTat().split("\\.");
		this.txtDiem3.setValue(str[2].substring(0, 1));
		this.txtKhoan3.setValue(str[1]);
		this.txtDieu3.setValue(str[0]);
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbHVVP6}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbHVVP6_valueChange(final Property.ValueChangeEvent event) {
		final String[] str = new HanhViViPhamDAO().find(this.cbHVVP6.getSelectedItem().getBean().getId())
				.getTomTat().split("\\.");
		this.txtDiem6.setValue(str[2].substring(0, 1));
		this.txtKhoan6.setValue(str[1]);
		this.txtDieu6.setValue(str[0]);
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbHVVP5}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbHVVP5_valueChange(final Property.ValueChangeEvent event) {
		final String[] str = new HanhViViPhamDAO().find(this.cbHVVP5.getSelectedItem().getBean().getId())
				.getTomTat().split("\\.");
		this.txtDiem5.setValue(str[2].substring(0, 1));
		this.txtKhoan5.setValue(str[1]);
		this.txtDieu5.setValue(str[0]);
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbHVVP4}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbHVVP4_valueChange(final Property.ValueChangeEvent event) {
		final String[] str = new HanhViViPhamDAO().find(this.cbHVVP4.getSelectedItem().getBean().getId())
				.getTomTat().split("\\.");
		this.txtDiem4.setValue(str[2].substring(0, 1));
		this.txtKhoan4.setValue(str[1]);
		this.txtDieu4.setValue(str[0]);
	}

	/**
	 * Event handler delegate method for the {@link XdevComboBox}
	 * {@link #cbHVVP2}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cbHVVP2_valueChange(final Property.ValueChangeEvent event) {
		final String[] str = new HanhViViPhamDAO().find(this.cbHVVP2.getSelectedItem().getBean().getId())
				.getTomTat().split("\\.");
		this.txtDiem2.setValue(str[2].substring(0, 1));
		this.txtKhoan2.setValue(str[1]);
		this.txtDieu2.setValue(str[0]);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #btnClose}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnClose_buttonClick(final Button.ClickEvent event) {
		//((Window)this.getParent()).close();
		final Window w = new Window();
		w.center();
		w.setWidth(1000, Unit.PIXELS);
		w.setHeight(600, Unit.PIXELS);
		w.setResizable(false);
		w.setClosable(true);
		final long sobb = 1;
		w.setCaption("QUYẾT ĐỊNH CƯỠNG CHẾ KHẤU TRỪ");
		UI.getCurrent().getSession().setAttribute("OutPut07PreView", sobb);
		w.setContent(new OutPut07PreView());
		UI.getCurrent().addWindow(w);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #btnLuu}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnLuu_buttonClick(final Button.ClickEvent event) {
		sbf = new StringBuffer("Vào hồi ");
		sbf.append(this.txtHour.getValue()+" giờ "+this.txtMinute.getValue()+" phút, ngày ");
		sbf.append(this.popupDateField.getValue());
		sbf.append(" tại "+this.txtDiaDiem.getValue()+ " điều khiển "+ this.comboBox.getSelectedItem().getBean());//Phuong tien thieu
		sbf.append(" mang biển kiếm soát "+ this.txtBKS.getValue()+ " đã vi phạm hành vi:");
		
		sbf.append(this.cbHVVP.getSelectedItem().getBean().getNoiDung());
		sbf.append(" tại điểm "+this.txtDiem.getValue()+" Khoản "+this.txtKhoan.getValue()+" Điều "+this.txtDieu.getValue() );
		if(this.absoluteLayout2.isVisible()){
			sbf.append("; "+this.cbHVVP2.getSelectedItem().getBean().getNoiDung());
			sbf.append(" tại điểm "+this.txtDiem2.getValue()+" Khoản "+this.txtKhoan2.getValue()+" Điều "+this.txtDieu2.getValue() );
		}
		if(this.absoluteLayout3.isVisible()){
			sbf.append("; "+this.cbHVVP3.getSelectedItem().getBean().getNoiDung());
			sbf.append(" tại điểm "+this.txtDiem3.getValue()+" Khoản "+this.txtKhoan3.getValue()+" Điều "+this.txtDieu3.getValue() );
		}
		if(this.absoluteLayout4.isVisible()){
			sbf.append("; "+this.cbHVVP4.getSelectedItem().getBean().getNoiDung());
			sbf.append(" tại điểm "+this.txtDiem4.getValue()+" Khoản "+this.txtKhoan4.getValue()+" Điều "+this.txtDieu4.getValue() );
		}
		if(this.absoluteLayout5.isVisible()){
			sbf.append("; "+this.cbHVVP5.getSelectedItem().getBean().getNoiDung());
			sbf.append(" tại điểm "+this.txtDiem5.getValue()+" Khoản "+this.txtKhoan5.getValue()+" Điều "+this.txtDieu5.getValue() );
		}
		if(this.absoluteLayout6.isVisible()){
			sbf.append("; "+this.cbHVVP6.getSelectedItem().getBean().getNoiDung());
			sbf.append(" tại điểm "+this.txtDiem6.getValue()+" Khoản "+this.txtKhoan6.getValue()+" Điều "+this.txtDieu6.getValue() );
		}
		sbf.append(" ngày "+this.comboBox3.getSelectedItem().getBean().getNoiDung() );
		
		
		
		sbf.append(" quy định XPHC trong lĩnh vực giao thông Đường bộ và Đường sắt.");
		BBVPHCView.getInstance().setTextArea(sbf);
		((Window)this.getParent()).close();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new GridLayout();
		this.absoluteLayout = new AbsoluteLayout();
		this.label = new Label();
		this.txtMinute = new TextField();
		this.popupDateField = new PopupDateField();
		this.label2 = new Label();
		this.txtDiaDiem = new TextField();
		this.label3 = new Label();
		this.comboBox = new XdevComboBox<>();
		this.label4 = new Label();
		this.label5 = new Label();
		this.txtBKS = new TextField();
		this.txtHour = new TextField();
		this.absoluteLayout1 = new AbsoluteLayout();
		this.label6 = new Label();
		this.cbHVVP = new XdevComboBox<>();
		this.comboBox3 = new XdevComboBox<>();
		this.btnDelete = new XdevButton();
		this.label7 = new Label();
		this.label8 = new Label();
		this.lblDieu = new Label();
		this.txtDieu = new TextField();
		this.txtKhoan = new TextField();
		this.txtDiem = new TextField();
		this.absoluteLayout3 = new AbsoluteLayout();
		this.label12 = new Label();
		this.cbHVVP3 = new XdevComboBox<>();
		this.comboBox5 = new XdevComboBox<>();
		this.btnDelete3 = new XdevButton();
		this.label13 = new Label();
		this.label14 = new Label();
		this.lblDieu3 = new Label();
		this.txtDieu3 = new TextField();
		this.txtKhoan3 = new TextField();
		this.txtDiem3 = new TextField();
		this.absoluteLayout6 = new AbsoluteLayout();
		this.label21 = new Label();
		this.cbHVVP6 = new XdevComboBox<>();
		this.comboBox8 = new XdevComboBox<>();
		this.btnDelete6 = new XdevButton();
		this.label22 = new Label();
		this.label23 = new Label();
		this.lblDieu6 = new Label();
		this.txtDieu6 = new TextField();
		this.txtKhoan6 = new TextField();
		this.txtDiem6 = new TextField();
		this.absoluteLayout5 = new AbsoluteLayout();
		this.label18 = new Label();
		this.cbHVVP5 = new XdevComboBox<>();
		this.comboBox7 = new XdevComboBox<>();
		this.btnDelete5 = new XdevButton();
		this.label19 = new Label();
		this.label20 = new Label();
		this.lblDieu5 = new Label();
		this.txtDieu5 = new TextField();
		this.txtKhoan5 = new TextField();
		this.txtDiem5 = new TextField();
		this.absoluteLayout4 = new AbsoluteLayout();
		this.label15 = new Label();
		this.cbHVVP4 = new XdevComboBox<>();
		this.comboBox6 = new XdevComboBox<>();
		this.btnDelete4 = new XdevButton();
		this.label16 = new Label();
		this.label17 = new Label();
		this.lblDieu4 = new Label();
		this.txtDieu4 = new TextField();
		this.txtKhoan4 = new TextField();
		this.txtDiem4 = new TextField();
		this.absoluteLayout2 = new AbsoluteLayout();
		this.label9 = new Label();
		this.cbHVVP2 = new XdevComboBox<>();
		this.comboBox4 = new XdevComboBox<>();
		this.btnDelete2 = new XdevButton();
		this.label10 = new Label();
		this.label11 = new Label();
		this.lblDieu2 = new Label();
		this.txtDieu2 = new TextField();
		this.txtKhoan2 = new TextField();
		this.txtDiem2 = new TextField();
		this.absoluteLayout10 = new AbsoluteLayout();
		this.btnLuu = new XdevButton();
		this.btnClose = new XdevButton();
		this.btnAdd = new XdevButton();
	
		this.setPrimaryStyleName("v-font-ct");
		this.label.setValue("Hồi &emsp;&emsp;&emsp;&emsp;&emsp; giờ &emsp;&emsp;&emsp;&emsp;&emsp; phút, ngày ");
		this.label.setContentMode(ContentMode.HTML);
		this.txtMinute.setStyleName("borderless");
		this.popupDateField.setDateFormat("dd/MM/YYYY");
		this.label2.setValue("Tại");
		this.txtDiaDiem.setInputPrompt(
				".................................................................................................................");
		this.txtDiaDiem.setStyleName("borderless");
		this.label3.setValue("Phương tiện:");
		this.comboBox.setItemCaptionFromAnnotation(false);
		this.comboBox.setContainerDataSource(PhuongTienTggt.class, DAOs.get(PhuongTienTggtDAO.class).findAll());
		this.comboBox.setItemCaptionPropertyId("tenPhuongtien");
		this.label4.setValue("BKS:");
		this.label5.setValue("Hành vi vi phạm chính tại:");
		this.txtBKS.setInputPrompt("");
		this.txtBKS.setStyleName("borderless");
		this.txtHour.setStyleName("borderless");
		this.label6.setValue("Hành vi vi phạm ");
		this.cbHVVP.setItemCaptionFromAnnotation(false);
		this.cbHVVP.setContainerDataSource(HanhViViPham.class, DAOs.get(HanhViViPhamDAO.class).findAll());
		this.cbHVVP.setItemCaptionPropertyId(HanhViViPham_.noiDung.getName());
		this.comboBox3.setItemCaptionFromAnnotation(false);
		this.comboBox3.setContainerDataSource(NghiDinhCp.class, DAOs.get(NghiDinhCpDAO.class).findAll());
		this.comboBox3.setItemCaptionPropertyId(NghiDinhCp_.ten.getName());
		this.btnDelete.setIcon(FontAwesome.REMOVE);
		this.btnDelete.setCaption("");
		this.btnDelete.setPrimaryStyleName("v-btnLuu");
		this.label7.setValue("Điều");
		this.label8.setValue("Khoản");
		this.lblDieu.setValue("Điểm");
		this.txtDieu.setData(this.comboBox3);
		this.txtDieu.setInputPrompt(".......");
		this.txtDieu.setStyleName("borderless");
		this.txtDieu.setEnabled(false);
		this.txtKhoan.setInputPrompt("........");
		this.txtKhoan.setStyleName("borderless");
		this.txtKhoan.setEnabled(false);
		this.txtDiem.setInputPrompt(".........");
		this.txtDiem.setStyleName("borderless");
		this.txtDiem.setEnabled(false);
		this.label12.setValue("Hành vi vi phạm ");
		this.cbHVVP3.setItemCaptionFromAnnotation(false);
		this.cbHVVP3.setContainerDataSource(HanhViViPham.class, DAOs.get(HanhViViPhamDAO.class).findAll());
		this.cbHVVP3.setItemCaptionPropertyId(HanhViViPham_.noiDung.getName());
		this.comboBox5.setItemCaptionFromAnnotation(false);
		this.comboBox5.setContainerDataSource(NghiDinhCp.class, DAOs.get(NghiDinhCpDAO.class).findAll());
		this.comboBox5.setItemCaptionPropertyId(NghiDinhCp_.ten.getName());
		this.btnDelete3.setIcon(FontAwesome.REMOVE);
		this.btnDelete3.setCaption("");
		this.btnDelete3.setPrimaryStyleName("v-btnLuu");
		this.label13.setValue("Điều");
		this.label14.setValue("Khoản");
		this.lblDieu3.setValue("Điểm");
		this.txtDieu3.setInputPrompt(".......");
		this.txtDieu3.setStyleName("borderless");
		this.txtDieu3.setEnabled(false);
		this.txtKhoan3.setInputPrompt("........");
		this.txtKhoan3.setStyleName("borderless");
		this.txtKhoan3.setEnabled(false);
		this.txtDiem3.setInputPrompt(".........");
		this.txtDiem3.setStyleName("borderless");
		this.txtDiem3.setEnabled(false);
		this.label21.setValue("Hành vi vi phạm ");
		this.cbHVVP6.setItemCaptionFromAnnotation(false);
		this.cbHVVP6.setContainerDataSource(HanhViViPham.class, DAOs.get(HanhViViPhamDAO.class).findAll());
		this.cbHVVP6.setItemCaptionPropertyId(HanhViViPham_.noiDung.getName());
		this.comboBox8.setItemCaptionFromAnnotation(false);
		this.comboBox8.setContainerDataSource(NghiDinhCp.class, DAOs.get(NghiDinhCpDAO.class).findAll());
		this.comboBox8.setItemCaptionPropertyId(NghiDinhCp_.ten.getName());
		this.btnDelete6.setIcon(FontAwesome.REMOVE);
		this.btnDelete6.setCaption("");
		this.btnDelete6.setPrimaryStyleName("v-btnLuu");
		this.label22.setValue("Điều");
		this.label23.setValue("Khoản");
		this.lblDieu6.setValue("Điểm");
		this.txtDieu6.setInputPrompt(".......");
		this.txtDieu6.setStyleName("borderless");
		this.txtDieu6.setEnabled(false);
		this.txtKhoan6.setInputPrompt("........");
		this.txtKhoan6.setStyleName("borderless");
		this.txtKhoan6.setEnabled(false);
		this.txtDiem6.setInputPrompt(".........");
		this.txtDiem6.setStyleName("borderless");
		this.txtDiem6.setEnabled(false);
		this.label18.setValue("Hành vi vi phạm ");
		this.cbHVVP5.setItemCaptionFromAnnotation(false);
		this.cbHVVP5.setContainerDataSource(HanhViViPham.class, DAOs.get(HanhViViPhamDAO.class).findAll());
		this.cbHVVP5.setItemCaptionPropertyId(HanhViViPham_.noiDung.getName());
		this.comboBox7.setItemCaptionFromAnnotation(false);
		this.comboBox7.setContainerDataSource(NghiDinhCp.class, DAOs.get(NghiDinhCpDAO.class).findAll());
		this.comboBox7.setItemCaptionPropertyId(NghiDinhCp_.ten.getName());
		this.btnDelete5.setIcon(FontAwesome.REMOVE);
		this.btnDelete5.setCaption("");
		this.btnDelete5.setPrimaryStyleName("v-btnLuu");
		this.label19.setValue("Điều");
		this.label20.setValue("Khoản");
		this.lblDieu5.setValue("Điểm");
		this.txtDieu5.setInputPrompt(".......");
		this.txtDieu5.setStyleName("borderless");
		this.txtDieu5.setEnabled(false);
		this.txtKhoan5.setInputPrompt("........");
		this.txtKhoan5.setStyleName("borderless");
		this.txtKhoan5.setEnabled(false);
		this.txtDiem5.setInputPrompt(".........");
		this.txtDiem5.setStyleName("borderless");
		this.txtDiem5.setEnabled(false);
		this.label15.setValue("Hành vi vi phạm ");
		this.cbHVVP4.setItemCaptionFromAnnotation(false);
		this.cbHVVP4.setContainerDataSource(HanhViViPham.class, DAOs.get(HanhViViPhamDAO.class).findAll());
		this.cbHVVP4.setItemCaptionPropertyId(HanhViViPham_.noiDung.getName());
		this.comboBox6.setItemCaptionFromAnnotation(false);
		this.comboBox6.setContainerDataSource(NghiDinhCp.class, DAOs.get(NghiDinhCpDAO.class).findAll());
		this.comboBox6.setItemCaptionPropertyId(NghiDinhCp_.ten.getName());
		this.btnDelete4.setIcon(FontAwesome.REMOVE);
		this.btnDelete4.setCaption("");
		this.btnDelete4.setPrimaryStyleName("v-btnLuu");
		this.label16.setValue("Điều");
		this.label17.setValue("Khoản");
		this.lblDieu4.setValue("Điểm");
		this.txtDieu4.setInputPrompt(".......");
		this.txtDieu4.setStyleName("borderless");
		this.txtDieu4.setEnabled(false);
		this.txtKhoan4.setInputPrompt("........");
		this.txtKhoan4.setStyleName("borderless");
		this.txtKhoan4.setEnabled(false);
		this.txtDiem4.setInputPrompt(".........");
		this.txtDiem4.setStyleName("borderless");
		this.txtDiem4.setEnabled(false);
		this.label9.setValue("Hành vi vi phạm ");
		this.cbHVVP2.setItemCaptionFromAnnotation(false);
		this.cbHVVP2.setContainerDataSource(HanhViViPham.class, DAOs.get(HanhViViPhamDAO.class).findAll());
		this.cbHVVP2.setItemCaptionPropertyId(HanhViViPham_.noiDung.getName());
		this.comboBox4.setItemCaptionFromAnnotation(false);
		this.comboBox4.setContainerDataSource(NghiDinhCp.class, DAOs.get(NghiDinhCpDAO.class).findAll());
		this.comboBox4.setItemCaptionPropertyId(NghiDinhCp_.ten.getName());
		this.btnDelete2.setIcon(FontAwesome.REMOVE);
		this.btnDelete2.setCaption("");
		this.btnDelete2.setPrimaryStyleName("v-btnLuu");
		this.label10.setValue("Điều");
		this.label11.setValue("Khoản");
		this.lblDieu2.setValue("Điểm");
		this.txtDieu2.setInputPrompt(".......");
		this.txtDieu2.setStyleName("borderless");
		this.txtDieu2.setEnabled(false);
		this.txtKhoan2.setInputPrompt("........");
		this.txtKhoan2.setStyleName("borderless");
		this.txtKhoan2.setEnabled(false);
		this.txtDiem2.setInputPrompt(".........");
		this.txtDiem2.setStyleName("borderless");
		this.txtDiem2.setEnabled(false);
		this.btnLuu.setCaption("Lưu");
		this.btnLuu.setPrimaryStyleName("v-btnLuu");
		this.btnClose.setCaption("Đóng");
		this.btnClose.setPrimaryStyleName("v-btnLuu");
		this.btnAdd.setCaption("Thêm lỗi HVVP");
		this.btnAdd.setPrimaryStyleName("v-btnLuu");
	
		this.label.setWidth(300, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label, "left:50px; top:40px");
		this.txtMinute.setWidth(50, Unit.PIXELS);
		this.txtMinute.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtMinute, "left:200px; top:40px");
		this.absoluteLayout.addComponent(this.popupDateField, "left:380px; top:35px");
		this.label2.setWidth(50, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label2, "left:50px; top:70px");
		this.txtDiaDiem.setWidth(500, Unit.PIXELS);
		this.txtDiaDiem.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtDiaDiem, "left:120px; top:70px");
		this.label3.setWidth(100, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label3, "left:50px; top:105px");
		this.comboBox.setWidth(450, Unit.PIXELS);
		this.comboBox.setHeight(30, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.comboBox, "left:170px; top:100px");
		this.label4.setWidth(50, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label4, "left:50px; top:135px");
		this.label5.setWidth(300, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label5, "left:50px; top:167px");
		this.txtBKS.setWidth(150, Unit.PIXELS);
		this.txtBKS.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtBKS, "left:100px; top:135px");
		this.txtHour.setWidth(50, Unit.PIXELS);
		this.txtHour.setHeight(25, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtHour, "left:90px; top:40px");
		this.label6.setWidth(130, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.label6, "left:70px; top:20px");
		this.cbHVVP.setWidth(600, Unit.PIXELS);
		this.cbHVVP.setHeight(30, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.cbHVVP, "left:230px; top:15px");
		this.comboBox3.setWidth(300, Unit.PIXELS);
		this.comboBox3.setHeight(30, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.comboBox3, "left:70px; top:60px");
		this.btnDelete.setWidth(40, Unit.PIXELS);
		this.btnDelete.setHeight(30, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.btnDelete, "left:850px; top:15px");
		this.label7.setWidth(50, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.label7, "left:419px; top:60px");
		this.label8.setWidth(50, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.label8, "left:559px; top:60px");
		this.lblDieu.setWidth(50, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.lblDieu, "left:696px; top:60px");
		this.txtDieu.setWidth(50, Unit.PIXELS);
		this.txtDieu.setHeight(25, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.txtDieu, "left:478px; top:60px");
		this.txtKhoan.setWidth(50, Unit.PIXELS);
		this.txtKhoan.setHeight(25, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.txtKhoan, "left:618px; top:60px");
		this.txtDiem.setWidth(50, Unit.PIXELS);
		this.txtDiem.setHeight(25, Unit.PIXELS);
		this.absoluteLayout1.addComponent(this.txtDiem, "left:755px; top:60px");
		this.label12.setWidth(130, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.label12, "left:70px; top:20px");
		this.cbHVVP3.setWidth(600, Unit.PIXELS);
		this.cbHVVP3.setHeight(30, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.cbHVVP3, "left:230px; top:15px");
		this.comboBox5.setWidth(300, Unit.PIXELS);
		this.comboBox5.setHeight(30, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.comboBox5, "left:70px; top:60px");
		this.btnDelete3.setWidth(40, Unit.PIXELS);
		this.btnDelete3.setHeight(30, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.btnDelete3, "left:850px; top:15px");
		this.label13.setWidth(50, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.label13, "left:419px; top:60px");
		this.label14.setWidth(50, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.label14, "left:559px; top:60px");
		this.lblDieu3.setWidth(50, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.lblDieu3, "left:696px; top:60px");
		this.txtDieu3.setWidth(50, Unit.PIXELS);
		this.txtDieu3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.txtDieu3, "left:478px; top:60px");
		this.txtKhoan3.setWidth(50, Unit.PIXELS);
		this.txtKhoan3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.txtKhoan3, "left:618px; top:60px");
		this.txtDiem3.setWidth(50, Unit.PIXELS);
		this.txtDiem3.setHeight(25, Unit.PIXELS);
		this.absoluteLayout3.addComponent(this.txtDiem3, "left:755px; top:60px");
		this.label21.setWidth(130, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.label21, "left:70px; top:20px");
		this.cbHVVP6.setWidth(600, Unit.PIXELS);
		this.cbHVVP6.setHeight(30, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.cbHVVP6, "left:230px; top:15px");
		this.comboBox8.setWidth(300, Unit.PIXELS);
		this.comboBox8.setHeight(30, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.comboBox8, "left:70px; top:60px");
		this.btnDelete6.setWidth(40, Unit.PIXELS);
		this.btnDelete6.setHeight(30, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.btnDelete6, "left:850px; top:15px");
		this.label22.setWidth(50, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.label22, "left:419px; top:60px");
		this.label23.setWidth(50, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.label23, "left:559px; top:60px");
		this.lblDieu6.setWidth(50, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.lblDieu6, "left:696px; top:60px");
		this.txtDieu6.setWidth(50, Unit.PIXELS);
		this.txtDieu6.setHeight(25, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.txtDieu6, "left:478px; top:60px");
		this.txtKhoan6.setWidth(50, Unit.PIXELS);
		this.txtKhoan6.setHeight(25, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.txtKhoan6, "left:618px; top:60px");
		this.txtDiem6.setWidth(50, Unit.PIXELS);
		this.txtDiem6.setHeight(25, Unit.PIXELS);
		this.absoluteLayout6.addComponent(this.txtDiem6, "left:755px; top:60px");
		this.label18.setWidth(130, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.label18, "left:70px; top:20px");
		this.cbHVVP5.setWidth(600, Unit.PIXELS);
		this.cbHVVP5.setHeight(30, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.cbHVVP5, "left:230px; top:15px");
		this.comboBox7.setWidth(300, Unit.PIXELS);
		this.comboBox7.setHeight(30, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.comboBox7, "left:70px; top:60px");
		this.btnDelete5.setWidth(40, Unit.PIXELS);
		this.btnDelete5.setHeight(30, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.btnDelete5, "left:850px; top:15px");
		this.label19.setWidth(50, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.label19, "left:419px; top:60px");
		this.label20.setWidth(50, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.label20, "left:559px; top:60px");
		this.lblDieu5.setWidth(50, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.lblDieu5, "left:696px; top:60px");
		this.txtDieu5.setWidth(50, Unit.PIXELS);
		this.txtDieu5.setHeight(25, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.txtDieu5, "left:478px; top:60px");
		this.txtKhoan5.setWidth(50, Unit.PIXELS);
		this.txtKhoan5.setHeight(25, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.txtKhoan5, "left:618px; top:60px");
		this.txtDiem5.setWidth(50, Unit.PIXELS);
		this.txtDiem5.setHeight(25, Unit.PIXELS);
		this.absoluteLayout5.addComponent(this.txtDiem5, "left:755px; top:60px");
		this.label15.setWidth(130, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.label15, "left:70px; top:20px");
		this.cbHVVP4.setWidth(600, Unit.PIXELS);
		this.cbHVVP4.setHeight(30, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.cbHVVP4, "left:230px; top:15px");
		this.comboBox6.setWidth(300, Unit.PIXELS);
		this.comboBox6.setHeight(30, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.comboBox6, "left:70px; top:60px");
		this.btnDelete4.setWidth(40, Unit.PIXELS);
		this.btnDelete4.setHeight(30, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.btnDelete4, "left:850px; top:15px");
		this.label16.setWidth(50, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.label16, "left:419px; top:60px");
		this.label17.setWidth(50, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.label17, "left:559px; top:60px");
		this.lblDieu4.setWidth(50, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.lblDieu4, "left:696px; top:60px");
		this.txtDieu4.setWidth(50, Unit.PIXELS);
		this.txtDieu4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.txtDieu4, "left:478px; top:60px");
		this.txtKhoan4.setWidth(50, Unit.PIXELS);
		this.txtKhoan4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.txtKhoan4, "left:618px; top:60px");
		this.txtDiem4.setWidth(50, Unit.PIXELS);
		this.txtDiem4.setHeight(25, Unit.PIXELS);
		this.absoluteLayout4.addComponent(this.txtDiem4, "left:755px; top:60px");
		this.label9.setWidth(130, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label9, "left:70px; top:20px");
		this.cbHVVP2.setWidth(600, Unit.PIXELS);
		this.cbHVVP2.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.cbHVVP2, "left:230px; top:15px");
		this.comboBox4.setWidth(300, Unit.PIXELS);
		this.comboBox4.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.comboBox4, "left:70px; top:60px");
		this.btnDelete2.setWidth(40, Unit.PIXELS);
		this.btnDelete2.setHeight(30, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.btnDelete2, "left:850px; top:15px");
		this.label10.setWidth(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label10, "left:419px; top:60px");
		this.label11.setWidth(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.label11, "left:559px; top:60px");
		this.lblDieu2.setWidth(50, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.lblDieu2, "left:696px; top:60px");
		this.txtDieu2.setWidth(50, Unit.PIXELS);
		this.txtDieu2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtDieu2, "left:478px; top:60px");
		this.txtKhoan2.setWidth(50, Unit.PIXELS);
		this.txtKhoan2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtKhoan2, "left:618px; top:60px");
		this.txtDiem2.setWidth(50, Unit.PIXELS);
		this.txtDiem2.setHeight(25, Unit.PIXELS);
		this.absoluteLayout2.addComponent(this.txtDiem2, "left:755px; top:60px");
		this.btnLuu.setWidth(100, Unit.PIXELS);
		this.btnLuu.setHeight(30, Unit.PIXELS);
		this.absoluteLayout10.addComponent(this.btnLuu, "left:448px; top:37px");
		this.btnClose.setWidth(100, Unit.PIXELS);
		this.btnClose.setHeight(30, Unit.PIXELS);
		this.absoluteLayout10.addComponent(this.btnClose, "left:570px; top:37px");
		this.btnAdd.setWidth(150, Unit.PIXELS);
		this.btnAdd.setHeight(30, Unit.PIXELS);
		this.absoluteLayout10.addComponent(this.btnAdd, "left:69px; top:0px");
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(8);
		this.absoluteLayout.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout.setHeight(200, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout, 0, 0);
		this.absoluteLayout1.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout1.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout1, 0, 1);
		this.absoluteLayout3.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout3.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout3, 0, 2);
		this.absoluteLayout6.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout6.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout6, 0, 3);
		this.absoluteLayout5.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout5.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout5, 0, 4);
		this.absoluteLayout4.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout4.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout4, 0, 5);
		this.absoluteLayout2.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout2.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout2, 0, 6);
		this.absoluteLayout10.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout10.setHeight(100, Unit.PIXELS);
		this.gridLayout.addComponent(this.absoluteLayout10, 0, 7);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		this.gridLayout.setRowExpandRatio(7, 10.0F);
		this.gridLayout.setWidth(100, Unit.PERCENTAGE);
		this.gridLayout.setHeight(-1, Unit.PIXELS);
		this.setContent(this.gridLayout);
		this.setWidth(100, Unit.PERCENTAGE);
		this.setHeight(-1, Unit.PIXELS);
	
		this.cbHVVP.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				OptionHVVP.this.cbHVVP_valueChange(event);
			}
		});
		this.cbHVVP3.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				OptionHVVP.this.cbHVVP3_valueChange(event);
			}
		});
		this.btnDelete3.addClickListener(event -> this.btnDelete3_buttonClick(event));
		this.cbHVVP6.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				OptionHVVP.this.cbHVVP6_valueChange(event);
			}
		});
		this.btnDelete6.addClickListener(event -> this.btnDelete6_buttonClick(event));
		this.cbHVVP5.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				OptionHVVP.this.cbHVVP5_valueChange(event);
			}
		});
		this.btnDelete5.addClickListener(event -> this.btnDelete5_buttonClick(event));
		this.cbHVVP4.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				OptionHVVP.this.cbHVVP4_valueChange(event);
			}
		});
		this.btnDelete4.addClickListener(event -> this.btnDelete4_buttonClick(event));
		this.cbHVVP2.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				OptionHVVP.this.cbHVVP2_valueChange(event);
			}
		});
		this.btnDelete2.addClickListener(event -> this.btnDelete2_buttonClick(event));
		this.btnLuu.addClickListener(event -> this.btnLuu_buttonClick(event));
		this.btnClose.addClickListener(event -> this.btnClose_buttonClick(event));
		this.btnAdd.addClickListener(event -> this.btnAdd_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton btnDelete, btnDelete3, btnDelete6, btnDelete5, btnDelete4, btnDelete2, btnLuu, btnClose, btnAdd;
	private TextField txtMinute, txtDiaDiem, txtBKS, txtHour, txtDieu, txtKhoan, txtDiem, txtDieu3, txtKhoan3, txtDiem3,
			txtDieu6, txtKhoan6, txtDiem6, txtDieu5, txtKhoan5, txtDiem5, txtDieu4, txtKhoan4, txtDiem4, txtDieu2,
			txtKhoan2, txtDiem2;
	private XdevComboBox<PhuongTienTggt> comboBox;
	private XdevComboBox<HanhViViPham> cbHVVP, cbHVVP3, cbHVVP6, cbHVVP5, cbHVVP4, cbHVVP2;
	private XdevComboBox<NghiDinhCp> comboBox3, comboBox5, comboBox8, comboBox7, comboBox6, comboBox4;
	private Label label, label2, label3, label4, label5, label6, label7, label8, lblDieu, label12, label13, label14,
			lblDieu3, label21, label22, label23, lblDieu6, label18, label19, label20, lblDieu5, label15, label16, label17,
			lblDieu4, label9, label10, label11, lblDieu2;
	private PopupDateField popupDateField;
	private GridLayout gridLayout;
	private AbsoluteLayout absoluteLayout, absoluteLayout1, absoluteLayout3, absoluteLayout6, absoluteLayout5,
			absoluteLayout4, absoluteLayout2, absoluteLayout10;
	// </generated-code>

	// </generated-code>
	private static OptionHVVP hvvp = null;

	public static OptionHVVP getInstance() {
		// TODO Auto-generated method stub
		if (hvvp == null) {
			hvvp = new OptionHVVP();
		}
		return hvvp;
	}

}
