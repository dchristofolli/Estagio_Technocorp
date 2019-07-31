package com.github.dchristofolli.technocorp.estagio.apresentacao02.dry;

import java.util.Scanner;

public class Cadastro {
    static Cliente[] clientes = new Cliente[1000];
    static Funcionario[] funcionarios = new Funcionario[100];
    static int indexFuncionarios = 0;
    static int indexClientes = 0;

    public static void main(String[] args) {
    CadastrarCliente();
    CadastrarFuncionario();

        }


    private static void CadastrarFuncionario() {
        String nome = input("Nome do funcionário: ");
        if (validaNome(nome)){
            funcionarios[indexFuncionarios] = new Funcionario(nome);
            System.out.println("Funcionário cadastrado com sucesso");
        }
        else {
            CadastrarFuncionario();
        }
    }
//    public String weekday1(int day) {
//        switch (day) {
//            case 1:
//                return "Monday";
//            case 2:
//                return "Tuesday";
//            case 3:
//                return "Wednesday";
//            case 4:
//                return "Thursday";
//            case 5:
//                return "Friday";
//            case 6:
//                return "Saturday";
//            case 7:
//                return "Sunday";
//            default:
//                System.out.println("day must be in range 1 to 7");
//        }
//    }
    public String weekday2(int day) {
        if ((day < 1) || (day > 7)) System.out.println("day must be in range 1 to 7");
                String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        return days[day - 1];
    }


    private static void CadastrarCliente() {
        String nome = input("Nome do cliente: ");
        if (validaNome(nome)){
            clientes[indexClientes] = new Cliente(nome);
            System.out.println("Cliente cadastrado com sucesso");
        }
        else {
            CadastrarCliente();
        }
    }

    private static boolean validaNome(String nome) {
        if(nome.length() < 5) {
            System.out.println("O nome deve ter pelo menos 5 caracteres");
            return false;
        }
        else {
            return true;
        }
    }

    private static String input(String texto) {
        System.out.println(texto);
        String s = new Scanner(System.in).nextLine();
        return s;
    }

    private static void CadastrarPessoa() {
        
    }
}

