/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author pedro.amaral
 */
public class Funcionario {
    
    private String nome;
    private String cargo;
    private double slbruto;
    private double diatb;
    private double vltrans;
    private double vlref;
    private double otrbf;
    private double deducao = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSlbruto() {
        return slbruto;
    }

    public void setSlbruto(double slbruto) {
        this.slbruto = slbruto;
    }

    public double getDiatb() {
        return diatb;
    }

    public void setDiatb(double diatb) {
        this.diatb = diatb;
    }

    public double getVltrans() {
        return vltrans;
    }

    public void setVltrans(double vltrans) {
        this.vltrans = vltrans;
    }

    public double getVlref() {
        return vlref;
    }

    public void setVlref(double vlref) {
        this.vlref = vlref;
    }

    public double getOtrbf() {
        return otrbf;
    }

    public void setOtrbf(double otrbf) {
        this.otrbf = otrbf;
    }

    public double getDeducao() {
        return deducao;
    }

    public void setDeducao(double deducao) {
        this.deducao = deducao;
    }
    
}
