# Java: Introducción a la Programación Orientada a Objetos (POO)

## Objetivo de aprendizaje

Comprender y aplicar los fundamentos de la Programación Orientada a Objetos (POO) en Java, mediante la creación de clases y objetos, la definición de atributos y métodos, el uso de constructores y la implementación del encapsulamiento.

---

# BLOQUE 1. Funciones y métodos en Java

Antes de comenzar con la Programación Orientada a Objetos, es importante comprender cómo podemos organizar y reutilizar instrucciones mediante métodos.

## 1.1. ¿Qué es una función?

Una función es un conjunto de instrucciones agrupadas que permiten realizar una tarea específica dentro de un programa.

Su principal propósito es evitar la repetición de código, organizar las instrucciones y facilitar el mantenimiento de un programa.

En Java, las funciones se implementan mediante métodos, los cuales pertenecen a una clase.

**Ejemplo:**

```java
public class Saludos {

    public void saludar() {
        System.out.println("Hola, bienvenido a Java");
    }

}
```

En este ejemplo:

- `public`: indica que el método puede ser utilizado desde otras clases.
- `void`: indica que el método no devuelve ningún resultado.
- `saludar`: es el nombre del método.
- `{ }`: contienen las instrucciones que ejecutará el método.

## 1.2. Métodos sin parámetros

Son métodos que no necesitan recibir información para realizar su tarea.

**Ejemplo:**

```java
public class Mensajes {

    public void mostrarBienvenida() {
        System.out.println("Bienvenido al sistema");
    }

    public void mostrarDespedida() {
        System.out.println("Hasta pronto");
    }

}
```

Para ejecutar estos métodos desde otra clase:

```java
public class Main {

    public static void main(String[] args) {

        Mensajes mensaje = new Mensajes();

        mensaje.mostrarBienvenida();
        mensaje.mostrarDespedida();

    }

}
```

**Resultado esperado:**

```text
Bienvenido al sistema
Hasta pronto
```

Observa que necesitamos crear un objeto de la clase `Mensajes` para utilizar sus métodos de instancia.

## 1.3. Métodos con parámetros

Un parámetro es una variable que se declara en la definición de un método y permite recibir información para ejecutar una tarea.

Los parámetros hacen que los métodos sean más flexibles, porque podemos utilizarlos con diferentes valores.

**Ejemplo:**

```java
public class Saludos {

    public void saludar(String nombre) {

        System.out.println("Hola " + nombre);

    }

}
```

Para utilizarlo:

```java
public class Main {

    public static void main(String[] args) {

        Saludos saludo = new Saludos();

        saludo.saludar("Carlos");
        saludo.saludar("María");
        saludo.saludar("Andrés");

    }

}
```

**Resultado esperado:**

```text
Hola Carlos
Hola María
Hola Andrés
```

En este ejemplo, `nombre` es el parámetro del método y los textos enviados al invocarlo son los argumentos.

**Otro ejemplo:**

```java
public class Calculadora {

    public void sumar(int numero1, int numero2) {

        int resultado = numero1 + numero2;

        System.out.println("Resultado: " + resultado);

    }

}
```

Uso:

```java
Calculadora calculadora = new Calculadora();

calculadora.sumar(10, 5);
calculadora.sumar(20, 30);
```

Resultado:

```text
Resultado: 15
Resultado: 50
```

## 1.4. Métodos con valores de retorno

Un método con retorno es aquel que, después de realizar una operación, devuelve un resultado.

Para indicar el tipo de dato que devuelve, se utiliza el tipo correspondiente en lugar de `void`.

La palabra reservada `return` permite devolver el resultado.

**Ejemplo:**

```java
public class Calculadora {

    public int sumar(int numero1, int numero2) {

        int resultado = numero1 + numero2;

        return resultado;

    }

}
```

Uso:

```java
public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(10, 5);

        System.out.println("La suma es: " + resultado);

    }

}
```

**Resultado esperado:**

```text
La suma es: 15
```

Otros ejemplos de métodos con diferentes tipos de retorno:

```java
public class Operaciones {

    public double calcularPromedio(double nota1, double nota2) {

        return (nota1 + nota2) / 2;

    }

    public boolean esMayorDeEdad(int edad) {

        return edad >= 18;

    }

    public String obtenerMensaje() {

        return "Operación completada";

    }

}
```

