import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Don't stop Defunk", "Party like its 2021...");
        trackList.put("One night in Teignmouth", "Oh what a night..");
        trackList.put("Around the world in forty seconds", "Took a stop in Rome..");
        trackList.put("Interlude", "The day we got signed..");
        trackList.put("Last Call", "This is the last call for..");

        String song = trackList.get("Interlude"); //pulledsong
        System.out.print(song);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.print(String.format("Track:" + key +"Lyrics" + trackList.get(key)));
            
        }
    }
}
