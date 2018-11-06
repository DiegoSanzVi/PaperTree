package org.vaadin.addons;

import java.util.Arrays;
import java.util.List;

/**
 * Data hold by the root node (contains the children).
 *
 * Specific data:
 *
 * - `data.name`: string representing the node name.
 * - `data.icon`: string telling which icon to use (default to 'folder' icon).
 * - `data.open`: boolean telling whether the node is expanded or not.
 * - `data.children` array containing the children of the node.
 */
public class Data {

    private String name;
    private String icon;
    private boolean open;
    private List<Data> children;

    public Data() {
    }

    public Data(String name) {
        this.name = name;
    }

    public Data(String name, String icon) {
        this(name);
        this.icon = icon;
    }

    public Data(String name, String icon, boolean open) {
        this(name,icon);
        this.open = open;
    }


    public Data(String name, String icon, boolean open, List<Data> children) {
        this(name,icon,open);
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List<Data> getChildren() {
        return children;
    }

    public void setChildren(List<Data> children) {
        this.children = children;
    }

    public void setChildren(Data... children) {
        setChildren(Arrays.asList(children));
    }
}
