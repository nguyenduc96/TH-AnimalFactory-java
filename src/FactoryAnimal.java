public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else  {
            return new Cat();
        }
    }
}
