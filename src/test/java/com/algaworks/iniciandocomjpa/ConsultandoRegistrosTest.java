package com.algaworks.iniciandocomjpa;


import com.algaworks.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.jupiter.api.*;

public class ConsultandoRegistrosTest extends EntityManagerTest {


    @Test
    public void busarPorIdentificador() {
        Produto produto = entityManager.find(Produto.class, 1);
//        Produto produto = entityManager.getReference(Produto.class, 1); // nesse momento ainda não buscado o produto no BD

        Assertions.assertNotNull(produto);
        Assertions.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void atualizarAReferencia() {
        Produto produto = entityManager.find(Produto.class, 1);
        produto.setNome("Microfone Samson"); // o nome do produto foi alterado, mas nao foi salvo no BD

        entityManager.refresh(produto); // Ao fazer o refresh e atualizado o nome para kindle novamente

        Assertions.assertEquals("Kindle", produto.getNome());
    }
}
