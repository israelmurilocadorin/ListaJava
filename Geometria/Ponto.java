package Exercicios;

public class Ponto {
    private Double x;
    private Double y;

    public Ponto(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Ponto - x: " + this.x + " y: " + this.y;
    }
}