# Programación Orientada a Objetos
Repositorio de trabajos de Programación Orientada a Objetos, ciclo 01/2024
<<<<<
# Apuntes
## 7/03/2024
Ahora tenemos un cambio de paradigma. PED era un paradigma estructurado, POO es el paradigma orientado a objetos. Un paradigma es una forma de pensar y construir el código. Antes hemos visto el paradigma estructurado, que es seguir una serie de pasos ordenadamente, ahora veremos otra forma de pensar para resolver los problemas. Mientras más formas de resolver un problema y más lenguajes de programación saben, más valor tiene el programador (en el mercado).
Java es un lenguaje orientado a objetos, técnicamente es un paradigma estructurado (ya que tomó varias cosas de C++). El proyecto puede tener dos opciones: desarrollar un aplicativo que incorpore diversos contenidos vistos a lo largo de la materia, participar en el ICPC.
Libros: The Object-Oriented Thought Process, third edition by Matt A. Weisfeld; Core Java, volume I: Fundamentals, 12th edition by Cay S: Horstmann
### 01. De estructurado a orientado a objetos
Todo gira en torno a los objetos. Un Objeto es algo que tiene propiedades y realiza acciones. Definir un Objeto es fácil y es difícil, para alguien que ya está familiarizado con el paradigma es fácil definir un Objeto, pero para alguien que no está entrenado, puede ser difícil para ciertos objetos. En la programación estructurada el código suele colocarse en funciones, las cuales no tiene conocimiento de lo que hay en otras funciones, solo envían una entrada y reciben una salida. Estas funciones están separadas unas de otras, a diferencia de los objetos que encapsulan todo. 

La programación estructurada es donde los datos y las operaciones (variables y funciones) se suelen separar, enviando a las funciones únicamente lo que necesitan para trabajar. En PED, los datos se envían explícitamente, los datos están centralizados, hay una función/procedimiento para cada tarea, las funciones acceden a los datos centrales. Los datos son globales y todas las funciones pueden acceder a esos datos, alguien con malas intenciones puede agregar una función maliciosa y acceder fácilmente a esos datos.

La programación orientada a objetos es donde los datos y las operaciones (variables y funciones) se encapsulan en un Objeto, por lo que tanto las características como el comportamiento pueden ser enviados. No se ve directamente la información, sino un objeto. Aquí resolver problemas no es seguir una serie de pasos, sino identificar todos los objetos involucrados y ver la manera de relacionarlos a todos. La diferencia entre funciones y procedimientos tiene que ver con si devuelve o retorna algo. Si devuelve algo, es una función; si no devuelva algo y solo realiza algo, es un procedimiento.
Un objeto es el hecho de que los datos estén encerrados y protegidos, dentro del Objeto; la consecuencia de brindar mayor seguridad a dicha información; y la acción de solo poder conocer esos datos a través de los métodos. Encapsulamiento es el proceso de encerrar los datos en una cajita/capsula.
### 02. Historia del paradigma
En 1960 ya se hacía uso del término Objeto para algunos conceptos relacionados a la IA. Entre 1960 y 1961 en el MIT se desarrolló Sketchpad, un programa utilizado para la manipulación de objetos gráficos (predecesor a los CAD). En el glosario del informe técnico se presentan algunos conceptos de Objeto e Instancia. En 1962 el lenguaje de programación Simula introduce e implementa conceptos como Clases, Objetos y Herencia. Se convierte en el primer lenguaje de POO. En 1983 se publica el lenguaje de programación C++, técnicamente es un lenguaje multiparadigma y tiene soporte de conceptos como Clases, Objetos, etc. En 1995 se publica Java, derivando en gran parte de C y C++, siendo nativamente Orientado a Objetos, es uno de los lenguajes de programación más populares en la actualidad, y será nuestra herramienta de trabajo a lo largo de la materia.
Luego surgieron nuevas propuestas de lenguajes OO como: C#, Ruby, Python, Visual Basic .NET, Kotlin, Swift.
### 03. Java
Es un lenguaje creado para el paradigma OO, cada vez que mejora Java, mejora OO. Java es multiplataforma (Linux, Mac, Windows, Android). Java no se compila, se interpreta, el cuál es un plus para que pueda funcionar en cualquier máquina. El término formal es "código intermedio", ese archivo lo puedo compartir con cualquier dispositivo y funcionará, ya que el intérprete de cada máquina se hace cargo de hacer que funcione en la máquina. JDK (Java Development Kit) nos permite hacer programas y ejecutarlos. En cambio, JRE (Java Runtime Enviroment) es solo para ejecutar programas de Java, como por ejemplo lo piden algunos videojuegos. La prioridad de la materia será Ubuntu (Linux), en los labs se utilizará Linux para irnos indepernizarnos de Windows.
IDE (Integrated Development Environment) es un entorno de desarrollo integrado para desarrollar el código de la manera más código posible. Si es primera vez en Linux, recomendable usar Ubuntu.
C++ no es multi plataforma, por lo que si compilamos un archivo en Mac, no funcionará en Windows.

