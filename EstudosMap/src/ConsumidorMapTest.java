import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Pedro", "11231");
        Consumidor consumidor2 = new Consumidor("Amanda", "55595");
        Produto produto1 = new Produto("1", "frango", 30.5);
        Produto produto2 = new Produto("2", "carne", 50.5);
        Produto produto3 = new Produto("1", "asa", 30.5);
        Produto produto4 = new Produto("2", "cabrito", 50.5);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);

        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor1, produtosCon1);
        map.put(consumidor2, produtosCon2);

        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(0, 1);
        listaNumeros.add(1, 2);
        listaNumeros.add(2, 3);
        listaNumeros.add(3, 4);

        var novaLista = listaNumeros.stream()
                .map(e -> e * 2)
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(novaLista);

        String collect = listaNumeros.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining());
        System.out.println(collect);

        for (Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for(Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }

    }

}
