package org.app.ch04;

//import com.app.ch04.Consumer;
import com.app.ch04.Producer;
import com.app.ch05.Device;

public class Main4Org {

    public static void main(String[] args) {
        Producer p = new Producer();
        p.doProduce();
        //No access from this package
        //Consumer c = new Consumer();
        //c.doAction();

        Device device = new Device();
        device.setName("HTC");
        //device.price=1000;
        Phone phone = new Phone();
        phone.doAction();
        phone.year=10;

        //Phone.year();
        //Phone.manufacturePublic;

        /*
        IS-A
        HAS-A
         */

        Device d1 = new Phone();
        int size=d1.size;
        System.out.println(size);
        int width=d1.width;
        System.out.println(width);
        Phone p1 = (Phone) d1;

        System.out.println(p1.width);


    }

}
