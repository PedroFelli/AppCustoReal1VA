package util;

import bean.Funcionario;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro.amaral
 */
public class Calculo {

    public static DecimalFormat df = new DecimalFormat("#,##0.00");

    public static String getSituacao(Funcionario funcionario) {
        double salarioBruto = funcionario.getSlbruto();
        String res;

        res = "Funcionário: " + funcionario.getNome();
        res += "<br/>Cargo: " + funcionario.getCargo().toUpperCase();
        res += "<br/>Salário Bruto: " + df.format(funcionario.getSlbruto());
        res += "<br/>Dedução IR: " + df.format(getDeducao(salarioBruto));
        res += "<br/>Salário Líquido: " + df.format(salarioBruto - getDeducao(salarioBruto) - getINSS(salarioBruto));
        res += "<br/>FGTS: " + (getFGTS(funcionario.getSlbruto()));
        res += "<br/>INSS: " + (getINSS(funcionario.getSlbruto()));
        res += "<br/>Outros Beneficios: " + funcionario.getOtrbf();
        res += "<br/>Vale refeição: " + getRefeicao(funcionario.getDiatb(), funcionario.getVlref());
        res += "<br/>Vale transporte: " + getTrans(funcionario.getDiatb(), funcionario.getVltrans());
        res += "<br/>Provisão 13º salario: " + df.format(getProv13(salarioBruto));
        res += "<br/>Provisão de férias: " + df.format(getProv13(salarioBruto));
        res += "<br/>Provisão 1/3 ferias: " + df.format(getProv13(salarioBruto)/3);
        res += "<br/>Provisão de avisio prévio: " + df.format(getProv13(salarioBruto));
        
        

        
        
        return res;
    }

    static private double getDeducao(double salario) {
        double deducao;

        if (salario <= 1903.98) {
            deducao = 0.0;
        } else if (salario <= 2826.65) {
            deducao = (salario * 0.075) - 142.80;
        } else if (salario <= 3751.05) {
            deducao = (salario * 0.15) - 354.80;
        } else if (salario <= 4664.68) {
            deducao = (salario * 0.225) - 636.13;
        } else {
            deducao = (salario * 0.275) - 869.36;
        }

        return deducao;
    }

    static private double getFGTS(double salario) {
        double fgts;
        fgts = (salario * 8)/100;
        return fgts;
    }
    
    static private double getINSS(double salario){
        double inss;
        inss = (salario * 9)/100;
        return inss;
    }

    static private double getRefeicao(double diaTb, double vlRefe){
        double vlRefei = (diaTb * vlRefe);
        return vlRefei;
    }
    
    static private double getTrans(double diaTb, double vlTrans){
        double vlTran = (diaTb * vlTrans) * 2;
        return vlTran;
    }
    
    static private double getProv13(double salario){
        double prov13 = salario / 12;
        return prov13;
    }
}
