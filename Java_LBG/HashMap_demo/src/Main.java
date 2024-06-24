import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
//hashmap created, using country and key and food as value
        Map<String, String> worldFoods = new HashMap<>();
//Hashmpa created with a key and a list of foods values
        Map<String, List<String>> newList = new HashMap<>();
//add to a hashmap
        worldFoods.put("Italy", "Pasta");
        worldFoods.put("America", "Everything");
        worldFoods.put("UK", "Roast dinner");
        worldFoods.put("Scotland", "Haggis");
        worldFoods.put("Italy", "Pizza");
//prints out the keys in worldFoods
// for(String s : worldFoods.keySet()){
// System.out.println(s);
// }
//prints out the values in worldFoods
// for(String s : worldFoods.values()){
// System.out.println(s);
// }
//print out the whole entry of data
// for(Entry<String, String> s : worldFoods.entrySet()){
// System.out.println(s);
// }
        System.out.println(worldFoods.isEmpty());
        System.out.println(worldFoods.size());
        worldFoods.remove("Italy");
//prints out the keys in worldFoods
        for(String s : worldFoods.values()){
            System.out.println(s);
        }
        System.out.println(worldFoods.containsKey("Pizza"));
    }
}