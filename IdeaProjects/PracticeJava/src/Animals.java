import java.io.FilterOutputStream;

public class Animals  {

    public Animals(String cat, String furr, int age, int numOfTeeth) {

        this.cat = cat;
        this.furr = furr;
        this.age = age;

    }

    String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat="kedi";
    }

    public String getFurr() {
        return furr;
    }

    public void setFurr(String furr) {
        this.furr ="furry animals";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 20;
    }

        int getNumOfTeeth(int NumOfTeeth) {

            return NumOfTeeth;

        }

            String cat;
            String furr;
            int age;


        }



