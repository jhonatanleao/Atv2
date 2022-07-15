/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Collections.PessoaCollection;
import Grafico.Builder.Diretor;
import Grafico.Builder.GraficoHorizontalBuilder;
import Grafico.Decorator.GraficoPessoa;
import Grafico.Decorator.Titulo;
import Grafico.Decorator.IComponente;
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
        GraficoPessoa grafico = new GraficoPessoa(); 
        grafico = diretor.buildGrafico(totalCasados.realizaConta(pColletion.getPessoas()), totalSolteiros.realizaConta(pColletion.getPessoas()));
        grafico.criarGrafico();
        
        view = new GraficoView();
        
        
        

        this.view.getCkBoxTitulo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                titulo();
            }
        });

        this.view.getCkBoxLegenda().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                legenda();
            }
        });

        this.view.getCkBoxTituloEixos().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tituloEixos();
            }
        });

        this.view.getCkBoxRotuloDadosPercentual().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                rotuloDadosPercentual();
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


    public void titulo(){
        try {
            if (view.getCkBoxTitulo().isSelected()) {
                System.out.println(12);
                grafico = new Titulo(grafico);
                //view.getJpnGrafico().setLayout(new BorderLayout());
                //view.getJpnGrafico().add(grafico.criarGrafico());
            } else {

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao acionar título " + e.getMessage());
        }

    }

    public void legenda(){

    }

    public void tituloEixos(){

    }

    public void rotuloDadosPercentual(){

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


