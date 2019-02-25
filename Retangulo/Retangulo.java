public class Retangulo {

    private double largura = 1;
    private double comprimento = 1;

    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public void setComprimento(double comprimento) {
        if(comprimento <= 0){
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
            System.exit(0);
        } else {
            this.comprimento = comprimento;
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        if(largura <= 0){
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
            System.exit(0);
        } else {
            this.largura = largura;
        }
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

