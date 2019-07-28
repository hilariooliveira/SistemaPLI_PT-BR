
package tcc.sistemasumarizacao.classesbase;

import java.util.HashMap;
import java.util.Map;

public class Resumo {

  // Atributos
	
  private String sistema;
  private Map<String, MedidasAvalicao> mapMedidasAvalicao;

  
  // Construtor
  
  public Resumo() {

  }


  // Métodos

  public String getSistema() {
	
    return sistema;

  }

  public void setSistema(String sistema) {
	
    this.sistema = sistema;

  }
  
  public Map<String, MedidasAvalicao> getMapMedidasAvalicao() {
	
    return mapMedidasAvalicao;

  }

  public void setMapMedidasAvalicao(Map<String, MedidasAvalicao> mapMedidasAvalicao) {
	
    this.mapMedidasAvalicao = mapMedidasAvalicao;

  }

  public void putMedidasAvalicao(String tipoRouge, MedidasAvalicao medidasAvalicao) {
	  
    if( this.mapMedidasAvalicao == null ) {
	    	
      this.mapMedidasAvalicao = new HashMap<String, MedidasAvalicao>();
	      
    }
	    
    this.mapMedidasAvalicao.put( tipoRouge, medidasAvalicao );
	    
  }
	  
  public MedidasAvalicao getMedidasAvalicao(String tipoRouge) {
	  
    if( this.mapMedidasAvalicao == null || this.mapMedidasAvalicao.isEmpty() ) {
	    	
      return null;
      
    }
	    
    return this.mapMedidasAvalicao.get( tipoRouge );
	    
  }
  
}
