package sometest.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

import java.util.*;
import java.util.logging.Logger;

@JsExport
@JsType
public class MyModel {

    private static final Logger LOG = Logger.getLogger(MyModel.class.getName());

    public int someProperty;

    public int otherProperty;

    public String[] someArray = new String[0];

    public MyOtherModel[] otherArray = new MyOtherModel[0];

    public int getOtherProperty() {
        return otherProperty;
    }

    public void setOtherProperty(int otherProperty) {
        this.otherProperty = otherProperty + 1;
    }

    public void updateMyModel() {
        int value = (int) (Math.random() * 100);

        this.someProperty = value;
        this.setOtherProperty(value);

        List<String> strings = new ArrayList<>(Arrays.asList(someArray));
        strings.add("Added " + value);
        someArray = strings.toArray(new String[strings.size()]);

        List<MyOtherModel> others = new ArrayList<>(Arrays.asList(otherArray));
        others.add(new MyOtherModel(value));
        otherArray = others.toArray(new MyOtherModel[others.size()]);

    }
}