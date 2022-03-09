public class Plant implements IMortal {

    private String name;
    private int age;
    private boolean isAnnual;

    public Plant(String name, int age, boolean isAnnual) {
        this.name = name;
        this.age = age;
        this.isAnnual = isAnnual;
    }
    public String toString() {
        return "A " + age + "-year-old Plant " + name;
    }

    public void isAnnual() {
        String end = "";
        if(this.isAnnual) {
            end = " is an annual plant.";
        } else {
            end = " is a perennial plant.";
        }
        System.out.println(this.toString() + end);
    }
    //IMortal 구현
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

}
