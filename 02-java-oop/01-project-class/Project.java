public class Project{
    private String name;
    private String description;
    private double initialCost = 5.323;
    
    public String elevatorPitch(String name, String description){
        return(name + "  "+ (initialCost)+" : "  +description); 
    }
    public Project(){
        System.out.println("Add new Project!");
    }
    //name
    public Project(String name){
        this.name = name; 
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    //description
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void setInformation(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getInformation(){
        return (name + " " +description);
    }
    //initialCost
    public Project(Double cost){
        this.initialCost = cost;
    }
    public void setCost(Double newCost){
        this.initialCost = newCost;
    }
    public double getCost(){
        return initialCost;
    }
}
