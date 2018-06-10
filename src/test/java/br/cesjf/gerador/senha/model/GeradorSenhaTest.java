package br.cesjf.gerador.senha.model;

import org.junit.Assert;
import org.junit.Test;

public class GeradorSenhaTest {
    
    @Test
    public void testTamanhoDaSenhaSer10SeSetTamanho10(){       
        // Arrange
        int expectedTamanho = 10;
        
        GeradorSenha gerador = new GeradorSenha();
        gerador.setTamanho(expectedTamanho);
        
        // Act
        String senha = gerador.gerar();
        
        // Assert
        Assert.assertEquals("A senha gerada deve ter o tamanho definido", 
                expectedTamanho, 
                senha.length());        
    }
}
