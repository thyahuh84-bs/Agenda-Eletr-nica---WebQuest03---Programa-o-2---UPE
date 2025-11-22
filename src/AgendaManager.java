import java.util.Collections;
import java.util.List;

public class AgendaManager extends Exception implements GerenciadorContatos {
    public static String nome01;
    public void adicionarContato(Contato contato) throws ContatoExistenteException{   
        
        System.out.println("Nome: ");
        nome01=AgendaApplication.sc.nextLine();
        contato.setName(nome01); 
        System.out.println("Telefone: ");
        contato.setPhone(AgendaApplication.sc.nextLine()); 
        System.out.println("E-Mail: ");
        contato.setEmail(AgendaApplication.sc.nextLine());
        AgendaApplication.contatoList.addLast(contato); 

        //AgendaApplication.sc.close();

        /*if(AgendaApplication.contatoList.contains(getName())) {
        System.out.println ("Erro: Contato pré-existente." +
        "Pode haver duplicação");
        throw new ContatoExistenteException(AgendaApplication.resultadoList, pessoa);         
        }*/
        return;
    }

    public Contato buscarContato(String name) throws ContatoNaoEncontradoException{
        
        throw new ContatoNaoEncontradoException();
    }

    public void removerContato(String name) throws ContatoNaoEncontradoException{
        throw new ContatoNaoEncontradoException();
    }

    public List<Contato> listarTodosContatos(){
        throw new UnsupportedOperationException("Alguma falha está impedindo a exibição " + 
        "dos contatos. Tente reiniciar");
    }

    public void salvarContatosCSV(String nomeArquivo){
    }

    public void carregarContatosCSV(String nomeArquivo){
    }

    public void listaContatosOrdenados(){
        Collections.sort(AgendaApplication.resultadoList);
        return;
        
    }

    public void buscarPorDominioEmail(String dominio){

    }
}
