public class Human extends Animal implements ITalkable, IWalkable {
    public Human(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "A " + age + "-year-old Human " + name;
    }
    //Animal 구현
    public void isVegetarian() {
        System.out.println(this.toString() + " lives on a mixed diat.");
    }

    //ITalkable 구현
    public void talk(){
        System.out.println(this.toString() + " can talk to other Humans.");
    }

    //IWalkable 구현
    public void walk(){
        System.out.println(this.toString() + " can walk on two legs.");
    }

}
