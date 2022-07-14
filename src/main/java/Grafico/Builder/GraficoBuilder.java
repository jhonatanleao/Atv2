/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafico.Builder;

import Grafico.Decorator.GraficoPessoa;
import Util.Math.Estatistica;

/**
 *
 * @author jhonatan
 */
public abstract class GraficoBuilder {
    
    protected GraficoPessoa grafico;
    
    public abstract void createDataSet(int valorGraficoCasado, int valorGraficoSolteiro);
    
    public abstract void createChart();
    
    public abstract void createGrafico();
    
    public GraficoPessoa getComputador(){
        return this.grafico;
    }
}
