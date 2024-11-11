public class Main {
    public static void main(String[] args){

        Animal animal=new Animal("generic-animal","huge",40);
        doAnimalStuff(animal,"slow");
        Dog dog=new Dog();
        doAnimalStuff(dog,"fast");  // dog inherit the Animal class so it's also a animal
                                           // so we can pass it to Animal type parameter
        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriever",65,"floppy","Swimmer");
        doAnimalStuff(retriever,"slow");
        Dog wolf = new Dog("wolf",40);
        doAnimalStuff(wolf,"slow");
        Fish goldie=new Fish("GoldFish",0.25,2,3);
        doAnimalStuff(goldie,"fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();  // this method is in Animal and Dog class if instance is Dog type then the Dog class method(subclass) method is called method is override in subclass
        //if method is not in subclass so even the Dog instance is calling the superclass method is called because the method is not override
                               //in subclass

        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----------");
    }
}
