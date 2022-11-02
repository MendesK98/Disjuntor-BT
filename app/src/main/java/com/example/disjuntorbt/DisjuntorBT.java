package com.example.disjuntorbt;

public class DisjuntorBT {
    //Dados do equipamento
    String cliente;
    String subestacao;
    String tag;
    String nSerie;
    String fabricante;
    String tipo;
    String tipoRele;
    int vNominal;
    int iNominal;

    //Condições Gerais do equipamento
    String conexoes;
    String contatos;
    String hasteAcionamento;
    String camaraExtincao;
    String bobinasAcionamento;
    String sinalizacao;
    String lubrificacao;
    String aterramento;

    //Ensaios Elétricos
    //Resistencia dos contatos
    double rCR;
    double rCS;
    double rCT;

    //Resistencia de Isolação
    double rIR;
    double rIS;
    double rIT;


}
