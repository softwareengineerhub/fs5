package com.app.ch06;

public class Main {

    public static void main(String[] args) {
        MyChild myChild = new MyChild();
        if(myChild instanceof MyParent ){

        }


        MyParent myParent = null;
        if(myParent instanceof MyChild){
            MyChild myChild1 = (MyChild) myParent;

        }

        if(myParent.getClass()==MyChild.class){
            //MyChild myChild1 = (MyChild) myParent;

        }

    }
}