Los tipos de retorno utilizados son:

- `double`: devuelve un número decimal.
- `boolean`: devuelve `true` o `false`.
- `String`: devuelve una cadena de texto.

## 1.5. Alcance de las variables (Scope)

El alcance de una variable determina desde qué parte del programa puede utilizarse.

En Java, una variable declarada dentro de un método normalmente solo puede utilizarse dentro de ese método. Una variable declarada dentro de un bloque también queda limitada a ese bloque.

**Ejemplo:**

```java
public class Ejemplo {

    public void mostrarDatos() {

        String nombre = "Carlos";

        System.out.println(nombre);

    }

    public void mostrarEdad() {

        int edad = 25;

        System.out.println(edad);

    }

}
```

En este ejemplo:

- `nombre` solamente existe dentro de `mostrarDatos()`.
- `edad` solamente existe dentro de `mostrarEdad()`.

No podemos acceder directamente a `nombre` desde `mostrarEdad()`.

**Ejemplo de alcance de una variable dentro de un bloque:**

```java
public class Ejemplo {

    public void verificarEdad(int edad) {

        if (edad >= 18) {

            String mensaje = "Es mayor de edad";

            System.out.println(mensaje);

        }

    }

}
```

La variable `mensaje` solamente puede utilizarse dentro del bloque `if`.

## 1.6. Reutilización de lógica

La reutilización de lógica consiste en crear métodos que puedan ejecutarse varias veces sin tener que escribir nuevamente las mismas instrucciones.

Esto permite:

- Evitar código repetido.
- Facilitar el mantenimiento.
- Organizar mejor los programas.
- Separar las responsabilidades de cada operación.

**Ejemplo:**

```java
public class Calculadora {

    public int sumar(int a, int b) {

        return a + b;

    }

    public int restar(int a, int b) {

        return a - b;

    }

    public int multiplicar(int a, int b) {

        return a * b;

    }

}
```

Uso:

```java
public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.sumar(10, 5));

        System.out.println(calculadora.restar(10, 5));

        System.out.println(calculadora.multiplicar(10, 5));

    }

}
```

La clase `Calculadora` concentra las operaciones y permite reutilizarlas desde diferentes partes del programa.

**Nota:** En los ejemplos de esta guía utilizaremos métodos de instancia, evitando `static` en los métodos que estamos aprendiendo. El método `main` se mantiene como `static` porque es el punto de entrada que utiliza Java para iniciar la ejecución del programa.

---

# BLOQUE 2. Introducción a la Programación Orientada a Objetos

## 2.1. ¿Qué es la Programación Orientada a Objetos?

La Programación Orientada a Objetos (POO) es un paradigma de programación que permite organizar un programa mediante clases y objetos.

La POO busca representar elementos del mundo real o conceptos de un sistema mediante estructuras que contienen:

- Atributos: características o información.
- Métodos: comportamientos o acciones.

Por ejemplo, en un sistema académico podemos representar un estudiante mediante:

**Atributos:**
- Nombre.
- Edad.
- Carrera.
- Correo electrónico.

**Métodos:**
- Inscribirse.
- Consultar calificaciones.
- Mostrar información.

La idea es agrupar los datos y los comportamientos relacionados dentro de una misma estructura.

## 2.2. Programación estructurada

La programación estructurada es un paradigma que organiza un programa mediante instrucciones, funciones y estructuras de control.

Su enfoque principal consiste en definir los pasos que debe seguir el programa para resolver un problema.

**Ejemplo:**

```java
public class Main {

    public static void main(String[] args) {

        String nombre = "Carlos";
        int edad = 25;

        mostrarEstudiante(nombre, edad);

    }

    public static void mostrarEstudiante(
        String nombre, int edad) {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}
```

En este ejemplo:

- Los datos del estudiante se almacenan en variables.
- La función recibe los datos mediante parámetros.
- Las instrucciones realizan la operación solicitada.

Los datos y las operaciones se encuentran organizados por separado.

## 2.3. Programación Orientada a Objetos

En la POO podemos representar al estudiante mediante una clase que agrupa sus atributos y comportamientos.

