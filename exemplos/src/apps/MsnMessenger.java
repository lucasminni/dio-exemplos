package apps;
public class MsnMessenger extends ServicoMensagemInstantanea {
    
    @Override
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }

    @Override
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da mensagem");
    }
    
}
