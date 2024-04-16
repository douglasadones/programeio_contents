package servicos;

import generico.ServicoGenerico;
import javax.ejb.Stateless;
import modelo.Filme;

/**
 *
 * @author dougl
 */

@Stateless
public class FilmeServico extends ServicoGenerico<Filme> {
        
    public FilmeServico(){
        super(Filme.class);
    }
    
}
