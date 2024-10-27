# API de Gestión de Monstruos

![halloween](https://raw.githubusercontent.com/fjmarson/Api-Monstruos/refs/heads/main/src/main/resources/images/halloween.png)

API de Gestión de Monstruos para un desafío de Halloween, construida con Java y Spring Boot. Permite realizar operaciones CRUD sobre monstruos y proporciona documentación interactiva a través de Swagger.

## Descripción

Esta API permite gestionar una colección de monstruos, incluyendo la creación, lectura, actualización y eliminación de registros. Utiliza Spring Boot para el backend y Thymeleaf para el frontend. La base de datos está en MySQL.

## Funcionalidades

- **CRUD**: Crear, leer, actualizar y eliminar monstruos.
- **Documentación**: Interfaz Swagger para interactuar con la API.
- **Autenticación**: Seguridad básica para proteger las operaciones.

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Swagger
- MySQL
- Thymeleaf

## Configuración

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/fjmarson/Api-Monstruos.git


2. Crea tu base de datos con MySQL Worbench:
   
-- Crear la base de datos

CREATE DATABASE monstruos;

-- Usar la base de datos creada

USE monstruos;

-- Crear la tabla monstruo

CREATE TABLE monstruo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255),
    nivel_amenaza INT,
    nombre VARCHAR(255),
    tipo VARCHAR(255)
);

3. Configura tus variables de entorno
   
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

app.security.user=${USER_NAME}
app.security.password=${USER_PASSWORD}

4. Ejecuta la aplicación:

./mvnw spring-boot:run

## Endpoints:

- Lista los monstruos: http://localhost:8080/monstruos

![monstruos](https://raw.githubusercontent.com/fjmarson/Api-Monstruos/refs/heads/main/src/main/resources/images/monstruos.png)

- Agregar un nuevo monstruo: http://localhost:8080/monstruos/new

 ![new](https://raw.githubusercontent.com/fjmarson/Api-Monstruos/refs/heads/main/src/main/resources/images/new.png)

- Editar un monstruo: http://localhost:8080/monstruos/edit/(id)

![edit](https://raw.githubusercontent.com/fjmarson/Api-Monstruos/refs/heads/main/src/main/resources/images/edit.png)

- Eliminar un monstruo: http://localhost:8080/monstruos/delete/(id)

![delete](https://raw.githubusercontent.com/fjmarson/Api-Monstruos/refs/heads/main/src/main/resources/images/delete.png)

## Contribuciones

¡Las contribuciones son bienvenidas! Si tienes ideas para mejorar la API o encuentras algún problema, no dudes en abrir un _issue_ o hacer un _pull request_ en el repositorio. 

Este código fue desarrollado por Fernando Marson como parte de un desafío de Halloween. ¡Gracias por interesarte en el proyecto y por cualquier contribución que puedas hacer para mejorarlo!

