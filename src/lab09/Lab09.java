/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09;

import java.util.ArrayList;
import java.util.List;
import lab09.entidades.Estudiante;
import lab09.pantallas.PantallaListaEstudiantes;

/**
 *
 * @author Estudiante
 */
public class Lab09 {

    /**
     * @param args the command line arguments
     */
    
    public static List<Estudiante> listaEstudianteGlobal = new ArrayList<>();
    
    public static void main(String[] args) {
        
        PantallaListaEstudiantes pantallaInicial = new PantallaListaEstudiantes();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
        
    }
    
}
