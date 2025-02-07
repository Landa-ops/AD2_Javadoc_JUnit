# 📌 Calculadora en Java

Este proyecto es una calculadora interactiva desarrollada en Java, que permite realizar operaciones de suma y resta. Incluye validaciones de entrada y pruebas unitarias con JUnit.

## 🚀 Instrucciones de Uso

1. Abre el proyecto en tu IDE favorito.
2. Ejecuta la clase `Main.java` para interactuar con la calculadora desde la consola.

Al ejecutar el programa, se mostrará un menú con varias opciones. El usuario podrá seleccionar la operación deseada e ingresar los valores necesarios.

### 📌 Ejemplo de Ejecución
```
========= MENU ==========
1. Suma Dos Números Reales
2. Suma Dos Números Enteros
3. Suma Tres Números Reales
4. Suma Con Valor Acumulado
5. Resta Dos Números Reales
6. Resta Dos Números Enteros
7. Resta Tres Números Reales
8. Resta Acumulada
9. Salir
------------------------
+++ Seleccione la operación +++

Introduzca un número real: 3.5
Introduzca otro número real: 2.7
Resultado: 6.2
```

---
## 🔧 Funcionalidades

### **Suma**
- Suma dos números reales: `sumaDosNumerosReales(Double num1, Double num2)`
- Suma dos números enteros: `sumaDosNumerosEnteros(Integer num1, Integer num2)`
- Suma tres números reales: `sumaTresNumerosReales(Double num1, Double num2, Double num3)`
- Suma con valor acumulado: `sumaValorAcumulado(Double num)`

### **Resta**
- Resta dos números reales: `restaDosReales(Double num1, Double num2)`
- Resta dos números enteros: `restaDosEnteros(Integer num1, Integer num2)`
- Resta tres números reales: `restaTresReales(Double num1, Double num2, Double num3)`
- Resta acumulada: `restaValorAcumulado(Double num)`

---
## 🛠️ Validaciones y Excepciones

El programa valida que los valores ingresados sean:
✅ No nulos
✅ No negativos (cuando aplique)
✅ Números válidos

Si se ingresa un valor incorrecto, se lanza una excepción `IllegalArgumentException`.

---
## 🧪 Tests

El proyecto incluye pruebas unitarias con JUnit para garantizar el correcto funcionamiento de las operaciones.

### 🔹 Para ejecutar las pruebas:
1. Asegúrate de tener **JUnit 5** configurado.
2. Ejecuta la clase de pruebas `TestsSumaCalculadora.java` desde tu IDE.

---
## 📌 Instalación

### 📥 Clonar el repositorio
```sh
git clone https://github.com/usuario/AD2_Javadoc_JUnit.git
```

### 🔧 Compilar el proyecto
Si usas la terminal:
```sh
cd ruta/al/repositorio
javac Main.java
```

### ▶️ Ejecutar el programa
```sh
java Main
```

---
## 📄 Ejemplo de Código

```java
public class Resta_SamanthaMohedano {

    private double acum = 0;

    public void menuResta() {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int opcion;

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
                    System.out.println("Resultado: " + restaDosReales(5.0, 3.2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restaDosEnteros(8, 4));
                    break;
                case 3:
                    System.out.println("Resultado: " + restaTresReales(9.5, 2.3, 1.2));
                    break;
                case 4:
                    System.out.println("Acumulado: " + restaValorAcumulado(2.0));
                    break;
                case 5:
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!salida);
    }
}
```

---
## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Para contribuir:

1. Realiza un **fork** del repositorio.
2. Crea una **nueva rama** (`git checkout -b feature/nueva-caracteristica`).
3. Realiza los cambios y haz **commit** (`git commit -am 'Añadir nueva característica'`).
4. Haz **push** a la rama (`git push origin feature/nueva-caracteristica`).
5. Abre un **Pull Request**.

---
## 📜 Licencia

Este proyecto está bajo la **Licencia MIT**. Consulta el archivo `LICENSE` para más detalles.

---
### 💡 Autor: Samantha Mohedano

