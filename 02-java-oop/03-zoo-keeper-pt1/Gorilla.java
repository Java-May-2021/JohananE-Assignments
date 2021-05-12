public class Gorilla extends Mammal{
    public Gorilla(int energyLevel){ //Superclass constructor
        super(energyLevel);
    }
    public void throwSomething(){
        energyLevel -=5;
        System.out.println("Duck, the Gorilla is throwing a banana!");
    }
    public void eatBananas(){
        energyLevel +=10;
        System.out.println("Gorilla is eating a banana.");
    }
    public void climb(){
        energyLevel -=10;
        System.out.println("Gorilla is climbing a tree.");
    }
}
