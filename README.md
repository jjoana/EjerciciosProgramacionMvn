# EjerciciosProgramacionMvn
Hoja de Ejercicios de clase

## Ejercicios

### Ejercicio 10.- Explique qué es List en Java y qué relación guarda con ArrayList.

Una listen java, es una estructura de datos que puede contener varios elementos en una secuencia ordenada.
ArrayList es una clase concreta que implementa la interfaz List

ArrayList es una clase que implementa la interfaz List.


### Ejercicio 12.- Explique qué es una expresion lambda y para qué sirve.
Las expresiones lambda son funciones anónimas, es decir, funciones que no necesitan una clase. El operador lambda (->) separa la declaración de parámetros de la declaración del cuerpo de la función. Las expresiones lambda son un método sin declaración, es decir, sin modificadores de acceso, que devuelve un valor y un nombre. Permiten escribir un método y utilizarlo inmediatamente. Esto es útil en el caso de una única llamada a un método, ya que permite reducir el tiempo de declarar y escribir el método sin tener que crear una clase.


### Ejercicio 18

### 1.- ¿Qué es Maven?

Maven es una herramienta que automatiza el proceso de creación y administración de proyectos desarrollados en el lenguaje de programacion Java.
Cualquier proyecto que se cree mediante Maven, tiene la misma estructura de carpetas. 

Durante el proceso de creación del Proyecto, se genera automaticamente un fichero denominado "pom.xml" el cual es un archivo de configuración utilizado en proyectos de software desarrollados en lenguaje Java que utilizan Apache Maven como herramientas de creación de proyectos. El archivo pom.xml contiene información acerca del proyecto, como el nombre, la versión, la descripción, las dependencias del proyecto, los plugins utilizados, entre otros aspectos.

El archivo pom.xml es muy importante en el uso de Maven, ya que permite que el sistema de construcción Maven compile y empaquete el proyecto correctamente. Además, el archivo pom.xml también puede ser utilizado para automatizar tareas de construcción, pruebas y despliegue del proyecto.

### 2.- ¿Qué es el respositorio central de Maven? ¿Hasta que punto son fiables las bibliotecas que hay en él?

El repositorio central de Maven es mantenido y administrado por la organización sin fines de lucro llamada "The Apache Software Foundation" (ASF). La ASF es una comunidad de desarrolladores de software que desarrolla y mantiene proyectos de código abierto en diversas áreas, incluyendo Apache Maven.

El repositorio central de Maven es un repositorio de artefactos, que contiene una amplia gama de bibliotecas, frameworks y herramientas de software de código abierto, que están disponibles para ser descargados y utilizados por cualquier desarrollador Java. La ASF se encarga de mantener el repositorio central de Maven actualizado y seguro, y de asegurarse de que los artefactos almacenados allí cumplan con los estándares de calidad y licencias adecuados para ser utilizados en proyectos de software.

Al repositorio central de Maven se puede acceder a través de la URL `https://repo.maven.apache.org/maven2/`. Cuando un desarrollador de software utiliza Maven como herramienta para crear un proyecto, el sistema descarga automáticamente los artefactos necesarios del repositorio central de Maven, a menos que ya se encuentren en el repositorio local del desarrollador (debido a que anteriormente a la hora de crear otro proyecto, ya hayan sido descargados).

### 3.- ¿Qué es el repositorio local?

El repositorio local de Maven es un directorio en el sistema de archivos del ordenador. En esta carpeta Maven almacena las dependencias de los proyectos y sus versiones descargadas desde el repositorio remoto (el repositorio central de Maven) para su posterior reutilización en futuros proyectos.

Cada vez que se crea un proyecto con Maven, el sistema primero busca las dependencias en el repositorio local antes de intentar descargarlas del repositorio remoto. Esto acelera el proceso de construcción y reduce la dependencia de la conexión a Internet.

El directorio del repositorio local se encuentra en la carpeta .m2 del usuario del ordeandor (por ejemplo, C:/Users/jesus/.m2/repository en sistemas basados en Windows). El directorio .m2 contiene subdirectorios para cada paquete Maven que el desarrollador ha descargado, junto con sus dependencias.

