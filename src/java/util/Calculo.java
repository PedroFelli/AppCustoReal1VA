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
      	
        public static DecimalFormat df = new DecimalFormat("#,##0.000");
      
         
        public static String getSituacao(Funcionario funcionario) {
      
            
            
        double salarioBruto = funcionario.getSlbruto();
        
        
        String res;

        res =  "Funcionário: " + funcionario.getNome();
        res += "<br/>Cargo: " + funcionario.getCargo();
        res += "<br/>Salário Bruto: " + df.format(funcionario.getSlbruto());
        res += "<br/>Dedução IR: " + getDeducao(salarioBruto);
        res += "<br/>Salário Líquido: " + df.format(salario - deducao);
        
        request.setAttribute("resultado", res);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    

    private int getTempoServico(String dtAdmissao) {
        try {
            Date dt = new SimpleDateFormat("dd/MM/yyyy").parse(dtAdmissao);
            long diff = System.currentTimeMillis() - dt.getTime();
            double indice = 1000 * 60 * 60 * 24 * 365.25;
            return (int) (diff / indice);
        } catch (ParseException ex) {
            Logger.getLogger(IrrfSV.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

     private double getDeducao(double salario) {
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
   



     
}