package sometest.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
public class MyModel {

    public int someProperty;

    protected int otherProperty;

    @JsProperty
    public int getOtherProperty() {
        return otherProperty;
    }

    @JsProperty
    public void setOtherProperty(int otherProperty) {
        this.otherProperty = otherProperty;
    }

    public void updateMyModel() {
        this.someProperty = (int)(Math.random() * 100);
        this.setOtherProperty((int)(Math.random() * 100));
    }
}