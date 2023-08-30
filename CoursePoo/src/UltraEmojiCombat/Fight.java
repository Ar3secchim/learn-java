package UltraEmojiCombat;
import java.util.Random;

import javax.sound.midi.Soundbank;

public class Fight {
  private Fighter challengedFighter;
  private Fighter challengingFighter;
  private boolean approved = false;


  public Fight(Fighter challengedFighter, Fighter challengingFighter, int rounds) {
    this.challengedFighter = challengedFighter;
    this.challengingFighter = challengingFighter;
    getApproved();
  }

  private Fighter getChallenged(){
    return this.challengedFighter;
  }

   private Fighter getChallengingFighter(){
    return this.challengingFighter;
  }

  public boolean getApproved() {
    return checkFight();
  }

  public boolean setApproved(boolean approved) {
    return this.approved = approved;
  }


  public boolean checkFight() {
    if(getChallenged() == null || getChallengingFighter() == null){
      System.out.println("Jogadores não existe");
      return setApproved(false);
    }else if( getChallenged().getCategory()  != getChallengingFighter().getCategory()) {
      System.out.println("Lutadores com categorias diferentes");
       return setApproved(false);
    } else {
      System.out.println("Luta Marcada");
      return true;
    }
  }

  public void toFight(){
   if(getApproved()){
    System.out.println("HORA DE COMEÇAR A LUTA");

    System.out.println("DESAFIADO");
    System.out.println(this.challengedFighter.toPresent());

    System.out.println("DESAFIANTE");
    System.out.println(this.challengingFighter.toPresent());  

    Random random = new Random();
    int win = random.nextInt(3);

    switch(win){
      case 0 :
        this.challengedFighter.tiedFight();
        this.challengingFighter.tiedFight();
        System.out.println("Empate");
        break;
      case 1 :
        this.challengedFighter.winFight();
        this.challengingFighter.lostFight();
        System.out.println("Vencedor: " + challengedFighter.getName());
        break;
      case 2:
        this.challengedFighter.lostFight();
        this.challengingFighter.winFight();
         System.out.println("Vencedor: " + challengingFighter.getName());
        break;
    }
   }
  }
  
}
