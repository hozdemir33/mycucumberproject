public class Main {

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eat();
        bear.drink();
        bear.predator();

        Laptops appleLaptops = new Laptops();
        //we need to create an Laptop object to be able to implement these
        // interface methods. Without creating this appleLaptops object this wont work for a fact.

        appleLaptops.appleLogo();
        appleLaptops.appleCustomerService();
        appleLaptops.fast();

    Chickens chicken1=new Chickens();
    chicken1.drink();

       Animals a1=new Animals("meow","furry",20,33);

       a1.setAge(23);
       a1.setFurr("futty");

    }
}



