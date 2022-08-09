/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_15_exercios_2;

import java.util.Scanner;

/**
 *
 * @author leonardo-user
 */
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, civil, tempo;

        System.out.println("Insira seu Nome: ");
        nome = sc.nextLine();

        System.out.println("Insira seu Sexo");
        System.out.println("F para Mulher");
        System.out.println("M para Homem");
        sexo = sc.nextLine();

        System.out.println("Insira seu Estado Civil");
        civil = sc.nextLine();

        if ((("F".equals(sexo)) || (("f".equals(sexo)))) && (("CASADA".equals(civil)) || ("casada".equals(civil)))) {
            System.out.println("Há quanto tempo é casada?");
            tempo = sc.nextLine();
            System.out.println("Seu nome é " + nome + ", você é Mulher, e está " + civil + " há " + tempo);
        } else {
            System.out.println("Muito bem");
        }
    }
}
