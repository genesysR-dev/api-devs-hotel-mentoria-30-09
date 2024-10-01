# API REST para Sistema de Gestión del Hotel Alura

Este repositorio contiene una parte del código para una API REST para un sistema de gestión de hotel desarrollada con Spring Boot y utiliza MySQL como base de datos. La API permite la gestión de reservas y se incluye una colección de Postman para facilitar la prueba y la interacción con la aplicación.
realizada durante una mentoria del Bootcamp Java de Alura.

## Tecnologías Utilizadas
**Spring Boot:** Spring Boot es un framework de Java que simplifica el desarrollo de aplicaciones web y APIs RESTful.

**MySQL:** MySQL es un sistema de gestión de bases de datos relacionales ampliamente utilizado.

## Funcionalidades
La API ofrece las siguientes funcionalidades principales:

Creación, actualización y eliminación de reservas

## Prueba la API
Puedes probar la API utilizando la colección de Postman proporcionada en este repositorio. Sigue estos pasos:

Descarga e instala Postman desde postman.com.

Abre Postman y importa la colección HotelAlura_management.postman_collection.json que se encuentra en la carpeta postman.

En la colección, encontrarás ejemplos de solicitudes para crear reservas, consultar información y más.

Asegúrate de que la aplicación esté en ejecución localmente siguiendo las instrucciones en el README del proyecto.

Realiza las solicitudes de prueba utilizando Postman.

## Configuración del Entorno de Desarrollo
Para ejecutar la API localmente, sigue estos pasos:

1. Clona este repositorio:
```
git clone https://github.com/tu-usuario/tu-repositorio.git 
```
2. Configura la base de datos MySQL. Asegúrate de que MySQL esté instalado y crea una base de datos llamada hotel_management. También deberás configurar las credenciales de acceso en el archivo application.properties.

3. Compila y ejecuta la aplicación:
   Esto puedes realizarlo mediante la linea de comandos con:
```   
    cd tu-repositorio
   ./mvnw spring-boot:run
```
O a través del IDE con el que estes trabajando, en mi caso IntelliJ.


#### La API estará disponible en http://localhost:8080.

## Contribuciones
¡Siéntete libre de contribuir al desarrollo de este proyecto! Puedes abrir problemas (issues) o enviar solicitudes de extracción (pull requests) con mejoras.
