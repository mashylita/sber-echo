package ru.sbt.echo;

import java.util.logging.Logger;

/**
 * @author sbt-zaharova-ma
 */
public class EchoMain2 {

    static public void main(String[] a) {
//        main1(a);
        mainWhile(a);
//        main3(a);
    }

    static public void main1(String a[]) {
        Logger logger = Logger.getLogger("логер");
        String message = "";
        int o = 9;

        message = a[0];

        for (int i = 1; i < a.length; i++) {
            message = message + " " + a[i];
        }

        logger.severe(message);
        System.out.println(message);

        System.out.println("Элементы в обратном порядке");
//        message="";
        message = a[a.length - 1];
//        message = a[0] + "/" + a[1] + "/" + a[2] + "/" + a[3];
        for (int i = a.length - 2; i >= 0; i--) {
            message = message + " " + a[i];
        }
//        message = message + a[0];
        System.out.print(message);
    }


    static public void mainWhile(String a[]) {
        String message = "";
        int i = a.length - 1;
        message = a[i];

        i = a.length - 2;

        while (i >= 0) {
            message = message + " " + a[i];
            i = i - 2;

        }
        System.out.println(message);
    }

    static public void main3(String a[]) {
        Logger logger = Logger.getLogger("логер");
        String message = "";


        message = a[0];

        int i = 1;
        do {
            message = message + " " + a[i];
            i++;


        } while (i < a.length);

        System.out.println(message);


        logger.severe(message);
        System.out.println();

//        throw new RuntimeException();

    }

}
