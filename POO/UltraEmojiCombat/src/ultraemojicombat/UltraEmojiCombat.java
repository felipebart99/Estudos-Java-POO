
package ultraemojicombat;


public class UltraEmojiCombat {

    
    public static void main(String[] args) {
       Lutador l[] = new Lutador[5];
        
        l[0] = new Lutador("McGregor","Irlanda",31,1.75f,68.9f,11,2,1);
        l[1] = new Lutador("Anderson Silva","Brasil",29,2.68f,57.8f,14,2,3);
        l[2] = new Lutador("Floyd Mayweather","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador("Jon Jones","EUA",28,1.93f,81.6f,13,0,2);
        l[4] = new Lutador("Minotauro","Brasil",37,1.70f,119.3f,5,4,3);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
        l[0].status();
        l[1].status();
    }
    
}
