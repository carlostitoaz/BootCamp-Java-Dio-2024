package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas = null;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasUnicas);
    }

    public void adcionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                this.palavrasUnicas.remove(palavra);
            }else{
                System.out.println("Palavra não está no conjunto");
            }
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void verificarPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            boolean existe = false;
            /*
            for(String p : palavrasUnicas){
               if(p.equalsIgnoreCase(palavra)){
                   System.out.println("Palavra '"+palavra+"' existe no conjunto.");
                   existe = !existe;
                   break;
               }
            }
            */
            existe = palavrasUnicas.contains(palavra);
            if(!existe){
                System.out.println("Palavra '"+palavra+"' não existe no conjunto.");
            }else{
                System.out.println("Palavra '"+palavra+"' existe no conjunto.");
            }
        }
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicas.isEmpty()){
            System.out.println(palavrasUnicas);
        }
    }

    //Testando...
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adcionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adcionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adcionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adcionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adcionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 3");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 9");
    }
}
