package org.vaadin.addons;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.JsonSerializable;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.internal.JsonSerializer;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("paper-tree")
@HtmlImport("bower_components/paper-tree/paper-tree.html")
public class PaperTree extends Component {//PolymerTemplate<PaperTree.PaperTreeTemplateModel> {


    public PaperTree() {
    }

    public void setData(Data data){
        System.out.println(JsonSerializer.toJson(data));
        getElement().setAttribute("data",JsonSerializer.toJson(data).toJson());
//        getElement().getNode().runWhenAttached(ui ->
//                ui.getPage().executeJavaScript("alert($1);$0.data = JSON.parse($1)",
//                        getElement(), a.replace("\"","'")
//                ));
    }


    final String example = "{\"name\":\"Media Center\",\"icon\":\"weekend\",\"open\":true,\"children\":[{\"name\":\"Movies\",\"icon\":\"av:movie\",\"children\":[{\"name\":\"Interstellar\",\"icon\":\"theaters\"},{\"name\":\"The Godfather\",\"icon\":\"theaters\"},{\"name\":\"Pulp Fiction\",\"icon\":\"theaters\"}]},{\"name\":\"TV Shows\",\"icon\":\"notification:live-tv\",\"children\":[{\"name\":\"Breaking Bad\",\"icon\":\"theaters\"},{\"name\":\"Game of Thrones\",\"icon\":\"theaters\"}]}]}";
    final String a = "'{\"name\": \"root\", \"open\": true }'";
}
