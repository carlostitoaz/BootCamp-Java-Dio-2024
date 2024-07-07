package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeres{
    private List<Integer> numeros;

    public SomaNumeres(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int total=0;
        if(!numeros.isEmpty()){
            for(Integer n : numeros){
                total += n;
            }
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer n : numeros){
                maior = (n > maior ? n : maior);
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer n : numeros){
                menor = (n < menor ? n : menor);
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    //Testando...
    public static void main(String[] args) {
        SomaNumeres sm1 = new SomaNumeres();

        sm1.adicionarNumero(20);
        sm1.adicionarNumero(0);
        sm1.adicionarNumero(5);
        sm1.adicionarNumero(-8);
        sm1.adicionarNumero(2);
        sm1.adicionarNumero(4);

        //System.out.println(sm1.exibirNumeros());
        sm1.exibirNumeros();

        System.out.println("Maior número: "+sm1.encontrarMaiorNumero());
        System.out.println("Menor número: "+sm1.encontrarMenorNumero());
        System.out.println("Soma dos números: "+sm1.calcularSoma());

    }

}
