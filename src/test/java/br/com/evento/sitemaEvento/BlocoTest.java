package br.com.evento.sitemaEvento;

import br.com.evento.sitemaEvento.entities.Bloco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BlocoTest {


    @Test
    public void deveCriarProdutoComSucesso(){
        Bloco bloco = new Bloco();
        assertNotNull(bloco);
        bloco.setId(1);
        assertEquals(1, bloco.getId());
    }

    @Test
    public void getterSeters(){
        Bloco bloco = new Bloco();
    }
}

