package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {
    /*
     * ? Collection TreeSet
     * Nao aceita elementos repetidos
     * Mais lenta em comparacao com o HashSet
     * Permite a ordenacao e reordenacao
     */
    TreeSet<String> treeCapital = new TreeSet<>();

    // ? Adicionando elementos na TreeSet - ADD
    treeCapital.add("Fortaleza");
    treeCapital.add("Sao Paulo");
    treeCapital.add("Porto Alegre");
    treeCapital.add("Rio de Janeiro");

    // ? Retorna o elemento que esta no topo da arvore
    System.out.println(treeCapital.first());

    // ? Retorna o elemento que esta no fim da arvore
    System.out.println(treeCapital.last());

    // ? Retorna o elemento que esta acima do argumento passado
    System.out.println(treeCapital.higher("Sao Paulo"));

    // ? Retorna o elemento que esta abaixo do argumento passado
    System.out.println(treeCapital.lower("Sao Paulo"));

    // ? Retorna o elemento que esta no topo e o remove da arvore
    System.out.println(treeCapital.pollFirst());

    // ? Retorna o elemento que esta no fim e o remove da arvore
    System.out.println(treeCapital.pollLast());

    // ? Usando um FOR EACH no TREESET
    for (String cityName : treeCapital) {
      System.out.println(cityName);
    }

    // ? Usando um ITERATOR no TREESET
    Iterator<String> iterator = treeCapital.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
