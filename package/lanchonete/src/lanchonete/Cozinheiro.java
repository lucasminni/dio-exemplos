package lanchonete;

public class Cozinheiro{
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }

    public void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }

    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLacnhe(){
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    public void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    public void baterVitaminaNoLiquidificador(){
        System.out.println("BATENDO A VITAMINA NO LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}