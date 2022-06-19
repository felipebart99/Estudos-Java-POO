
package javaapplication1;


public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;
  
  public Caneta() { //este é o metodo construtor
      this.tampar();
      this.cor= "azul";
  }
  
  public void status(){
      System.out.println("uma caneta " + this.cor);
      System.out.println("o tamanho da ponta é: " + this.ponta);
      System.out.println("está tampada? " + this.tampada);
  }
  
   public void rabiscar(){
    if (this.tampada == true) {
        System.out.println("nao posso rabiscar");
    } else{
         System.out.println("estou rabiscando");
        }
    }  
   
    
 protected void tampar(){
    this.tampada = true;  
  }

protected void destampar(){
 this.tampada = false;   
} 

}
