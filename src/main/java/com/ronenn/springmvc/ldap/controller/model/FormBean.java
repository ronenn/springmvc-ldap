package com.ronenn.springmvc.ldap.controller.model;

import org.springframework.context.annotation.Scope;

import java.util.Map;

@Scope("session")
public class FormBean {

    private Map<String, String> additionalInfo;

    private String name;

    private boolean subscribeNewsletter;


    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribeNewsletter() {
        return subscribeNewsletter;
    }

    public void setSubscribeNewsletter(boolean subscribeNewsletter) {
        this.subscribeNewsletter = subscribeNewsletter;
    }
}
