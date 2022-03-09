abstract class Animal implements IMortal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract public void isVegetarian();

    // IMortal 구현
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}