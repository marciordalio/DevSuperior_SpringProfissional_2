package br.com.evento.sitemaEvento;

import br.com.evento.sitemaEvento.entities.Atividade;
import br.com.evento.sitemaEvento.entities.Paricipante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParticipanteTest {

    @Test
    public void deveCriarProdutoComSucesso(){
        Paricipante paricipante = new Paricipante("José Silva", "jose@mail.com");
    }


    @Test
    public void getterSetter(){
        Paricipante paricipante = new Paricipante();

        paricipante.setNome("José Silva");
        paricipante.setId(1);
        paricipante.setEmail("jose@mail.com");

        assertEquals("José Silva", paricipante.getNome());
        assertEquals(1, paricipante.getId());
        assertEquals("jose@mail.com", paricipante.getEmail());

        Atividade atividade = new Atividade("Curso HTML", "Curso de HTML", 80.00);

        paricipante.getAtividades().add(atividade);
        atividade.getParicipantes().add(paricipante); //pega participantes e adiciona

        assertEquals("José Silva", atividade.getParicipantes().iterator().next().getNome());

    }
}
