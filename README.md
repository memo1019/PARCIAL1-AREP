# AREP LABORATORIO 2 - INTRODUCCIÓN AL DISEÑO DE SISTEMAS INFORMÁTICOS

se realizo el taller propuesto de "INTRODUCCIÓN AL DISEÑO DE SISTEMAS INFORMÁTICOS" con ayuda del lavoratorio anteriormente realizado "Introducción a los sistemas complejos, JAVA,MVN y GIT" utilizando listas enlazadas

### PREREQUISITOS

Los prerrequisitos que manejaremos para lograr con exito el desarrollo del laboratorio son:
- Maven
- Git  
- Java
- SparkWeb
- Heroku

### Ejecucion e instalacion
se debe clonar el proyecto con el siguiente comando:

```
git clone https://github.com/memo1019/miprimera-app
```
luego ingresaremos a la carpeta dede el cmd o la consola:
```
cd /Lab02-AREP
```
Finalmente coonstruiremos y compilaremos el proyecto para asi poder ejecutarlo.
```
 mvn package
```
## Pruebas
las podra ver corriendo con el comando 

```
 mvn test
```

## Correr

Para correr el programa tenemos que ejecutar el siguiente comando :

```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.Calculadora.SparkWeb.SparkWebApp
```
Luego vaya a http://localhost:4567/operacion para ver el programa desplegado localmente

Ponga sus casos de prueba (Sólo recibirá números enteros y Float(.) separados por coma "," en otros casos el programa le mostrará y error de entrada en su navegador.

La aplicación se despliega con heroku y el enlace está en la parte inferior de este documento (botón Heroku)

## Diseño

![Diagrama de Clases](/src/site/Resources/DiagramaComponentes.png)

## Documentacion
para realizar la documentacion de javadoc use estos comandos y aqui podra llevar acabo el proceso de creacion de esta documentacion.
```
$ mvn javadoc:javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
si desea ver el javadoc se encuentra en el directorio
```
/target/site
```

Podemos ver la descripcion del proyecto en este pdf [file](/src/site/Resources/lab2.pdf) mostrando el diseño y la estructura del proyecto

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* Git - Version Control  
* [Heroku](https://www.heroku.com)

## Despliegue en Heroku

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://blooming-mesa-19180.herokuapp.com/operacion)


## Autor

* **Guillermo Alfonso Castro Camelo** - [Memo1019](https://github.com/memo1019)

## Licensia

This project is licensed under the GNU v3.0 License - see the [LICENSE](LICENSE.txt) file for details