**Ejemplo:**

```java
class Estudiante {

    String nombre;
    int edad;

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}
```

Uso:

```java
public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Carlos";
        estudiante.edad = 25;

        estudiante.mostrarInformacion();

    }

}
```

En este caso:

- La clase `Estudiante` representa el concepto de estudiante.
- Los atributos almacenan sus características.
- El método `mostrarInformacion()` representa un comportamiento.
- El objeto `estudiante` representa una instancia concreta de esa clase.

## 2.4. Diferencias entre programación estructurada y POO

| Característica | Programación estructurada | Programación orientada a objetos |
|---|---|---|
| Organización | Funciones e instrucciones. | Clases y objetos. |
| Datos | Se manejan mediante variables y estructuras de datos. | Se agrupan en atributos de los objetos. |
| Comportamientos | Se implementan mediante funciones. | Se implementan mediante métodos. |
| Enfoque | Pasos para resolver un problema. | Objetos que contienen datos y comportamientos. |
| Reutilización | Mediante funciones y estructuras reutilizables. | Mediante clases, objetos y otros mecanismos de POO. |

**Importante:** La programación estructurada no es incorrecta ni está obsoleta. Ambos paradigmas permiten desarrollar programas. La POO ofrece una forma adicional de organizar y administrar la complejidad del software.

---

# BLOQUE 3. Clases y objetos

## 3.1. ¿Qué es una clase?

Una clase es una estructura que define las características y los comportamientos que tendrán los objetos creados a partir de ella.

Podemos entenderla como un molde o plantilla.

Por ejemplo, podemos crear una clase llamada `Vehiculo` que defina características comunes para diferentes vehículos.

**Ejemplo:**

```java
public class Vehiculo {

    String marca;
    String color;
    int velocidad;

}
```

En este caso, `Vehiculo` es una clase que define tres características.

## 3.2. ¿Qué es un objeto?

Un objeto es una instancia de una clase.

Esto significa que podemos utilizar una clase como plantilla para crear diferentes objetos, cada uno con sus propios valores para los atributos.

Por ejemplo, a partir de la clase `Vehiculo` podemos crear:

- Un vehículo Toyota de color rojo.
- Un vehículo Mazda de color negro.
- Un vehículo Chevrolet de color blanco.

Todos pertenecen a la misma clase, pero representan objetos diferentes.

## 3.3. ¿Qué son los atributos?

Los atributos son variables declaradas dentro de una clase que permiten almacenar las características o el estado de un objeto.

**Ejemplo:**

```java
public class Producto {

    String nombre;
    double precio;
    int cantidad;

}
```

En esta clase encontramos tres atributos:

- `nombre`: almacena el nombre del producto.
- `precio`: almacena su precio.
- `cantidad`: almacena las unidades disponibles.

Cada objeto tendrá sus propios valores.

## 3.4. ¿Qué son los métodos dentro de una clase?

Los métodos representan las acciones o comportamientos que pueden realizar los objetos de una clase.

**Ejemplo:**

```java
public class Producto {

    String nombre;
    double precio;
    int cantidad;

    public void mostrarInformacion() {

        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);

    }

    public void aumentarCantidad(int unidades) {

        cantidad = cantidad + unidades;

    }

}
```

La clase `Producto` tiene:

**Atributos:**
- `nombre`
- `precio`
- `cantidad`

**Métodos:**
- `mostrarInformacion()`
- `aumentarCantidad()`

## 3.5. Creación e instanciación de objetos

La instanciación es el proceso de crear un objeto a partir de una clase.

En Java utilizamos la palabra reservada `new` para crear una instancia.

**Sintaxis general:**

```java
NombreClase nombreObjeto = new NombreClase();
```

Donde:

- `NombreClase`: identifica la clase utilizada.
- `nombreObjeto`: es la referencia que permite acceder al objeto.
- `new`: crea una nueva instancia.
- `NombreClase()`: invoca el constructor de la clase.

**Ejemplo:**

```java
public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto();

        producto1.nombre = "Teclado";
        producto1.precio = 80000;
        producto1.cantidad = 10;

        producto1.mostrarInformacion();

    }

}
```

