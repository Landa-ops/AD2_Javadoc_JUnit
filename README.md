# :globe_with_meridians: Clase `ConversionUnidades_BeatrizToledano`

La clase `ConversionUnidades_BeatrizToledano` permite realizar conversiones entre **Celsius** y **Fahrenheit**, así como entre **grados** y **radianes**. Los usuarios pueden interactuar con el programa a través de un menú interactivo, que les permite seleccionar la conversión que desean realizar. El programa también gestiona errores de entrada, como valores no numéricos, mediante excepciones.

---

## :wrench: Funcionalidad

El código tiene las siguientes funcionalidades principales:

1. :thermometer: Conversión de **Celsius** a **Fahrenheit**.
2. :thermometer: Conversión de **Fahrenheit** a **Celsius**.
3. :triangular_ruler: Conversión de **grados** a **radianes**.
4. :triangular_ruler: Conversión de **radianes** a **grados**.
5. :gear: Menú interactivo para que el usuario seleccione la conversión que desea realizar.
6. :warning: **Manejo de excepciones**: El código valida las entradas y muestra mensajes de error si el usuario introduce valores no numéricos.

---

## :memo: Detalles del código

### :lock: Atributos privados

La clase tiene cuatro atributos privados:

- `celsius`: Almacena el valor en grados **Celsius**.
- `fahrenheit`: Almacena el valor en grados **Fahrenheit**.
- `grados`: Almacena el valor en **grados**.
- `radianes`: Almacena el valor en **radianes**.

### :arrows_counterclockwise: Métodos de conversión

- `celsiusAFahrenheit(double celsius)`: Convierte de **Celsius** a **Fahrenheit**.
- `fahrenheitACelsius(double fahrenheit)`: Convierte de **Fahrenheit** a **Celsius**.
- `gradosARadianes(double grados)`: Convierte de **grados** a **radianes**.
- `radianesAGrados(double radianes)`: Convierte de **radianes** a **grados**.

### :pencil2: Método `toString()`

Sobrescribe el método `toString` para representar el objeto `ConversionUnidades_BeatrizToledano` de forma legible, mostrando los valores actuales de `celsius`, `fahrenheit`, `grados` y `radianes`.

### :computer: Menú interactivo (`menuConversion`)

El método `menuConversion` proporciona un menú en la consola donde el usuario puede elegir una opción de conversión. El menú permite realizar las conversiones mencionadas y proporciona la opción de salir del programa (opción 5). Además, se utiliza un bucle `do-while` para permitir que el usuario realice múltiples conversiones sin necesidad de reiniciar el programa. Si el usuario introduce una opción inválida o un valor no numérico, el programa gestionará el error y pedirá de nuevo la entrada.

---

## :arrow_forward: Ejemplo de uso

El flujo del programa es el siguiente:

1. El usuario ve el menú con las opciones de conversión.
2. Selecciona la opción que desea (por ejemplo, convertir de **Celsius** a **Fahrenheit**).
3. Introduce el valor numérico que desea convertir.
4. El programa realiza la conversión y muestra el resultado.
5. El programa le permite al usuario realizar otra conversión o salir.

---

## :warning: Manejo de errores

El código maneja los errores de entrada mediante el uso de un bloque `try-catch`. Si el usuario introduce un valor no numérico, el programa captura la excepción y muestra un mensaje de error adecuado. Esto ayuda a evitar que el programa se cierre inesperadamente debido a entradas incorrectas.
