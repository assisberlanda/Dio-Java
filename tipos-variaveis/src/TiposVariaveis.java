// Pra Criar o Javadoc digite no terminal esse comando abaixo
// javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java 

/**
 * A classe TiposVariaveis demonstra o uso de operadores ternários
 * e estruturas de controle como if-else para realizar comparações
 * simples entre dois números inteiros.
 */
public class TiposVariaveis {

    /**
     * O método main é o ponto de entrada da aplicação.
     * Ele compara dois números inteiros e imprime no console
     * se eles são iguais ou não, utilizando um operador ternário.
     *
     * @param args argumentos da linha de comando (não utilizados neste exemplo)
     * @throws Exception se houver algum erro durante a execução (não ocorre neste exemplo)
     */
    public static void main(String[] args) throws Exception {

        // Declaração e inicialização de duas variáveis inteiras
        int a = 5;
        int b = 6;

        // Operador ternário para verificar se 'a' é igual a 'b'
        // Se 'a' for igual a 'b', 'resultado' será "verdadeiro", caso contrário, "falso"
        String resultado = (a == b) ? "verdadeiro" : "falso";

        // Exibe o resultado da comparação no console
        System.out.println(resultado);
    }
}
