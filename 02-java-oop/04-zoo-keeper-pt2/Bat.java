public class Bat extends Mammal {
    public Bat(){
    }

    public void fly(){
        energyLevel -= 50;
        System.out.println("WHOOSH");
    }
    public void eatHumas(){
        energyLevel += 25;
        System.out.println("Nom Nom Nom");
    }
    public void attackTown(){
        energyLevel -= 100;
        System.out.println("WHOOSH, CRACKLE, CRACKLE");
    }
}
