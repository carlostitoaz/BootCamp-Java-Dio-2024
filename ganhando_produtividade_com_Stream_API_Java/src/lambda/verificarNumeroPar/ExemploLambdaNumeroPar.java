package lambda.verificarNumeroPar;

public class ExemploLambdaNumeroPar {
    public static void main(String[] args) {
        Verificar verificarNumero = (numero) -> numero % 2 == 0;

        System.out.println(verificarNumero.isPar(15));
        System.out.println(verificarNumero.isPar(4));

        Verificar verificarNumero2 = (numero) -> {
            return (numero + 35) % 2 == 0;
        };
        System.out.println(verificarNumero2.isPar(11));
        System.out.println(verificarNumero2.isPar(10));
    }
}
