# java-base-project

Esta es una plantilla de proyecto diseñada para: 

* Java 17. :warning: Si bien el proyecto no lo limita explícitamente, el comando `mvn verify` no funcionará con versiones más antiguas de Java. 
* JUnit 5. :warning: La versión 5 de JUnit es la más nueva del framework y presenta algunas diferencias respecto a la versión "clásica" (JUnit 4). Para mayores detalles, ver: 
  *  [Apunte de herramientas](https://docs.google.com/document/d/1VYBey56M0UU6C0689hAClAvF9ILE6E7nKIuOqrRJnWQ/edit#heading=h.dnwhvummp994)
  *  [Entrada de Blog (en inglés)](https://www.baeldung.com/junit-5-migration) 
  *  [Entrada de Blog (en español)](https://www.paradigmadigital.com/dev/nos-espera-junit-5/)
* Maven 3.8.1 o superior

## Ejecutar tests

```
mvn test
```

## Validar el proyecto de forma exahustiva

```
mvn clean verify
```

Este comando hará lo siguiente:

 1. Ejecutará los tests
 2. Validará las convenciones de formato mediante checkstyle
 3. Detectará la presencia de (ciertos) code smells
 4. Validará la cobertura del proyecto

## Entrega del proyecto

Para entregar el proyecto, crear un tag llamado `entrega-final`. Es importante que antes de realizarlo se corra la validación
explicada en el punto anterior. Se recomienda hacerlo de la siguiente forma:

```
mvn clean verify && git tag entrega-final && git push origin HEAD --tags
```

## Configuración del IDE (IntelliJ)

### Usar el SDK de Java 8

1. En **File/Project Structure...**, ir a **Project Settings | Project**
2. En **Project SDK** seleccionar la versión 1.8 y en **Project language level** seleccionar `8 - Lambdas, type annotations, etc.`
![image](https://user-images.githubusercontent.com/39303639/142300569-24dd57c4-a25d-40b4-ac77-7111912dbcc5.png)

### Tabular con dos espacios

1. En **File/Settings...**, ir a **Editor | Code Style | Java**.
2. Cambiar **Tab size**, **Indent** y **Continuation indent** a 2, 2 y 4 respectivamente:
![Screenshot_20210614_170636](https://user-images.githubusercontent.com/39303639/142298802-47b30a7d-f22b-441a-84a1-5241cb9354a8.png)

### Instalar y configurar Checkstyle

1. Instalar el plugin https://plugins.jetbrains.com/plugin/1065-checkstyle-idea:
2. Configurarlo activando los Checks de Google y la versión de Checkstyle `== 8.35`:
![image](https://user-images.githubusercontent.com/39303639/142299662-ca0ed8f5-03e2-4811-b0eb-0549926f422b.png)

### Usar fin de linea unix
1. En **File/Settings...**, ir a **Editor | Code Style**.
2. En la lista **Line separator**, seleccionar `Unix and OS X (\n)`.
 ![image](https://user-images.githubusercontent.com/39303639/142300119-8a7a0ae4-2fec-44a7-9bfb-796b93bdea04.png)

