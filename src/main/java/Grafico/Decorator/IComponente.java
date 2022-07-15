/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Grafico.Decorator;

import java.awt.Dimension;
import org.jfree.chart.ChartPanel;
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
    protected boolean rotulo;
    protected boolean legenda;

    public IComponente(CategoryDataset dataSet, JFreeChart chart, String titulo, String tituloVertical, String tituloHorizontal, PlotOrientation orientacao, boolean rotulo, boolean legenda) {
        this.dataSet = dataSet;
        this.chart = chart;
        this.titulo = titulo;
        this.tituloVertical = tituloVertical;
        this.tituloHorizontal = tituloHorizontal;
        this.orientacao = orientacao;
        this.rotulo = rotulo;
        this.legenda = legenda;
    }

    public ChartPanel criarGrafico(){

        ChartPanel painelDoGrafico = new ChartPanel(this.chart);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }
    

    public IComponente() {
    }
    
    public IComponente reverter(){
        
        return this;
    }
}
