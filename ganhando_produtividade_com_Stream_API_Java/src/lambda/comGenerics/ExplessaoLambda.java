package lambda.comGenerics;

public class ExplessaoLambda{
    public static void main(String[] args) {
        //Teste com generics com string
         String primeiroNome = "Kamila";
     MinhaInterfaceFuncional myfunc = (nome) -> System.out.println(nome+" Sodre");
        myfunc.metodoComGenerics(primeiroNome);

        //Teste com generics com int
        int idade = 26;
        MinhaInterfaceFuncional myfunc2 = (valorIdade) -> System.out.println(valorIdade);
        myfunc2.metodoComGenerics(idade);

        //Teste com retorno int
        int ano = 2014;
        MinhaInterfaceFuncional2 myfunc3 = (anoT) -> anoT;
        System.out.println(myfunc3.metodoComGenericsComRetorno(ano));

        //Teste com retorno String
        String endereco = "Rua das Graças";
        MinhaInterfaceFuncional2 myfunc4 = (enderecoT) -> enderecoT;
        System.out.println(myfunc4.metodoComGenericsComRetorno(endereco));

        //Teste com mais de um tipo e com retorno de um tipo
        Double salario = 1700.85;
        String cpf = "111.222.333-00";
        MinhaInterfaceFuncional3 myfunc5 = (salarioT, cpfR) -> cpfR;
        System.out.println(myfunc5.metodoComMaisDeUmGenerics(salario, cpf));
    }
}
