
package aplicação_jogo_de_adivinhacao;

import javax.swing.*;

import aplicação_jogo_de_adivinhacao.obj;

public class verificacao {
    public verificacao sim;
    public verificacao nao;
    public String value;
    public int key;

    public verificacao(String value) {
        this.value = value;
        
    }


    public void modelTO(verificacao animal) {
        String _save = JOptionPane.showInputDialog(null, "QUAL ANIMAL VOCÊ IMAGINOU?", 
        		"Jogo de advinhar", 3);
        if(_save == null) {
        	System.exit(0);
        }
        String _feature = (JOptionPane.showInputDialog(null, "MAS UM(A) " + _save + " ?,NÃO É UM(A)  " 
        			+ animal.value + " NÃO?", "Jogo de advinhar", 3));
        if(_feature == null) {
        	System.exit(0);
        }
        String _change = animal.value;
        obj animalobj = new obj(_save, _feature);
        int confirmation = JOptionPane.showConfirmDialog(null, animalobj.getType() + " É " + animalobj.getFeature() 
        + "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(confirmation) {
        case 0:
            animal.value = _feature;
            animal.nao = new verificacao(_save);
            animal.sim = new verificacao(_change);
        	break;
        case 1:
        	modelTO(animal);
        	break;
        case -1:
        	System.exit(0);
        	break;
        
        }

    }
      private verificacao(verificacao _change) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void verification(verificacao animal) { 
         key = JOptionPane.showConfirmDialog(null, "O ANIMAL QUE VOCÊ IMAGINOU = " 
        		 + animal.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, 
        		 JOptionPane.QUESTION_MESSAGE);
        if (key == 0) {
            if (animal.nao == null) {
                JOptionPane.showMessageDialog(null, "EU ACERTEI !");
                
            } else {
                verification(animal.nao);
                
            }
            
        } else if (key == -1){
        	System.exit(0);
        	
        }

        if (key == 1) {
            if (animal.sim == null)
            	modelTO(animal);
            
            else {
            	
            	verification(animal.sim);
                
            }
            
        }
        
    }
  //--------------------------------------------------------  
    public void verificationveiculo(verificacao veiculo) { 
         key = JOptionPane.showConfirmDialog(null, "O VEICULO QUE VOCÊ IMAGINOU = " 
        		 + veiculo.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, 
        		 JOptionPane.QUESTION_MESSAGE);
        if (key == 0) {
            if (veiculo.nao == null) {
                JOptionPane.showMessageDialog(null, "EU ACERTEI !");
                
            } else {
                verification(veiculo.nao);
                
            }
            
        } else if (key == -1){
        	System.exit(0);
        	
        }

        if (key == 1) {
            if (veiculo.sim == null)
            	modelTOVeiculo(veiculo);
            
            else {
            	
            	verificationveiculo(veiculo.sim);
                
            }
            
        }
        
    }
    
    public void modelTOVeiculo(verificacao Veiculo) {
        String _save = JOptionPane.showInputDialog(null, "QUAL VEICULO VOCÊ IMAGINOU?", 
        		"Jogo de advinhar", 3);
        if(_save == null) {
        	System.exit(0);
        }
        String _feature = (JOptionPane.showInputDialog(null, "MAS UM(A) " + _save + " ?,NÃO É UM(A)  " 
        			+ Veiculo.value + " NÃO?", "Jogo de advinhar", 3));
        if(_feature == null) {
        	System.exit(0);
        }
        String _change = Veiculo.value;
        obj animalobj = new obj(_save, _feature);
        int confirmation = JOptionPane.showConfirmDialog(null, animalobj.getType() + " É " + animalobj.getFeature() 
        + "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(confirmation) {
        case 0:
            Veiculo.value = _feature;
            Veiculo.nao = new verificacao(_save);
            Veiculo.sim = new verificacao(_change);
        	break;
        case 1:
        	modelTO(Veiculo);
        	break;
        case -1:
        	System.exit(0);
        	break;
        
        }

    }
    //----------------------------------
    public void verificationplanta(verificacao planta) { 
         key = JOptionPane.showConfirmDialog(null, "A PLANTA QUE VOCÊ IMAGINOU = " 
        		 + planta.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, 
        		 JOptionPane.QUESTION_MESSAGE);
        if (key == 0) {
            if (planta.nao == null) {
                JOptionPane.showMessageDialog(null, "EU ACERTEI !");
                
            } else {
                verificationplanta(planta.nao);
                
            }
            
        } else if (key == -1){
        	System.exit(0);
        	
        }

        if (key == 1) {
            if (planta.sim == null)
            	modelTOVeiculo(planta);
            
            else {
            	
            	verificationplanta(planta.sim);
                
            }
            
        }
        
    }
    