**Resultado esperado:**

```text
Producto: Teclado
Precio: 80000.0
Cantidad: 10
```

## 3.6. Crear varios objetos de una misma clase

Una de las ventajas de las clases es que podemos crear diferentes objetos utilizando la misma estructura.

**Ejemplo:**

```java
public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto();

        producto1.nombre = "Teclado";
        producto1.precio = 80000;
        producto1.cantidad = 10;


        Producto producto2 = new Producto();

        producto2.nombre = "Mouse";
        producto2.precio = 45000;
        producto2.cantidad = 20;


        producto1.mostrarInformacion();

        producto2.mostrarInformacion();

    }

}
```

Cada objeto tiene sus propios valores.

Aunque ambos objetos pertenecen a la clase `Producto`, modificar el precio de `producto1` no modifica el precio de `producto2`.

---

# BLOQUE 4. Constructores y uso de this

## 4.1. ¿Qué es un constructor?

Un constructor es un elemento especial de una clase que permite inicializar un objeto cuando se crea una instancia.

Su principal función es asignar valores iniciales a los atributos del objeto.

Características:

- Tiene el mismo nombre de la clase.
- No tiene tipo de retorno, ni siquiera `void`.
- Se ejecuta cuando se crea un objeto mediante `new`.
- Puede recibir parámetros.

## 4.2. Constructor sin parámetros

Un constructor sin parámetros permite crear objetos sin enviar información inicial.

**Ejemplo:**

```java
public class Producto {

    String nombre;
    double precio;

    public Producto() {

        nombre = "Sin nombre";
        precio = 0;

    }

}
```

Uso:

```java
public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto();

        System.out.println(producto1.nombre);
        System.out.println(producto1.precio);

    }

}
```

**Resultado esperado:**

```text
Sin nombre
0.0
```

**Importante:** Si no declaramos ningún constructor, Java proporciona automáticamente un constructor sin parámetros. Pero si declaramos un constructor propio, Java ya no genera automáticamente ese constructor.

## 4.3. Constructor con parámetros

Un constructor con parámetros permite enviar información al momento de crear un objeto.

**Ejemplo:**

```java
public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;

    }

}
```

Uso:

```java
public class Main {

    public static void main(String[] args) {

        Producto producto1 =
            new Producto("Teclado", 80000);

        Producto producto2 =
            new Producto("Mouse", 45000);

        System.out.println(producto1.nombre);
        System.out.println(producto2.nombre);

    }

}
```

**Resultado esperado:**

```text
Teclado
Mouse
```

En este caso, cada objeto se crea con sus respectivos valores iniciales.

## 4.4. ¿Qué es this?

`this` es una palabra reservada de Java que hace referencia al objeto actual.

Se utiliza especialmente para diferenciar los atributos de una clase de los parámetros o variables locales que tienen el mismo nombre.

**Ejemplo:**

```java
public class Estudiante {

    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

}
```

Analicemos esta instrucción:

```java
this.nombre = nombre;
```

- `this.nombre`: hace referencia al atributo de la clase.
- `nombre`: hace referencia al parámetro recibido por el constructor.

De esta manera, Java puede identificar correctamente dónde debe almacenar el valor recibido.

**Ejemplo de uso:**

```java
public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 =
            new Estudiante("Carlos", 22);

        Estudiante estudiante2 =
            new Estudiante("María", 24);

    }

}
```

Cada objeto tendrá su propio nombre y edad.

---

# BLOQUE 5. Modificadores de acceso y encapsulamiento

## 5.1. ¿Qué son los modificadores de acceso?

Los modificadores de acceso permiten establecer desde dónde pueden utilizarse los atributos, métodos y otros elementos de una clase.

En Java encontramos cuatro niveles de acceso:

| Modificador | Descripción |
|---|---|
| `public` | Permite acceder desde cualquier clase. |
| `private` | Permite acceder únicamente desde la misma clase. |
| `protected` | Permite acceder desde clases del mismo paquete y desde subclases, incluso si están en otros paquetes, bajo las reglas de herencia. |
| Sin modificador | Permite acceder desde clases que pertenecen al mismo paquete. |

**Ejemplo con public:**

```java
public class Persona {

    public String nombre;

}
```

