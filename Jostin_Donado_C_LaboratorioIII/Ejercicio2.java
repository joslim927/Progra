import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            System.out.println("\n========== MENÚ PRINCIPAL - POO BÁSICA ==========");
            System.out.println("1. Clases Base y Encapsulamiento");
            System.out.println("2. Validaciones en Setters y Métodos");
            System.out.println("3. Lógica de Negocio y Métodos");
            System.out.println("4. Gestión de Objetos y Colecciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcionPrincipal = leerEntero();

            switch (opcionPrincipal) {
                case 1:
                    menuModulo1();
                    break;
                case 2:
                    menuModulo2();
                    break;
                case 3:
                    menuModulo3();
                    break;
                case 4:
                    menuModulo4();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionPrincipal != 0);
    }

    // ==========================================
    // MÓDULO 1: CLASES BASE Y ENCAPSULAMIENTO
    // ==========================================
    private static void menuModulo1() {
        int opcion;
        do {
            System.out.println("\n--- 1. Clases Base y Encapsulamiento ---");
            System.out.println("1. Ejercicio Persona (Atributos, Getter/Setter)");
            System.out.println("2. Ejercicio Producto (Precio encapsulado)");
            System.out.println("3. Ejercicio Empleado (Salario encapsulado)");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    Persona p = new Persona("Carlos Perez", 25);
                    p.mostrarInformacion();
                    break;
                case 2:
                    Producto prod = new Producto("Laptop", 1200.50);
                    prod.mostrarInformacion();
                    break;
                case 3:
                    Empleado emp = new Empleado("Ana Gomez", 2500.00);
                    emp.mostrarInformacion();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // ==========================================
    // MÓDULO 2: VALIDACIONES EN SETTERS Y MÉTODOS
    // ==========================================
    private static void menuModulo2() {
        int opcion;
        do {
            System.out.println("\n--- 2. Validaciones en Setters y Métodos ---");
            System.out.println("1. Validar Edad (Persona)");
            System.out.println("2. Validar Precio (Producto)");
            System.out.println("3. Validar Salario (Empleado)");
            System.out.println("4. Validar Notas (Estudiante)");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    Persona p = new Persona("Luis", 20);
                    System.out.print("Ingrese una nueva edad para probar validación: ");
                    int edad = leerEntero();
                    p.setEdad(edad);
                    p.mostrarInformacion();
                    break;
                case 2:
                    Producto prod = new Producto("Teclado", 50.0);
                    System.out.print("Ingrese un nuevo precio para probar validación: ");
                    double precio = leerDouble();
                    prod.setPrecio(precio);
                    prod.mostrarInformacion();
                    break;
                case 3:
                    Empleado emp = new Empleado("Marta", 1800.0);
                    System.out.print("Ingrese un nuevo salario para probar validación: ");
                    double salario = leerDouble();
                    emp.setSalario(salario);
                    emp.mostrarInformacion();
                    break;
                case 4:
                    Estudiante est = new Estudiante("Juan");
                    System.out.print("Ingrese una nota para probar validación (0-100): ");
                    double nota = leerDouble();
                    est.agregarNotaValidada(nota);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // ==========================================
    // MÓDULO 3: LÓGICA DE NEGOCIO Y MÉTODOS
    // ==========================================
    private static void menuModulo3() {
        CuentaBancaria cuentaPrueba = new CuentaBancaria("001-9876", 500.0);
        int opcion;

        do {
            System.out.println("\n--- 3. Lógica de Negocio y Métodos ---");
            System.out.println("1. Cuenta bancaria (Depositar)");
            System.out.println("2. Cuenta bancaria (Retirar con validación)");
            System.out.println("3. Cuenta bancaria (Mostrar Saldo)");
            System.out.println("4. Estudiante (Calcular Promedio)");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.print("Monto a depositar: ");
                    double dep = leerDouble();
                    cuentaPrueba.depositar(dep);
                    break;
                case 2:
                    System.out.print("Monto a retirar: ");
                    double ret = leerDouble();
                    cuentaPrueba.retirar(ret);
                    break;
                case 3:
                    cuentaPrueba.consultarSaldo();
                    break;
                case 4:
                    Estudiante est = new Estudiante("Maria");
                    est.agregarNotaValidada(85);
                    est.agregarNotaValidada(90);
                    est.agregarNotaValidada(78);
                    est.mostrarPromedio();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // ==========================================
    // MÓDULO 4: GESTIÓN DE OBJETOS Y COLECCIONES
    // ==========================================
    private static void menuModulo4() {
        int opcion;
        do {
            System.out.println("\n--- 4. Gestión de Objetos y Colecciones ---");
            System.out.println("1. Instanciación múltiple (Crear y gestionar varios objetos)");
            System.out.println("2. Lista de productos (Gestionar ArrayList de Producto)");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Creando e imprimiendo múltiples objetos ---");
                    Persona p1 = new Persona("Sofia", 22);
                    Empleado e1 = new Empleado("Roberto", 3200.0);
                    CuentaBancaria c1 = new CuentaBancaria("ACC-101", 1000.0);

                    p1.mostrarInformacion();
                    e1.mostrarInformacion();
                    c1.consultarSaldo();
                    break;
                case 2:
                    gestionarListaProductos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void gestionarListaProductos() {
        List<Producto> inventario = new ArrayList<>();
        inventario.add(new Producto("Monitor", 250.0));
        inventario.add(new Producto("Mouse", 25.0));
        inventario.add(new Producto("Silla Gamer", 180.0));

        System.out.println("\n--- Recorriendo Lista de Productos ---");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.print("Índice [" + i + "] - ");
            inventario.get(i).mostrarInformacion();
        }
    }

    // ==========================================
    // MÉTODOS AUXILIARES DE LECTURA POR CONSOLA
    // ==========================================
    private static int leerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next();
        }
        int val = scanner.nextInt();
        scanner.nextLine(); // Limpiar búfer
        return val;
    }

    private static double leerDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Por favor, ingrese un número decimal válido: ");
            scanner.next();
        }
        double val = scanner.nextDouble();
        scanner.nextLine(); // Limpiar búfer
        return val;
    }
}

// ============================================================================
// CLASES DE APOYO CON ENCAPSULAMIENTO Y VALIDACIONES
// ============================================================================

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println(" [ERROR] La edad no puede ser negativa. No se actualizó.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Persona -> Nombre: " + nombre + " | Edad: " + edad);
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println(" [ERROR] El precio debe ser estrictamente positivo (> 0). No se actualizó.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Producto -> Nombre: " + nombre + " | Precio: $" + precio);
    }
}

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println(" [ERROR] El salario debe ser mayor a cero. No se actualizó.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Empleado -> Nombre: " + nombre + " | Salario: $" + salario);
    }
}

class Estudiante {
    private String nombre;
    private List<Double> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNotaValidada(double nota) {
        if (nota >= 0 && nota <= 100) {
            notas.add(nota);
            System.out.println("Nota " + nota + " agregada correctamente.");
        } else {
            System.out.println(" [ERROR] La nota debe estar dentro del rango [0 - 100].");
        }
    }

    public void mostrarPromedio() {
        if (notas.isEmpty()) {
            System.out.println("El estudiante " + nombre + " no tiene notas registradas.");
            return;
        }
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        double promedio = suma / notas.size();
        System.out.println("Estudiante: " + nombre + " | Promedio Final: " + promedio);
    }
}

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido. Se inicializó en 0.0");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + ". Nuevo saldo: $" + saldo);
        } else {
            System.out.println(" [ERROR] El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println(" [ERROR] El monto a retirar debe ser positivo.");
        } else if (monto > saldo) {
            System.out.println(" [ERROR] Fondos insuficientes. Intenta retirar $" + monto + " pero solo dispone de $" + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + ". Nuevo saldo: $" + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Saldo actual: $" + saldo);
    }
}
