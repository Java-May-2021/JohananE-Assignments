public class Human{
    protected Integer strength = 3;
    protected Integer stealth = 3;
    protected Integer intelligence = 3;
    protected Integer health = 100;

    public Human(){}
    public void attack(Human victim){
        victim.health -= this.strength;
        int injured = victim.health;
        System.out.println(injured);
    }
}
