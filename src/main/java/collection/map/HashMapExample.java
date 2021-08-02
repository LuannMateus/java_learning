package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    Map<String, Integer> worldChampions = new HashMap<>();

    // ? Adicionando elementos no MAP - PUT
    worldChampions.put("BRASIL", 5);
    worldChampions.put("ALEMANHA", 4);
    worldChampions.put("ITALIA", 4);

    // ? Alterando elemento em uma MAP - PUT
    worldChampions.put("BRASIL", 6);

    // ? Retornando o valor de um elemento - GET
    System.out.println(worldChampions.get("BRASIL"));

    // ? Verificando se existe um chave no MAP - CONTAINSKEY
    System.out.println(worldChampions.containsKey("ITALIA"));

    // ? Verificando se existe um valor no MAP - CONTAINSVALUE
    System.out.println(worldChampions.containsValue("4"));

    // ? Removendo um elemento no MAP - REMOVE
    worldChampions.remove("ITALIA");

    // ? Retornando o tamanho do MAP - SIZE
    System.out.println(worldChampions.size());

    // ? Usando um FOR EACH no MAP
    for (Map.Entry<String, Integer> entry : worldChampions.entrySet()) {
      System.out.println(entry.getKey() + " -- " +entry.getValue());
    }

    for (String key : worldChampions.keySet()) {
      System.out.println(key + " -- " + worldChampions.get(key));
    }

    // ? Remove todos os elementos - CLEAR
    worldChampions.clear();

  }
}
