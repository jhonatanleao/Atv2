/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pss.atv2;

import Collections.PessoaCollection;
import Model.Pessoa;
import Util.CSVUtil;
import Util.Math.Estatistica;
import Util.Math.PorcentagemCasados;
import java.util.ArrayList;

public class Atv2 {

    public static void main(String[] args) {
        PessoaCollection pessoas = new PessoaCollection();
        CSVUtil csv = new CSVUtil();
        pessoas = csv.read();
        
        Estatistica conta = new PorcentagemCasados();
        
        System.out.println(conta.realizaConta(pessoas.getPessoas()));
    }
}
