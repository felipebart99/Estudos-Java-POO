            //polimorfismo de sobreposiçao
package aula12;
public class Aula12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        k.locomover();
        k.emitirSom();
        c.locomover();
        c.emitirSom();
        p.locomover();
        a.locomover();
    }
    
}
