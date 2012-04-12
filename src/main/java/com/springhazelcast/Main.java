package com.springhazelcast;

import com.hazelcast.core.IMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
        TestBean testBean = (TestBean) ctx.getBean("springTestBean");
        System.out.println(testBean.getResult());

        IMap map = (IMap) ctx.getBean("usermap");
        map.put("somekey","somevalue");
        map.put("somekey1","somevalue1");
        System.out.println(map.get("somekey"));
    }
}
