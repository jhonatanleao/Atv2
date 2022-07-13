/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import Model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author jhonatan
 */
public class PessoaCollection {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
    
    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    @Override
    public String toString() {
        return "PessoaCollection{" + "pessoas=" + pessoas + '}';
    }
    
    
    
}
