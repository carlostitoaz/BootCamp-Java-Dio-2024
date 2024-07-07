package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento (LocalDate data, String nome, String atracao){
        this.eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dataSet = eventosMap.keySet(); //Pegando todas as chaves
        //Collection<Evento> values = eventosMap.values(); //Pegando todos os valores

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (var entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){ //isAfter() verifica se o conteudo passado como parametro vem antes do elemento comparado.
                proximoData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println("Data atual: " + LocalDate.now()); //Mostrando a data atual

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 20), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 2, 16), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 17), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 4), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 9), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 18), "Evento 6", "Atração 6");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 8), "Evento 7", "Atração 7");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}