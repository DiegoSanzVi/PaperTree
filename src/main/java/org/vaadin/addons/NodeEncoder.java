package org.vaadin.addons;

import com.vaadin.flow.templatemodel.ModelEncoder;

public class NodeEncoder implements ModelEncoder<Long, String> {

    @Override
    public String encode(Long modelValue) {
        return "";
    }

    @Override
    public Long decode(String presentationValue) {
       return 0L;
    }

}
