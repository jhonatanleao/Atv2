/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafico.Decorator;

/**
 *
 * @author jhonatan
 */
public class TituloHorizontal extends GraficoDecorator{

    public TituloHorizontal(IComponente componente){
        super(componente);
        this.tituloHorizontal = "Porcentagem";
        this.tituloVertical = "Homem/Mulher";
    }    
}
