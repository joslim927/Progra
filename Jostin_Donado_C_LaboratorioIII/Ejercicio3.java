import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcionPrincipal;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL: NIVEL 3 POO ===");
            System.out.println("1. Herencia");
            System.out.println("2. Polimorfismo");
            System.out.println("3. Abstracción");
            System.out.println("4. Integración");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = pedirEntero();

            switch (opcionPrincipal) {
                case 1:
                    menuHerencia();
                    break;
                case 2:
                    menuPolimorfismo();
                    break;
                case 3:
                    menuAbstraccion();
                    break;
                case 4:
                    menuIntegracion();
                    break;
                case 5:
                    System.out.println("¡Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionPrincipal != 5);
    }

    private static int pedirEntero() {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // ==========================================
    // 1. HERENCIA
    // ==========================================
    static class Animal {
        public void sonido() {
            System.out.println("El animal hace un sonido genérico.");
        }
    }

    static class Perro extends Animal {
        @Override
        public void sonido() {
            System.out.println("El Perro dice: ¡Guau, guau!");
        }
    }

    private static void menuHerencia() {
        int opcion;
        do {
            System.out.println("\n--- SUBMENÚ: HERENCIA ---");
            System.out.println("1. Crear clase Animal");
            System.out.println("2. Crear clase Perro que herede de Animal");
            System.out.println("3. Agregar/Sobrescribir método sonido()");
            System.out.println("4. Crear objeto y probar");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = pedirEntero();

            switch (opcion) {
                case 1:
                    System.out.println("-> Se ha definido la clase base 'Animal' con el método sonido().");
                    break;
                case 2:
                    System.out.println("-> Se ha definido la clase 'Perro' extendiendo de 'Animal'.");
                    break;
                case 3:
                    System.out.println("-> El método sonido() de 'Perro' se ha sobrescrito con @Override.");
                    break;
                case 4:
                    System.out.println("-> Probando objeto Perro:");
                    Animal miPerro = new Perro();
                    miPerro.sonido();
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // ==========================================
    // 2. POLIMORFISMO
    // ==========================================
    static class Gato extends Animal {
        @Override
        public void sonido() {
            System.out.println("El Gato dice: ¡Miau, miau!");
        }
    }

    private static void menuPolimorfismo() {
        int opcion;
        List<Animal> animales = new ArrayList<>();

        do {
            System.out.println("\n--- SUBMENÚ: POLIMORFISMO ---");
            System.out.println("1. Crear clase Gato que herede de Animal");
            System.out.println("2. Sobrescribir método sonido() en Gato");
            System.out.println("3. Crear lista de animales");
            System.out.println("4. Recorrer lista y ejecutar métodos");
            System.out.println("5. Ejecutar un mismo método en distintos objetos");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = pedirEntero();

            switch (opcion) {
                case 1:
                case 2:
                    System.out.println("-> Clase 'Gato' lista, hereda de 'Animal' y sobrescribe sonido().");
                    break;
                case 3:
                    animales.clear();
                    animales.add(new Perro());
                    animales.add(new Gato());
                    animales.add(new Animal());
                    animales.add(new Perro());
                    System.out.println("-> Lista creada e inicializada con varios animales.");
                    break;
                case 4:
                case 5:
                    if (animales.isEmpty()) {
                        System.out.println("-> Inicializando la lista automáticamente...");
                        animales.add(new Perro());
                        animales.add(new Gato());
                        animales.add(new Animal());
                    }
                    System.out.println("-> Ejecutando sonido() de forma polimórfica en la lista:");
                    for (Animal a : animales) {
                        a.sonido();
                    }
                    break;
                case 6:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    // ==========================================
    // 3. ABSTRACCIÓN
    // ==========================================
    abstract static class Figura {
        public abstract double area();
    }

    static class Cuadrado extends Figura {
        private double lado;

        public Cuadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double area() {
            return lado * lado;
        }
    }

    static class Circulo extends Figura {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double area() {
            return Math.PI * radio * radio;
        }
    }

    private static void menuAbstraccion() {
        int opcion;
        do {
            System.out.println("\n--- SUBMENÚ: ABSTRACCIÓN ---");
            System.out.println("1. Crear clase abstracta Figura");
            System.out.println("2. Método abstracto area()");
            System.out.println("3. Crear clase Cuadrado e implementar área");
            System.out.println("4. Crear clase Circulo e implementar área");
            System.out.println("5. Probar cálculo de áreas");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = pedirEntero();

            switch (opcion) {
                case 1:
                case 2:
                    System.out.println("-> Definida la clase abstracta 'Figura' con método abstracto 'area()'.");
                    break;
                case 3:
                    Figura c = new Cuadrado(4);
                    System.out.println("-> Cuadrado creado (lado = 4). Área calculada: " + c.area());
                    break;
                case 4:
                    Figura cir = new Circulo(3);
                    System.out.println("-> Círculo creado (radio = 3). Área calculada: " + String.format("%.2f", cir.area()));
                    break;
                case 5:
                    Figura f1 = new Cuadrado(5);
                    Figura f2 = new Circulo(2.5);
                    System.out.println("-> Prueba Cuadrado (lado=5): " + f1.area());
                    System.out.println("-> Prueba Círculo (radio=2.5): " + String.format("%.2f", f2.area()));
                    break;
                case 6:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    // ==========================================
    // 4. INTEGRACIÓN
    // ==========================================
    interface Vehiculo {
        void encender();
        void acelerar();
    }

    static class Carro implements Vehiculo {
        @Override
        public void encender() {
            System.out.println("El Carro gira la llave y enciende el motor V6.");
        }

        @Override
        public void acelerar() {
            System.out.println("El Carro avanza presionado el pedal de aceleración.");
        }
    }

    static class Moto implements Vehiculo {
        @Override
        public void encender() {
            System.out.println("La Moto presiona el botón de encendido eléctrico.");
        }

        @Override
        public void acelerar() {
            System.out.println("La Moto acelera girando el puño derecho.");
        }
    }

    private static void menuIntegracion() {
        int opcion;
        do {
            System.out.println("\n--- SUBMENÚ: INTEGRACIÓN ---");
            System.out.println("1. Usar varias figuras en lista y calcular áreas con polimorfismo");
            System.out.println("2. Crear interfaz Vehículo e implementar en Carro");
            System.out.println("3. Implementar interfaz Vehículo en Moto");
            System.out.println("4. Probar comportamiento de Vehículos");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = pedirEntero();

            switch (opcion) {
                case 1:
                    List<Figura> figuras = new ArrayList<>();
                    figuras.add(new Cuadrado(3));
                    figuras.add(new Circulo(2));
                    figuras.add(new Cuadrado(6));

                    System.out.println("-> Calculando áreas con polimorfismo en la lista:");
                    for (int i = 0; i < figuras.size(); i++) {
                        System.out.println("Figura " + (i + 1) + " Área: " + String.format("%.2f", figuras.get(i).area()));
                    }
                    break;
                case 2:
                    System.out.println("-> Creada la interfaz 'Vehiculo' e implementada en la clase 'Carro'.");
                    break;
                case 3:
                    System.out.println("-> Implementada la interfaz 'Vehiculo' en la clase 'Moto'.");
                    break;
                case 4:
                    List<Vehiculo> garaje = new ArrayList<>();
                    garaje.add(new Carro());
                    garaje.add(new Moto());

                    System.out.println("-> Probando interfaz Vehículo polimórficamente:");
                    for (Vehiculo v : garaje) {
                        v.encender();
                        v.acelerar();
                        System.out.println("---");
                    }
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}