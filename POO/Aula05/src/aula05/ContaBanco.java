
package aula05;
public class ContaBanco {
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
   
   public void estadoAtual(){
       System.out.println("--------------------------");
       System.out.println("conta:"+ this.getNumConta());
       System.out.println("tipo:"+ this.getTipo());
       System.out.println("dono:"+ this.getDono());
       System.out.println("saldo:"+ this.getSaldo());
       System.out.println("status:"+ this.getStatus());
   }
   
   public void abrirConta(String t){
     this.setTipo(t);
     this.setStatus(true);
       if (t == "CC") {
        this.setSaldo(50);
       } else if(t == "CP"){
          this.setSaldo(150);
       }
       System.out.println("conta aberta com sucesso");
   }
   public void fecharConta(){
     if(this.getSaldo()>0){
         System.out.println("conta n pode ser fechada pq ainda tem dinheiro");
     } else if(this.getSaldo()<0){
         System.out.println("conta n pode ser fechada pq tem debito");
     } else{
       this.setStatus(false);
     }
   }
   public void depositar(float v){
       if(this.getStatus()==true){
         this.setSaldo(this.getSaldo()+ v);
           System.out.println("deposito realizado");
       }else{
           System.out.println("impossivel depositar numa conta fechada");
       }
       
   }
   public void sacar(float v){
     if (this.getStatus()==true){
       if(this.getSaldo()>= v){
           this.setSaldo(this.getSaldo()- v);
           System.out.println("saque realizado");
       } else{
           System.out.println("saldo insuficiente para saque");
       } 
     }else{
         System.out.println("impossivel sacar de uma conta fechada");
     }
   }
   public void pagarMensal(){
     int v=0;
     if(this.getTipo()=="CC"){
         v=12;
     }else{
         v=20;
     }if(this.getStatus()==true){
         this.setSaldo(this.getSaldo()-v);
         System.out.println("mensalidade paga");
     }else{
         System.out.println("impossivel pagar uma conta fechada");
     }
   }

    public ContaBanco() {
    this.saldo=0;
    this.status=false;
    }
   
   public void setNumConta(int n){
       this.numConta = n;
   }
   public int getNumConta(){
       return this.numConta;
   }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
   
   
}

