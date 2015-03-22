package sometest.client;

import java.util.logging.Logger;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

    private static final Logger LOG = Logger.getLogger(EntryPoint.class.getName());

    @Override
    public void onModuleLoad() {
        LOG.info("### RESULT JAVA: " + new sometest.client.Foo());
        LOG.info("### RESULT GWT: " + callExported());
        onModuleReady();
    }

    private native int callExported() /*-{
        return new $wnd.sometest.client.Foo();
    }-*/;

    private native void onModuleReady() /*-{
        $wnd.onGwtReady();
    }-*/;

}
