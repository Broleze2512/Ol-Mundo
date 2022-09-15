
package olamundo;


public class OlaMundo {

    
    public static void main(String[] args) {
           EscreverOlaMundo();
           Soma();
           Subtrção();
           Multiplicação();
           Divisão();
    }
    public static void EscreverOlaMundo(){
            System.out.println("Olá Mundo");
       
    }
  public static void Soma(){
      int n1 = 10;
      int n2 = 20;
      
      
      int soma = n1 + n2;
      System.out.println("Resultado Soma:"+ soma);
      
  } 
   public static void Subtrção(){
      int n1 = 5;
      int n2 = 3;
      
      
      int sub = n1 - n2;
      System.out.println("Resultado Subtração:"+ sub);
   }
    public static void Divisão(){
      int n1 = 10;
      int n2 = 2;
      
      
      int div = n1 / n2;
      System.out.println("Resultado Divisão:"+ div);
    }
     public static void Multiplicação(){
      int n1 = 10;
      int n2 = 10;
      
      
      int mult = n1 * n2;
      System.out.println("Resultado Multiplicação:"+ mult);
     }
  
    
    
  
}
