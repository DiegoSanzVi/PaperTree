package org.vaadin.addons;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-tree")
@HtmlImport("bower_components/paper-tree/paper-tree.html")
public class PaperTree extends Component {


    public PaperTree() {
    }

    public void setData(String data){
        getElement().setProperty("data",data);
    }
}
