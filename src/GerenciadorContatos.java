import java.util.List;

public interface GerenciadorContatos{
    void adicionarContato(Contato contato)throws ContatoExistenteException;
    Contato buscarContato(String name)throws ContatoNaoEncontradoException;
    void removerContato(String name)throws ContatoNaoEncontradoException;
    List<Contato> listarTodosContatos();
}