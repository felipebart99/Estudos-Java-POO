            //polimorfismo de sobrecarga
package aula13;
public class Aula13 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        
        c.reagir("ola");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(2,12.5f);
        
        
    }
    
}
