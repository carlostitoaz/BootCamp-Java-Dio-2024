package List.Ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoNumeros{
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenadaAscendente = new ArrayList<>(this.numeros);
        if(!listaOrdenadaAscendente.isEmpty()){
            Collections.sort(listaOrdenadaAscendente);
        }
        return listaOrdenadaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenadaDescendente = new ArrayList<>(this.numeros);
        if(!listaOrdenadaDescendente.isEmpty()){
            //Collections.reverse(listaOrdenadaDescendente);//Apenas inverte a ordem da lista, colocando de tras para frente
            //Collections.sort(listaOrdenadaDescendente, Collections.reverseOrder());
            listaOrdenadaDescendente.sort(Comparator.reverseOrder());
        }
        return listaOrdenadaDescendente;
    }

    //Testando...
    public static void main(String[] args) {
        OrdenacaoNumeros on1 = new OrdenacaoNumeros();

        on1.adicionarNumero(10);
        on1.adicionarNumero(8);
        on1.adicionarNumero(4);
        on1.adicionarNumero(9);
        on1.adicionarNumero(30);

        System.out.println(on1.ordenarAscendente());

        on1.adicionarNumero(80);
        on1.adicionarNumero(7);
        on1.adicionarNumero(5);
        on1.adicionarNumero(6);
        on1.adicionarNumero(40);

        System.out.println(on1.ordenarDescendente());

    }

}
