package geometrico;

public class Retangulo extends ObjetoGeometrico {
  private double comprimento;
  private double altura;

  Retangulo(double c, double a) {
    comprimento = c;
    altura = a;
  }

  public double getArea() {
    area = comprimento * altura;
    return area;
  }

  public double getPerimetro() {
    return 2 * (comprimento + altura); // Calcula o perímetro diretamente
  }
}
