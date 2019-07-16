package com.github.dchristofolli.technocorp.estagio.apresentacao01.cadastro;

import java.util.*;

public class Cadastro {
    static Programador[] programadorArray = new Programador[10];
    static Estagiario[] estagiarioArray = new Estagiario[10];
    static int idProgramador = 1;
    static int idEstagiario = 1;

    public static void main(String[] args) {
        menuCadastro();
    }

    private static void menuCadastro() {
        String escolha = input("Cadastro\nSelecione uma opção:\n1 - Cadastrar novo programador" +
                "\n2 - Listar programadores\n3 - Cadastrar novo estagiário\n4 - Listar estagiários\nENTER - Sair");
        switch (escolha){
            case "1":{
                cadastraProgramador();
            }
            case "2":{
                listaProgramador();
            }
            case "3":{
                cadastraEstagiário();
            }
            case "4":{
                listaEstagiario();
            }
            case "":{
                System.exit(0);
            }
            default:{
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
    }

    private static void listaEstagiario() {
        for (Estagiario e : estagiarioArray
        ) {
            if (e != null)
                System.out.println(e);
        }
        menuCadastro();
    }

    private static void listaProgramador() {
        for (Programador p : programadorArray
             ) {
            if (p != null)
            System.out.println(p);
        }
        System.out.println();

        try {
            menuCadastro();
        } catch (Exception e) {
            System.out.println("Opção inválida. Tente novamente. " + e.getMessage());
            menuCadastro();
        }

    }

    private static void cadastraProgramador() {
        System.out.println("\nCadastro de Programador");
        String nomeProgramador = validaNome();
        String nivel = input("Nível: ").toUpperCase();
        double salario = validaRemuneracao();
        String cpfProgramador = cadastraCPF();
        if (cpfProgramador.equals("")){
            System.out.println("Erro. Favor digitar o CPF novamente.");
            cadastraCPF();
        }
        else
            System.out.println("Programador cadastrado com sucesso com a id: " + idProgramador + "\n");
        programadorArray[idProgramador] = (new Programador(idProgramador, nomeProgramador, nivel, salario, cpfProgramador));
        idProgramador ++;
        menuCadastro();
    }

    private static String validaNome() {
        String nome = "";
        String inputNome = input("Nome:");
        try {
            if (inputNome.length() >= 3) {
                nome = inputNome;
            } else {
                System.out.println("O nome deve ter pelo menos 5 caracteres. ");
                validaNome();
            }

        } catch (Exception e) {
            System.out.println("Nome inválido.\n" +e.getMessage());
            validaNome();
        }
        return nome;
    }

    private static double validaRemuneracao() {
        double salario = 0;
        String inputRemuneracao = input("Valor da remuneração mensal: ");
        try{
            salario = Double.parseDouble(inputRemuneracao);
        }catch (Exception e){
            System.out.println("Somente valores decimais. Tente novamente.\n" + e.getMessage());
            validaRemuneracao();
        }
        return salario;
    }

    private static String cadastraCPF() {
        String inputCpf = input("CPF: ");
        String cpfPessoa = ("");
        try{
            if (ValidaCPF.isCPF(inputCpf)) {
                cpfPessoa = inputCpf;
            }
            else{
                System.out.println("CPF inválido");
                cadastraCPF();
            }
        } catch (Exception e) {
            System.out.println("CPF inválido.\n" + e.getMessage());
            cadastraCPF();
        }
        return cpfPessoa;
    }

    private static void cadastraEstagiário() {
        System.out.println("cadastro de Estagiário");
        String nome = validaNome();
        double remuneracao = validaRemuneracao();
        String cpf = cadastraCPF();
        estagiarioArray[idEstagiario] = (new Estagiario(idEstagiario, nome, remuneracao, cpf));
        System.out.println(estagiarioArray[idEstagiario]);
        idEstagiario ++;
        menuCadastro();
    }

    private static String input(String s) {
        System.out.println(s);
        return new Scanner(System.in).nextLine();
    }
}
