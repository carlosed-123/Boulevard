//BOULEVARD - VERSÃO 1
//Versão utilizando vetores. Vai precisar informar quantos animais serão cadastrados.

// precisa cadastrar os animais e exibir relatório com o nome do animal, tipo(cão ou gato), nome do dono e telefone pra falar com o dono
// Desconsidera que vários animais podem ser do mesmo dono
// cada animal tem um nome, um dono e uma data que fez o cadastro.
// cada info deve ficar num vetor diferente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos animais serão cadastrados? ");
        int qtdAnimais = sc.nextInt();
        sc.nextLine(); // consumir o /n que fica ao dar enter no nextInt();
        //declaração dos arrays(o uso de arrays é proposital, pois o intuito do projeto é conseguir manipulá-los).
        String [] animais = new String[qtdAnimais];
        String [] tipoAnimal = new String[qtdAnimais];
        String [] nomeDono = new String [qtdAnimais];
        String [] telefoneDono = new String[qtdAnimais];

        for (int i = 0; i < qtdAnimais; i++){
            System.out.printf("INSIRA O NOME DO %dº ANIMAL: ", i+1);
            animais[i] = sc.nextLine();
            System.out.printf("%s É DE QUE TIPO? ",animais[i]);
            tipoAnimal[i] = sc.nextLine();
            System.out.printf("Agora, insira o nome do dono de %s: ", animais[i]);
            nomeDono[i] = sc.nextLine();
            System.out.printf("Por útlimo, um telefone para que possamos manter contato: ");
            telefoneDono[i] = sc.nextLine();
        }
        System.out.printf("RELATÓRIO: %n");
        for (int j = 0; j < qtdAnimais; j++){
            System.out.printf("%nRESERVA N.%d%n",j+1);
            System.out.printf("NOME DO ANIMAL: %s", animais[j]);
            System.out.printf("%nTIPO DO ANIMAL: %s", tipoAnimal[j]);
            System.out.printf("%nDONO: %s", nomeDono[j]);
            System.out.printf("%nTELEFONE CADASTRADO: %s", telefoneDono[j]);

        }
    }
}
