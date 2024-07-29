package lambda.comParametro;

public class ExpressaoLambda {
    public static void main(String[] args) {
        MinhaInterfaceFuncional adicao = (y, x) -> y + x;

        MinhaInterfaceFuncional subtracao = (y, x) -> y - x;

        MinhaInterfaceFuncional multiplicacao = (y, x) -> y * x;

        MinhaInterfaceFuncional divisao = (y, x) -> y / x;

        System.out.println(adicao.metodoComParametro(10, 3));
        System.out.println(subtracao.metodoComParametro(10, 3));
        System.out.println(multiplicacao.metodoComParametro(10, 3));
        System.out.println(divisao.metodoComParametro(10, 3));
    }
}
