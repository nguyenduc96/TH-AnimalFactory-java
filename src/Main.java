public class Main {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();

        Animal animal = factoryAnimal.getAnimal("dog");
        System.out.println(animal.makeSound());
        animal = factoryAnimal.getAnimal("cat");
        System.out.println(animal.makeSound());
    }
}
