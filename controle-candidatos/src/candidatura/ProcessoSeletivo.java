package candidatura;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void imprimirSelecionados(String [] nomeCandidatoSelecionado){
        int indice = 0;
        String [] nomeCandSelecionado = {};
        nomeCandSelecionado[indice]  = Arrays.toString(nomeCandidatoSelecionado);
        indice++;
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0, candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato+ " solicitou este valor de salário: "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                imprimirSelecionados(candidatos[candidatosAtual]);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            System.out.println("Ligar para o candidado");
        else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");

        else System.out.println("Aquardando o resultado dos demais candidados");

    }




}