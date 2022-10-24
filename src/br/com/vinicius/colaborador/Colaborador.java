package br.com.vinicius.colaborador;

import br.com.vinicius.folhadepagamento.FolhaPagamento;

import java.util.ArrayList;
import java.util.List;

public class

Colaborador {

    String nome;
    String cpf;
    List<FolhaPagamento> folhasPagamento= new ArrayList<>();

    public double retornarValorFolhas(){
        double valorTotal = 0;
        for (FolhaPagamento folha : folhasPagamento){
            valorTotal += folha.getValor();
        }
       return valorTotal;
     }


     public void imprimirFicha(){

         System.out.println(nome + ": CPF" + cpf + ". Total folha:"+retornarValorFolhas());

     }

}
