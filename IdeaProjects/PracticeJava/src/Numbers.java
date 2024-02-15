public class Numbers {

    public int a=4;
    int b=5;

    static int sum(int a, int b){

        int sum=a+b;
        return sum;

    }

    public int sum(){
        int sum=a+b;
        return sum;
    }

    private int ssnNumber;

    public int setSsnNumber(int ssnNumber){
        return ssnNumber;
    }

    public int getSsnNumber(int ssnNumber){
        return ssnNumber;
    }

    public static void main(String[] args) {

        Numbers n1=new Numbers();
        System.out.println(sum(2,30));
        System.out.println(sum(4,3));

        System.out.println(n1.getSsnNumber(123));
        System.out.println(n1.setSsnNumber(321));

    }

}
