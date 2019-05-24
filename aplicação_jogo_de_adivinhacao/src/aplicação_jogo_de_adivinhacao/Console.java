
package aplicação_jogo_de_adivinhacao;

import java.util.List;

import aplicação_jogo_de_adivinhacao.obj;
import aplicação_jogo_de_adivinhacao.verificacao;


import javax.swing.*;

public class Console {
  public static String verifica;
	
	private static int key;
	
    public static verificacao branch;

    public static void main(String[] args) {
    	start();
    	interaction();

    }
    
    public static void start() {
    	verificacao _branch = new verificacao("É UM PASSARO?");
    	branch = _branch;
    	branch.sim = new verificacao("Labrador Retriever");
    	branch.nao = new verificacao("Saí-de-perna-amarela");
    	verifica = "É UM ANIMAL?";
        interaction();
    }
    public static void startveiculo(){
      verificacao _branch = new verificacao("TEM 4 RODAS ?");
    	branch = _branch;
    	branch.sim = new verificacao("Moto");
    	branch.nao = new verificacao("Carro?");
        verifica = "É UM VEICULO?";
        interactionVeiculo();
    }
    public static void startPlanta(){
         verificacao _branch = new verificacao("É PEQUENA?");
    	branch = _branch;
    	branch.sim = new verificacao("E UMA ARVORE?");
    	branch.nao = new verificacao("E UMA FLOR ?");
        verifica = "É UM PLANTA?";
        interactionplanta();
    }
    public static void startpessoa(){
       verificacao _branch = new verificacao("É PESSOA?");
    	branch = _branch;
    	branch.sim = new verificacao("E UM FANTASMA ?");
    	branch.nao = new verificacao("E UMA PESSOA?");
        verifica = "É UM SER VIVO ?"; 
        interactionpessoa();
    }
    
    public static void interaction() {
        do {
        	key = JOptionPane.showConfirmDialog(null, verifica 
            		+ "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == 1) {
        		startveiculo();
               
        	}
            
            key = JOptionPane.showConfirmDialog(null, "O ANIMAL QUE VOCÊ IMAGINOU " 
            		+ branch.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == -1) {
        		System.exit(0);
        		
        	}
        	
            switch (key) {
            case 0:
            	branch.verification(branch.nao);
                break;
                    
            case 1:
            	branch.verification(branch.sim);
                break;
                    
            }
            
        } while (key == 0 || key == 1);
        
    }
   public static void interactionVeiculo() {
         do {
        	key = JOptionPane.showConfirmDialog(null, verifica 
            		+ "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == 1) {
        	startPlanta();
               
        	}
            
      key = JOptionPane.showConfirmDialog(null, "O VEICULO QUE VOCÊ IMAGINOU " 
            		+ branch.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == -1) {
        		System.exit(0);
        		
        	}
        	
            switch (key) {
            case 0:
            	branch.verificationveiculo(branch.nao);
                break;
                    
            case 1:
            	branch.verificationveiculo(branch.sim);
                break;
                    
            }
            
        } while (key == 0 || key == 1);  
   }
   
   public static void interactionplanta() {
         do {
        	key = JOptionPane.showConfirmDialog(null, verifica 
            		+ "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == 1) {
        	startpessoa();
               
        	}
            
      key = JOptionPane.showConfirmDialog(null, "A PLANTA QUE VOCÊ IMAGINOU " 
            		+ branch.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == -1) {
        		System.exit(0);
        		
        	}
        	
            switch (key) {
            case 0:
            	branch.verificationplanta(branch.nao);
                break;
                    
            case 1:
            	branch.verificationplanta(branch.sim);
                break;
                    
            }
            
        } while (key == 0 || key == 1);  
   }
    public static void interactionpessoa() {
         do {
        	key = JOptionPane.showConfirmDialog(null, verifica 
            		+ "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == 1) {
        	start();
               
        	}
            
      key = JOptionPane.showConfirmDialog(null, "O SER QUE VOCÊ IMAGINOU " 
            		+ branch.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	if(key == -1) {
        		System.exit(0);
        		
        	}
        	
            switch (key) {
            case 0:
            	branch.verificationpessoa(branch.nao);
                break;
                    
            case 1:
            	branch.verificationpessoa(branch.sim);
                break;
                    
            }
            
        } while (key == 0 || key == 1);  
   }
}