public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piaui"),
    MARANHAO ("MA", "Maranhão");

    private String nome, sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNomeMaiuscula(){
        return nome.toUpperCase();
    }


}
