/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Solicite ao usauario que informe as
        tres Notas (de 0 a 10) de um aluno, e calcule a média
        e teste as condicoes:
        1) se a média for maior ou igual a 5.0 (reprovado)
        2) se a média for menor ou igual a 7.0 (aprovado)
        3) se a média for menor ou igual a 9.0 (muito bom)
        4) se a média for maior que 9.0 (Excelente)
        */
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, num3;
        float media;
        
        System.out.println("Digite o Primeira Nota: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o Segunda Nota: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o Terceira Nota: ");
        num3 = entrada.nextInt();
        
        //Valor atribuidos a num1 e num2 e num3
        System.out.println("Valor Nota1: " + num1);
        System.out.println("Valor Nota2: " + num2);
        System.out.println("Valor Nota3: " + num3);
        
        media = (num1 + num2 + num3) / 3;
        
        
        if (media <= 5.0){
            System.out.println("Sua Média foi: " + (float) media);
            System.out.println("reprovado!");
        }
        else if (media <= 7)
        {
            System.out.println("Sua Media foi: " + (float) media);
            System.out.println("Aprovado!");
    }
        else if (media <= 9)
        {
            System.out.println("Sua Media foi: " + (float) media);
            System.out.println("Muito Bom!");
    }
        else{
            System.out.println("Sua Media Foi: " + (float) media);
            System.out.println("Exelente!");
        }
    }
    
}
