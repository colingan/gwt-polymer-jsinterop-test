package sometest.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
public class SomeRegistration<E extends SomeEvent> {

    final protected String eventName;
    final protected SomeListener<E> listener;

    public SomeRegistration(String eventName, SomeListener<E> listener) {
        this.eventName = eventName;
        this.listener = listener;
    }

    public String getEventName() {
        return eventName;
    }

    public SomeListener<E> getListener() {
        return listener;
    }
}