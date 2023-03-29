package edu.acauhi.operadores;

public class TiposOperadores {

    public static void main(String[] args) {

        //concatenar

        String nomeCompleto = "Márcio " + "Acauhi";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        //repetição

        int numero = 5;

        System.out.println(++numero);

        boolean variavel = true;

        // ! inverte o valor de uma variável booleana

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 5;

        // retorna um valor booleano, não necessáriamente necessita de um If.

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //exemplo para comparação de objetos.

        String nomeUm = "Márcio";
        String nomeDois = new String("Márcio");

        System.out.println(nomeUm.equals(nomeDois));

        //Operadores lógicos E e OU.

        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira!");
        }

        System.out.println("Fim!");
    }
}
