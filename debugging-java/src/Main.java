import javax.xml.transform.stream.StreamSource;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa");
        a();
        System.out.println("Fnalizou o programa");
    }

    static void a(){
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizou o método a");
    }

    static void b(){
        System.out.println("Entrou no método b");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizu o métodp b");
    }

    static void c(){
        System.out.println("Entrou no método c");
        Thread.dumpStack(); //Mostrar a pilha de execução, usado para depurar o código
        System.out.println("Finalizou o método c");
    }


}