## 12/03/2024
A groso modo, un objeto es una entidad que encapsula tanto datos como comportamiento. Los objetos son cimientos de un programa orientado a objetos. Un programa que está basado en este paradigma básicamente es una colección de objetos. Un paradigma es la forma de modular. Objeto es toda cosa que cumple esas 2 características: atributos y métodos, principalmente son cosas abstractas, no suele ser tangible. Abstraer es transformar o representar algo de manera que se pueda representar en otro contexto. Agarrar del mundo real cosas y traducirlas/transformarlas en algo que la computadora puede leer.
Los Datos que se encuentran almacenados en un Objeto representan el estado del Objeto. En terminología de POO, los Datos son llamados Atributos. Los Comportamientos de un Objeto es lo que el Objeto puede hacer. En los lenguajes de programación estructurados los comportamientos se definen por procedimientos, funciones y subrutinas. En terminología de POO, los Comportamientos son llamados Métodos y se puede invocar un método "enviándole una señal".

Clases y objetos.
Hay que ver las clases como plantillas para describir a los objetos. Si nos enfocamos sólo en los objetos, hay mucha repetición de datos (código). Si varios objetos tienen las mismas características y/o comportamiento, es recomendable tener una plantilla. Las clases son las plantillas de los objetos y los objetos son las instancias de las clases. Las clases son las que permiten el encapsulamiento de la información; los objetos utilizan esta propiedad. ESto permite efectuar un Ocultamiento de los Datos (Data Hiding).

Java.
Los nombres de las clases tienen que iniciar con mayúscula. Java y Linux es "case senstive". Windows es "case insensitive". Si hay más de 1 palabra, se usa Camel Case. El tipo de dato string en C++ es en realidad una clase, está disfrazado; en Java es lo mismo pero no disfrazado, aclara que es una clase (usamos mayúscula). La palabra reservada "new" crea objetos en base a las clases (toma plantillas).
Para ejecutar una clase, es necesario que tenga un main.
En C++, al usar new, al finalizar teníamos que usar delete. Eso se llama liberación de memoria. En Java, se llama recolección de basura. En Java, el garbage collector lo hace automáticamente, no tenemos que hacerlo nosotros, Java lo hace por nosotros.
Si el archivo tuviese múltiples clases, lo cual no es recomendable, en esos casos el main debe ir en la clase que tiene el nombre del archivo. Si no dice public ni void, es default.
Especificadores de visibilidad: public, private, protected, default

## 14/03/2024
Clase con el otro catedrático de la materia (Mario López).
Labs en horarios disponibles de lunes a viernes a las 9am o 3:30pm

