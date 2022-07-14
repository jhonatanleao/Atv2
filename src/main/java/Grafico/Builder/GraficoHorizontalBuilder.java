/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafico.Builder;

import Grafico.Decorator.GraficoPessoa;
import Util.Math.Estatistica;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author jhonatan
 */
public class GraficoHorizontalBuilder extends GraficoBuilder {

    @Override
    public void createGrafico() {
        this.grafico = new GraficoPessoa();
    }

    //Lembrar que esse valor é obtido atraves de uma das classes concretas do Estatistica
    @Override
    public void createDataSet(int valorGraficoCasado, int valorGraficoSolteiro) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(valorGraficoCasado, "Casado","");
        dataSet.addValue(valorGraficoSolteiro, "Solteiro","");
        this.grafico.setDataSet(dataSet);       
    }

    @Override
    public void createChart() {
        JFreeChart graficoBarras = ChartFactory.createBarChart("", "", "", this.grafico.getDataSet(), PlotOrientation.HORIZONTAL, false, false, false);
        this.grafico.setChart(graficoBarras);
    }




    
}
