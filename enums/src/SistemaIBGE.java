public class SistemaIBGE {
    public static void main(String[] args){

        //Imprimindo uma constante (objeto) especifico
        System.out.println("\nImprimindo uma constante (objeto) especifico:\n");

        EstadoBrasileiro estadoBrasil = EstadoBrasileiro.SAO_PAULO;

        System.out.println(
            "Nome do estado: "+estadoBrasil.getNome()
            +"\nSigla do estado: "+estadoBrasil.getSigla()
            +"\nNome em letra maiúscula: "+estadoBrasil.getNomeMaiuscula()
        );

        //Imprimindo o nome das constantes (objetos)
        System.out.println("\n\nImprimindo o nome das constantes (objetos):\n");

        for(EstadoBrasileiro estadoBr : EstadoBrasileiro.values()){
            System.out.println(estadoBr);
        }

        //Obtendo a constante (objeto) espessifica a partir do nome dela
        EstadoBrasileiro estadoBrasileiroEspecifico = EstadoBrasileiro.valueOf("SAO_PAULO");
        System.out.println(estadoBrasileiroEspecifico);

        //Obtendo o indice da constante (objeto)
        int indice = EstadoBrasileiro.RIO_DE_JANEIRO.ordinal();

    }

}
