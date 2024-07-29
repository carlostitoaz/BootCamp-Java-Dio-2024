package methodReference;

public class Principal {
    public static void main(String[] args) {
        MinhaInterfaceFuncional teste1 = ExemploStatic::imprimirMensagem; //Utilizando method reference, na utilização de referencia de metodo o metodo referenciado deve ser estatico. Classe::metodoEstatico
        teste1.metodoImprimir();

        MinhaInterfaceFuncional teste2 = () -> ExemploStatic.imprimirMensagem(); ///Sem method reference. (referencia) -> implementação
        teste2.metodoImprimir();

        MinhaInterfaceFuncional teste3 = new ExemploSemStatic(); //Sem lambda e sem method reference
        teste3.metodoImprimir();
    }
}
