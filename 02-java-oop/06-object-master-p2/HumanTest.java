public class HumanTest {
    public static void main(String[] args){
        Ninja subZero = new Ninja();
        Wizard mrPotter = new Wizard();
        Samurai jack = new Samurai();
        Samurai seibie = new Samurai();
        Samurai ujio = new Samurai();

        subZero.iceShower(jack);
        jack.deathBlow(subZero);

        subZero.displayInfo();
        jack.displayInfo();

        mrPotter.heal(subZero);
        jack.meditate();

        subZero.displayInfo();
        jack.displayInfo();

        mrPotter.fireball(jack);
        jack.meditate();
        jack.deathBlow(mrPotter);

        jack.displayInfo();
        mrPotter.displayInfo();
        System.out.println(Samurai.samuraiCount());
    }
}
