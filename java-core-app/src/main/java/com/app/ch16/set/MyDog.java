package com.app.ch16.set;

public class MyDog implements Comparable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object obj){
        System.out.println("running equals");
        return true;
    }*/

    public int hashCode(){
        return age + name == null ? 0 : name.hashCode();
    }

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj instanceof MyDog){
            MyDog otherDog = (MyDog) obj;
            if(age!=otherDog.age){
                return false;
            }
            if(name!=null){
                return name.equals(otherDog.name);
            }
            if(otherDog.name!=null){
                return otherDog.name.equals(name);
            }
        }
        return false;
    }




    @Override
    public String toString() {
        return "MyDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Object o) {
        if(o instanceof MyDog){
            MyDog otherDog = (MyDog) o;
            if(age==otherDog.age){
                if(name!=null){
                    return -name.compareTo(otherDog.name);
                }
                if(otherDog.name!=null){
                    return -otherDog.name.compareTo(name);
                }
                return 0;
            }
            return -(age-otherDog.age);
        }
        return -1;
    }
}
