# Java desde cero: Laboratorio práctico de programación

## Proyecto: TechStore – Sistema de compras de una tienda de tecnología

### 1. Introducción

En este laboratorio desarrollarás progresivamente la lógica de un sistema de comercio electrónico para una tienda de tecnología llamada **TechStore**.

La aplicación funcionará inicialmente desde la consola de Java. A través de diferentes ejercicios, construirás funcionalidades que permitirán consultar productos, calcular precios, aplicar descuentos, validar compras y generar resúmenes de pedidos.

No se busca desarrollar todos los ejercicios como programas independientes. La intención es que comprendas cómo cada concepto de programación permite resolver una necesidad real del sistema.

### 2. Reglas generales de trabajo

- Utiliza Java 17 o una versión superior.
- Cada ejercicio debe implementarse en un programa Java.
- Utiliza nombres de variables descriptivos.
- Mantén una indentación adecuada y agrega comentarios cuando sean necesarios.
- No utilices arreglos, listas, colecciones, clases personalizadas ni bases de datos.
- Resuelve los problemas utilizando exclusivamente los conceptos estudiados hasta cada ejercicio.
- Cuando un ejercicio solicite modificar un programa anterior, conserva su funcionalidad y agrega la nueva característica.

---

# Nivel 1. Construyendo la información de la tienda

En esta primera etapa aprenderás a representar la información de los productos y las operaciones comerciales.

## Ejercicio 1. Ficha de un producto

**Contexto:**

TechStore necesita mostrar la información básica de uno de sus productos en la consola.

**Requerimientos:**

Declara variables para almacenar la siguiente información:

- Nombre del producto.
- Código de referencia.
- Precio del producto.
- Cantidad disponible en inventario.
- Si el producto está disponible para la venta.
- Inicial del fabricante.

Utiliza los tipos de datos apropiados para cada variable.

**Resultado esperado:**

Muestra la información del producto de manera organizada.

Ejemplo:

```text
================================
          TECHSTORE
================================
Producto: Teclado mecánico RGB
Código: TEC-001
Precio: $189900.0
Inventario: 15 unidades
Disponible: true
Fabricante: L
================================
```

**Conceptos trabajados:**

- Declaración e inicialización de variables.
- Tipos de datos primitivos.
- Tipo String.
- Salida por consola.

## Ejercicio 2. Configuración de la tienda

**Contexto:**

La tienda necesita establecer algunos valores que no deberían cambiar durante la ejecución del programa.

**Requerimientos:**

Declara las siguientes constantes utilizando `final`:

- Nombre de la tienda.
- Porcentaje de IVA.
- Porcentaje de descuento para clientes registrados.
- Valor mínimo de compra para obtener envío gratuito.

Posteriormente, declara variables para representar un producto y calcula su precio con IVA.

Muestra el resultado en consola.

**Condiciones:**

- Los valores constantes deben escribirse utilizando la convención de nombres en mayúsculas.
- No debes modificar el valor de las constantes después de declararlas.
- El cálculo debe realizarse utilizando las constantes declaradas.

**Conceptos trabajados:**

- Constantes mediante `final`.
- Variables.
- Operadores aritméticos.
- Strings.

## Ejercicio 3. Registro de un nuevo producto

**Contexto:**

TechStore necesita permitir que un empleado registre un producto desde la consola.

**Requerimientos:**

Solicita al usuario los siguientes datos:

1. Nombre del producto.
2. Código del producto.
3. Precio.
4. Cantidad inicial en inventario.
5. Nombre del fabricante.

Utiliza `Scanner` para capturar la información.

Una vez ingresados los datos, muestra una ficha con toda la información registrada.

**Condiciones:**

- Utiliza `nextLine()` para capturar textos.
- Utiliza los métodos apropiados de Scanner para capturar números.
- Evita que los saltos de línea pendientes interfieran con la lectura de textos.

**Conceptos trabajados:**

- Scanner.
- Entrada de datos.
- Variables.
- Strings.
- Tipos de datos primitivos.

## Ejercicio 4. Calculadora de compras

**Contexto:**

Un cliente desea comprar varios productos y necesita conocer cuánto debe pagar.

**Requerimientos:**

Solicita al usuario:

- Nombre del producto.
- Precio unitario.
- Cantidad que desea comprar.

Calcula y muestra:

1. Subtotal de la compra.
2. IVA correspondiente.
3. Total a pagar.

**Fórmulas:**

- Subtotal = Precio unitario × Cantidad.
- IVA = Subtotal × Porcentaje de IVA.
- Total = Subtotal + IVA.

**Reto adicional:**

