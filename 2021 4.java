public class Main{

   public static void main(String[]args){

   }
   public static boolean isNonZero(int[][] array2D, int r){
         for(int k=0;k<array2D[0].length;k++){
            if(array2D[r][k]==0){
               return false;
            }
         }
      return true;
   }
   public static int[][] resize(int[][] array2D){
      int[][] newArray = new int[array2D.length][array2D[0].length];
      int c = 0;
      for(int i=0;i<array2D.length;i++){
         if(isNonZero(array2D,i)){
         for(int j=0;j<array2D[0].length;j++){
            newArray[c][j] = array2D[i][j];
            }
         c++;
         }
      }
return newArray;
   }
}
