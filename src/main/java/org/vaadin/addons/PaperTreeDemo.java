package org.vaadin.addons;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class PaperTreeDemo extends VerticalLayout {

    public PaperTreeDemo() {
        PaperTree paperTree = new PaperTree();
        paperTree.setData(data);
        add(paperTree);
    }


    private final String data = "{\n" +
            "        \"name\": \"Hello\",\n" +
            "        \"children\": [{\n" +
            "            \"name\": \"World\"\n" +
            "        }, {\n" +
            "            \"name\": \"There\"\n" +
            "        }, {\n" +
            "            \"name\": \"You\"\n" +
            "        }]";

}
