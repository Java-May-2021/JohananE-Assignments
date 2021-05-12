public class ProjectTest {
    public static void main(String[] args) {
        Project main = new Project();
        String newElevatorPitch = main.elevatorPitch("App Project", "Its an airplane tracker");
        main.setName("App Project");
        main.setInformation("App Project", "Airplane Tracker");
        main.setCost(15.24);
        String pitch = newElevatorPitch;
        String info = main.getInformation();
        String startName = main.getName();
        Double mainCost = main.getCost();

        System.out.print(pitch);
        //System.out.print(info);
        //System.out.print(startName);
        System.out.print(mainCost);
        //System.out.print(newElevatorPitch);
    }
}
