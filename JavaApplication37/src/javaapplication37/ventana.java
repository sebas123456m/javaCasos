/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 57320
 */
public class ventana extends JFrame{
    public ventana(){
        setSize(500, 500); // Establecemos la dimension de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Menu de opciones Estructura de datos");
        //setLocation(300,200); colocamos donde queremos que se vea la pantalla
        setLocationRelativeTo(null); // colocamos la ventana en el centro
        paneles();
    }
    public void paneles(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Bienvenido al menu de estructura de datos");
        panel.add(etiqueta);
    }
    
}