Calcula cuánto dinero ahorraría el cliente si recibe un descuento del 10 % sobre el subtotal.

**Conceptos trabajados:**

- Scanner.
- Operadores aritméticos.
- Variables.
- Constantes.
- Operaciones con tipos numéricos.

---

# Nivel 2. Validando las operaciones comerciales

Ahora comenzarás a implementar reglas de negocio. La tienda no solamente necesita calcular precios: también debe determinar si una operación es válida.

## Ejercicio 5. Validación de inventario

**Contexto:**

Un cliente intenta comprar un producto, pero la tienda debe verificar si existe suficiente inventario.

**Requerimientos:**

Solicita al usuario:

- Nombre del producto.
- Cantidad disponible en inventario.
- Cantidad que desea comprar.

Determina si la cantidad solicitada puede ser atendida.

Muestra uno de los siguientes mensajes:

```text
Producto: Mouse inalámbrico
Inventario disponible: 12
Cantidad solicitada: 5

Resultado: Compra disponible.
```

O:

```text
Producto: Mouse inalámbrico
Inventario disponible: 12
Cantidad solicitada: 20

Resultado: Inventario insuficiente.
```

**Reto adicional:**

Determina cuántas unidades quedarían disponibles después de realizar la compra.

**Conceptos trabajados:**

- Operadores relacionales.
- Operadores aritméticos.
- Condicionales if y else.

## Ejercicio 6. Clasificación de clientes

**Contexto:**

TechStore tiene diferentes beneficios dependiendo del tipo de cliente y del valor de su compra.

**Requerimientos:**

Solicita:

- Nombre del cliente.
- Valor de su compra.
- Si está registrado como cliente frecuente.

Aplica las siguientes reglas:

| Condición                                         | Beneficio         |
| ------------------------------------------------- | ----------------- |
| Cliente frecuente y compra superior a $500.000    | 15 % de descuento |
| Cliente frecuente y compra de hasta $500.000      | 10 % de descuento |
| Cliente no frecuente y compra superior a $500.000 | 5 % de descuento  |
| Cliente no frecuente y compra de hasta $500.000   | Sin descuento     |

Calcula el descuento y el total que debe pagar.

**Reto adicional:**

Agrega una validación para impedir compras con valores iguales o inferiores a cero.

**Conceptos trabajados:**

- Operadores relacionales.
- Operadores lógicos.
- if, else if y else.
- Operadores aritméticos.

## Ejercicio 7. Sistema de categorías de productos

**Contexto:**

La tienda necesita clasificar sus productos para aplicar diferentes políticas comerciales.

**Requerimientos:**

Solicita al usuario que seleccione una categoría:

```text
========= TECHSTORE =========

Seleccione una categoría:

1. Computadores
2. Periféricos
3. Accesorios
4. Componentes

Ingrese una opción:
```

Utiliza `switch` para mostrar una descripción de la categoría seleccionada.

Ejemplo:

```text
Categoría seleccionada: Periféricos
Productos disponibles: Teclados, mouse y monitores.
```

Si el usuario ingresa una opción diferente de las disponibles, muestra un mensaje de error.

**Reto adicional:**

Agrega una opción para consultar todas las categorías disponibles.

**Conceptos trabajados:**

- switch.
- Variables.
- Strings.
- Condicionales.

## Ejercicio 8. Conversión de monedas

**Contexto:**

TechStore importa algunos productos y necesita calcular sus precios en pesos colombianos.

**Requerimientos:**

Solicita al usuario:

- Precio del producto en dólares.
- Tasa de cambio del dólar frente al peso colombiano.

Calcula el precio equivalente en pesos colombianos.

Posteriormente, muestra los resultados en ambas monedas.

**Reto adicional:**

Permite que el usuario seleccione entre las siguientes conversiones:

1. Dólares a pesos colombianos.
2. Pesos colombianos a dólares.

**Condiciones:**

- Utiliza `double` para representar los valores monetarios.
- Valida que el precio y la tasa de cambio sean mayores que cero.
- Utiliza conversión de tipos cuando sea necesario.

**Conceptos trabajados:**

- Conversión de tipos de datos.
- Casting.
- Operadores aritméticos.
- Condicionales.
- switch.

---

# Nivel 3. Automatizando las operaciones

Hasta ahora, los programas han ejecutado operaciones individuales. En esta etapa aprenderás a repetir procesos para simular el comportamiento de una tienda real.

## Ejercicio 9. Catálogo de productos

**Contexto:**

TechStore necesita mostrar un catálogo numerado de productos para que los clientes puedan consultarlo.

**Requerimientos:**

