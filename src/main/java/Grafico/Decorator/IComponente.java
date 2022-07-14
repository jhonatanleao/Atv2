/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Grafico.Decorator;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author jhonatan
 */
abstract class IComponente {
    protected CategoryDataset dataSet;
    protected JFreeChart chart;
    protected String titulo;
    protected String tituloVertical;
    protected String tituloHorizontal;
    protected PlotOrientation orientacao;

    public IComponente(CategoryDataset dataSet, JFreeChart chart, String titulo, String tituloVertical, String tituloHorizontal, PlotOrientation orientacao) {
        this.dataSet = dataSet;
        this.chart = chart;
        this.titulo = titulo;
        this.tituloVertical = tituloVertical;
        this.tituloHorizontal = tituloHorizontal;
        this.orientacao = orientacao;
    }

    public IComponente() {
    }
    
    public IComponente reverter(){
        
        return this;
    }
}