    public void modelTOplanta(verificacao planta) {
        String _save = JOptionPane.showInputDialog(null, "QUAL PLANTA VOCÊ IMAGINOU?", 
        		"Jogo de advinhar", 3);
        if(_save == null) {
        	System.exit(0);
        }
        String _feature = (JOptionPane.showInputDialog(null, "MAS UM(A) " + _save + " ?,NÃO É UM(A)  " 
        			+ planta.value + " NÃO?", "Jogo de advinhar", 3));
        if(_feature == null) {
        	System.exit(0);
        }
        String _change = planta.value;
        obj animalobj = new obj(_save, _feature);
        int confirmation = JOptionPane.showConfirmDialog(null, animalobj.getType() + " É " + animalobj.getFeature() 
        + "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(confirmation) {
        case 0:
            planta.value = _feature;
            planta.nao = new verificacao(_save);
            planta.sim = new verificacao(_change);
        	break;
        case 1:
        	modelTOplanta(planta);
        	break;
        case -1:
        	System.exit(0);
        	break;
        
        }

    }
   //---------------------------------------------------------------------------
       public void verificationpessoa(verificacao pessoa) { 
         key = JOptionPane.showConfirmDialog(null, "O SER QUE VOCÊ IMAGINOU = " 
        		 + pessoa.value, "Jogo de advinhar", JOptionPane.YES_NO_OPTION, 
        		 JOptionPane.QUESTION_MESSAGE);
        if (key == 0) {
            if (pessoa.nao == null) {
                JOptionPane.showMessageDialog(null, "EU ACERTEI !");
                
            } else {
                verificationplanta(pessoa.nao);
                
            }
            
        } else if (key == -1){
        	System.exit(0);
        	
        }

        if (key == 1) {
            if (pessoa.sim == null)
            	modelTOpessoa(pessoa);
            
            else {
            	
            	verificationplanta(pessoa.sim);
                
            }
            
        }
        
    }
    
    public void modelTOpessoa(verificacao pessoa) {
        String _save = JOptionPane.showInputDialog(null, "QUAL SER VOCÊ IMAGINOU?", 
        		"Jogo de advinhar", 3);
        if(_save == null) {
        	System.exit(0);
        }
        String _feature = (JOptionPane.showInputDialog(null, "MAS UM(A) " + _save + " ?,NÃO É UM(A)  " 
        			+ pessoa.value + " NÃO?", "Jogo de advinhar", 3));
        if(_feature == null) {
        	System.exit(0);
        }
        String _change = pessoa.value;
        obj animalobj = new obj(_save, _feature);
        int confirmation = JOptionPane.showConfirmDialog(null, animalobj.getType() + " É " + animalobj.getFeature() 
        + "", "Jogo de advinhar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(confirmation) {
        case 0:
            pessoa.value = _feature;
            pessoa.nao = new verificacao(_save);
            pessoa.sim = new verificacao(_change);
        	break;
        case 1:
        	modelTOplanta(pessoa);
        	break;
        case -1:
        	System.exit(0);
        	break;
        
        }

    }
    
    
}
