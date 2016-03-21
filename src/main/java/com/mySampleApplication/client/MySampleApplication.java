package com.mySampleApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.mySampleApplication.client.services.JSONtoString;
import com.mySampleApplication.client.services.TextService;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        final Button button = new Button("Click me");
        final Label label = new Label();
        final Label label2 = new Label();

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (label.getText().equals("")) {
                    TextService.Instance.getInstance().getText("Hello, World!", new MyMethodCallBack(label));
                    TextService.Instance.getInstance().getHello(new MyMethodCallBack(label2));
                } else {
                    label.setText("");
                }
            }
        });

        RootPanel.get("slot1").add(button);
        RootPanel.get("slot2").add(label);
        RootPanel.get("slot3").add(label2);
    }

    private static class MyMethodCallBack implements MethodCallback<JSONtoString> {
        private Label label;

        public MyMethodCallBack(Label label) {
            this.label = label;
        }
        public void onFailure(Method method, Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }

        public void onSuccess(Method method, JSONtoString result) {
            label.getElement().setInnerHTML(result.getMsg());
        }
    }
}
