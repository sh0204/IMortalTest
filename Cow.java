public class Cow extends Animal implements IWalkable {

    public Cow(String name, int age) {
        super(name, age); //조상의 생성자
    }

    public String toString() {
        return "A " + age + "-year-old Cow " + name;
    }

    //Animal 구현
    public void isVegetarian() {
        System.out.println(this.toString() + " is a plant-eating animal.");
    }
    //IWalkable 구현
    public void walk(){
        System.out.println(this.toString() +" can walk on four legs.");
    }

}
