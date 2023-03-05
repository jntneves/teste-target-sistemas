# Teste Target Sistemas
<br>
<br>

**1)** Observe o trecho de código abaixo:
<br>
<br>

```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça {

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
```

Ao final do processamento, qual será o valor da variável SOMA?
<br>
<br>
**RESPOSTA:** Primeiro foram inicializadas 3 variáveis: "INDICE" com valor 13 (que define o limite superior da soma, ou seja, até que número a soma deve ser realizada), "SOMA" (que armazena a soma dos números 1 a "INDICE") e "K" (que é utilizada como uma variável auxiliar para iterar os números no loop) com valor 0. Em seguida, um loop é executado enquanto "K" for menor que o "INDICE" (13). Em cada iteração do loop, "K" recebe a soma de "K" + 1 e logo após, a variável "SOMA" recebe a soma de "SOMA" + "K". Por fim, o valor final (91) será exibido na tela.

---
<br>

**2)** Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
<br>
IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
<br>
<br>

```java
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        int previousNumber = 0;
        int currentNumber = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scan.nextInt();

        while (currentNumber < number) {
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        if (currentNumber == number) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci!");
        } else  {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci!");
        }

    }
}
```

**RESPOSTA:** No inicio do programa temos a inicialização de duas variáveis "previousNumber" e "currentNumber" para armazenar os dois primeiros números da sequência de Fibonacci. Logo em sequida, o programa irá ler um número que será fornecido pelo usuário utilizando a classe Scanner. Um loop while será executado para calcular a sequência de Fibonacci até que o número atual seja maior ou igual ao número fornecido pelo usuário, e uma variável "nextNumber" será criada para calcular o próximo número na sequência. Logo após calcular a sequência de Fibonacci, o programa verifica se o número fornecido pelo usuário é igual ao número atual da sequência. Se for igual, ele exibe uma mensaghem informando que o número pertence à sequência de Fibonacci. Caso contrário, ele exibe uma mensagem informando que número não pertence à sequência de Fibonacci.

---
<br>

**3)** Descubra a lógica e complete o próximo elemento:

**a)** 1, 3, 5, 7, ___

**RESPOSTA:** Cada número da sequência é igual ao anterior somado a 2, iniciando em 1. Deste modo, o próximo número é igual a 7 + 2 = 9.

**b)** 2, 4, 8, 16, 32, 64, ____

**RESPOSTA:** Cada número da sequência é igual ao anterior multiplicado por 2. Deste modo, o próximo número é igual a 64 x 2 = 128.

**c)** 0, 1, 4, 9, 16, 25, 36, ____

**RESPOSTA:** Cada número da sequência é igual ao anterior somado pela sequência de números ímpares iniciado em 1. Deste modo, o próximo número é igual a 36 + 13 = 49.

**d)** 4, 16, 36, 64, ____

**RESPOSTA:** Cada número da sequência é igual ao quadrado da sequência de números pares iniciado em 2. Deste modo, o próximo número é igual a 10² = 100.

**e)** 1, 1, 2, 3, 5, 8, ____

**RESPOSTA:** Temos uma sequência de Fibonacci onde, cada número é igual à soma do número atual com o número anterior. Deste modo, o próximo número é igual a 8 + 5 = 13.

**f)** 2,10, 12, 16, 17, 18, 19, ____

**RESPOSTA:** Temos uma sequência em ordem crescente formada apenas por números que quando escritos por extenso iniciam com a letra D. Deste modo, o próximo número é igual a 200 (duzentos).

---
<br>

**4)** Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.

<br>

**RESPOSTA:** Devemos levar em consideração que para se cruzarem, ambos devem estar no mesmo ponto da rodovia, logo, estarão na mesma distância da cidade de Ribeirão Preto. O fato de um ter saído de Ribeirão Preto, o outro de Franca e a velocidade média dos veículos é irrelevante, pois o ponto de encontro é o mesmo para ambos.

---
<br>

**5)** Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

<br>

```java
import java.util.Scanner;

public class QuintoDesafio {
    public static void main(String[] args) {

        String invertedString = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String string = scan.nextLine();

        for (int i = string.length() - 1; i >= 0; i--) {
            invertedString += string.charAt(i);
        }

        System.out.println("A inversão string informada é: " + invertedString);

    }
}
```

**RESPOSTA**: Primeiro inicializamos uma string vazia para armazenar a string invertida que será o resultado final do programa. Em seguida, solicitamos ao usuário que insira uma palavra ou texto utilizando a classe Scanner. A seguir, executamos um loop para percorrer a string informada pelo usuário de trás para frente, utilizando o contador "i" iniciando em "string.length()-1" (que realiza a contagem de caracteres da string) e decrementamos em cada iteração até chegar em 0. Dentro do próprio loop, cada caractere percorrido é adicionado à string vazia criada no início utilizando o método "charAt". Por fim, a string invertida será exibida na tela utilizando o método "println()".

<br>
<br>
<br>
By Jonathan Neves
