/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Collections.PessoaCollection;
import Model.Pessoa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author jhonatan
 */
public class CSVUtil {
    
    public PessoaCollection read(){
        PessoaCollection ListPessoa = new PessoaCollection();       
        InputStream is = getClass().getClassLoader().getResourceAsStream("pessoas.csv");            
        Reader reader = new InputStreamReader(is);
        
        try (BufferedReader br = new BufferedReader(reader)) {
            String linhaCSV = br.readLine();
            linhaCSV = br.readLine();
            
            while (linhaCSV != null) {  
                String[] infoPessoas = linhaCSV.split(",");
                Pessoa p = new Pessoa(infoPessoas[0], infoPessoas[1], infoPessoas[2]);
                ListPessoa.addPessoa(p);
                linhaCSV = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        return ListPessoa;
        
    }
}
