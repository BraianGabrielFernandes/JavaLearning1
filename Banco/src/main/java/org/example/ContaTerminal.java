package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

        System.out.println("Por favor, digite o número da conta: ");
        numero = input.nextInt();
        System.out.println("Digite o número da agencia com o '-' 000-0");
        agencia = input.next();
        System.out.println("Digite o nome do cliente");
        nomeCliente = input.next();
        System.out.println("Saldo: ");
        saldo = input.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
