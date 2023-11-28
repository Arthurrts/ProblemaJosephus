/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemajosephus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author thuts
 */
public class ProblemaJosephus {
    public static void main(String[] args) {
        int n = 20;

        List<Pessoa> roda = new ArrayList<>();
        roda.add(new Pessoa("Ana", "1234-5678", "Rua A, 123", "123.456.789-01"));
        roda.add(new Pessoa("Bruno", "2345-6789", "Rua B, 456", "234.567.890-12"));
        roda.add(new Pessoa("Carla", "3456-7890", "Rua C, 789", "345.678.901-23"));
        roda.add(new Pessoa("Daniel", "4567-8901", "Rua D, 987", "456.789.012-34"));
        roda.add(new Pessoa("Eduarda", "5678-9012", "Rua E, 654", "567.890.123-45"));
        roda.add(new Pessoa("Fábio", "6789-0123", "Rua F, 321", "678.901.234-56"));
        roda.add(new Pessoa("Gabriela", "7890-1234", "Rua G, 876", "789.012.345-67"));
        roda.add(new Pessoa("Henrique", "8901-2345", "Rua H, 543", "890.123.456-78"));
        roda.add(new Pessoa("Isabela", "9012-3456", "Rua I, 210", "901.234.567-89"));
        roda.add(new Pessoa("João", "0123-4567", "Rua J, 109", "012.345.678-90"));
        roda.add(new Pessoa("Karina", "1234-5678", "Rua K, 876", "123.456.789-10"));
        roda.add(new Pessoa("Lucas", "2345-6789", "Rua L, 543", "234.567.890-21"));
        roda.add(new Pessoa("Mariana", "3456-7890", "Rua M, 210", "345.678.901-32"));
        roda.add(new Pessoa("Nathan", "4567-8901", "Rua N, 987", "456.789.012-43"));
        roda.add(new Pessoa("Olivia", "5678-9012", "Rua O, 654", "567.890.123-54"));
        roda.add(new Pessoa("Pedro", "6789-0123", "Rua P, 321", "678.901.234-65"));
        roda.add(new Pessoa("Quiteria", "7890-1234", "Rua Q, 876", "789.012.345-76"));
        roda.add(new Pessoa("Rafael", "8901-2345", "Rua R, 543", "890.123.456-87"));
        roda.add(new Pessoa("Sofia", "9012-3456", "Rua S, 210", "901.234.567-98"));
        roda.add(new Pessoa("Thiago", "0123-4567", "Rua T, 109", "012.345.678-90"));

        int m = new Random().nextInt(n) + 1;
        System.out.println("O número m-ésimo gerado é: " + m + "\n");

        Pessoa sobrevivente = josephus(roda, m);
        
        System.out.println("A pessoa sobrevivente é: " + sobrevivente.nome);
    }

    private static Pessoa josephus(List<Pessoa> roda, int m) {
        int index = 0;
        while (roda.size() > 1) {
            index = (index + m - 1) % roda.size();
            Pessoa removida = roda.remove(index);
            System.out.println("Pessoa removida: " + removida.nome + ", Telefone: " + removida.telefone + ", Endereco: " + removida.endereco + ", CPF: " + removida.cpf + "\n");
        }
        return roda.get(0);
    }
}


