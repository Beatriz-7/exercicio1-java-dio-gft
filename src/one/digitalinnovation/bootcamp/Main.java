package one.digitalinnovation.bootcamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculadora");
        Calculadora.soma(2, 7);
        Calculadora.subtracao(7, 2);
        Calculadora.multiplicacao(9, 3);
        Calculadora.divisao(7, 2);

        System.out.println("Mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(23);


        System.out.println("Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}


