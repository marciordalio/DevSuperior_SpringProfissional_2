package br.com.evento.sitemaEvento;

import br.com.evento.sitemaEvento.entities.Atividade;
import br.com.evento.sitemaEvento.entities.Bloco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AtividadeTest {

    @Test
    public void deveCriarProdutoComSucesso(){
        Atividade atividade = new Atividade("Curso HTML", "aprenda HTML de forma prática", 80.00);
        assertNotNull(atividade);
    }

    @Test
    public void getterSeters(){
        Atividade atividade = new Atividade();
        atividade.setNome("Curso HTML");
        atividade.setId(1);
        atividade.setDescricao("aprenda HTML de forma prática");
        atividade.setPreco(80.00);

        Bloco bloco = new Bloco();
        bloco.setId(1);
        atividade.getBlocos().add(bloco);

        assertEquals("Curso HTML", atividade.getNome());
        assertEquals(1, atividade.getId());
        assertEquals("aprenda HTML de forma prática", atividade.getDescricao());
        assertEquals(80.00, atividade.getPreco());
    }
}
