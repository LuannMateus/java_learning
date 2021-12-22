package collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    TreeMap<String, Integer> worldChampions = new TreeMap<>();

    // ? Adicionando elementos no TREEMAP - PUT
    worldChampions.put("BRASIL", 5);
    worldChampions.put("ALEMANHA", 4);
    worldChampions.put("ITALIA", 4);
    worldChampions.put("PORTO RICO", 2);

    // ? Retorna o elemento que esta no topo da arvore - FIRSTKEY
    System.out.println(worldChampions.firstKey());

    // ? Retorna o elemento que esta no fim da arvore - LASTKEY
    System.out.println(worldChampions.lastKey());

    // ? Retorna o elemento que esta acima da chave passada - HIGHERKEY
    System.out.println(worldChampions.higherKey("ALEMANHA"));

    // ? Retorna o elemento que esta abaixo da chave passada - LOWERKEY
    System.out.println(worldChampions.lowerKey("ALEMANHA"));

    // ? Retorna chave e valor do elemento que esta no topo da arvore - FIRSTENTRY +
    // GETKEY && FIRSTENTRY + GETVALUE
    System.out.println(worldChampions.firstEntry().getKey() + " -- " + worldChampions.firstEntry().getValue());

    // ? Retorna chave e valor do elemento que esta no fim da arvore - LASTENTRY +
    // GETKEY && LASTENTRY + GETVALUE
    System.out.println(worldChampions.lastEntry().getKey() + " -- " + worldChampions.lastEntry().getValue());

    // ? Retorna chave e valor do elemento que esta acima da chave passada -
    // HIGHERENTRY + GETKEY && HIGHERENTRY + GETVALUE
    System.out.println(
        worldChampions.higherEntry("ALEMANHA").getKey() + " -- " + worldChampions.higherEntry("ALEMANHA").getValue());

    // ? Retorna chave e valor do elemento que esta abaixo da chave passada -
    // LOWERENTRY + GETKEY && LOWERENTRY + GETVALUE
    System.out.println(
        worldChampions.lowerEntry("ITALIA").getKey() + " -- " + worldChampions.higherEntry("ITALIA").getValue());

    // ? Retorna o elemento que esta no topo da arvore e o remove
    Map.Entry<String, Integer> firstEntry = worldChampions.pollFirstEntry();
    System.out.println(firstEntry);

    // ? Retorna o elemento que esta no fim da arvore e o remove
    Map.Entry<String, Integer> lastEntry = worldChampions.pollLastEntry();
    System.out.println(lastEntry);

    // ? Usando um ITERATOR na TREEMAP
    Iterator<String> iterator = worldChampions.keySet().iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      System.out.println(key + " -- " + worldChampions.get(key));
    }

    for (String key : worldChampions.keySet()) {
      System.out.println(key + " -- " + worldChampions.get(key));
    }

    for (Map.Entry<String, Integer> element : worldChampions.entrySet()) {
      System.out.println(element.getKey() + " -- " + element.getValue());
    }

  }

}
