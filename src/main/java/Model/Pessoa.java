/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jhonatan
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private String estadoCivil;

    public Pessoa(String sexo, String nome, String estadoCivil) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
}
