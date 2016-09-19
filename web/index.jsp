<%-- 
    Document   : index
    Created on : 17/09/2016, 11:02:24
    Author     : pedro.amaral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Imc</title>
    </head>
    <body bgcolor="33CCFF">
        <h1>Custo real</h1>
        <fieldset>
            <legend>Digite os dados do funcionario</legend>
            <form action="RealSV" method="post">
                Nome<br/> <input type="text" name="nome" size="40"/><br/>
                Cargo<br/> <select name="cargo">
                    <option value="professor">Professor</option>
                    <option value="diretor">Diretor</option>
                    <option value="secretario">Siretor</option>
                </select><br/>
                Salario bruto<br/> <input type="text" name="slbruto" size="10"/><br/>
                Dias trabalhados<br/> <input type="text" name="slbruto" size="10"/><br/>
                Valor do vale transporte<br/> <input type="text" name="vltrans" size="10"/><br/>
                Valor do vale refeição<br/> <input type="text" name="vlref" size="10"/><br/>
                Outros beneficios<br/> <input type="text" name="otrbf" size="10"/><hr/>
                <input type="submit" name="btn" value="Calcular salario" />
                <input type="reset" name="btn" value="Cancelar" />                
            </form>
        </fieldset>
        <fieldset>
            ${resultado}
        </fieldset>
    </body>
</html>

