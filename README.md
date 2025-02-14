# 📊 Calculadora Interactiva

## 🚀 Descripción
Esta aplicación es una calculadora interactiva que permite realizar diversas operaciones matemáticas y estadísticas a través de un menú fácil de usar. Los usuarios pueden seleccionar entre diferentes opciones, cada una de las cuales invoca un método específico para realizar la operación deseada.

## 🛠️ Funciones de cada clase

### 1. **Main**
- **Descripción**: Punto de entrada de la aplicación.
- **Funcionalidades**:
  - Presenta un menú interactivo con opciones para realizar operaciones matemáticas y estadísticas.
  - Permite al usuario seleccionar entre las siguientes operaciones:
    1. **SUMA**: Accede al menú de suma.
    2. **RESTA**: Accede al menú de resta.
    3. **PRODUCTO**: Accede al menú de multiplicación.
    4. **COCIENTE**: Accede al menú de división.
    5. **MÓDULO**: Accede al menú de módulo.
    6. **ESTADÍSTICA**: Accede al menú de estadísticas.
    7. **CONVERSIÓN**: Accede al menú de conversión de unidades.
    8. **SALIR**: Termina la ejecución del programa.
- **Ejemplo de uso**:
  ```java
  public static void main(String[] args) {
      // Ejecución del menú interactivo
  }
  ```

### 2. **Suma_JonLandaluce**
- **Descripción**: Clase que proporciona funcionalidades para realizar operaciones de suma.
- **Funcionalidades**:
  - Sumar dos números reales.
  - Sumar dos números enteros.
  - Sumar tres números reales.
  - Mantener un valor acumulado de sumas.
- **Ejemplo de uso**:
  ```java
  Suma_JonLandaluce suma = new Suma_JonLandaluce();
  double resultado = suma.sumaDosNumerosReales(1.3, 3.4);
  ```

### 3. **Resta_SamanthaMohedano**
- **Descripción**: Clase que permite realizar operaciones de resta.
- **Funcionalidades**:
  - Resta dos números reales.
  - Resta dos números enteros.
  - Resta tres números reales.
  - Realiza una resta acumulativa.
- **Ejemplo de uso**:
  ```java
  Resta_SamanthaMohedano resta = new Resta_SamanthaMohedano();
  resta.menuResta();
  ```

### 4. **MultiplicacionArantzaAlcazar**
- **Descripción**: Clase que proporciona métodos para realizar operaciones de multiplicación y potenciación.
- **Funcionalidades**:
  - Multiplicar dos números reales.
  - Multiplicar dos números enteros.
  - Multiplicar tres números reales.
  - Calcular la potencia de un número real.
- **Ejemplo de uso**:
  ```java
  MultiplicacionArantzaAlcazar multiplicacion = new MultiplicacionArantzaAlcazar();
  multiplicacion.menuMultiplicacion();
  ```

### 5. **DivisionCesarAAlcazarRomero**
- **Descripción**: Clase que implementa operaciones relacionadas con la división.
- **Funcionalidades**:
  - Dividir dos números reales.
  - Dividir dos números enteros.
  - Calcular el inverso de un número real.
  - Calcular la raíz cuadrada de un número.
- **Ejemplo de uso**:
  ```java
  DivisionCesarAAlcazarRomero division = new DivisionCesarAAlcazarRomero();
  division.menuDivision();
  ```

### 6. **Modulo_EvaLopez**
- **Descripción**: Clase que proporciona métodos para calcular el módulo y el valor absoluto.
- **Funcionalidades**:
  - Calcular el residuo de la división de dos números enteros.
  - Calcular el valor absoluto de un número real.
- **Ejemplo de uso**:
  ```java
  Modulo_EvaLopez modulo = new Modulo_EvaLopez();
  modulo.menuModulo();
  ```

### 7. **Estadistica_AndreeaIstrate**
- **Descripción**: Clase que proporciona métodos para calcular medidas estadísticas.
- **Funcionalidades**:
  - Calcular la media aritmética de una lista de números.
  - Calcular la varianza de una lista de números.
  - Calcular la desviación estándar de una lista de números.
- **Ejemplo de uso**:
  ```java
  Estadistica_AndreeaIstrate estadistica = new Estadistica_AndreeaIstrate();
  estadistica.menuEstadistica();
  ```

### 8. **ConversionUnidades_BeatrizToledano**
- **Descripción**: Clase que permite realizar conversiones entre diferentes unidades de medida.
- **Funcionalidades**:
  - Convertir de Celsius a Fahrenheit.
  - Convertir de Fahrenheit a Celsius.
  - Convertir de grados a radianes.
  - Convertir de radianes a grados.
- **Ejemplo de uso**:
  ```java
  ConversionUnidades_BeatrizToledano conversor = new ConversionUnidades_BeatrizToledano();
  conversor.menuConversion();
  ```

### 9. **Validate**
- **Descripción**: Clase que proporciona métodos para validar la entrada de números.
- **Funcionalidades**:
  - Validar que el usuario introduzca un número real.
  - Validar que el usuario introduzca un número entero.
- **Ejemplo de uso**:
  ```java
  Validate valida = new Validate();
  Double numeroReal = valida.validateIsDouble();
  Integer numeroEntero = valida.validateIsInteger();
  ```

## 📋 Requisitos
- **Java 8 o superior**: Asegúrate de tener instalada una versión compatible de Java.
- **Clases adicionales**: Todas las clases mencionadas deben estar implementadas y disponibles en el mismo paquete.

## ⚠️ Notas
- Se utiliza un `Scanner` para la entrada de datos del usuario.
- El programa continuará ejecutándose hasta que el usuario seleccione la opción de salir.
- Se manejan excepciones para asegurar que las entradas sean válidas y evitar errores en las operaciones.

¡Disfruta usando la calculadora interactiva! 🎉

