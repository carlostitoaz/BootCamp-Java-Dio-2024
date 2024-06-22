public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public void tocar(){
        System.out.println("Tocando Música");
    };
    public void pausar(){
        System.out.println("Pausando Música");
    };
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: "+musica);
    };

    public void ligar(String numero){
        System.out.println("Ligando para: "+numero);
    };
    public void atender(){
        System.out.println("Atendendo");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    };

    public void exibirPagina(String url){
        System.out.println("Exibindo página: "+url);
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    };

    public static void main(String[] args){
        Iphone ip = new Iphone();

        ip.tocar();
        ip.pausar();
        ip.selecionarMusica("Música teste");

        ip.ligar("22999999999");
        ip.atender();
        ip.iniciarCorreioVoz();

        ip.exibirPagina("www.teste.com");
        ip.adicionarNovaAba();
        ip.atualizarPagina();
    }

}
