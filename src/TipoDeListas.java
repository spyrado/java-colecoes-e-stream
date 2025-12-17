import java.util.*;

public class TipoDeListas {


  public void possibilidades() {
    System.out.println("==== INICIANDO TipoDeListas ====");
    this.possibilidadesComList();
    this.possibilidadesComSet();
    this.possibilidadesComMap();
  }

  public void possibilidadesComList() {
    System.out.println("==== possibilidadesComList ====");
    System.out.println("==== O List permite duplicidades, nesse exemplo cadastrei dois Nicolas ====");

    List<String> nomes = new ArrayList<>();

    nomes.add("Nicolas");
    nomes.add("Roberta");
    nomes.add("Fulana");
    nomes.add("Nicolas");

    System.out.println("==== Logando Array de List ====");
    System.out.println(nomes);


    System.out.println("==== Removendo via Index ====");
    nomes.remove(3);
    System.out.println(nomes);

    System.out.println("==== Ordenando Array de List ====");
    nomes.sort(Comparator.comparing((nome) -> nome));
    System.out.println(nomes);
  }

  public void possibilidadesComSet() {
    Set<String> nomes = new HashSet<>();
    System.out.println("==== O Set não permite duplicidades, eu adicionei 2x Nicolas, porem no log só vai aparecer uma vez ====");
    nomes.add("Nicolas");
    nomes.add("Roberta");
    nomes.add("Fulana");
    nomes.add("Nicolas");

    System.out.println(nomes);
  }

  public void possibilidadesComMap() {
    System.out.println("==== O Map não permite CHAVES duplicadas, entao se no primeiro PUT eu colocar 1 e qualquer outro put eu colocar 1 novamente, ele vai desconsiderar o ultimo put e vai pegar o atual ====");
    Map<Integer, String> nomes = new HashMap<>();

    nomes.put(1, "Nicolas");
    nomes.put(2, "Roberta");
    nomes.put(3, "Fulana");
    nomes.put(1, "Era pra ser Nicolas, mas eu sobrescrevi passando o id 1 novamente");

    System.out.println(nomes);
  }
}
