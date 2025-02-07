# Calculadora de Módulo y Valor Absoluto

Este proyecto contiene una clase en Java llamada `ModuloEvaLopez` que permite calcular el módulo (resto de una división) y el valor absoluto de un número. La aplicación presenta un menú interactivo donde el usuario puede elegir entre estas dos opciones.

## Funcionalidades

El programa tiene dos funciones principales:

1. **Calcular Módulo**: El programa calcula el resto de la división entre dos números proporcionados por el usuario.
   
   **Fórmula**:  
   Módulo = `a % b`

2. **Calcular Valor Absoluto**: El programa devuelve el valor absoluto de un número. Si el número es negativo, lo convierte a positivo.
   
   **Fórmula**:  
   Si `a >= 0`, entonces `|a| = a`  
   Si `a < 0`, entonces `|a| = -a`

## Requisitos

- Java 8 o superior
- IDE o editor de texto para compilar y ejecutar código Java

## Instalación

Para ejecutar este proyecto en tu máquina local, sigue estos pasos:

1. Asegúrate de tener Java instalado en tu computadora. Puedes verificarlo ejecutando el siguiente comando en tu terminal:

   ```bash
   java -version

2. Descarga o clona este repositorio en tu máquina local.

3. Abre el archivo ModuloEvaLopez.java en tu editor de texto favorito (por ejemplo, IntelliJ IDEA, Eclipse, Visual Studio Code, etc.).

4. ejecuta el archivo:
    javac ModuloEvaLopez.java
    java ModuloEvaLopez

## Uso
Al ejecutar el programa, se mostrará un menú con las siguientes opciones:

1. Calcular Módulo
2. Calcular Valor Absoluto
Elige la opción que deseas. 
Si eliges 1, el programa te pedirá ingresar dos números (dividendo y divisor) para calcular el módulo. 
Si eliges 2, te pedirá un número para calcular su valor absoluto.

## Ejemplo de ejecución
Menú de opciones:

Selecciona:
1. Modulo
2. Valor absoluto
Si seleccionas 1 (Modulo):
    Inserta el dividendo: 15
    Inserta el divisor: 4
    Resultado: 3
Si seleccionas 2 (Valor absoluto):
    Inserta el valor: -5.7
    Resultado: 5.7

## Autor
@Autor Eva López