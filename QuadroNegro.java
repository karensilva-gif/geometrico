package geometrico;

public class QuadroNegro {
  private Quadrado quadrado;
  private Retangulo retangulo;
  private Circunferencia circunferencia;
  private Triangulo triangulo;

  public void limpaQuadro() {}

  public void criaQuadrado(double l) {
    quadrado = new Quadrado(l);
    quadrado.setCor("Azul");
  }

  public void criaRetangulo(double c, double a) {
    retangulo = new Retangulo(c, a);
    retangulo.setCor("Verde");
  }

  public void criaTriangulo(double b, double a) {
    triangulo = new Triangulo(b, a);
    triangulo.setCor("Amarelo");
  }

  public void criaCircunferencia(double r) {
    circunferencia = new Circunferencia(r);
    circunferencia.setCor("Vermelho");
  }

  public void mostraAreaObjetos() {
    System.out.println("Quadrado. Área: " + quadrado.getArea());
    System.out.println("Retângulo. Área: " + retangulo.getArea());
    System.out.println("Triângulo. Área: " + triangulo.getArea());
    System.out.println("Circunferência. Área: " + circunferencia.getArea());
  }

  public void mostraPerimetroObjetos() {
    System.out.println("Quadrado. Perímetro: " + quadrado.getPerimetro());
    System.out.println("Retângulo. Perímetro: " + retangulo.getPerimetro());
    System.out.println("Triângulo. Perímetro: " + triangulo.getPerimetro());
    System.out.println("Circunferência. Perímetro: " + circunferencia.getPerimetro());
  }

  public void mostraCorObjetos() {
    System.out.println("Quadrado. Cor: " + quadrado.getCor());
    System.out.println("Retângulo. Cor: " + retangulo.getCor());
    System.out.println("Triângulo. Cor: " + triangulo.getCor());
    System.out.println("Circunferência. Cor: " + circunferencia.getCor());
  }

  public static void main(String args[]) {
    QuadroNegro quadroNegro = new QuadroNegro();
    quadroNegro.criaQuadrado(10.6);
    quadroNegro.criaRetangulo(50.5, 20.4);
    quadroNegro.criaTriangulo(6.7, 5.5);  // Adicionado para evitar NullPointerException
    quadroNegro.criaCircunferencia(10);
    quadroNegro.mostraAreaObjetos();
    quadroNegro.mostraPerimetroObjetos();
    quadroNegro.mostraCorObjetos();
  }
}
