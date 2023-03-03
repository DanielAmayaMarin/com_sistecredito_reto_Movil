Automatización Móvil Reto Sistecredito
---  

El framework utilizado para la automatización de las pruebas es Serenity BDD utilizando el patron de diseño Screenplay  
Link de referencia: https://serenity-bdd.github.io/docs/guide/user_guide_intro

Requisito para ejecutar:
+ **Java 1.8**
+ **gradle 6 o superior**

Ejecución de pruebas
---  

Para ejecutar el proyecto completo utilizar el comando:
```
 gradle test   
```  
Actualmente la automatización cuenta con los siguientes tags:

Tag Global: ```  @CompraProducto  ```
Tag Registrar usuario: ```  @RegistrarUsuario  ```
Tag Agregar producto: ```  @AgregarProductoCarrito  ```

Para ejecutar un runner específico :

```  gradle clean test -Dtest.single=MiRunner  ```   
```  gradle clean test -Prunner=MiRunner  ```
Para ejecutar diferentes runners separándolos por comas:
```  gradle clean test -Prunner=PrimerRunner,SegundoRunner  ```
Para Generar la evidencia de pruebas:
```  gradle aggregate  ```
Aunque el proyecto por si solo genera la evidencia automaticamente una vez finalice la ejecución.
# Ejemplo comandos de ejecución:
```   gradle clean test -Dtest.single=LoginRunner aggregate  ```  