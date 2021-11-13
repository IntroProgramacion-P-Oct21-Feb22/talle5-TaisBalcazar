/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        String descripcion;
        int cantidad_requerida;
        double precio_unitario;
        double porcentaje;
        double descuento;
        double valor_total;
        porcentaje = 15;

        //proceso
        System.out.println("Ingrese la cantidad requerida");
        cantidad_requerida = entrada.nextInt();

        System.out.println("Ingrese el precio unitario del articulo");
        precio_unitario = entrada.nextDouble();

        entrada.nextLine(); //limpieza del buffer

        System.out.println("Ingrese la descripcion del articulo");
        descripcion = entrada.nextLine();

        valor_total = precio_unitario * cantidad_requerida;
        if (cantidad_requerida < 0 || precio_unitario < 0) {
            System.out.println("Los datos ingresados son incorrectos");
        } else {
            if (cantidad_requerida > 50) {
                descuento = (porcentaje * valor_total) / 100;
                valor_total = valor_total - descuento;
            }
            System.out.printf("El valor total a pagar es: %.2f\nDescripcion:%s\n",
                     valor_total, descripcion);

        }

    }
}
