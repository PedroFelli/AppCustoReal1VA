package controller;

import bean.Funcionario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Calculo;


/**
 *
 * @author pedro.amaral
 */
public class RealSV extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(request.getParameter("nome"));
        funcionario.setCargo(request.getParameter("cargo"));
 
        funcionario.setSlbruto(Double.parseDouble(request.getParameter("slbruto")));
        funcionario.setDiatb(Double.parseDouble(request.getParameter("diatb")));
        funcionario.setVltrans(Double.parseDouble(request.getParameter("vltrans")));
        funcionario.setVlref(Double.parseDouble(request.getParameter("vlref")));
        funcionario.setOtrbf(Double.parseDouble(request.getParameter("otrbf")));
        

        request.setAttribute("resultado", Calculo.getSituacao(funcionario));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
            
    
}
