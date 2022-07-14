/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Grafico.Decorator;

/**
 *
 * @author jhonatan
 */
abstract class GraficoDecorator extends IComponente{
    
    protected IComponente decoratedGrafico;

    public GraficoDecorator(IComponente decoratedGrafico) {
        super(decoratedGrafico.dataSet, decoratedGrafico.chart, decoratedGrafico.titulo, decoratedGrafico.tituloVertical, decoratedGrafico.tituloHorizontal, decoratedGrafico.orientacao);
        this.decoratedGrafico = decoratedGrafico;
    }
    
    @Override
    public IComponente reverter() {
        
        return decoratedGrafico;
    }
    
    public void Titulo(){
        
    }  
    
    public void Legenda(){
        
    }

    public void TituloEixos(){
        
    }  
    
    public void RotuloValorQtd(){
        
    }
    
    public void RotuloValorPorcentagem(){
        
    }  

    public void RotuloValorAmbos(){
        
    }  
    
    public void CorBarras(){
        
    }  
    
    public void CorBarrasGrupo(){
        
    }  
    
    public void Grade(){
        
    }  
}
