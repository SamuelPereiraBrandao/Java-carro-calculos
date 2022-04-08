/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apconsumo;

import java.util.Scanner;

/**
 *
 * @author biblioteca
 */
public class ApConsumo {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantos Km rodou? ");
        int km = scan.nextInt();
        System.out.print("Quantos Litros usou? ");
        float litros = scan.nextFloat();
        System.out.print("Qual o valor pago no combustivel(R$)? ");
        float valor = scan.nextFloat();
        
        Carro car = new Carro(km, litros);
        car.setPreco(valor);
        System.out.println(car);
        
        
    }
    
}
