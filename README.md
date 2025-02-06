**Calculadora: Clase Resta**

**Descripción**

Este proyecto contiene una clase en Java llamada Resta_SamanthaMohedano, que permite realizar diversas operaciones de resta sobre números reales y enteros. Además, incluye un menú interactivo que permite al usuario elegir entre diferentes opciones de operaciones matemáticas de resta.


**Funcionalidades**
- Resta de dos números reales.  
- Resta de dos números enteros.  
- Resta de tres números reales.
- Resta acumulada de un valor.

El programa valida las entradas del usuario, garantizando que se ingresen valores válidos y no nulos. Además, maneja excepciones si se intenta realizar una operación con valores no permitidos, como null o 0.


**Características**

- Interfaz interactiva con un menú que permite elegir la operación de resta. 
- Validación de entradas para asegurar que el usuario ingrese números válidos. 
- Excepciones controladas para gestionar situaciones como valores nulos o entradas inválidas.


**Requisitos**

- JDK 8 o superior.
- Un editor de código (como IntelliJ IDEA, Eclipse o cualquier editor de texto).


**Instalación**

- Paso 1: Clona el repositorio
Clona el repositorio a tu máquina local usando el siguiente comando:
git clone https://github.com/usuario/AD2_Javadoc_JUnit.git

- Paso 2: Compila el proyecto
Una vez clonado el repositorio, abre el archivo Java en tu IDE favorito y compílalo. Si prefieres usar la línea de comandos, puedes usar los siguientes comandos: cd ruta/al/repositorio
javac Resta_SamanthaMohedano.java

- Paso 3: Ejecuta el programa 
Para ejecutar el programa, usa el siguiente comando en la terminal:
java Resta_SamanthaMohedano


**Uso** 

Al ejecutar el programa, se te presentará un menú interactivo en la consola con las siguientes opciones:

Selecciona una opción
1. Resta dos reales
2. Resta dos enteros
3. Resta tres reales
4. Resta acumulada
5. Salir 

Dependiendo de la opción que elijas, el programa pedirá que ingreses los números correspondientes y luego mostrará el resultado de la operación seleccionada.


**Ejemplo de código**

public class Resta_SamanthaMohedano {

    private double acum = 0;

    // Constructor
    public Resta_SamanthaMohedano() {
        super();
    }

    // Método que muestra el menú
    public void menuResta() {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int opcion = 0;

        do {
            System.out.println("Selecciona una opción");
            System.out.println("1. Resta dos reales");
            System.out.println("2. Resta dos enteros");
            System.out.println("3. Resta tres reales");
            System.out.println("4. Resta acumulada");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("La resta de tus dos números reales es: " +
                            restaDosReales(valida.validateIsDouble(), valida.validateIsDouble()));
                    break;
                case 2:
                    System.out.println("La resta de tus dos números enteros es: " +
                            restaDosEnteros(valida.validateIsInteger(), valida.validateIsInteger()));
                    break;
                case 3:
                    System.out.println("La resta de tus tres números reales es: " +
                            restaTresReales(valida.validateIsDouble(), valida.validateIsDouble(), valida.validateIsDouble()));
                    break;
                case 4:
                    System.out.println("El valor acumulado después de la resta es: " +
                            restaValorAcumulado(valida.validateIsDouble()));
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (!salida);
    }

    // Métodos de resta
    public double restaDosReales(Double a, Double b) { ... }
    public int restaDosEnteros(Integer a, Integer b) { ... }
    public double restaTresReales(Double a, Double b, Double c) { ... }
    public double restaValorAcumulado(Double num) { ... }
}

**Contribuciones**

¡Las contribuciones son bienvenidas! Si deseas contribuir al proyecto, sigue estos pasos:

- Haz un fork del repositorio. 
- Crea una nueva rama (git checkout -b feature/nueva-caracteristica)
- Realiza tus cambios y haz commit (git commit -am 'Añadir nueva característica'). 
- Haz push a tu rama (git push origin feature/nueva-caracteristica). 
- Abre un pull request.

**Licencia**

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.