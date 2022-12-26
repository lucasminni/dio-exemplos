package exemplos;
import apps.FacebookMessenger;
import apps.MsnMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "MSN";

        if (appEscolhido.equals("MSN"))
            smi = new MsnMessenger();
        else if (appEscolhido.equals("Facebook"))
            smi = new FacebookMessenger();
        else
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
