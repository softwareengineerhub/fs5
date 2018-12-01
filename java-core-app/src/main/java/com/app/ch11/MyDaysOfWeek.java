package com.app.ch11;

public enum MyDaysOfWeek {

    MONDAY(), TUESDAY, WEDNESDAY("WEDNESDAY"), THURSDAY(4);

    private String name;
    private int type;

    private MyDaysOfWeek(){

    }

    private MyDaysOfWeek(String name){
        this.name=name;
    }

    private MyDaysOfWeek(int type){
        this.type=type;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Enum");
        MyDaysOfWeek[] values=MyDaysOfWeek.values();
        for(MyDaysOfWeek value:values){
            System.out.println(value.name());
        }
        System.out.println("--------------");
        MyDaysOfWeek ofWeek =MyDaysOfWeek.valueOf("THURSDAY");
        System.out.println(ofWeek);
        System.out.println("--------------");
        MyDaysOfWeek ofWeek2 =MyDaysOfWeek.valueOf("THURSDAy");
        System.out.println(ofWeek2);
    }


    @Override
    public String toString() {
        return name+"; "+type;
    }
}
