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
public class TotalCasados implements Estatistica{

    @Override
    public int realizaConta(ArrayList<Pessoa> ListPessoa) {
        int contador=0;
        for(Pessoa pessoa : ListPessoa){
            if(pessoa.getEstadoCivil().contains("Casados"))
                contador++;
        }
        
        return contador;            
    }
    
}
