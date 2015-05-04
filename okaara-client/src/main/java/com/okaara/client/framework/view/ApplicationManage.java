package com.okaara.client.framework.view;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationManage {

	public static <T extends Widget> void changeBody(T widget) {
		RootPanel.get().clear();
		RootPanel.get().add(widget);
	}

}
