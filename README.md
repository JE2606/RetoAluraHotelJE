# RetoAluraHotelJE

#challengeonehotelaluralatam5

Reto Backend Alura Hotel

Descripción

Este proyecto fue desarrollado en Java como parte del Reto Backend proporcionado por Alura Latam. Se trata de una aplicación de escritorio diseñada para la gestión de reservas y el registro de usuarios en el contexto de un hotel. Además, cuenta con funcionalidades para buscar y filtrar datos en una tabla. La aplicación se conecta a una base de datos MySQL para almacenar y recuperar la información necesaria.

Instrucciones de Uso

Usuario y contraseña.
admin1 (Usuario)
root (contraseña)

Requisitos

Antes de ejecutar la aplicación, asegúrate de tener los siguientes requisitos en tu entorno de desarrollo:

Java Development Kit (JDK) instalado.
MySQL Server instalado y configurado con la base de datos necesaria.
Bibliotecas Java necesarias (incluidas en el proyecto o proporcionadas por Alura Latam).
Configuración de la Base de Datos
Inicia tu servidor MySQL.
Crea la base de datos para el proyecto y asegúrate de configurar las credenciales adecuadas en la aplicación.
Ejecuta los scripts SQL proporcionados para crear las tablas necesarias y poblar la base de datos con datos iniciales si es necesario.

Ejecución

Abre el proyecto en tu entorno de desarrollo Java favorito.
Ejecuta la aplicación desde la clase principal HotelApp.java.
La aplicación se iniciará y podrás comenzar a gestionar reservas y usuarios.

Capturas de Pantalla

Esta es la pantalla de inicio.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/6a64b7c3-f12e-4f3c-ae99-9f5049f68451)

Veremos qué sucede si presionamos el botón 'Salir' en la pantalla de inicio.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/3996483e-1870-424b-8582-c56072463b14)

Cuando le demos al botón de 'Inicio', veremos la siguiente pantalla de inicio de sesión.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/e92fb84b-c55a-49a1-9863-98b4cc8e229d)

Si le damos a 'Continuar' y los campos están vacíos, veremos la siguiente advertencia.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/77777fff-f0f1-418a-9237-7460f5508202)

Y esto sucede si ingresamos la contraseña o el usuario incorrectamente.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/510fc745-a022-4e97-89c5-fad103bb7249)

Este mensaje aparecerá cuando ingresemos correctamente los datos.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/9db257d8-e388-4371-af80-92b31caf1072)

Este es el menú principal.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/53e3aac8-253f-41f6-bda0-493901df8476)

A partir de esta pantalla, cuando oprimamos el botón 'Salir', aparecerá esta opción. Si le damos a 'Sí', nos enviará a la pantalla de inicio.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/b8e4d5fc-deab-4d59-9fe3-41bc46bf6da7)

Esta es la pantalla de reserva.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/996e4694-c870-4bb0-a4f8-e0e6072b3ace)

Si intentamos continuar con algún campo vacío, nos aparecerá este aviso.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/fb5f744e-11a1-4521-85f5-0d98212f10f9)

Al completar todos los datos de la reserva correctamente, nos aparecerá este mensaje y nos llevará a la pantalla de registro de huéspedes.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/71624680-f7d1-4507-88ef-e4519d1030c5)

Esta es nuestra pantalla de registro de huésped.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/dfbfc850-5114-46ac-b21e-4afdac5f1c03)

Si le damos al botón con forma de 'X', nos saldrá la siguiente pantalla, la cual, si la oprimimos, nos permitirá regresar al menú solo con la reserva registrada.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/d26808cb-1f54-4b49-9891-bdbb40791af7)

Si le damos a 'Guardar' con alguno de los campos incompletos, nos aparecerá el siguiente mensaje.
Ojo, el campo de número de reserva se genera automáticamente cuando guardamos la reserva y continuamos. Por eso, se puede apreciar que dicho campo está completo.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/ecdf8b25-8aab-4c92-8275-98e3da8c9ac3)


Si intentamos ingresar un caracter incompatible con su campo, nos saldrá este mensaje.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/4053f04e-e99a-4a74-a1ad-21234924976a)

Al completar todos los datos correctamente y darle al botón 'Guardar', nos saldrá este mensaje que, al oprimir el botón, nos devolverá al menú principal.

<img width="660" alt="image" src="https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/c6b9c89b-962a-466e-b5d9-f943445f6e89">

Entonces, accederemos a nuestra pantalla de búsqueda de reservas, donde podremos ver las reservas y los registros que tenemos

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/329a91f9-b768-435c-80e5-96f7636f1c7f)

Tendremos dos botones, uno donde podremos obtener en nuestra tabla las reservas y otro donde obtendremos los registros de huéspedes. Por defecto, vendrá en reserva.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/55fe3425-3d91-4ce3-87d2-607d09db7a5f)

Al presionar las filas, podremos editar los campos disponibles. Al cambiarlos y presionar el botón 'Guardar cambios', nos saldrán los siguientes mensajes.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/a1de697c-1e5e-4e32-9845-d9524d75dcdc)


![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/d615bab5-a072-47c6-b095-99c2077398f9)

También, al seleccionar una fila, podremos utilizar el botón 'Eliminar', que al presionarlo nos enviará los siguientes mensajes. Si eliminamos una fila, se eliminará de la base de datos y de la tabla.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/95069ed2-e775-499c-8f85-456579a5a2c4)

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/f3a0492f-12b5-41b4-b3fb-bde291688a07)

"En la parte superior tendremos una caja de texto donde al escribir algún dato de reserva o de registro, al presionar la lupa se buscará el registro que tenga similitud con el dato ingresado.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/42e00aca-58ab-4794-b624-c9d96ebbba7f)

Y, por último, nuestro botón de regresar que hemos visto en casi todas nuestras pantallas, este nos regresará a la pantalla anterior.

![image](https://github.com/JE2606/RetoAluraHotelJE/assets/131697277/02739c16-b7a9-4ec1-934d-f8cd80d314c5)


Contribución

Este proyecto se inspiró en el Reto Backend proporcionado por Alura Latam. Además, se utilizaron imágenes de Flaticon para algunos elementos de la interfaz gráfica.

Si deseas contribuir a este proyecto, por favor sigue estas pautas:

Abre un issue para discutir los cambios que deseas realizar.
Fork del repositorio y trabaja en tu propia rama.
Envía un pull request detallado describiendo tus cambios y por qué deberían ser fusionados.

Información de Contacto

Para obtener más información sobre este proyecto o ponerse en contacto con el desarrollador, puedes visitar mi perfil de LinkedIn:

LinkedIn - [Juan Elías HJ](https://www.linkedin.com/in/juan-elias-hj)

Estado del Proyecto

Este proyecto ya no se encuentra en desarrollo activo y no está recibiendo actualizaciones. Sin embargo, aún puede ser útil como referencia o punto de partida para proyectos similares.
