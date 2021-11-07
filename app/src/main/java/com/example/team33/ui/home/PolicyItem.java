package com.example.team33.ui.home;

import com.example.team33.R;

import java.util.ArrayList;

public class PolicyItem {
    String name;
    String message;
    int resourceId;

    public PolicyItem(int resourceId, String name, String message) {
        this.name = name;
        this.message= message;
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public static ArrayList<PolicyItem> createContactsList(int numContacts) {
        ArrayList<PolicyItem> contacts = new ArrayList<PolicyItem>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new PolicyItem(R.drawable.ic_baseline_home_24,"청년 주거지원 방안","청년 임대주택 본격 공급, 대학 기숙사 확충, 희망상가 공급"));
        }

        return contacts;
    }
}
