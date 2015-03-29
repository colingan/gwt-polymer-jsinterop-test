package sometest.client;

import com.google.gwt.core.client.js.JsFunction;

@JsFunction
public interface SomeListener<E extends SomeEvent> {
    public void on(E event);
}
