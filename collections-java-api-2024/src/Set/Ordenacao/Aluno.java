package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Define como o objeto ficara organizado dentro de uma lista
    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareTo(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

class ComparatorPorNotaCrescente implements Comparator<Aluno> {
    //Comparando por nota em ordem crescente
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}

class ComparatorPorNotaDecrescente implements Comparator<Aluno>{
    //Comparando por nota em ordem decrescente
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a2.getNota(), a1.getNota());
    }
}
