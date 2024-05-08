/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author manuel
 */
public class Main {

    public static void main(String[] args) {

        operativa_cuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0, 2000);

    }

    static void operativa_cuenta(String nombre, String cuenta, double saldo, double tipo, float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta(nombre, cuenta, saldo, tipo);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
