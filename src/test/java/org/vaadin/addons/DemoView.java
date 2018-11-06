package org.vaadin.addons;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

public class DemoView extends Div {

    public DemoView() {
        add(new PaperTree());
    }
}
