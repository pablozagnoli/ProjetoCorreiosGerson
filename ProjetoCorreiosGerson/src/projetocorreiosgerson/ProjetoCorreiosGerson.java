
package projetocorreiosgerson;
import java.util.Scanner;

public class ProjetoCorreiosGerson {

  
    public static void main(String[] args) {
      Scanner  teclado = new Scanner(System.in);
      int   categoria;
      int  preco, peso, altura, largura;
      int  bronze, prata, platina;  
      peso =0;
      altura = 0;
      System.out.println("Digite a sua categoria");
      categoria = teclado.nextInt();
      bronze = 1;
      prata = 2;
      
      
      if (categoria == bronze ){
      
          System.out.println("Digite o peso do produto");
          peso = teclado.nextInt();
          
          System.out.println("Digite a altura do produto");
          altura = teclado.nextInt();
          
          System.out.println("Digite a largura do produto");
          largura = teclado.nextInt();
        }
      
      
      if (categoria == prata){
      System.out.println("Digite o peso do produto");
      peso = teclado.nextInt();
      
      System.out.println("Digite a altura do produto");
      altura = teclado.nextInt();
      
      System.out.println("Digite a largura do produto");
      largura = teclado.nextInt();
      
      }
        System.out.println("O valor da sua tarifa é" + " " + ((peso) * (altura )));
        
        
        
        
        
        
    }
    
}
