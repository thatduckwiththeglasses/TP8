package concurrencia;

class RunnableTest {
    public static void main(String[] args) {
        // Creamos las "tareas"
        RunnableSimple tarea1 = new RunnableSimple("Argentina");
        RunnableSimple tarea2 = new RunnableSimple("Uruguay");

        // Creamos los "trabajadores" (Threads) y les asignamos las tareas
        Thread t1 = new Thread(tarea1, "Argentina"); // Opcional: darle nombre al Thread también
        Thread t2 = new Thread(tarea2, "Uruguay");

        // Los iniciamos
        t1.start();
        t2.start();
        
        System.out.println("Hilos principales lanzados desde main.");
    }
}