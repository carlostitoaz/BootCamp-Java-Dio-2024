package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap; //O Map trabalha com key e value.

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone); //O put pode adicionar um valor ou também pode substituir um valor existente, desde que a key seja a mesma.
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }else{
            System.out.println("A coleção está vazia!");
        }
    }

    public void exibirContatos(){
        if(!agendaContatosMap.isEmpty()){
            System.out.println(agendaContatosMap);
        }else{
            System.out.println("A coleção está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer contato = null;
        if(!agendaContatosMap.isEmpty()){
            contato = agendaContatosMap.get(nome); //Pesquisa pela key e retorna o value;
            if(contato == null){
                System.out.println("Contato não encontrado!");
            }
        }else{
            System.out.println("A coleção está vazia!");
        }
        return contato;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Ana", 1);
        agendaContatos.adicionarContato("Maria", 3);
        agendaContatos.adicionarContato("Bruna", 2);
        agendaContatos.adicionarContato("Felipe", 4);
        agendaContatos.adicionarContato("Maria", 5);

        agendaContatos.exibirContatos();

        //System.out.println(agendaContatos.pesquisarPorNome("Ana"));

        //agendaContatos.removerContato("Maria");
        //agendaContatos.exibirContatos()
    }
}
