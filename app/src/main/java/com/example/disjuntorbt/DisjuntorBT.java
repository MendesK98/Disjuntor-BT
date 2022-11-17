package com.example.disjuntorbt;

public class DisjuntorBT {
    //Dados do equipamento

    String tag;
    String nSerie;
    String fabricante;
    String tipo;
    String tipoRele;
    double iNominalRele;
    double interrupcao;
    double vNominal;
    double iNominal;

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

    //Getters and Setters
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoRele() {
        return tipoRele;
    }

    public void setTipoRele(String tipoRele) {
        this.tipoRele = tipoRele;
    }

    public double getINominalRele() {return iNominalRele;}

    public void setINominalRele (double iNominalRele) {this.iNominalRele = iNominalRele;}

    public double getInterrupcao () {return interrupcao;}

    public void setInterrupcao (double interrupcao) {this.interrupcao = interrupcao;}

    public double getvNominal() {
        return vNominal;
    }

    public void setvNominal(double vNominal) {
        this.vNominal = vNominal;
    }

    public double getiNominal() {
        return iNominal;
    }

    public void setiNominal(double iNominal) {
        this.iNominal = iNominal;
    }

    public String getConexoes() {
        return conexoes;
    }

    public void setConexoes(String conexoes) {
        this.conexoes = conexoes;
    }

    public String getContatos() {
        return contatos;
    }

    public void setContatos(String contatos) {
        this.contatos = contatos;
    }

    public String getHasteAcionamento() {
        return hasteAcionamento;
    }

    public void setHasteAcionamento(String hasteAcionamento) {
        this.hasteAcionamento = hasteAcionamento;
    }

    public String getCamaraExtincao() {
        return camaraExtincao;
    }

    public void setCamaraExtincao(String camaraExtincao) {
        this.camaraExtincao = camaraExtincao;
    }

    public String getBobinasAcionamento() {
        return bobinasAcionamento;
    }

    public void setBobinasAcionamento(String bobinasAcionamento) {
        this.bobinasAcionamento = bobinasAcionamento;
    }

    public String getSinalizacao() {
        return sinalizacao;
    }

    public void setSinalizacao(String sinalizacao) {
        this.sinalizacao = sinalizacao;
    }

    public String getLubrificacao() {
        return lubrificacao;
    }

    public void setLubrificacao(String lubrificacao) {
        this.lubrificacao = lubrificacao;
    }

    public String getAterramento() {
        return aterramento;
    }

    public void setAterramento(String aterramento) {
        this.aterramento = aterramento;
    }

    public double getrCR() {
        return rCR;
    }

    public void setrCR(double rCR) {
        this.rCR = rCR;
    }

    public double getrCS() {
        return rCS;
    }

    public void setrCS(double rCS) {
        this.rCS = rCS;
    }

    public double getrCT() {
        return rCT;
    }

    public void setrCT(double rCT) {
        this.rCT = rCT;
    }

    public double getrIR() {
        return rIR;
    }

    public void setrIR(double rIR) {
        this.rIR = rIR;
    }

    public double getrIS() {
        return rIS;
    }

    public void setrIS(double rIS) {
        this.rIS = rIS;
    }

    public double getrIT() {
        return rIT;
    }

    public void setrIT(double rIT) {
        this.rIT = rIT;
    }
}
