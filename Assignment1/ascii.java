class codee
{
   void asci() {
       for (int i = 65; i <= 90; i++) 
       { 
           System.out.println(i + " -->  " + (char) i);
       }
   }
}

class ascii {
   public static void main(String args[]) {
       codee obj = new codee(); 
       obj.asci();
   }
}
