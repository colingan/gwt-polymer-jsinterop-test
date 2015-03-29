package sometest.client;

import com.google.gwt.core.client.js.JsExport;

@JsExport
public class SomeEventFoo implements SomeEvent<String> {

    public static final String NAME = SomeEventFoo.class.getName();

    @Override
    public String doStuff() {
        return "FOO";
    }
}