Podemos acceder al atributo desde otra clase:

```java
Persona persona = new Persona();

persona.nombre = "Carlos";
```

**Ejemplo con private:**

```java
public class Persona {

    private String nombre;

}
```

Ahora no podemos acceder directamente al atributo desde otra clase:

```java
Persona persona = new Persona();

// Esto genera un error:
persona.nombre = "Carlos";
```

Esto sucede porque el atributo tiene acceso privado.

## 5.2. ¿Qué es el encapsulamiento?

El encapsulamiento es un principio de la Programación Orientada a Objetos que consiste en proteger los datos de una clase y controlar la manera en que otras partes del programa pueden acceder a ellos.

Para implementar el encapsulamiento normalmente:

1. Declaramos los atributos como `private`.
2. Creamos métodos públicos para consultar o modificar los atributos cuando sea necesario.
3. Podemos establecer condiciones para validar los valores que recibe un objeto.

Su propósito es evitar modificaciones incorrectas y mantener el control sobre los datos.

**Ejemplo sin encapsulamiento:**

```java
public class CuentaBancaria {

    public double saldo;

}
```

Uso:

```java
CuentaBancaria cuenta = new CuentaBancaria();

cuenta.saldo = -500000;
```

En este ejemplo podemos asignar directamente un saldo negativo, aunque no sea un valor válido para nuestro escenario.

**Ejemplo con encapsulamiento:**

```java
public class CuentaBancaria {

    private double saldo;

}
```

Ahora el atributo está protegido y no puede modificarse directamente desde otra clase.

Para controlar su acceso podemos utilizar getters y setters.

## 5.3. ¿Qué es un Getter?

Un getter es un método que permite consultar y obtener el valor de un atributo privado.

Generalmente comienza con la palabra `get` seguida del nombre del atributo.

**Ejemplo:**

```java
public class Persona {

    private String nombre;

    public String getNombre() {

        return nombre;

    }

}
```

Uso:

```java
Persona persona = new Persona();

System.out.println(persona.getNombre());
```

El método `getNombre()` devuelve el valor almacenado en el atributo `nombre`.

## 5.4. ¿Qué es un Setter?

Un setter es un método que permite modificar el valor de un atributo privado.

Generalmente comienza con la palabra `set` seguida del nombre del atributo.

**Ejemplo:**

```java
public class Persona {

    private String nombre;

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

}
```

Uso:

```java
Persona persona = new Persona();

persona.setNombre("Carlos");

System.out.println(persona.getNombre());
```

El método `setNombre()` permite modificar el nombre del objeto.

## 5.5. Getters y setters con validaciones

Una ventaja importante de los setters es que podemos establecer condiciones antes de modificar un atributo.

**Ejemplo:**

```java
public class Persona {

    private String nombre;
    private int edad;

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        if (nombre != null && !nombre.isBlank()) {

            this.nombre = nombre;

        }

    }

    public int getEdad() {

        return edad;

    }

    public void setEdad(int edad) {

        if (edad > 0) {

            this.edad = edad;

        }

    }

}
```

Uso:

```java
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Carlos");
        persona.setEdad(25);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());

        persona.setEdad(-10);

        System.out.println(persona.getEdad());

    }

}
```

**Resultado esperado:**

```text
Carlos
25
25
```

¿Por qué continúa mostrando 25?

Porque el setter de `edad` solamente permite modificar el atributo cuando el valor recibido es mayor que cero.

Cuando enviamos `-10`, la condición no se cumple y el atributo conserva su valor anterior.

**Importante:** No todos los atributos necesitan obligatoriamente un getter y un setter. Debemos definir los métodos de acceso de acuerdo con las necesidades de cada clase.

---

# BLOQUE 6. Ejercicio integrador guiado

## Sistema de gestión de productos

### Contexto

Una tienda de tecnología necesita desarrollar un pequeño programa en Java que permita administrar información básica de sus productos.

El sistema debe permitir registrar productos, consultar sus características y actualizar sus precios y cantidades disponibles.

El objetivo es aplicar los conceptos estudiados de Programación Orientada a Objetos.

### Objetivo del ejercicio

