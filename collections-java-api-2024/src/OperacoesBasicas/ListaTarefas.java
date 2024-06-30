package OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : listaDeTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }

        listaDeTarefas.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaDeTarefas);
    }

    //Testando...
    public static void main(String[] args) {
        ListaTarefas lt1 = new ListaTarefas();

        System.out.println("O número total de elementos na lista é: "+lt1.obterNumeroTotalTarefas());

        lt1.adicionarTarefa("Tarefa 1");
        lt1.adicionarTarefa("Tarefa 2");
        lt1.adicionarTarefa("Tarefa 1");
        lt1.adicionarTarefa("Tarefa 4");

        System.out.println("O número total de elementos na lista é: "+lt1.obterNumeroTotalTarefas());

        lt1.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+lt1.obterNumeroTotalTarefas());

        lt1.obterDescricoesTarefas();
    }
}
