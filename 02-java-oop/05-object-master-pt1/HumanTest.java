public class HumanTest {
    public static void main(String[] args){
        Human samurai = new Human();
        Human ninja = new Human();
        Human wizard = new Human();
        ninja.attack(samurai);
        samurai.attack(wizard);
        ninja.attack(samurai);
    }
}
