package br.com.evento.sitemaEvento;

import br.com.evento.sitemaEvento.entities.Atividade;
import br.com.evento.sitemaEvento.entities.Categoria;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaTest {

    @Test
    public void deveCriarProdutoComSucesso(){
        Categoria categoria = new Categoria(1, "Curso");
    }

    @Test
    public void getterSeters(){
        Categoria categoria = new Categoria();
        categoria.setId(1);
        categoria.setDescricao("Curso");

        assertEquals(1, categoria.getId());
        assertEquals("Curso", categoria.getDescricao());

    }

    @Test
    public void deveAssociarAtividades(){
        Categoria categoria = new Categoria(1, "Curso");
        Atividade atividade = new Atividade("Curso de HTML", "Formação em HTML", 80.00);

        atividade.setCategoria(categoria);
        Set<Atividade> atividades = categoria.getAtividades();

        assertEquals("Curso", atividade.getCategoria().getDescricao());
        assertEquals(atividades, categoria.getAtividades());

    }
}
