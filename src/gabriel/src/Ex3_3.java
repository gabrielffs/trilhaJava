public class Ex3_3 {

  public static void main(String[] args) {
    double comprimento = 25;
    double largura = 10;

    double area = calcularArea(comprimento, largura);
    double perimetro = calcularPerimetro(comprimento, largura);

    System.out.println("A área do retângulo é: " + area);
    System.out.println("O perímetro do retângulo é: " + perimetro);
  }

  public static double calcularArea(double comprimento, double largura) {
    return comprimento * largura;
  }

  public static double calcularPerimetro(double comprimento, double largura) {
    return 2 * (comprimento + largura);

  }
}
