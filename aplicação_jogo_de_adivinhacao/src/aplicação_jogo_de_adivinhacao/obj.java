
package aplicação_jogo_de_adivinhacao;

public class obj {
	
    private String type;
    private String feature;

    public obj() {
    	
    }

    public obj(String type, String feature) {
        this.type = type;
        this.feature = feature;
        
    }

   

    public void setType(String type) {
        this.type = type;
        
    }
    
     public String getType() {
        return type;
        
    }

    public void setFeature(String feature) {
        this.feature = feature;
        
    }
    
    public String getFeature() {
        return feature;
        
    }

    
}