public class Ninja extends Human{
    public Ninja(){
        this.health = 50;
    }
    public void steal(Human icon){
        icon.health -= this.stealth;
        this.health += this.stealth;
    }
    public void runAway(){
        this.health -= 10;
    }
    public void iceShower(Human icon){
        icon.health -= (this.strength * 3);
    }
}
