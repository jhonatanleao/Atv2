/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util.Math;

import Model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author jhonatan
 */
public class PorcentagemCasados implements Estatistica{

    @Override
    public int realizaConta(ArrayList<Pessoa> ListPessoa) {
        float contador=0, total=0;
        for(Pessoa pessoa : ListPessoa){
            if(pessoa.getEstadoCivil().equals("Casado(a)"))
                contador++;
            total++;
        }
        
        float resultado = (contador/total)*100;
        
        return (int) resultado;            
    }    
}
