package com.library;
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryGUI().setVisible(true));
    }
}

git commit -m "Esto es la clase principal Main que inicia la aplicación de biblioteca ejecutando la interfaz gráfica en el hilo de eventos de Swing. ¿que es swing? Swing es una biblioteca de componentes gráficos para Java que permite crear interfaces de usuario (ventanas, botones, menús) de forma multiplataforma."
