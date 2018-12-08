package com.app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ShopingCart shopingCart = new ShopingCart();
        shopingCart.setName("Denis");
        shopingCart.setSum(100);
        System.out.println(shopingCart);
        System.out.println("-----------");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ShopingCart cart1= (ShopingCart) ctx.getBean("cart1");
        ShopingCart cart2= (ShopingCart) ctx.getBean("cart2");
        System.out.println(cart1);
        System.out.println(cart2);
    }

}
