public class Human {
    protected Integer strength = 3;
    protected Integer stealth = 3;
    protected Integer intelligence = 3;
    protected Integer health = 100;

    public Human(){}
    
    public void attack(Human victim){
        victim.health -= this.strength;
    }
    public void displayInfo(){
        System.out.println("Current health :" + health);
        System.out.println("Current intelligence :" + intelligence);
        System.out.println("Current strength :" + strength);
        System.out.println("Current stealth :" + stealth);
    }
}
