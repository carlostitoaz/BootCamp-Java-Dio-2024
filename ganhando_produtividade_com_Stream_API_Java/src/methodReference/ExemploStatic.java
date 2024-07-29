package methodReference;

public class ExemploStatic {
    public static void imprimirMensagem(){
        System.out.println("Método static");
    }
}

class ExemploSemStatic implements MinhaInterfaceFuncional{
    public void metodoImprimir(){
        System.out.println("Método static");
    }
}