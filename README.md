# 🧮 Clase MultiplicacionArantzaAlcazar

🚀 **Descripción**  
La clase `MultiplicacionArantzaAlcazar` es una herramienta diseñada para realizar operaciones de **multiplicación** y **potenciación**. Incluye un **menú interactivo** que permite al usuario elegir entre diferentes opciones de operaciones matemáticas relacionadas con la multiplicación. Esta clase forma parte de un proyecto más amplio de una calculadora interactiva desarrollada en Java.

---

## 🛠️ **Funcionalidades de la Clase**

### **Métodos Principales**
La clase `MultiplicacionArantzaAlcazar` proporciona los siguientes métodos:

1. **Multiplicar dos números reales**:
  - Realiza la multiplicación de dos números de tipo `double`.
  - Ejemplo:
    ```java
    double resultado = multiplicarDosReales(2.5, 3.5);
    ```

2. **Multiplicar dos números enteros**:
  - Realiza la multiplicación de dos números de tipo `int`.
  - Ejemplo:
    ```java
    int resultado = multiplicarDosEnteros(4, 5);
    ```

3. **Multiplicar tres números reales**:
  - Realiza la multiplicación de tres números de tipo `double`.
  - Ejemplo:
    ```java
    double resultado = multiplicarTresReales(1.2, 2.3, 3.4);
    ```

4. **Calcular la potencia de un número real**:
  - Calcula la potencia de un número de tipo `double` elevado a un exponente de tipo `int`.
  - Ejemplo:
    ```java
    double resultado = calcularPotencia(2.0, 3); // 2.0^3 = 8.0
    ```

5. **Menú interactivo**:
  - Muestra un menú que permite al usuario seleccionar entre las diferentes operaciones de multiplicación y potenciación.
  - Ejemplo de uso:
    ```java
    MultiplicacionArantzaAlcazar multiplicacion = new MultiplicacionArantzaAlcazar();
    multiplicacion.menuMultiplicacion();
    ```

---

## 📋 **Requisitos**

Para utilizar esta clase, asegúrate de cumplir con los siguientes requisitos:

- **Java 8 o superior**: Es necesario tener instalada una versión compatible de Java.
- **Clases adicionales**: Todas las clases relacionadas (como `Main`, `Validate`, etc.) deben estar implementadas y disponibles en el mismo paquete.

---

## ⚠️ **Notas Importantes**

- **Entrada de datos**: Se utiliza la clase `Scanner` para capturar la entrada del usuario.
- **Manejo de excepciones**: Se implementan validaciones para asegurar que las entradas sean correctas y evitar errores durante la ejecución.
- **Ciclo del programa**: El menú continuará ejecutándose hasta que el usuario seleccione la opción de salir.

---

## 🖥️ **Ejemplo de Uso**

A continuación, se muestra un ejemplo básico de cómo utilizar la clase `MultiplicacionArantzaAlcazar`:

```java
public class Main {
    public static void main(String[] args) {
        MultiplicacionArantzaAlcazar multiplicacion = new MultiplicacionArantzaAlcazar();
        multiplicacion.menuMultiplicacion();
    }
}
📂 Estructura del Proyecto
Copy
/calculadora-interactiva
│
├── /src
│   ├── /com
│   │   ├── /tudominio
│   │   │   ├── MultiplicacionArantzaAlcazar.java  # Clase de multiplicación
│   │   │   ├── Main.java                         # Punto de entrada del programa
│   │   │   ├── Validate.java                     # Clase para validar entradas
│
├── README.md                                     # Este archivo
✒️ Autor
Nombre: Tu Nombre

Curso: 1º DAM

Asignatura: Entornos de Desarrollo

¡Disfruta usando la clase de multiplicación! 🎉