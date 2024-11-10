package geometrico;

abstract public class ObjetoGeometrico {
  public double area;
  private double perimetro;
  protected String cor;

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
  }

  public double getPerimetro() {
    return perimetro;
  }
}