### Ejercicio 19
### Version descargada
```
    C:\1.2 - Ingeniería Sistemas\Programación II\4.- Pruebas>mvn --version
    Apache Maven 3.8.7 (b89d5959fcde851dcb1c8946a785a163f14e1e29)
    Maven home: C:\Program Files\apache-maven-3.8.7
    Java version: 19.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-19
    Default locale: es_ES, platform encoding: UTF-8
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

### Ejercicio 20.-

### Ejercicio 1.- Cree un proyecto en Maven ejecutando la siguiente instrucción

Comando para la creación del proyecto Maven
```
mvn archetype:generate -DgroupId=pr2.org -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

### Ejercicio 2.- ¿Qué es un arquetipo en Maven?

Para Maven, un arquetipo es una plantilla que se utiliza para crear nuevos proyectos. Estos se utilizan para simplificar el proceso de creación de nuevos proyectos y para asegurar que todos proyectos creados sigan una estructura.
Los arquetipos de Maven se utilizan con el comando `mvn archetype:generate`.



### Ejercicio 3- Explique el fichero pom.xml que hay en directorio my-app que se hagenerado.

El archivo `pom.xml` contiene información importante sobre el proyecto, como el nombre del proyecto, la versión, la descripción, el grupo de artefactos, la licencia, la URL, las dependencias necesarias, los plugins utilizados, etc.

### Ejercicio 4.- Explore el árbol de directorios.

El árbol de directorios es una representación de la estructura de los directorios y archivos de un sistema de archivos.

### Ejercicio 5.-Compile el programa: mvn compile

El comando `mvn compile` se utiliza para compilar el código fuente de un proyecto Maven y lo genera en archivos de clase Java en el directorio de destino `target`.

Este comando también compila los recursos del proyecto que se encuentran en el directorio `src` y los copia en el directorio de destino `target`.


### Ejercicio 6.- Ejecute el programa: mvn exec:java -D exec.mainClass=pr2.org.App

El comando `mvn exec:java -Dexec.mainClass=pr2.org.App` se utiliza para ejecutar una aplicación Java desde la línea de comandos utilizando Maven.

### Ejercicio 7.- Elimine los artefactos generados anteriormente, vuelva compilar y ejecute de nuevo:mvn clean compile /  mvn exec:java -Dexec.mainClass=pr2.org.App

- El comando `mvn clean` elimina todos los artefactos generados previamente por Maven.
- El comando `mvn compile` compila el código fuente y los recursos de la aplicación y los genera en archivos de clase Java
- El comando `mvn exec:java -Dexec.mainClass=pr2.org.App` invoca el plugin de Maven para ejecutar la clase principal.

### Ejercicio 8.- Genere la documentación del proyecto, y explórela:
```
mvn site
cd target/site
firefox index.html &
```
El comando `mvn site` genera la documentación del sitio para tu proyecto de Maven, que incluye informes.
El comando `cd target/site` cambia el directorio de trabajo actual al directorio target/site.

### Ejercicio 9.- Explique en qué consisten las siguientes fases:
```
- Validate: Esta fase se utiliza para validar el proyecto, es decir, verificar si el proyecto es correcto
- Compile: Se compilan los archivos fuente del proyecto y se generan los archivos de clases 
- Test: Se ejecutan las pruebas de unidad del proyecto utilizando una herramienta de pruebas como JUnit.
- Package: En esta fase, se toman los archivos compilados y los empaqueta en un formato específico, como JAR o WAR, que se puede distribuir y utilizar
-Install: En Maven, la fase install se utiliza para instalar un artefacto en el repositorio local de Maven.
-Deploy: En Maven, la fase deploy se utiliza para desplegar el artefacto construido en un repositorio remoto
-Clean: En Maven, la fase clean se utiliza para eliminar los archivos generados por las fases anteriores.
-Site: En Maven, la fase site se utiliza para generar la documentación del proyecto y el sitio web asociado.
```

