package apps;
public class Telegram extends ServicoMensagemInstantanea {
    
    @Override
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    @Override
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da mensagem");
    }
}
