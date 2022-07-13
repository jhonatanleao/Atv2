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
public class PorcentagemMasculino implements Estatistica{

    @Override
    public int realizaConta(ArrayList<Pessoa> ListPessoa) {
        int contador=0, total=0;
        for(Pessoa pessoa : ListPessoa){
            if(pessoa.getSexo().equals("Masculino"))
                contador++;
            total++;
        }
        
        return contador/total;
    }    
}
