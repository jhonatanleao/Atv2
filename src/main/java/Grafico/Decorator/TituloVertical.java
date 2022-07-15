/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafico.Decorator;

/**
 *
 * @author jhonatan
 */
public class TituloVertical extends GraficoDecorator{

    public TituloVertical(GraficoDecorator componente){
        super(componente);
        this.tituloVertical = "Titulo vertical";
    }
}