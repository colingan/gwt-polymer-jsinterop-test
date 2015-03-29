package sometest.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
public interface SomeEvent<P> {
    public P doStuff();
}
