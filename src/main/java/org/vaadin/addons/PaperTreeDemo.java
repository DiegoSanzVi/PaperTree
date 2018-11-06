package org.vaadin.addons;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.internal.JsonSerializer;
import com.vaadin.flow.router.Route;

@Route("")
public class PaperTreeDemo extends VerticalLayout {

    public PaperTreeDemo() {
        setSizeFull();

        PaperTree paperTree = new PaperTree();
//
        Data root = new Data("root");
        Data childA = new Data("A");
        Data childB = new Data("B");
        Data childC = new Data("C");

        root.setChildren(childA,childB,childC);
        root.setOpen(true);
        paperTree.setData(root);

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
