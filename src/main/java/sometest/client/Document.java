package sometest.client;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.dom.client.Element;

@JsType
public interface Document {

    @JsProperty
    Element getBody();

}
