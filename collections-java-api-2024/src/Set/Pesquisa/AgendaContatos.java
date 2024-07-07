package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!contatoSet.isEmpty()){
            System.out.println(contatoSet);
        }else{
            System.out.println("O catálogo está vazio.");
        }
    }


    public Set<Contato> pesquisarPorNome_Sem_StartWith(String nome){
        Set<Contato> contatosPesquisa = new HashSet<>();
        boolean palavraConhecide = true;
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                for(int cont = 0; cont < nome.length(); cont++){
                    if(!(c.getnome().charAt(cont) == nome.charAt(cont))){
                        palavraConhecide = !palavraConhecide;
                        break;
                    }
                }
                if (palavraConhecide){
                    contatosPesquisa.add(c);
                }
                palavraConhecide = true;
            }
        }
        return contatosPesquisa;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getnome().startsWith(nome)){ //startsWith verifica se o inicio da cadeia de caractere conhecide com o valor passado por parametro.
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getnome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }


    //Testando...
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato ("Camila", 123456);
        agendaContatos.adicionarContato ("Camila", 0);
        agendaContatos.adicionarContato ("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato ("Camila DIO", 654987);
        agendaContatos.adicionarContato ("Maria Silva", 1111111);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
    }
}
