package saldo;
/*Escreva um programa em Java calcule o valor do saldo de um artigo, sabendo-se que os descontos são feitos em função do preço e segundo a seguinte tabela: 

 

Preço                                             Desconto 

P>10000                                           40% 

5000 < P <= 10000                         20% 

2500 < P <= 5000                            10% 

Outros                                               5%  */
 
import java.util.Scanner;
public class saldopr {
public static void main(String[] args) {
    double p,des;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o antigo valor do produto: ");
    p = ler.nextDouble();
    if (p>1000) {
    des = (p * 0.4);
    System.out.printf("O novo preço seria " + des);
    }else if (5000 < p && p <= 10000){
        des = (p *0.2);
        System.out.println("O novo preço sera: " + des);
    }else if (2500 < p && p <= 5000){
        des = (p * 0.1);
        System.out.println("O novo preço sera de " + des);
    }else{
    des = (p * 0.05);
    System.out.println("O novo preço seria de: " + des);
    }

}
}
