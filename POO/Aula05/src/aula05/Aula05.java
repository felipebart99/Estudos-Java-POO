package aula05;
public class Aula05 {
   
    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      p1.setNumConta(1111);
      p1.setDono("jubileu");
      p1.abrirConta("CC");
      p1.estadoAtual();
     
      ContaBanco p2 = new ContaBanco();
      p2.setNumConta(2222);
      p2.setDono("creuza");
      p2.abrirConta("CP");
    }
    
}
