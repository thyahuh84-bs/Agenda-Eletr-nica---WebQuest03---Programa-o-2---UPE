/*UPE - Licenciatura em Ciências da Computação
   Programação 2 - Webquest 3
   Ana Patricia Monteiro Guimarães
   Francisco Tiago Bezerra Da Silva
   Hercílio Barbosa Teixeira
   Wellbya Bruna de Melo Souza
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AgendaApplication {
    public static HashMap<Integer, Contato> contatos02 = new HashMap<Integer, Contato>();
    public static List<String> resultadoList;
    public static List<Contato> contatoList;
    public static Contato contato = new Contato("", "", "");
    public static Scanner sc;
    public static String conteudo;
    public static String caminhoArquivo = "Arquivo.CSV";
    public static AgendaManager agenda;
    public static void main(String[] args) throws Exception {
        agenda = new AgendaManager();
        boolean adicionarArquivo = true;
        contatoList = new ArrayList<>();
        
        sc = new Scanner(System.in);
        System.out.println("\nO que você gostaria de fazer?" + 
        "\n\nOpções:\n1. Adicionar Contato \n2. Buscar Contato \n3. Remover Contato " + 
        "\n4. Listar Todos os Contatos \n5. Salvar em CSV \n6. Carregar de CSV \n7. Sair");
        int menuInt = sc.nextInt();
        sc.nextLine();

        if(menuInt == 1) {
            
            agenda.adicionarContato(contato);
            System.out.println("Contato adicionado com sucesso!\n");
            try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, adicionarArquivo))){
                escritor.write(contato + "");
                //System.out.println(contatoList);
            }finally{
                //System.out.println ("Contato salvo com sucesso");
                sc.close();
                //System.out.println (resultadoList);
            }
        }else if(menuInt == 2){
            contatoList.forEach(c -> 
                System.out.println(c.getName())
            );
            
        }else if(menuInt == 4){
            try{ 
                // O readAllLines retorna uma lista de Strings em vez das linhas do arquivo convertidas em uma String só
                Path caminhos = Paths.get(caminhoArquivo);
                resultadoList = Files.readAllLines(caminhos); // Precisa importar o List
                conteudo = String.join("\n", resultadoList); 
                // Sintaxe do join - entres aspas é o separador. pode ser \n, ; ou espaço. Se estiver vazio, simplesmente junta tudo em uma "palavra" só
                System.out.println(conteudo);
            } catch (Exception e) {
                System.out.println("Algo de errado não está certo!"); //ou
                //JOptionPane.showMessageDialog(null, "Algo de errado não está certo!"); //precisa importar o painel pop up
            }
        }
    }
}
