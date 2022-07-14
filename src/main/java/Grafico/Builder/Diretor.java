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
public class Diretor {
    
    private GraficoBuilder builder;

    public Diretor(GraficoBuilder builder) {
        this.builder = builder;
    }
    
    public GraficoPessoa buildGrafico(int valorGraficoCasado, int valorGraficoSolteiro){
        builder.createGrafico();
        builder.createDataSet(valorGraficoCasado, valorGraficoSolteiro);
        builder.createChart();
        return builder.getComputador();
    }
    
}
