
package tcc.sistemasumarizacao.classesbase;

import java.util.ArrayList;
import java.util.List;

public class MedidasAvalicao {

  // Attributes
	
  private double recall = 0;
  private List<Double> recalls;
  private double precision = 0;
  private List<Double> precisions;
  private double fMeasure = 0;
  private List<Double> fMeasures;

  
  // Constructor
  
  public MedidasAvalicao() {

  }

  
  // Methods
  
  public double getRecall() {
	
    return recall;

  }

  public void setRecall(double recall) {
	
    this.recall = recall;

  }

  public List<Double> getRecalls() {
	
    return recalls;

  }

  public void setRecalls(List<Double> recalls) {
	
    this.recalls = recalls;

  }

  public void addRecall(double recall) {
	  
    if( recall >= 0 ) {
    	
      this.recall += recall;

      if( this.recalls == null ) {
    	  
        this.recalls = new ArrayList<Double>();
        
      }

      this.recalls.add( recall );
      
    }
    
  }
  
  public double getPrecision() {
	
    return precision;

  }
  
  public void setPrecision(double precision) {
	
    this.precision = precision;

  }

  public List<Double> getPrecisions() {
	
    return precisions;

  }

  public void setPrecisions(List<Double> precisions) {
	
    this.precisions = precisions;

  }

  public void addPrecision(double precision) {
	  
    if( precision > 0 ) {
	    	
      this.precision += precision;

      if( this.precisions == null ) {
	    	  
        this.precisions = new ArrayList<Double>();
	        
      }

      this.precisions.add( precision );
	      
    }
	    
  }

  public double getFMeasure() {

    return fMeasure;

  }
  
  public void setFMeasure(double fMeasure) {
	
    this.fMeasure = fMeasure;

  }

  public List<Double> getfMeasures() {

    return fMeasures;

  }

  public void setfMeasures(List<Double> fMeasures) {

    this.fMeasures = fMeasures;

  }
  
  public void addFMeasure(double fMeasure) {
	  
    if( fMeasure > 0 ) {
		    	
      this.fMeasure += fMeasure;

      if( this.fMeasures == null ) {
		    	  
        this.fMeasures = new ArrayList<Double>();
		        
      }

      this.fMeasures.add( fMeasure );
		      
    }
		    
  }
  
  @Override
	
  public String toString() {
	
    return "" + this.getRecall();
    
  }

}

