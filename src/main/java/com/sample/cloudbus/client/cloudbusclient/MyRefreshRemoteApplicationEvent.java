package com.sample.cloudbus.client.cloudbusclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyRefreshRemoteApplicationEvent implements ApplicationListener<RefreshRemoteApplicationEvent> {

    @Autowired
    Sample sample;

    /*
     * RefreshRemoteApplicationEvent is catched before refreshment of environment.
     * So here the old value of prop4 is printed.
     */
    @Override
    public void onApplicationEvent(RefreshRemoteApplicationEvent event) {

        System.out.println("old value is : " + sample.getName());
    }

}