

package reviewnight.review1;

import java.util.Scanner;

// Rev1

// public class CtrlPrograma {
    
//     public static int contaVogais(String texto){
//         int contador = 0;
//         for(int i = 0; i < texto.length(); i++){
//             char c = texto.charAt(i);
//             if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
//                 contador++;
//         }
//         return contador;
//     }

//     public static boolean ehPar(int numero){
//         if(numero % 2 == 0)
//             return true;
//         return false;
        
//     }

//     public static void main(String[] args){
//         Scanner teclado = new Scanner(System.in);

//         System.out.println("Entre com um texto:");
//         String frase = teclado.nextLine();
//         System.out.println("o texto poussui " + contaVogais(frase)+ "vogais!");

//         System.out.println("Entre com um valor:");
//         int valor = teclado.nextInt();
//         if(ehPar(valor))
//             System.out.println(valor + " é um nnumero par");
//         else
//             System.out.println(valor + " é um numero impar");
//     }

// }

// Rev2

// public class CtrlPrograma{

//     public static int contaConsoante(String texto){
//         int contador = 0;
//         for(int i = 0; i < texto.length(); i++){
//             char x = Character.toLowerCase(texto.charAt(i));
//             if(Character.isLetter(x) && !"aeiou".contains(String.valueOf(x)))
//                 contador++;
//         }

//         return contador;
//     }

//     public static boolean ehMultiploDeTres(int valor){
//         if(valor % 3 == 0)
//             return true;
//         return false;
//     }

//     public static void main(String[] args){
//         Scanner teclado = new Scanner(System.in);

//         System.out.println("Digite uma palavra: ");
//         String texto = teclado.nextLine();
//         System.out.println("O sistema possui " + contaConsoante(texto) + " consoantes!");

//         System.out.println("Digite um numero");
//         int valor = teclado.nextInt();
//         if(ehMultiploDeTres(valor))
//             System.out.println(valor + " é multiplo de 3");
//         else
//             System.out.println(valor + " Não é multiplo de 3");

//     }
// }
