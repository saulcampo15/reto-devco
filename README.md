# Reto-Devco
Desarrollo del reto propuesto en el que se realizan pruebas automatizadas a la aplicación [AngularJS](http://todomvc.com/examples/angularjs/#/)

-------------
### Tegnologías Implementadas

El proyecto se realizó utilizando Serenity BDD, Cucumber, y el patrón de diseño Screenplay.

### Requerimientos

Para correr el proyecto se necesita tener instalado Java JDK 1.8 y Gradle. 

El navegador utilizado para realizar las pruebas es Chrome en su version 85, por lo que es es necesario tener instalado
el WebDriver for Chrome para dicha versión, este lo puede descargar de: https://chromedriver.storage.googleapis.com/index.html?path=85.0.4183.87/ 

Una vez descargado el ChromeDriver, en el poyecto modifique el archivo serenity.properties señalando la ruta donde alojó el archivo

(Abajo se muestra como se configuró en este proyecto)

```
webdriver.driver=chrome
webdriver.chrome.driver = src/test/resources/webdriver/chromedriver.exe
chrome.switches = --start-maximized
```
-------------

#### Ejecución 
navegue en el proyecto a la ruta: src\test\java\runner 
una vez en esta se encontrará con la clase PalabraClave.java la cual simplemente deberá correr

### Reportes

Serenity genera los reporte en el directorio: \target\site\serenity

-------------

### Autor
##### Saúl Enrique Campo Pertuz