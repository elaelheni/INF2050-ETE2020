public class Dog {
    String name;
    int age;
    String race;

    public Dog(String name, int age, String race){
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public static Dog getDog(String name, int age, String race){
        return new Dog(name, age, race);
    }

}