Construir una clase `Producto` que permita representar productos de una tienda, utilizando atributos privados, constructores, métodos y encapsulamiento.

### Parte 1. Creación de la clase

Crear una clase llamada `Producto`.

La clase debe contener los siguientes atributos:

| Atributo | Tipo de dato | Descripción |
|---|---|---|
| nombre | String | Nombre del producto. |
| categoria | String | Categoría del producto. |
| precio | double | Precio del producto. |
| cantidad | int | Unidades disponibles. |

**Requerimiento:**

Todos los atributos deben tener el modificador de acceso `private`.

### Parte 2. Constructores

Crear un constructor que permita inicializar todos los atributos de un producto.

Al momento de crear un objeto, se debe poder enviar:

- Nombre.
- Categoría.
- Precio.
- Cantidad disponible.

Utilizar `this` para diferenciar los atributos de los parámetros.

### Parte 3. Encapsulamiento

Implementar los métodos necesarios para consultar y modificar los atributos.

Requerimientos:

- Crear getters para consultar la información del producto.
- Crear setters para modificar los atributos que lo requieran.
- El precio no puede ser negativo.
- La cantidad disponible no puede ser negativa.
- El nombre no puede estar vacío.

### Parte 4. Métodos de comportamiento

Crear los siguientes métodos dentro de la clase `Producto`:

**1. mostrarInformacion()**

Debe mostrar todos los datos del producto:

- Nombre.
- Categoría.
- Precio.
- Cantidad disponible.

**2. aumentarInventario(int cantidad)**

Debe permitir incrementar la cantidad disponible de un producto.

La cantidad recibida debe ser mayor que cero.

**3. venderProducto(int cantidad)**

Debe permitir disminuir la cantidad disponible.

Condiciones:

- La cantidad solicitada debe ser mayor que cero.
- No se pueden vender más unidades de las disponibles.
- Si la operación es válida, debe actualizarse el inventario.

### Parte 5. Creación de objetos

Crear una clase `Main` que permita ejecutar el programa.

Desde el método `main`:

1. Crear tres objetos diferentes de la clase `Producto`.
2. Asignar valores iniciales mediante el constructor.
3. Mostrar la información de cada producto.
4. Modificar el precio de uno de los productos.
5. Incrementar el inventario de otro producto.
6. Realizar una venta.
7. Consultar nuevamente la información de los productos.

### Parte 6. Pruebas de funcionamiento

Realizar las siguientes pruebas:

| Prueba | Acción esperada |
|---|---|
| Crear producto | Se registra con sus valores iniciales. |
| Consultar producto | Se muestra toda su información. |
| Modificar precio | Se actualiza el precio cuando es válido. |
| Precio negativo | Se rechaza la modificación. |
| Aumentar inventario | Se incrementa la cantidad disponible. |
| Vender producto | Se descuenta la cantidad vendida. |
| Vender más unidades de las disponibles | Se rechaza la operación. |
| Cantidad negativa | Se rechaza la operación. |


# Glosario de conceptos

| Concepto | Definición |
|---|---|
| Método | Bloque de instrucciones que realiza una tarea específica dentro de una clase. |
| Parámetro | Variable declarada en un método para recibir información. |
| Argumento | Valor que se envía a un método cuando se invoca. |
| Retorno | Resultado que devuelve un método mediante `return`. |
| Clase | Estructura que define los atributos y métodos de sus objetos. |
| Objeto | Instancia concreta de una clase. |
| Atributo | Variable que representa una característica o estado de un objeto. |
| Método de instancia | Comportamiento definido dentro de una clase que se utiliza mediante un objeto. |
| Instanciación | Proceso de crear un objeto a partir de una clase. |
| Constructor | Elemento especial que permite inicializar un objeto. |
| `this` | Referencia al objeto actual. |
| Modificador de acceso | Elemento que establece los niveles de visibilidad de los miembros de una clase. |
| Encapsulamiento | Principio que protege los datos y controla el acceso a ellos. |
| Getter | Método que permite consultar el valor de un atributo. |
| Setter | Método que permite modificar el valor de un atributo. |
| `private` | Modificador que restringe el acceso directo a un miembro desde fuera de su clase. |
| `public` | Modificador que permite el acceso desde cualquier clase. |

---
