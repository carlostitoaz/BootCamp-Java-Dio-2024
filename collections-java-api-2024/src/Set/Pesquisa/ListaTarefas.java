package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("Conjunto está vazio!");
        }

        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else{
            System.out.println("Conjunto está vazio!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasBusca = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getConcluido()){
                    tarefasBusca.add(t);
                }
            }
        }else{
            System.out.println("Conjunto está vazio!");
        }
        return tarefasBusca;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasBusca = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(!(t.getConcluido())){
                    tarefasBusca.add(t);
                }
            }
        }else{
            System.out.println("Conjunto está vazio!");
        }
        return tarefasBusca;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(true);
                    System.out.println("A tarefa '"+descricao+"' foi concluida com sucesso!");
                    break;
                }
            }
        }else{
            System.out.println("Conjunto está vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(false);
                    System.out.println("A tarefa '"+descricao+"' foi concluida com sucesso!");
                    break;
                }
            }
        }else{
            System.out.println("Conjunto está vazio!");
        }
    }

    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
            tarefaSet.clear();
        }else{
            System.out.println("Conjunto já está vazio!");
        }
    }
}
