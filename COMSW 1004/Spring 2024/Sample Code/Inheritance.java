public class Inheritance {
    
    public static void main(String[] args) {
        Animal myFirstAnimal = new Animal("Cat");
        Animal mySecondAnimal = new Dog("Terrier");

        myFirstAnimal.eat();
        mySecondAnimal.eat();
    }
}

class Animal {

    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println(type + " is eating");
    }

}


class Dog extends Animal {

    private String breed; 

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }

}