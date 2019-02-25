public class RetanguloTeste {

    public static void main(String[] args){

        double comprimento = Double.valueOf(args[0]);
        double largura = Double.valueOf(args[1]);

        Retangulo retangulo = new Retangulo(comprimento, largura);

        System.out.println(retangulo.toString());
    }
}