Utiliza un ciclo `for` para generar una lista de 10 productos ficticios.

Como todavía no se han estudiado arreglos ni colecciones, puedes utilizar una estructura de repetición que genere productos identificados mediante un número consecutivo.

Ejemplo:

```text
========== CATÁLOGO TECHSTORE ==========

Producto número: 1
Producto número: 2
Producto número: 3
Producto número: 4
Producto número: 5
Producto número: 6
Producto número: 7
Producto número: 8
Producto número: 9
Producto número: 10
```

**Reto adicional:**

Muestra únicamente los números de productos pares.

**Conceptos trabajados:**

- Ciclo for.
- Operadores aritméticos.
- Operador módulo.
- Condicionales.

## Ejercicio 10. Simulador de caja registradora

**Contexto:**

Un cliente puede comprar diferentes unidades de un mismo producto. La caja registradora debe acumular el valor de todas las unidades compradas.

**Requerimientos:**

Solicita:

- Precio unitario del producto.
- Cantidad de unidades que desea comprar.

Utiliza un ciclo `while` para procesar cada unidad y acumular el valor de la compra.

Al finalizar, muestra:

- Cantidad total de unidades.
- Valor acumulado.
- Total de la compra.

**Ejemplo:**

```text
Precio unitario: $50000
Cantidad de unidades: 3

Procesando compra...

Unidad 1: $50000
Unidad 2: $50000
Unidad 3: $50000

Total de unidades: 3
Total a pagar: $150000
```

**Reto adicional:**

Implementa una validación para impedir que se ingresen cantidades negativas o iguales a cero.

**Conceptos trabajados:**

- Ciclo while.
- Acumuladores.
- Contadores.
- Operadores aritméticos.
- Condicionales.

## Ejercicio 11. Menú interactivo de TechStore

**Contexto:**

La tienda necesita un menú que permanezca disponible hasta que el usuario decida salir del sistema.

**Requerimientos:**

Construye el siguiente menú utilizando `do-while`:

```text
================================
       SISTEMA TECHSTORE
================================

1. Consultar productos.
2. Registrar una compra.
3. Consultar promociones.
4. Consultar información de la tienda.
5. Salir.

Seleccione una opción:
```

Cada opción debe mostrar un mensaje que represente la funcionalidad seleccionada.

El programa debe repetirse mientras el usuario no seleccione la opción 5.

**Reto adicional:**

- Valida que las opciones estén entre 1 y 5.
- Utiliza `switch` para gestionar las opciones.
- Muestra un mensaje de despedida cuando el usuario seleccione salir.

**Conceptos trabajados:**

- Ciclo do-while.
- switch.
- Condicionales.
- Operadores relacionales.
- Variables.

---

# Nivel 4. Organizando la lógica mediante métodos

En esta etapa comenzarás a dividir las funcionalidades de la tienda en métodos. Esto permitirá reutilizar operaciones y organizar mejor el código.

## Ejercicio 12. Método para calcular el precio de una compra

**Contexto:**

La tienda necesita reutilizar el cálculo del subtotal de una compra en diferentes funcionalidades.

**Requerimientos:**

Crea un método llamado `calcularSubtotal` que reciba dos parámetros:

- Precio unitario.
- Cantidad de unidades.

El método debe calcular y mostrar el subtotal de la compra.

Ejemplo de invocación:

```java
calcularSubtotal(50000, 3);
```

Resultado esperado:

```text
Subtotal de la compra: $150000
```

**Condiciones:**

- El método debe recibir los valores mediante parámetros.
- El método debe tener retorno `void`.
- El cálculo debe realizarse dentro del método.

**Conceptos trabajados:**

- Declaración de métodos.
- Parámetros.
- Argumentos.
- Métodos void.

## Ejercicio 13. Método para calcular descuentos

**Contexto:**

TechStore necesita calcular descuentos de manera independiente para reutilizar esta operación en diferentes procesos.

**Requerimientos:**

Crea un método llamado `calcularDescuento` que reciba:

- Valor de la compra.
- Porcentaje de descuento.

El método debe calcular el valor del descuento y retornarlo.

Ejemplo:

```java
double descuento = calcularDescuento(200000, 10);
```

Resultado esperado:

```text
Valor de la compra: $200000
Descuento aplicado: $20000
```

**Reto adicional:**

Crea otro método llamado `calcularTotal` que reciba el subtotal y el descuento, y retorne el valor final que debe pagar el cliente.

**Conceptos trabajados:**

- Métodos con parámetros.
- Métodos con valores de retorno.
- return.
- Variables.
- Operadores aritméticos.

## Ejercicio 14. Validador de compras

