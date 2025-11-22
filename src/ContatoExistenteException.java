public class ContatoExistenteException extends Exception {
    private String conteud;
    private String pesso;
        
    public String getConteud() {
        return conteud;
    }
    public void setConteud(String conteud) {
        this.conteud = conteud;
    }
    public String getPessoa() {
        return pesso;
    }
    public void setPessoa(String pesso) {
        this.pesso = pesso;
    }
    public ContatoExistenteException(String conteud, String pesso) {
        super();
        this.conteud = conteud;
        this.pesso = pesso;
    }
    public String toString() {
        return "" + conteud + " já contém um contato com nome " + pesso;
    }
         
}