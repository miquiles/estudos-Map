import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("t", "teste");
        map.put("tc", "teclado");
        map.put("mo", "mouse");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            //System.out.println(entry.getClass());
        }

//        for (String key : map.values()){ // map.keySet retornará todos as chaves.
//            System.out.println(key);
//        }
    }
}
