import java.util.ArrayList;
public class ListOfExceptions {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("22");
        myList.add("Greeting Earthlings");
        myList.add(66);
        myList.add("We shouldn't have pulled over on this planet!");
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer CastedValue = (Integer) myList.get(i);
                System.out.println(CastedValue);
            }catch (ClassCastException e){
            System.out.println(e);
            }finally{
                System.out.print("Yea you need to try again my guy.");
            }
        }
    }
}
