import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

public class GestordeTareas {
   
        class Tarea {
        private String descripcion;
        private int prioridad; // 1 = Alta, 2 = Media, 3 = Baja
    
        public Tarea(String descripcion, int prioridad) {
            this.descripcion = descripcion;
            this.prioridad = prioridad;
        }
    
        public int getPrioridad() {
            return prioridad;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        @Override
        public String toString() {
            return "Tarea: " + descripcion + " | Prioridad: " + (prioridad == 1 ? "Alta" : prioridad == 2 ? "Media" : "Baja");
        }
    }
}