Métodos Setters y Getters.
Nuestros objetos son cápsulas que se almacenan en datos.
UML (Unified Modelling Language) sería como un mapa de nuestro sistema.
El nombre de los atributos y las funciones inician con la letra minúscula. 
Ejemplos de atributos: -socialSecurityNumber:String, -gender:boolean, -dateofBirth:Date
Ejemplos de métodos: +getSocialSecurityNumber:String, +getGender:boolean, +setSocialSecurityNumber:void, +setGender:void
El negativo indica que es privado, el positivo indica que es público.
La clase es la plantilla/esqueleto. Cuando instanciamos un Objeto, lo que hacemos es crer un Objeto. Un objeto no puede existir si no existe la clase.

Ejercicio de abstracción: realizaremos una abstracción completa de una computadora (sin periféricos). ESte ejemplo nos permitirá visualizar cómo pueden interactuar diversas Clases para formar un todo.
Componentes: motherboard, RAM, CPU, fuente de alimentación (PSU: power suply unit), disco duro.

Motherboard necesita que exista CPU, RAM, PSU y Storage. Storage necesita OS. CPU, RAM, PSU Y OS son independientes.
Paso 1. Abstraer
Paso 2. Identificar prioridades.
Paso 3. Descodificar
(1a) CPU: Modelo, marca, velocidad, hilos, núcleos
(1b) RAM: Modelo, marca, capacidad, frecuencia, RGB
(1c) PSU: Modelo, marca, voltaje, corriente, certificación
(1d) OS: Modelo, marca, versión
(2) Storage: Modelo, marca, capacidad, vel. lectura, vel. escritura, tipo, OS
(3) Motherboard: Modelo, marca, CPU, RAM, PSU, Storage
Con la palabra reservada (".this") llamamos lo que está dentro de la clase. Se ocupa para poder acceder a algo que está dentro de la misma clase.
No hay clase principal, solo método principal. El `public static void main(String[] args) {}`
ES **público** porque debe ser accesible en todo el sistema, es **static** porque siempre debe existir (incluso aunque no haya instancia del objeto), **void** no retorna nada.
`System.out.printl()` donde System es una clásica estática, por eso podemos acceder a `.out` sin instanciarlo. `printl` es un static void.

Tarea de práctica: realizar una abstacción lo más detallada posible de un libro de texto. 
1. Enlistar todos los atributos de un libro.
2. Enlistar todos los métodos que puede realizarse con un libro.
3. Crear un archivo llamado Libro.java donde se contenga la clase Libro con sus métodos y atributos. Solo deben incluirse métodos setters y getters.


(1) Libro: título, autor, isbn, editorial, fecha de publicación, género literario, # de páginas
(2) Autor: nombres, apellidos, edad, fecha de nacimiento, nacional 
(3) Editorial: nombre, país origen, fecha de fundación, fundador
## 19/03/2024
El nombre general de los setters y los getters es accessors y mutators. El accessor nos da acceso a los datos, el mutator es para crear mutaciones de los valores. En Java, los conocemos como getters y setters.
La diferencia entre double y float es que double duplica la precisión del número (mayor cantidad de decimales).
Un método estático es uno que le pertenece a la plantilla (Clase). Los objetos no pueden usar static, no se puede acceder desde los objetos.
Los constructores se llaman igual que la clase y no llevan tipo de dato. El primer uso es para tener valores por defecto.
Polimorfismo es cuando tenemos muchas cosas de muchas formas. Es decir, los métodos que tienen varios con el mismo nombre pero diferentes métodos.
Los dos pilares de POO son el encapsulamiento y el polimorfismo.
Paradigma estructurado es determinar un problema, determinar la lista de pasos, seguir ordenadamente esos pasos.

### 04. Herencia
La herencia es el tercer pilar de POO.
Hay subcategorías.
Padre e hijo. A la clase generalizada se le llama Superclase Clase Padre. A la clase específica se le llama Subclase o Clase Hijo. Se heredan todos los Atributos y Métodos, pero se preserva el sentido del Encapsulamiento.
Cada clase es una caja. Cada caja tiene 3 partes: el nombre de la clase, atributos y métodos. Las flechas hacia arriba (en blanco) indica que la clase hereda de otra clase. Menos es privado, más es público.
Ejercicio de clase: hacer Fortnite en papel