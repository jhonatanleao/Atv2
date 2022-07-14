/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import View.GraficoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Geovane
 */
public class GraficoPresenter {
	private GraficoView view;

	public GraficoPresenter(){
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
                            restaurarPadrao();                   
		        }
		    });
                    
                    this.view.getBtnRestaurarPadrao().addActionListener(new ActionListener(){
		        @Override
		        public void actionPerformed(ActionEvent e){
                            fechar();                   
		        }
		    });
		    
		    view.setVisible(true);
		}


	public void titulo(){

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

	}
  
}    


