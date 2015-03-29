package sometest.client;

import com.google.gwt.core.client.js.JsExport;

@JsExport
public class SomeEventBar implements SomeEvent<Integer> {

    public static final String NAME = SomeEventBar.class.getName();

    @Override
    public Integer doStuff() {
        return 123;
    }
}
