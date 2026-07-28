import java.util.Scanner;

public class Ejercicio1 {

    static class MiExcepcionPersonalizada extends Exception {
        public MiExcepcionPersonalizada(String mensaje) {
            super(mensaje);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n==========================================");
            System.out.println("      MENU PRINCIPAL - MANEJO DE EXCEPCIONES");
            System.out.println("==========================================");
            System.out.println("1. Manejar y Capturar");
            System.out.println("2. Validar Datos");
            System.out.println("3. Crear y Lanzar");
            System.out.println("4. Pedir y Controlar Flujo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        menuManejarYCapturar();
                        break;
                    case 2:
                        menuValidarDatos();
                        break;
                    case 3:
                        menuCrearYLanzar();
                        break;
                    case 4:
                        menuPedirYControlarFlujo();
                        break;
                    case 0:
                        salir = true;
                        System.out.println("\nPrograma finalizado exitosamente.");
                        break;
                    default:
                        System.out.println("Error: Opcion no valida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero entero valido.");
            }
        }
    }

    // ==========================================
    // 1. MANEJAR Y CAPTURAR
    // ==========================================
    private static void menuManejarYCapturar() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- SUBMENU: 1. MANEJAR Y CAPTURAR ---");
            System.out.println("1. Capturar division por cero");
            System.out.println("2. Convertir texto a numero");
            System.out.println("3. Acceso a arreglos");
            System.out.println("4. Acceso a caracteres");
            System.out.println("5. Mensajes personalizados");
            System.out.println("6. Bloque finally");
            System.out.println("7. Captura multiple (multi-catch)");
            System.out.println("8. Manejo modular");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione un ejercicio: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        try {
                            int a = 10;
                            int b = 0;
                            System.out.println(a / b);
                        } catch (ArithmeticException e) {
                            System.out.println("-> Capturado: Error de division por cero (" + e.getMessage() + ")");
                        }
                        break;
                    case 2:
                        try {
                            int num = Integer.parseInt("abc");
                            System.out.println("Numero: " + num);
                        } catch (NumberFormatException e) {
                            System.out.println("-> Capturado: No se pudo parsear la cadena 'abc' a entero.");
                        }
                        break;
                    case 3:
                        try {
                            int[] arr = {1, 2, 3};
                            int val = arr[5];
                            System.out.println("Valor: " + val);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("-> Capturado: Intento de acceder al indice 5 en arreglo de tamanyo 3.");
                        }
                        break;
                    case 4:
                        try {
                            String texto = "Hola";
                            char c = texto.charAt(10);
                            System.out.println("Caracter: " + c);
                        } catch (StringIndexOutOfBoundsException e) {
                            System.out.println("-> Capturado: Indice de caracter fuera de rango en el String.");
                        }
                        break;
                    case 5:
                        try {
                            int x = 5;
                            int y = 0;
                            System.out.println(x / y);
                        } catch (Exception e) {
                            System.out.println("-> Mensaje Propio: Ocurrio una anomalia matematica en la ejecucion.");
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Ejecutando bloque try...");
                            int res = 10 / 2;
                            System.out.println("Resultado: " + res);
                        } catch (Exception e) {
                            System.out.println("Ocurrio un error.");
                        } finally {
                            System.out.println("-> Bloque 'finally': Este codigo SIEMPRE se ejecuta al final.");
                        }
                        break;
                    case 7:
                        try {
                            String s = obtenerNull();
                            System.out.println(s.length());
                        } catch (ArithmeticException | NullPointerException e) {
                            System.out.println("-> Multi-catch capturo la excepcion: " + e.getClass().getSimpleName());
                        }
                        break;
                    case 8:
                        metodoConManejoInterno();
                        break;
                    case 0:
                        volver = true;
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }

    private static String obtenerNull() {
        return null;
    }

    private static void metodoConManejoInterno() {
        try {
            int n = 50;
            int d = 0;
            System.out.println(n / d);
        } catch (ArithmeticException e) {
            System.out.println("-> Manejo Modular: Excepcion capturada y procesada internamente dentro del metodo.");
        }
    }

    // ==========================================
    // 2. VALIDAR DATOS
    // ==========================================
    private static void menuValidarDatos() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- SUBMENU: 2. VALIDAR DATOS ---");
            System.out.println("1. Edad valida");
            System.out.println("2. Contrasenya minima");
            System.out.println("3. Texto no vacio");
            System.out.println("4. Division segura");
            System.out.println("5. Limite numerico");
            System.out.println("6. Longitud de texto");
            System.out.println("7. Email simple");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione un ejercicio: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        try {
                            validarEdad(-5);
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            validarPassword("123");
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            validarTextoNoVacio("   ");
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            divisionSegura(10, 0);
                        } catch (ArithmeticException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            validarLimiteNumerico(50);
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            validarLongitudTexto("Demasiado largo", 5);
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            validarEmail("correoSinArroba.com");
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 0:
                        volver = true;
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }

    private static void validarEdad(int edad) {
        if (edad < 0) throw new IllegalArgumentException("La edad no puede ser negativa.");
        System.out.println("Edad valida: " + edad);
    }

    private static void validarPassword(String pass) {
        if (pass == null || pass.length() < 8) {
            throw new IllegalArgumentException("La contrasenya debe tener al menos 8 caracteres.");
        }
        System.out.println("Contrasenya valida.");
    }

    private static void validarTextoNoVacio(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacio ni ser nulo.");
        }
        System.out.println("Texto valido: " + texto);
    }

    private static void divisionSegura(int num, int den) {
        if (den == 0) throw new ArithmeticException("Validacion previa: El divisor no puede ser cero.");
        System.out.println("Resultado: " + (num / den));
    }

    private static void validarLimiteNumerico(int num) {
        if (num <= 100) throw new IllegalArgumentException("El numero debe ser mayor a 100.");
        System.out.println("Numero valido: " + num);
    }

    private static void validarLongitudTexto(String texto, int max) {
        if (texto != null && texto.length() > max) {
            throw new IllegalArgumentException("El texto supera el limite permitido de " + max + " caracteres.");
        }
        System.out.println("Longitud correcta.");
    }

    private static void validarEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El email es invalido (debe contener '@' y '.').");
        }
        System.out.println("Email valido: " + email);
    }

    // ==========================================
    // 3. CREAR Y LANZAR
    // ==========================================
    private static void menuCrearYLanzar() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- SUBMENU: 3. CREAR Y LANZAR ---");
            System.out.println("1. Uso de throw");
            System.out.println("2. Simulacion controlada");
            System.out.println("3. Lanzamiento condicional");
            System.out.println("4. Excepcion personalizada (Definicion)");
            System.out.println("5. Lanzar excepcion propia");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione un ejercicio: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        try {
                            throw new RuntimeException("Excepcion lanzada manualmente con 'throw'.");
                        } catch (RuntimeException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Simulando falla de conexion al servidor...");
                            throw new IllegalStateException("Error 500: Conexion interrumpida.");
                        } catch (IllegalStateException e) {
                            System.out.println("-> Simulacion de error controlada: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            comprobarPositivo(-10);
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("-> La clase 'MiExcepcionPersonalizada' extiende de 'Exception' y esta definida como static dentro de Ejercicio1.");
                        break;
                    case 5:
                        try {
                            lanzarMiExcepcion();
                        } catch (MiExcepcionPersonalizada e) {
                            System.out.println("-> Excepcion Propia Capturada: " + e.getMessage());
                        }
                        break;
                    case 0:
                        volver = true;
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }

    private static void comprobarPositivo(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Se recibio un numero negativo (" + num + ").");
        }
    }

    private static void lanzarMiExcepcion() throws MiExcepcionPersonalizada {
        throw new MiExcepcionPersonalizada("Ocurrio un error personalizado de la aplicacion.");
    }

    // ==========================================
    // 4. PEDIR Y CONTROLAR FLUJO
    // ==========================================
    private static void menuPedirYControlarFlujo() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- SUBMENU: 4. PEDIR Y CONTROLAR FLUJO ---");
            System.out.println("1. Validacion de entrada (teclado)");
            System.out.println("2. Numero positivo");
            System.out.println("3. Control de entrada de usuario");
            System.out.println("4. Reintento de lectura (Bucle)");
            System.out.println("5. Menu con manejo de errores");
            System.out.println("0. Volver al menu principal");
            System.out.print("Seleccione un ejercicio: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese un numero entero por teclado: ");
                        try {
                            int num = Integer.parseInt(scanner.nextLine());
                            System.out.println("-> Numero ingresado correctamente: " + num);
                        } catch (NumberFormatException e) {
                            System.out.println("-> Capturado: La entrada no es un numero entero valido.");
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese un numero mayor a cero: ");
                        try {
                            int n = Integer.parseInt(scanner.nextLine());
                            if (n <= 0) {
                                throw new IllegalArgumentException("El numero debe ser mayor a cero.");
                            }
                            System.out.println("-> Numero valido: " + n);
                        } catch (NumberFormatException e) {
                            System.out.println("-> Error: Formato de numero invalido.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("-> Capturado: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese una opcion (ej: A, B o C): ");
                        String entrada = scanner.nextLine();
                        try {
                            if (entrada.trim().isEmpty()) {
                                throw new Exception("Entrada vacia detectada.");
                            }
                            System.out.println("-> Lectura procesada con exito: " + entrada);
                        } catch (Exception e) {
                            System.out.println("-> Control de entrada: " + e.getMessage());
                        }
                        break;
                    case 4:
                        int numeroCorrecto = 0;
                        boolean exito = false;
                        while (!exito) {
                            System.out.print("Ingrese un entero obligatoriamente (reintento automatico): ");
                            try {
                                numeroCorrecto = Integer.parseInt(scanner.nextLine());
                                exito = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada incorrecta. Intente de nuevo.");
                            }
                        }
                        System.out.println("-> Dato obtenido correctamente tras validacion: " + numeroCorrecto);
                        break;
                    case 5:
                        System.out.println("-> Este menu completo (Ejercicio1.java) es el ejemplo funcional de un menu robusto con manejo de errores por consola.");
                        break;
                    case 0:
                        volver = true;
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }
}