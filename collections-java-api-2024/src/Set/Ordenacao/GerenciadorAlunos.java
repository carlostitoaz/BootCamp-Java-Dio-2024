package Set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet = null;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()){
            for(Aluno a : alunoSet){
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            if(!alunoSet.remove(alunoParaRemover)){
                System.out.println("Aluno não encontrado");
            }
        }else{
            System.out.println("A coleção está vazia");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        //Set<Aluno> organizarAlunosPorNome = new HashSet<>(alunoSet); //O HashSet não implementa o Comparable, logo o metodo (compareTo) sobreecrito na classe Aluno não ira funcionar
        Set<Aluno> organizarAlunosPorNome = new TreeSet<>(alunoSet); //O TreeSet implementa o Comparable, logo o metodo compareTo da classe Aluno ira funcionar.
        return organizarAlunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> organizarAlunosPorNota = new TreeSet<>(new ComparatorPorNotaCrescente());
        //Set<Aluno> organizarAlunosPorNota = new TreeSet<>(new ComparatorPorNotaDecrescente());
        organizarAlunosPorNota.addAll(alunoSet);
        return organizarAlunosPorNota;
    }

    public void exibirAlunos(){
        String todosAlunos = null;
        for(Aluno a : alunoSet){
            System.out.println("Nome: "+a.getNome()+", Matrícula: "+a.getMatricula()+", Nota: "+a.getNota());
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Bruna", 2L, 6.7d);
        gerenciadorAlunos.adicionarAluno("Ana", 3L, 7d);
        gerenciadorAlunos.adicionarAluno("Sara", 1L, 8d);

        System.out.println("Por matrícula: "+gerenciadorAlunos.alunoSet);
        System.out.println("Por nome: "+gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Por nota"+gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(2);
        gerenciadorAlunos.removerAluno(0);
        gerenciadorAlunos.exibirAlunos();
    }
}
