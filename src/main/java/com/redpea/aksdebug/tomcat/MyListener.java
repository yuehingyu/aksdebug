package com.redpea.aksdebug.tomcat;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;

@Component
public class MyListener implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {

    @Override
    public void onApplicationEvent(final EmbeddedServletContainerInitializedEvent event) {
        int thePort = event.getEmbeddedServletContainer().getPort();
       
        System.out.printf("Tomcat Port is %s ", thePort);
    }
  }
