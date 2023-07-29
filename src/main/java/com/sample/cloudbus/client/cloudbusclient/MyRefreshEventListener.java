package com.sample.cloudbus.client.cloudbusclient;

import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;

public class MyRefreshEventListener implements ApplicationListener<RefreshScopeRefreshedEvent> {

    @Override
    public void onApplicationEvent(RefreshScopeRefreshedEvent event) {

        System.out.println("/refresh is called..");
    }

}