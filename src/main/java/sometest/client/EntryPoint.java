package sometest.client;

import java.util.logging.Logger;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

    private static final Logger LOG = Logger.getLogger(EntryPoint.class.getName());

    @Override
    public void onModuleLoad() {
        LOG.info("### ON MODULE LOAD");
        onModuleReady();
    }

    private native void onModuleReady() /*-{
        if ($wnd.onGwtReady()) {
            $wnd.onGwtReady();
        }
    }-*/;

}
