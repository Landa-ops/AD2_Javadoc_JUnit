Calculadora Java - Suma de Números
Este proyecto es una calculadora simple desarrollada en Java, que permite realizar operaciones de suma con diferentes tipos de números: reales y enteros. Además, incluye una funcionalidad para realizar una suma acumulativa.

Funcionalidades
El programa permite al usuario elegir entre las siguientes opciones en el menú:

Suma de dos números reales: Suma de dos números decimales (reales).
Suma de dos números enteros: Suma de dos números enteros.
Suma de tres números reales: Suma de tres números decimales.
Suma con valor acumulado: Realiza la suma de un número y acumula el resultado.
Salir: Termina la ejecución del programa.
Requisitos
Java 11 o superior.
IDE recomendado: IntelliJ IDEA, Eclipse o cualquier otro compatible con Java.
Instalación
Para ejecutar el proyecto en tu máquina local, sigue los siguientes pasos:

Clona este repositorio o descarga los archivos.

bash
Copiar código
git clone https://github.com/tu_usuario/calculadora-java.git
Abre el proyecto en tu IDE favorito.

Ejecuta la clase Main.java para interactuar con la calculadora desde la consola.

Uso
Al ejecutar el programa, se presentará un menú con varias opciones. El usuario puede ingresar la opción deseada e introducir los números para realizar las operaciones de suma. El programa validará la entrada de datos y mostrará los resultados.

Ejemplo de ejecución:
plaintext
Copiar código
========= MENU ==========
1. Suma Dos Numeros Reales
2. Suma Dos Numeros Enteros
3. Suma Tres Numeros Reales
4. Suma Con Valor Acumulado
5. Exit
---------------------------------------
+++ Seleccione que quiere sumar +++

Introduzca un numero real: 3.5
Introduzca un numero real: 2.7
Suma de dos numeros reales: 6.2
Tests
El proyecto incluye una serie de pruebas unitarias utilizando JUnit para garantizar el correcto funcionamiento de las funciones de suma.

Para ejecutar las pruebas:

Asegúrate de tener JUnit 5 configurado en tu entorno.
Ejecuta la clase de pruebas TestsSumaCalculadora.java desde tu IDE.
Funciones principales
Suma dos números reales: sumaDosNumerosReales(Double num1, Double num2)
Suma dos números enteros: sumaDosNumerosEnteros(Integer num1, Integer num2)
Suma tres números reales: sumaTresNumerosReales(Double num1, Double num2, Double num3)
Suma con valor acumulado: sumaValorAcumulado(Double num)
Validaciones
El programa valida que los números introducidos no sean nulos ni negativos. Si se detecta un valor no válido, se lanza una excepción IllegalArgumentException.

Contribuciones
Si deseas contribuir al proyecto, por favor sigue estos pasos:

Realiza un fork del repositorio.
Crea una nueva rama para tu característica o corrección (git checkout -b feature/nueva-caracteristica).
Realiza tus cambios y haz commit (git commit -am 'Añadir nueva característica').
Realiza un push a tu rama (git push origin feature/nueva-caracteristica).
Abre un Pull Request.
Licencia
Este proyecto está licenciado bajo la Licencia MIT.
