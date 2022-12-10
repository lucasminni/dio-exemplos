public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("12345678");
        System.out.println("CEP " + cepFormatado + " é válido.");
        }
        catch(CepInvalidoException e){
            System.out.println("O cep não corresponde com a regra de negócio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return "23.756.064";
    }
}
