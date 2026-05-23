public class StringBuffers {
 public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer("Poonaam");
    sb.append("Nikam");
    sb.insert(7, " ");     //add space 
    sb.replace(0, 7, "Punnaamm");   //replaca 0 to 7 index with new str
  //  sb.delete(0, 5);   ///delete 1 to 5 index
   // sb.reverse();   ////makiN mmaannuP
   // sb.toString();
   
   System.out.println(sb);
   }   
}
