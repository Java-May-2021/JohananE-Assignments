public class Wizard extends Human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }
    
    public void heal(Human icon){
        icon.health += this.intelligence;
        System.out.println("Sit still.");
    }
    public void fireball(Human icon){
        icon.health -= (this.intelligence * 3);
    }

}
