public class Fatura {
    private String codigo;
    private String descricao;
    private Integer quantidade;
    private double preco;

    public Fatura(String codigo, String descricao, Integer quantidade, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double Calcular(){
        double resultado = this.preco * this.quantidade;
        return resultado;
    }
    @Override
    public String toString() {
        return("\nDescricao: " + descricao + "\nTotal: " + Calcular());
    }
}
