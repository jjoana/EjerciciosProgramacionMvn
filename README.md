# EjerciciosProgramacionMvn
Hoja de Ejercicios de clase

## Ejercicios Maven
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
