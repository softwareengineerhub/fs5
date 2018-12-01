package com.app.ch18;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        //Locale locale = new Locale()
        //Locale locale=Locale.ITALY;
        Locale locale=Locale.FRENCH;
        ResourceBundle resourceBundle =
                ResourceBundle.getBundle("capital", locale);
        String res=resourceBundle.getString("city.name");
        System.out.println(res);
    }
}
