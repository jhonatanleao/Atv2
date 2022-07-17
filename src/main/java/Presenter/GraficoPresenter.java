/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Collections.PessoaCollection;
import Grafico.Builder.Diretor;
import Grafico.Builder.GraficoHorizontalBuilder;
import Grafico.Builder.GraficoVerticalBuilder;
import Grafico.Decorator.GraficoPessoa;
import Grafico.Decorator.Titulo;
import Grafico.Decorator.IComponente;
import Grafico.Decorator.Legenda;
import Grafico.Decorator.Rotulo;
import Grafico.Decorator.TituloHorizontal;
import Grafico.Decorator.TituloVertical;
import Util.CSVUtil;
import Util.Math.Estatistica;
import Util.Math.PorcentagemCasados;
import Util.Math.PorcentagemSolteiros;
import Util.Math.TotalCasados;
import Util.Math.TotalSolteiros;
import View.GraficoView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author Geovane
 */
public class GraficoPresenter {
    private GraficoView view;
    private IComponente grafico;

    public GraficoPresenter(){
        int valor1, valor2;
        Estatistica totalCasados = new PorcentagemCasados();
        Estatistica totalSolteiros = new PorcentagemSolteiros();       
        CSVUtil readCSV = new CSVUtil();
        PessoaCollection pColletion = new PessoaCollection();
        pColletion = readCSV.read();
        Diretor diretor = new Diretor(new GraficoHorizontalBuilder());
        this.grafico = new GraficoPessoa(); 
        grafico = diretor.buildGrafico(totalCasados.realizaConta(pColletion.getPessoas()), totalSolteiros.realizaConta(pColletion.getPessoas()));
        grafico.criarGrafico();
        
        view = new GraficoView();
        
        
        

        this.view.getCkBoxTitulo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                titulo(grafico);
            }
        });

        this.view.getCkBoxLegenda().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                legenda(grafico);
            }
        });

        this.view.getCkBoxTituloEixos().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tituloEixos(grafico);
            }
        });

        this.view.getCkBoxRotuloDadosPercentual().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                rotuloDadosPercentual(grafico);
            }
        });
        this.view.getCkBoxRotuloDadosValor().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                rotuloDadosValor();
            }
        });

        this.view.getCkBoxRotuloDadosValorPercentual().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                rotuloDadosValorPercentual();
            }
        });

        this.view.getCkBoxCorBarras().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                corBarras();
            }
        });

        this.view.getCkBoxCorBarrasGrupo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                corBarrasGrupo();
            }
        });

        this.view.getCkBoxGrade().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                grade();
            }
        });

        this.view.getjComboBox1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                mudarOrientacaoGrafico();                   
            }
        });

        this.view.getBntDesfazer().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                desfazer();                   
            }
        });

        this.view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 fechar();                                  
            }
        });

        this.view.getBtnRestaurarPadrao().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                restaurarPadrao();
            }
        });

        view.getJpnGrafico().setLayout(new BorderLayout());
        view.getJpnGrafico().add(grafico.criarGrafico());
        view.setVisible(true);
    }

    public void titulo(IComponente grafico){
        try {
            if (view.getCkBoxTitulo().isSelected()) {               
                view.getJpnGrafico().removeAll();
                this.grafico = new Titulo(grafico);
                this.grafico.createBarChart();
                view.getJpnGrafico().add(this.grafico.criarGrafico());  
                view.pack();
            } else {

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao acionar título " + e.getMessage());
        }

    }

    public void legenda(IComponente grafico){
        try {
            if (view.getCkBoxLegenda().isSelected()) {               
                view.getJpnGrafico().removeAll();
                this.grafico = new Legenda(grafico);
                this.grafico.createBarChart();
                view.getJpnGrafico().add(this.grafico.criarGrafico());                
                view.pack();
            } else {

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao acionar a legenda " + e.getMessage());
        }
    }

    public void tituloEixos(IComponente grafico){
        try {
            if (view.getCkBoxTituloEixos().isSelected()) {               
                view.getJpnGrafico().removeAll();
                this.grafico = new TituloHorizontal(grafico);
                this.grafico.createBarChart();
                view.getJpnGrafico().add(this.grafico.criarGrafico());                
                view.pack();
            } else {

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao acionar título nos eixos" + e.getMessage());
        }
    }

    public void rotuloDadosPercentual(IComponente grafico){
        try {
            if (view.getCkBoxTituloEixos().isSelected()) {               
                view.getJpnGrafico().removeAll();
                this.grafico = new Rotulo(grafico);
                this.grafico.createBarChart();
                view.getJpnGrafico().add(this.grafico.criarGrafico());                
                view.pack();
            } else {

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao acionar o rotulo " + e.getMessage());
        }
    }

    public void rotuloDadosValor(){

    }

    public void rotuloDadosValorPercentual(){

    }

    public void corBarras(){

    }

    public void corBarrasGrupo(){

    }

    public void grade(){

    }

    public void mudarOrientacaoGrafico(){

    }

    public void desfazer(){

    }

    public void restaurarPadrao(){

    }

    public void fechar(){
        view.dispose();
    }
  
}    


