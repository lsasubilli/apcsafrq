public class Main{
   private String secret;
   public int scoreGuess(String guess){
      int count = 0;
      for(int i=0;i<secret.length()-guess.length();i++){
         if(guess.equals(secret.substring(i,i+guess.length()))){
            count++;
         }
      }
      return count*guess.length()*guess.length();
   }
   public String findBetterGuess(String guess1, String guess2){
      int x = scoreGuess(guess1);
      int y = scoreGuess(guess2);
      if(x==y){
         int c1 = guess1.compareTo(guess2);
         int c2 = guess2.compareTo(guess1);
         if(c1>c2){
            return guess1;
         }else{
            return guess2;
         }
      }
      if(x>y){
         return guess1;
      }else{
         return guess2;
      }
   }
}
