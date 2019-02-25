public class Retangulo {

    private double largura = 1;
    private double comprimento = 1;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double ValidarComprimento(double comprimento){
        if(comprimento < 0 || comprimento == largura){
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
        }
        return comprimento;
    }

    public double ValidarLargura(double largura) {
        if (largura < 0 || largura == comprimento) {
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
        }
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = ValidarComprimento(comprimento);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        this.largura = ValidarLargura(largura);
    }

    public double getLargura() {
        return largura;
    }

    public double CalcularArea() {
        return this.largura * this.comprimento;
    }

    public double CalculadorPerimetro(){
        return (2 * this.comprimento) + (2 * this.largura);
    }

    @Override
    public String toString(){
        return ("Area: " + CalcularArea() + "\nPeriemtro: " + CalculadorPerimetro());
    }
}
