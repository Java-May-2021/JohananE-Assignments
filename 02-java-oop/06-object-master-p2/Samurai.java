public class Samurai extends Human{
    private static int numOfSamurai = 0;
    public Samurai(){
        this.health = 200;
        numOfSamurai++;
    }
    public void deathBlow(Human icon){
        icon.health = 0;
        this.health = (this.health/2);
        System.out.println("Game over.");
    }
    public void meditate(){
        this.health = ((this.health) + (this.health / 2));
    }
    public static int samuraiCount(){
        return numOfSamurai;
    }
}
