
package com.etc.bca_moto.ui;

import java.util.Random;

import com.etc.bca_moto.business.MyAuthenticationProvider;
import com.vaadin.event.ShortcutAction;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.xdev.res.ApplicationResource;
import com.xdev.security.authentication.CredentialsUsernamePassword;
import com.xdev.security.authentication.ui.Authentication;
import com.xdev.ui.XdevAbsoluteLayout;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevLabel;
import com.xdev.ui.XdevPasswordField;
import com.xdev.ui.XdevTextField;
import com.xdev.ui.XdevView;

public class LoginView extends XdevView implements com.xdev.security.authentication.ui.LoginView {

	/**
	 * 
	 */
	private final Random rdm = new Random();

	public LoginView() {
		super();
		this.initUI();
		setMaBaoMat();
	}

	@Override
	public String getPassword() {
		return this.txtPassword.getValue();
	}

	@Override
	public String getUsername() {
		return this.txtUsername.getValue();
	}

	public void setMaBaoMat() {
		String rd = String.valueOf(this.rdm.nextInt(9999));
		while (rd.length() < 4) {
			rd = "0" + rd;
		}
		this.txtRandom.setValue(rd);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #cmdLogin}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void cmdLogin_buttonClick(final Button.ClickEvent event) {
		final CredentialsUsernamePassword credentials = CredentialsUsernamePassword.New(getUsername(), getPassword());
		final MyAuthenticationProvider authenticatorProvider = MyAuthenticationProvider.getInstance();
		if (this.txtMaBaoVe.getValue().equals(this.txtRandom.getValue())) {
			if (!Authentication.tryLogin(credentials, authenticatorProvider)) {
				Notification.show("Tài khoản hoặc mật khẩu không chính xác!", Type.ERROR_MESSAGE);
				setMaBaoMat();
			}
		} else {
			Notification.show("Mã bảo mật không chính xác!", Type.WARNING_MESSAGE);
			setMaBaoMat();
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #btnRandom}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void btnRandom_buttonClick(final Button.ClickEvent event) {
		setMaBaoMat();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.gridLayoutBanner = new XdevGridLayout();
		this.image = new Image();
		this.absoluteLayout = new XdevAbsoluteLayout();
		this.label = new XdevLabel();
		this.txtUsername = new XdevTextField();
		this.txtPassword = new XdevPasswordField();
		this.txtMaBaoVe = new XdevTextField();
		this.cmdLogin = new XdevButton();
		this.txtRandom = new XdevTextField();
		this.btnRandom = new XdevButton();
		this.lblBCA = new XdevLabel();
	
		this.setPrimaryStyleName("v-font-ct");
		this.gridLayout.setMargin(new MarginInfo(false));
		this.gridLayoutBanner.setMargin(new MarginInfo(true, false, false, false));
		this.image.setSource(
				new ApplicationResource(this.getClass(), "WebContent/WEB-INF/resources/images/image_2019removebg.png"));
		this.label.setStyleName("h3");
		this.label.setValue("<div style=\"text-align: center;width:100%;color:#085B97\"><b >ĐĂNG NHẬP TÀI KHOẢN</b></div>");
		this.label.setContentMode(ContentMode.HTML);
		this.txtUsername.setCaption("Tài khoản");
		this.txtUsername.setInputPrompt("Nhập tài khoản");
		this.txtPassword.setCaption("Mật khẩu");
		this.txtPassword.setInputPrompt("..............");
		this.txtMaBaoVe.setInputPrompt("Nhập mã bảo vệ");
		this.cmdLogin.setCaption("ĐĂNG NHẬP");
		this.cmdLogin.setPrimaryStyleName("v-btnLuu");
		this.cmdLogin.setClickShortcut(ShortcutAction.KeyCode.ENTER);
		this.txtRandom.setColumns(5);
		this.txtRandom.setEnabled(false);
		this.btnRandom.setIcon(FontAwesome.REPEAT);
		this.btnRandom.setCaption("");
		this.btnRandom.setPrimaryStyleName("v-btnLuu");
		this.lblBCA.setStyleName("large");
		this.lblBCA.setValue(
				"<b style=\"color:#FBC50A;\">BỘ CÔNG AN<br>CỤC CẢNH SÁT GIAO THÔNG</b><br><b> HỆ THỐNG CƠ SỞ DỮ LIỆU XỬ PHẠT VI PHẠM HÀNH CHÍNH TRONG LĨNH VỰC GIAO THÔNG</b>");
		this.lblBCA.setContentMode(ContentMode.HTML);
	
		this.label.setWidth(400, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.label, "left:0px; top:150px");
		this.txtUsername.setWidth(400, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtUsername, "left:1px; top:200px");
		this.txtPassword.setWidth(400, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtPassword, "left:1px; top:285px");
		this.txtMaBaoVe.setWidth(300, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.txtMaBaoVe, "left:1px; top:340px");
		this.cmdLogin.setWidth(150, Unit.PIXELS);
		this.cmdLogin.setHeight(40, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.cmdLogin, "left:124px; top:390px");
		this.absoluteLayout.addComponent(this.txtRandom, "left:321px; top:340px");
		this.btnRandom.setWidth(40, Unit.PIXELS);
		this.btnRandom.setHeight(38, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.btnRandom, "left:411px; top:340px");
		this.lblBCA.setWidth(100, Unit.PERCENTAGE);
		this.absoluteLayout.addComponent(this.lblBCA, "left:0px; top:0px");
		this.gridLayoutBanner.setColumns(2);
		this.gridLayoutBanner.setRows(2);
		this.image.setWidth(110, Unit.PIXELS);
		this.image.setHeight(120, Unit.PIXELS);
		this.gridLayoutBanner.addComponent(this.image, 0, 0);
		this.gridLayoutBanner.setComponentAlignment(this.image, Alignment.TOP_RIGHT);
		this.absoluteLayout.setWidth(450, Unit.PIXELS);
		this.absoluteLayout.setHeight(500, Unit.PIXELS);
		this.gridLayoutBanner.addComponent(this.absoluteLayout, 1, 0);
		this.gridLayoutBanner.setComponentAlignment(this.absoluteLayout, Alignment.MIDDLE_CENTER);
		this.gridLayoutBanner.setColumnExpandRatio(1, 10.0F);
		final CustomComponent gridLayoutBanner_vSpacer = new CustomComponent();
		gridLayoutBanner_vSpacer.setSizeFull();
		this.gridLayoutBanner.addComponent(gridLayoutBanner_vSpacer, 0, 1, 1, 1);
		this.gridLayoutBanner.setRowExpandRatio(1, 1.0F);
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(2);
		this.gridLayoutBanner.setWidth(65, Unit.PERCENTAGE);
		this.gridLayoutBanner.setHeight(-1, Unit.PIXELS);
		this.gridLayout.addComponent(this.gridLayoutBanner, 0, 0);
		this.gridLayout.setComponentAlignment(this.gridLayoutBanner, Alignment.TOP_CENTER);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		final CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 1, 0, 1);
		this.gridLayout.setRowExpandRatio(1, 1.0F);
		this.gridLayout.setWidth(100, Unit.PERCENTAGE);
		this.gridLayout.setHeight(-1, Unit.PIXELS);
		this.setContent(this.gridLayout);
		this.setSizeFull();
	
		this.cmdLogin.addClickListener(event -> this.cmdLogin_buttonClick(event));
		this.btnRandom.addClickListener(event -> this.btnRandom_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private XdevLabel lblBCA, label;
	private XdevButton cmdLogin, btnRandom;
	private Image image;
	private XdevAbsoluteLayout absoluteLayout;
	private XdevPasswordField txtPassword;
	private XdevGridLayout gridLayout, gridLayoutBanner;
	private XdevTextField txtUsername, txtMaBaoVe, txtRandom;
	// </generated-code>

}
