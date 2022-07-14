/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafico.Decorator;

/**
 *
 * @author jhonatan
 */
public class Titulo extends GraficoDecorator{

    public Titulo(IComponente componente){
        super(componente);
        this.titulo = "Algum titulo";
    }
    

    @Override
    public IComponente reverter() {
        
        return decoratedGrafico;
    }


    

    
}
