/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contaunica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class ContaUnica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao, numero, numero2;
        double valor;
        ArrayList<Conta> lc = new ArrayList();
        Conta c1, c2;
        
        do{
            System.out.println("");
            System.out.println("--- MENU ---");
            System.out.println("");
            System.out.println("1) Criar Conta");
            System.out.println("2) Dados Bancários");
            System.out.println("3) Depósito");
            System.out.println("4) Saque");
            System.out.println("5) Transferência");
            System.out.println("0) Sair");
            System.out.println("");
            
            System.out.print("Opção: ");
            opcao = in.nextInt();
            in.nextLine();
            
            
            switch(opcao){
               
                case 1: 
                    
                    System.out.println("Digite o nome do titular: ");
                    aux = in.nextLine();
                    
                    c1 = new Conta(aux);
                    lc.add(c1);
                    
                    System.out.println("Conta criada com sucesso!");
                    
                        break;
                        
                case 2: 
                   
                    System.out.println("Digite o número da conta: ");
                    numero = in.nextInt();
                    
                    c1 = lc.get(numero-1);
                    c1.DadosBancarios(); 
                    
                        break;
                        
                case 3: 
                    
                    System.out.println("Digite o número da conta: ");
                    numero = in.nextInt();
                    
                    c1 = lc.get(numero-1);
                    
                    System.out.println("Digite o valor do depósito: ");
                    valor = in.nextDouble();
                
                    c1.Depositar(valor);
                    break;
                
                case 4: 
                    System.out.println("Digite o número da conta: ");
                    numero = in.nextInt();
                    
                    c1 = lc.get(numero-1);
                    
                    System.out.println("Digite o valor do saque: ");
                    valor = in.nextDouble();
                
                    c1.Sacar(valor);
                    
                        break;
                
                case 5: 
                    System.out.println("Digite o número da conta de origem: ");
                    numero = in.nextInt();
                    c1 = lc.get(numero-1);
                    
                    System.out.println("Digite o número da conta de destino: ");
                    numero2 = in.nextInt();
                    c2 = lc.get(numero2-1);
                    
                    System.out.println("Digite o valor da transferência: ");
                    valor = in.nextDouble();
                
                    c1.Transferir(c2, valor);
                    
                        break;
                
                default:
                    if(opcao != 0)
                        System.out.println("Opção Inválida");
                        
                        System.out.println("");
                        break;
            }
           
        }while(opcao != 0);
    }
}
