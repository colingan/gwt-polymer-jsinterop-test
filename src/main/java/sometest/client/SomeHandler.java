package sometest.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNoExport;
import com.google.gwt.core.client.js.JsType;

import java.util.ArrayList;
import java.util.Collection;

@JsExport
@JsType
public class SomeHandler {

    final protected Collection<SomeRegistration> registrations = new ArrayList<>();

    @JsNoExport
    public <E extends SomeEvent> SomeRegistration<E> register(Class<E> eventClass, SomeListener<E> listener) {
        return register(eventClass.getName(), listener);
    }

    public <E extends SomeEvent> SomeRegistration<E> register(String eventName, SomeListener<E> listener) {
        SomeRegistration<E> registration = new SomeRegistration<>(eventName, listener);
        registrations.add(registration);
        return registration;
    }

    public void unregister(SomeRegistration registration) {
        registrations.remove(registration);
    }

    @JsNoExport
    public void consume(SomeEvent event) {
        consume(event.getClass().getName(), event);
    }

    @JsNoExport
    public <E extends SomeEvent> void consume(Class<E> eventClass, E event) {
        consume(eventClass.getName(), event);
    }

    @SuppressWarnings("unchecked")
    public void consume(String eventName, SomeEvent someEvent) {
        for (SomeRegistration registration : registrations) {
            if (registration.getEventName().equals(eventName)) {
                registration.getListener().on(someEvent);
            }
        }
    }

    public void registerSomeModelUpdatingListeners(MyModel myModel) {
        register(SomeEventFoo.class, (SomeEventFoo event) -> {
            myModel.setOtherProperty(42);
        });
        register(SomeEventBar.class, (SomeEventBar event) -> {
            myModel.setOtherProperty(43);
        });
    }

    public void fireSomeModelUpdatingEvents(MyModel myModel) {
        consume(SomeEventFoo.class, new SomeEventFoo() {
            @Override
            public String doStuff() {
                myModel.updateMyModel();
                return super.doStuff();
            }
        });
        consume(SomeEventBar.class, new SomeEventBar() {
            @Override
            public Integer doStuff() {
                myModel.updateMyModel();
                return myModel.getOtherProperty();
            }
        });
    }

}