package apps;
public abstract class ServicoMensagemInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet(){
       System.out.println("Validando conexão com a internet");
    }
    
}
