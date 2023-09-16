package chapter10;

public class Zoo {
    public static void main(String[] args) {

        Dog ali = new Dog();
        ali.fetch();
        ali.makeSound();
        feed(ali);

        Animal diamond = new Dog();
        diamond.makeSound();
        feed(diamond);

        diamond = new Cat();
        diamond.makeSound();
        ((Cat) diamond).scratch();
        feed(diamond);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here is your cat food");
        }
    }
}
