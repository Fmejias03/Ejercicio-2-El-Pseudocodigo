import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Ejercicio3 {
       /*¿Qué hace este algoritmo?

Algo QueHace
# ¿Qué hace este algoritmo?
Variable valor1, valor2: real
Inicio
   valor1 <- enter("Introduza un valor: ")
   valor2 <- enter("Introduza otro valor: ")
   # tratamiento
   valor1 <- valor2
   valor2 <- valor1
   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)
Fin */

public static void main(String[] args) {
    double valor1, valor2;
    valor1 = parseDouble(JOptionPane.showInputDialog("Introduza un valor: "));
    valor2 = parseDouble(JOptionPane.showInputDialog("Introduza otro valor: "));
    // tratamiento
    valor1 = valor2;
    valor2 = valor1;
    JOptionPane.showMessageDialog(null, "valor1 = " + valor1 + "; valor2 = " + valor2);
}
//Este codigo pide al usuario el valor de 1 y 2 mediante un Dialog y despues los muestra en la consola.

}
