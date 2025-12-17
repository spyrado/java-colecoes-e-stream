import java.util.List;
import java.util.stream.Collectors;

public class TrabalhandoComStreams {

  public void possibilidades() {
    System.out.println("==== INICIANDO TrabalhandoComStreams ====");

    List<String> nomes = List.of("Nicolas", "Amanda", "Alice", "Duberval", "Extraordinario");
    List<String> nomesComLetraA = nomes.stream()
        .filter(nome -> nome.toLowerCase().startsWith("a"))
        .toList();
    System.out.println(nomes);
    System.out.println(nomesComLetraA);

    List<Double> salarios = List.of(800.0, 100.0, 1500.0, 5000.0);
    List<Double> salariosComAumentoDeCincoPorcento = salarios.stream().map(salario -> salario * 0.05).toList();
    Double salariosSomados = salarios.stream().reduce(0.0, Double::sum);
    System.out.println(salarios);
    System.out.println(salariosComAumentoDeCincoPorcento);
    System.out.println(salariosSomados);
  }
}
