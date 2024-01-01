import java.util.ArrayList;
public class Main{
   private ArrayList<Main> memberList;
   public static void main(String[]args){

   }
   public void addMembers(String[]names, int gradYear){
      memberList = new ArrayList<Main>();
      for(int i=0;i<names.length;i++){
         memberList.add(new Main(names[i], gradYear, true));
      }
   }
   public ArrayList<MemberInfo> removeMembers(int year){
      ArrayList<MemberInfo> newList = new ArrayList<MemberInfo>();
      for(int i=memberList.size()-1;i>=0;i--)
      {
         if(memberList.get(i).getGradYear()<=year && memberList.get(i).inGoodStanding()){
            newList.add(memberList.get(i));
            memberList.remove(i);
            continue;
      }
         return newList;
   }
}
   
