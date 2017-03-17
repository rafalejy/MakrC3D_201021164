package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad,v,f;
    

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
     public String getv(){
        return v;
    }
      public String getf(){
        return f;
    }
      
      public void addV(String ver){
      v+=", "+ver;
      }
      
       public void addF(String fal){
      f+=", "+fal;
      }
        
}
