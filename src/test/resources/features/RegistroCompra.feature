@CompraProducto
Feature: Registro y compra

  Como futuro cliente de dafiti
  Quiero registrarme y agregar un producto al carrito
  Para comprarlo

  @RegistrarUsuario
  Scenario Outline: Registro Exitoso en mundo Dafiti
    Given Daniel abre la app de Dafiti
    When Ingreso los datos de registro
      | nombres   | apellidos   | numerodocumento   | celular   | correoelectronico   | contrasena   | fechanacimiento   |
      | <nombres> | <apellidos> | <numerodocumento> | <celular> | <correoelectronico> | <contrasena> | <fechanacimiento> |
    Then válido que el registro sea exitoso <correoelectronico>

    Examples:
      | nombres | apellidos | numerodocumento | celular    | correoelectronico | contrasena | fechanacimiento |
      | Juan    | Martinez  | 1234567892      | 3188467090 | prueba321234ur@gmail.com  | Cambio23+  | 01072000        |

  @AgregarProductoCarrito
  Scenario Outline: Agregar un producto al carrito
    Given Daniel inicio sesión en la app de Dafiti
      | correoelectronico   | contrasena   |
      | <correoelectronico> | <contrasena> |
    When selecciono el producto al carrito
      | categoria   | producto   | talla   |
      | <categoria> | <producto> | <talla> |
    Then Válido que el producto seleccionado exista
      | producto   | talla   |
      | <producto> | <talla> |

    Examples:
      | correoelectronico | contrasena | categoria | producto                                                    | talla |
      | prueba321234ur@gmail.com  | Cambio23+  | ZAPATOS   | Tenis Running Negro-Gris-Blanco adidas Performance Galaxy 6 | 40    |



