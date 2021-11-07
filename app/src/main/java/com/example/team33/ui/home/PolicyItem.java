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

        //for (int i = 1; i <= numContacts; i++) {
        //    contacts.add(new PolicyItem(R.drawable.ic_baseline_home_24,"청년 주거지원 방안","청년 임대주택 본격 공급, 대학 기숙사 확충, 희망상가 공급"));
        //}
        contacts.add(new PolicyItem(R.drawable.ic_baseline_home_24,"청년 주거지원 방안","청년 임대주택 본격 공급, 대학 기숙사 확충, 희망상가 공급"));
        contacts.add(new PolicyItem(R.drawable.ic_baseline_home_24,"국민취업지원제도","취업을 희망하는 분들에게 취업지원서비스를 종합적으로 제공하고, 저소득 구직자에는 최소한의 소득도 지원"));
        contacts.add(new PolicyItem(R.drawable.ic_baseline_home_24,"청년수당","서울시에 거주하고 있는 만 19세~34세 미취업 청년들의 구직 활동을 촉진하는 수당 지원"));

        return contacts;
    }

    public static ArrayList<PolicyItem> createContactsList2(int numContacts) {
        ArrayList<PolicyItem> contacts2 = new ArrayList<PolicyItem>();

        //for (int i = 1; i <= numContacts; i++) {
        //    contacts.add(new PolicyItem(R.drawable.ic_baseline_home_24,"청년 주거지원 방안","청년 임대주택 본격 공급, 대학 기숙사 확충, 희망상가 공급"));
        //}
        contacts2.add(new PolicyItem(R.drawable.ic_baseline_home_24,"청년 일자리 도약 장려금 신설","코로나 블루 대응을 위한 “마음건강바우처” 신설, 코로나 졸업반 고졸 청년 패키지 지원 등 청년들이 당면하고 있는 어려움을 적극 해소해 나갈 계획"));
        contacts2.add(new PolicyItem(R.drawable.ic_baseline_home_24,"마음건강 바우처 1.5만명 지원","청년세대 내 격차를 완화하여 모든 청년들이 공정한 출발선에 설 수 있도록 적극 지원" ));
        contacts2.add(new PolicyItem(R.drawable.ic_baseline_home_24," 코로나 졸업반 고졸청년 패키지 지원 강화","청년의 디지털 직무능력 개발 지원 확대, 청년창업 활성화 3대 패키지, 장병 사회복귀 지원 등 맞춤형 역량개발 지원도 강화할 계획"));
        return contacts2;
    }
}
