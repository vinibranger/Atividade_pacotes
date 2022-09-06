package br.com.vinicius;

import br.com.vinicius.folhadepagamento.FolhaPagamento;

public class Main {


    public static void main(String[] args) {
//        folhaDePagamento.FolhaPagamento folhaPagamento01 = new folhaDePagamento.FolhaPagamento(5255,8,2022);
//        folhaDePagamento.FolhaPagamento folhaPagamento02 = new folhaDePagamento.FolhaPagamento(9,2022);
//
//        folhaDePagamento.Colaborador colaborador1 = new folhaDePagamento.Colaborador();
//        colaborador1.nome= "Roberto";
//        colaborador1.cpf="222221";
//        colaborador1.folhasPagamento.add(folhaPagamento01);
//        colaborador1.folhasPagamento.add(folhaPagamento02);
//
//        folhaDePagamento.Colaborador colaborador2 = new folhaDePagamento.Colaborador();
//        colaborador2.nome= "Vini";
//        colaborador2.cpf="1965461";
//
//
//        colaborador1.imprimirFicha();
//        colaborador2.imprimirFicha();


        final FolhaPagamento folhateste1 = new FolhaPagamento(30,1700);
        System.out.println("Mes: " + folhateste1.getMes());
        System.out.println("Ano: " + folhateste1.getAno());
    }
}
