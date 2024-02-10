public class speedLimitModel {

     static void myMethodHello(){
        System.out.println("please SAY HELLO....");

    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myName(String fname){
        System.out.println("My name is ::"+ fname);
    }

    static int speedLimit(int speed){
        return speed+30;
    }


    public static void main(String[] args) {

        myMethod();
        myName("hasan");

        //===========================

     int newSpeed= speedLimit(12);
        System.out.println(newSpeed);

     myMethodHello();


    }
}
