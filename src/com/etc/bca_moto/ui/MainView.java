
package com.etc.bca_moto.ui;

import com.etc.bca_moto.dal.QdGiamMienTienPhat04DAO;
import com.etc.bca_moto.entities.AuthUser;
import com.etc.bca_moto.entities.QdGiamMienTienPhat04;
import com.etc.bca_moto.entities.QdGiamMienTienPhat04_;
import com.vaadin.data.Property;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.xdev.dal.DAOs;
import com.xdev.res.ApplicationResource;
import com.xdev.ui.XdevAbsoluteLayout;
import com.xdev.ui.XdevBrowserFrame;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevLabel;
import com.xdev.ui.XdevPanel;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;

public class MainView extends XdevView {

	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
		final AuthUser object = (AuthUser) UI.getCurrent().getSession().getAttribute("AUTHENTICATION_RESULT");

		this.browserFrame.setSource(new ThemeResource("realtime.html"));
		if (object != null) {
			this.button.setCaption(object.getUserName());
		}
	}

	/**
	 * Event handler delegate method for the {@link XdevTable} {@link #table}.
	 *
	 * @see Property.ValueChangeListener#valueChange(Property.ValueChangeEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void table_valueChange(final Property.ValueChangeEvent event) {
		final QdGiamMienTienPhat04 giamMienTienPhat04 = this.table.getSelectedItem().getBean();
		UI.getCurrent().getSession().setAttribute("OutPutViewReport04", giamMienTienPhat04);
		final Window w = new Window();
		w.setWidth(1300, Unit.PIXELS);
		w.setHeight(60, Unit.PERCENTAGE);
		w.center();
		w.setResizable(false);
		w.setModal(true);
		w.setContent(new BBGiamPhatView());
		UI.getCurrent().addWindow(w);
	}

	/**
	 * Event handler delegate method for the {@link XdevButton} {@link #button}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void button_buttonClick(final Button.ClickEvent event) {
		final QdGiamMienTienPhat04 giamMienTienPhat04 = this.table.getSelectedItem().getBean();
		UI.getCurrent().getSession().setAttribute("OutPutViewReport04", giamMienTienPhat04);
		final Window w = new Window();
		w.setWidth(1300, Unit.PIXELS);
		w.setHeight(60, Unit.PERCENTAGE);
		w.center();
		w.setResizable(false);
		w.setModal(true);
		w.setContent(new BBVPHCView());
		UI.getCurrent().addWindow(w);
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.panel = new XdevPanel();
		this.gridLayout = new XdevGridLayout();
		this.button = new XdevButton();
		this.btnBBvphc = new XdevButton();
		this.gridLayoutBca = new XdevGridLayout();
		this.absoluteLayoutBanner = new XdevAbsoluteLayout();
		this.lblBCA = new XdevLabel();
		this.image = new Image();
		this.gridLayoutRealTime = new XdevGridLayout();
		this.label = new XdevLabel();
		this.browserFrame = new XdevBrowserFrame();
		this.table = new XdevTable<>();

		this.setPrimaryStyleName("v-font-ct");
		this.gridLayout.setMargin(new MarginInfo(false));
		this.button.setCaption("Button");
		this.btnBBvphc.setCaption("Create Report");
		this.btnBBvphc.setPrimaryStyleName("v-btnLuu");
		this.gridLayoutBca.setSpacing(false);
		this.gridLayoutBca.setPrimaryStyleName("v-gridlayout banner");
		this.gridLayoutBca.setMargin(new MarginInfo(false));
		this.lblBCA.setStyleName("large align-center");
		this.lblBCA.setValue(
				"<b style=\"font-size:32px;color:#FBC50A;\">BỘ CÔNG AN</b><br><b style=\"color:#FBC50A;\">CỤC CẢNH SÁT GIAO THÔNG</b>");
		this.lblBCA.setContentMode(ContentMode.HTML);
		this.image.setSource(
				new ApplicationResource(this.getClass(), "WebContent/WEB-INF/resources/images/image_2019removebg.png"));
		this.gridLayoutRealTime.setSpacing(false);
		this.gridLayoutRealTime.setMargin(new MarginInfo(false));
		this.label.setStyleName("align-right");
		this.label.setPrimaryStyleName("v-label v-text-white");
		this.label.setValue("<b style=\"font-size:16px\">Lĩnh vực đường bộ</b>");
		this.label.setContentMode(ContentMode.HTML);
		this.table.setContainerDataSource(QdGiamMienTienPhat04.class,
				DAOs.get(QdGiamMienTienPhat04DAO.class).findAll());
		this.table.setVisibleColumns(QdGiamMienTienPhat04_.coQuanChuQuan.getName(),
				QdGiamMienTienPhat04_.donVi.getName(), QdGiamMienTienPhat04_.capBacChucVu.getName(),
				QdGiamMienTienPhat04_.soQuyetDinh.getName(), QdGiamMienTienPhat04_.ngayTaoQuyetDinh.getName(),
				QdGiamMienTienPhat04_.tenNguoiNvp.getName(), QdGiamMienTienPhat04_.lyDoGiam.getName(),
				QdGiamMienTienPhat04_.tangVatNhanLai.getName(), QdGiamMienTienPhat04_.trangThaiQd.getName());
		this.table.setColumnHeader("coQuanChuQuan", "Cơ quan chủ quản");
		this.table.setColumnHeader("donVi", "Đơn vị");
		this.table.setColumnHeader("capBacChucVu", "Cấp bậc");
		this.table.setColumnHeader("soQuyetDinh", "Số QĐ");
		this.table.setColumnHeader("ngayTaoQuyetDinh", "Ngày tạo QĐ");
		this.table.setColumnHeader("tenNguoiNvp", "Người vi phạm");
		this.table.setColumnHeader("lyDoGiam", "Lý do giảm");
		this.table.setColumnHeader("tangVatNhanLai", "Tang vật nhận lại");
		this.table.setColumnHeader("trangThaiQd", "Trạng thái");

		this.lblBCA.setWidth(350, Unit.PIXELS);
		this.lblBCA.setHeight(90, Unit.PIXELS);
		this.absoluteLayoutBanner.addComponent(this.lblBCA, "left:80px; top:0px");
		this.image.setWidth(80, Unit.PIXELS);
		this.image.setHeight(90, Unit.PIXELS);
		this.absoluteLayoutBanner.addComponent(this.image, "left:0px; top:0px");
		this.gridLayoutRealTime.setColumns(1);
		this.gridLayoutRealTime.setRows(3);
		this.label.setWidth(135, Unit.PIXELS);
		this.label.setHeight(30, Unit.PIXELS);
		this.gridLayoutRealTime.addComponent(this.label, 0, 0);
		this.gridLayoutRealTime.setComponentAlignment(this.label, Alignment.MIDDLE_RIGHT);
		this.browserFrame.setWidth(100, Unit.PERCENTAGE);
		this.browserFrame.setHeight(50, Unit.PIXELS);
		this.gridLayoutRealTime.addComponent(this.browserFrame, 0, 1);
		this.gridLayoutRealTime.setComponentAlignment(this.browserFrame, Alignment.BOTTOM_CENTER);
		this.gridLayoutRealTime.setColumnExpandRatio(0, 10.0F);
		final CustomComponent gridLayoutRealTime_vSpacer = new CustomComponent();
		gridLayoutRealTime_vSpacer.setSizeFull();
		this.gridLayoutRealTime.addComponent(gridLayoutRealTime_vSpacer, 0, 2, 0, 2);
		this.gridLayoutRealTime.setRowExpandRatio(2, 1.0F);
		this.gridLayoutBca.setColumns(2);
		this.gridLayoutBca.setRows(2);
		this.absoluteLayoutBanner.setWidth(430, Unit.PIXELS);
		this.absoluteLayoutBanner.setHeight(90, Unit.PIXELS);
		this.gridLayoutBca.addComponent(this.absoluteLayoutBanner, 0, 0);
		this.gridLayoutBca.setComponentAlignment(this.absoluteLayoutBanner, Alignment.TOP_CENTER);
		this.gridLayoutRealTime.setWidth(250, Unit.PIXELS);
		this.gridLayoutRealTime.setHeight(90, Unit.PIXELS);
		this.gridLayoutBca.addComponent(this.gridLayoutRealTime, 1, 0);
		this.gridLayoutBca.setComponentAlignment(this.gridLayoutRealTime, Alignment.TOP_RIGHT);
		this.gridLayoutBca.setColumnExpandRatio(0, 10.0F);
		final CustomComponent gridLayoutBca_vSpacer = new CustomComponent();
		gridLayoutBca_vSpacer.setSizeFull();
		this.gridLayoutBca.addComponent(gridLayoutBca_vSpacer, 0, 1, 1, 1);
		this.gridLayoutBca.setRowExpandRatio(1, 1.0F);
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(4);
		this.button.setSizeUndefined();
		this.gridLayout.addComponent(this.button, 0, 0);
		this.btnBBvphc.setSizeUndefined();
		this.gridLayout.addComponent(this.btnBBvphc, 0, 1);
		this.gridLayoutBca.setWidth(100, Unit.PERCENTAGE);
		this.gridLayoutBca.setHeight(90, Unit.PIXELS);
		this.gridLayout.addComponent(this.gridLayoutBca, 0, 2);
		this.table.setWidth(100, Unit.PERCENTAGE);
		this.table.setHeight(500, Unit.PIXELS);
		this.gridLayout.addComponent(this.table, 0, 3);
		this.gridLayout.setRowExpandRatio(3, 100.0F);
		this.gridLayout.setWidth(100, Unit.PERCENTAGE);
		this.gridLayout.setHeight(-1, Unit.PIXELS);
		this.panel.setContent(this.gridLayout);
		this.panel.setSizeFull();
		this.setContent(this.panel);
		this.setSizeFull();

		this.button.addClickListener(event -> this.button_buttonClick(event));
		this.table.addValueChangeListener(new Property.ValueChangeListener() {
			@Override
			public void valueChange(final Property.ValueChangeEvent event) {
				MainView.this.table_valueChange(event);
			}
		});
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button, btnBBvphc;
	private XdevLabel lblBCA, label;
	private XdevAbsoluteLayout absoluteLayoutBanner;
	private Image image;
	private XdevBrowserFrame browserFrame;
	private XdevPanel panel;
	private XdevGridLayout gridLayout, gridLayoutBca, gridLayoutRealTime;
	private XdevTable<QdGiamMienTienPhat04> table;
	// </generated-code>

}
