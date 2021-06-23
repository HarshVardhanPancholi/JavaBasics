public class Demo {
 
  public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          String s = scan.nextLine();
          String a[]=s.split("[^a-zA-Z]");
          int count=0;
          for(String h:a){
              if((h.matches("[a-zA-Z]+"))){
               count++;   
              }
          }
          System.out.println(count);
          for(String h:a){
              if(h.matches("[a-zA-Z]+")){
                  System.out.println(h);
              }
          }
          scan.close();
      }
}
