import javax.naming.Name;

public class Mirsat extends Human{

    //String name="Mirsat";

    public String Name(String name){
        return name;
    }

    public static void main(String[] args) {

        Mirsat m1=new Mirsat();
        m1.brain();
        System.out.println(m1.Name("Mehmet"));

    }

}
