import java.util.HashMap;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Pedro", "11231");
        Consumidor consumidor2 = new Consumidor("Amanda", "55595");
        Produto produto1 = new Produto("1", "frango", 30.5);
        Produto produto2 = new Produto("2", "carne", 50.5);

        Map<Consumidor, Produto> map = new HashMap<>();
        map.put(consumidor1, produto2);
        map.put(consumidor2, produto1);

        for (Map.Entry<Consumidor,Produto> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}
