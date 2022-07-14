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
        super();
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
    
     public ChartPanel criarGrafico(){

        ChartPanel painelDoGrafico = new ChartPanel(this.chart);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }

    @Override
    public IComponente reverter() {
        return this;
    }

}
