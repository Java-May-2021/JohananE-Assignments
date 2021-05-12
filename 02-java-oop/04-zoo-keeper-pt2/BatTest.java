public class BatTest {
    public static void main(String[] args){
        Bat b = new Bat();
        b.displayEnergy();

        b.attackTown();
        b.attackTown();
        b.attackTown();

        b.eatHumas();
        b.eatHumas();

        b.fly();
        b.fly();

        b.displayEnergy();
    }
}
