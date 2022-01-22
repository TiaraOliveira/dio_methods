package dio;

public class main {
    public static void exercicio (String[] args) {
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtração(3, 1.0);
        Calculadora.divisão(5, 2.5);
        Calculadora.multiplicacao(7, 8);


        System.out.println("Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
    }
}