**Contexto:**

Antes de procesar una compra, TechStore necesita verificar que la cantidad solicitada sea válida y que exista suficiente inventario.

**Requerimientos:**

Crea un método llamado `validarCompra` que reciba:

- Cantidad disponible.
- Cantidad solicitada.

El método debe retornar un valor booleano:

- `true` cuando la compra pueda realizarse.
- `false` cuando no exista suficiente inventario o la cantidad solicitada sea inválida.

Ejemplo:

```java
boolean compraValida = validarCompra(20, 5);
```

Resultado esperado:

```text
¿La compra es válida? true
```

**Reto adicional:**

Integra el método con el ejercicio de la caja registradora. La compra solamente debe procesarse cuando el método retorne `true`.

**Conceptos trabajados:**

- Métodos.
- Parámetros.
- Valores de retorno.
- Tipo boolean.
- Operadores relacionales.
- Operadores lógicos.
- Condicionales.

---

# Nivel 5. Integración de conocimientos

## Ejercicio 15. Sistema de ventas de TechStore

**Contexto:**

TechStore necesita una primera versión de su sistema de ventas. El programa debe permitir que un cliente consulte una opción del menú, realice una compra y conozca el valor final que debe pagar.

Este ejercicio integra todos los conceptos estudiados durante el laboratorio.

### Requerimientos funcionales

**1. Configuración inicial**

Declara las siguientes constantes:

- Nombre de la tienda.
- Porcentaje de IVA.
- Porcentaje de descuento para clientes frecuentes.

**2. Menú principal**

Implementa un menú que se repita hasta que el usuario decida salir.

```text
================================
          TECHSTORE
================================

1. Consultar información.
2. Realizar una compra.
3. Salir.

Seleccione una opción:
```

**3. Consulta de información**

Al seleccionar esta opción, muestra:

- Nombre de la tienda.
- Porcentaje de IVA.
- Información general de los servicios ofrecidos.

**4. Proceso de compra**

Solicita los siguientes datos:

- Nombre del cliente.
- Nombre del producto.
- Precio unitario.
- Cantidad solicitada.
- Cantidad disponible en inventario.
- Si el cliente es frecuente.

**5. Validación de la compra**

Verifica que:

- El precio sea mayor que cero.
- La cantidad solicitada sea mayor que cero.
- Exista suficiente inventario.

Si alguna condición no se cumple, informa al usuario y no proceses la compra.

**6. Cálculo de la compra**

Si la compra es válida, calcula:

- Subtotal.
- Descuento, cuando corresponda.
- IVA.
- Total a pagar.

Aplica un descuento del 10 % a los clientes frecuentes.

**7. Resumen de la compra**

Muestra un comprobante en consola:

```text
========================================
           TECHSTORE
          COMPROBANTE
========================================

Cliente: Alfonso
Producto: Monitor 24 pulgadas
Precio unitario: $650000
Cantidad: 2

----------------------------------------
Subtotal:                 $1300000
Descuento:                $130000
Base gravable:            $1170000
IVA (19 %):               $222300
----------------------------------------
TOTAL A PAGAR:            $1392300
========================================

¡Gracias por comprar en TechStore!
```

_Nota: El porcentaje de IVA y las condiciones comerciales son valores didácticos definidos para el ejercicio._

### Requerimientos técnicos

El programa debe implementar:

- Variables y constantes.
- Tipos de datos primitivos y String.
- Entrada de datos con Scanner.
- Operadores aritméticos, relacionales y lógicos.
- Conversión de tipos cuando sea necesaria.
- Condicionales if, else if y else.
- Estructura switch.
- Ciclos for, while y do-while.
- Métodos con parámetros.
- Métodos con valores de retorno.
- Manejo adecuado del scope de las variables.

### Organización sugerida de los métodos

El programa debe contar con métodos que permitan separar las responsabilidades:

| Método                 | Responsabilidad                          |
| ---------------------- | ---------------------------------------- |
| `mostrarMenu()`        | Mostrar las opciones disponibles.        |
| `mostrarInformacion()` | Mostrar información de TechStore.        |
| `validarCompra()`      | Comprobar si la compra puede realizarse. |
| `calcularSubtotal()`   | Calcular el subtotal.                    |
| `calcularDescuento()`  | Calcular el descuento.                   |
| `calcularIVA()`        | Calcular el impuesto.                    |
| `calcularTotal()`      | Calcular el valor final.                 |
| `mostrarComprobante()` | Presentar el resumen de la compra.       |

No es obligatorio utilizar exactamente estos nombres, pero sí mantener una separación lógica de las responsabilidades.
