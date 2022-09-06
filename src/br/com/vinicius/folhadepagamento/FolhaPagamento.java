package br.com.vinicius.folhadepagamento;
public class FolhaPagamento {
    private double valor;
    private int mes;
    private int ano;

    // na classe main cria folha mes 17 e ano 1800

    public FolhaPagamento(double valor, int mes, int ano) {//contrutor com todas as variaveis
        this.setValor(valor);
        this.setMes(mes);
        this.setAno(ano);
    }

    public FolhaPagamento(int mes, int ano) {// construtor somente com 2 (posso ecolher qual usar)
        this.setMes(mes);
        this.setAno(ano);
    }

    public double getValor() {
        if (this.valor>= 10000){
            return 0;
        }else {
            return this.valor;
        }
    }

    public void setValor(double novoValor) {
        if(novoValor>=1000){
            this.valor=novoValor;
        }else {
            this.valor = 0;
        }

    }

    public int getMes() {
        return this.mes;
    }

    /**
     * valor mínimo= 1 valor maximo 12
     *
     */
    public void setMes(int mes) {
        if(mes >= 1 && mes <=12){//&& mesma cois que and
            this.mes=mes;
        }else {
            this.mes=1;
        }
    }

    public int getAno() {
        return this.ano;
    }

    /**
     * valor mínimo= 1990
     *
     */
    public void setAno(int ano) {
        if (ano >= 1990) { //aqui ele recebe valor que user digitou
            this.ano = ano;
        } else {
            this.ano = 1990;
        }
    }
    }

