/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Grafico.Decorator;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author jhonatan
 */
public abstract class IComponente {
    protected CategoryDataset dataSet;
    protected JFreeChart chart;
    protected ChartPanel chartPanel;
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

    public void createBarChart(){

        this.chart = ChartFactory.createBarChart(this.titulo, 
                this.tituloVertical, 
                this.tituloHorizontal, 
                this.dataSet, 
                PlotOrientation.HORIZONTAL, 
                this.legenda, 
                this.rotulo, 
                false);
        
    }
    
    public ChartPanel criarGrafico(){       
        
        this.chartPanel = new ChartPanel(this.chart);
        this.chartPanel.setPreferredSize(new Dimension(400, 400));
        return this.chartPanel;
        
    }
    
    public IComponente() {
    }
    
    public IComponente reverter(){
        
        return this;
    }

    @Override
    public String toString() {
        return "IComponente{" + "dataSet=" + dataSet + ", chart=" + chart + ", chartPanel=" + chartPanel + ", titulo=" + titulo + ", tituloVertical=" + tituloVertical + ", tituloHorizontal=" + tituloHorizontal + ", orientacao=" + orientacao + ", rotulo=" + rotulo + ", legenda=" + legenda + '}';
    }
    
    
}
