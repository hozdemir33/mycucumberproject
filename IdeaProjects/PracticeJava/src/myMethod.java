public class myMethod {


    static int myMethod(int y){
        return y+20;

    }

    static int myMethod(int y, int k){
        return y+k;
    }

    public static void main(String[] args) {

        System.out.println(myMethod(33));

        System.out.println(myMethod(4,5));

        System.out.println(myMethod(1,2));


    }
}
