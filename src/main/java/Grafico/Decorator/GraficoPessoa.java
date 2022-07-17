/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafico.Decorator;

import java.awt.Dimension;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author jhonatan
 */
public class GraficoPessoa extends IComponente{

    public GraficoPessoa() {
        
    }
    
    public GraficoPessoa(GraficoPessoa grafico) {
        super(grafico.dataSet, 
                grafico.chart, 
                grafico.titulo, 
                grafico.tituloVertical, 
                grafico.tituloHorizontal, 
                grafico.orientacao,
                grafico.rotulo,
                grafico.legenda);
        grafico = grafico;
        
    }
      

    public CategoryDataset getDataSet(){
        return dataSet;
    }

    public void setDataSet(CategoryDataset dataSet) {
        this.dataSet = dataSet;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }
    

    @Override
    public IComponente reverter() {
        return this;
    }

}
