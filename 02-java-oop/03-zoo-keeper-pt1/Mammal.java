public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergy(){
        System.out.println(energyLevel);
        return energyLevel;
    }
    public Mammal(int levels){ //construct
        this.energyLevel = levels;
    }
}
