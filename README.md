# PARCIAL 1 - TALLER DE VERIFICACIÓN DE CONOCIMIENTOS TÉCNICOS 

se realizo el parcial propuesto de "TALLER DE VERIFICACIÓN DE CONOCIMIENTOS TÉCNICOS " con despliegue y uso en heroku 

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
git clone https://github.com/memo1019/PARCIAL1-AREP
```
luego ingresaremos a la carpeta dede el cmd o la consola:
```
cd /PARCIAL1-AREP
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
java -cp target/classes;target/dependency/* edu.escuelaing.arep.app.App
```
Luego vaya a http:// localhost:4567/clima?lugar="la ciudad que desea ver" para ver el programa desplegado localmente

Ponga sus casos de prueba (recibira el json de la aplicacion de cada ciudad).

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


## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* Git - Version Control  
* [Heroku](https://www.heroku.com)

## Despliegue en Heroku
### Clima Bogota
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://peaceful-lowlands-99103.herokuapp.com/clima?lugar=cucuta)


## Autor

* **Guillermo Alfonso Castro Camelo** - [Memo1019](https://github.com/memo1019)

## Licensia

This project is licensed under the GNU v3.0 License - see the [LICENSE](LICENSE.txt) file for details
