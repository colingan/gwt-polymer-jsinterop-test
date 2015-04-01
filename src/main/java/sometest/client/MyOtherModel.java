package sometest.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
public class MyOtherModel {

    public int someNumber;

    public MyOtherModel(int someNumber) {
        this.someNumber = someNumber;
    }
}