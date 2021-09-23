public class App {
   
    public static void main(String[] args) throws Exception {
        // Ducati 999r 2001
        // Honda  Cbr  2005
        // Pcj    600  2004
        // Como criar variavel tipo primitiva (<tipoVariavel> nomeVariavel =valor;)
        // Criar variavel do tipo class é um objeto (public class Motoca {    String  modelo; //Atributo do tipo string)
        
        //Declarando atributos e instanciando variavel objetos
            Motoca motoca1 = new Motoca();
            motoca1.marca = "Ducati";
            motoca1.anoDeFabricaçao = 2001;
            motoca1.Cor = "vermelha";
            
            Motoca motoca2 = new Motoca();
            motoca2.marca = "Honda";
            motoca2.anoDeFabricaçao = 2005;
            motoca2.Cor = "azul";

            Motoca motoca3 = new Motoca();
            motoca3.marca = "Pcj";
            motoca3.anoDeFabricaçao = 2004;
            motoca3.Cor = "preto";
            
            
            //"Motoca" + motoca1.marca + "do ano " + motoca1.anoDeFabricao "e modelo" + motoca1.modelo "
            System.out.format("Motoca %s do ano %s e modelo %s\n "  , motoca1.marca, motoca1.anoDeFabricaçao , motoca1.Cor );
            System.out.format("Motoca %s do ano %s e modelo %s\n "  , motoca2.marca, motoca2.anoDeFabricaçao , motoca2.Cor );
            System.out.format("Motoca %s do ano %s e modelo %s "  , motoca3.marca, motoca3.anoDeFabricaçao , motoca3.Cor );
    }
}
