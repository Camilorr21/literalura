# LiterAlura

Este proyecto consiste en desarrollar un Catálogo de Libros interactivo, llamado **LiterAlura**, manera eficiente. Utiliza tecnologías como Java y Spring Boot para crear una aplicación robusta y escalable.

## Requisitos previos

1. Tener las siguientes variables de entorno configuradas:
   - `DB_HOST`: Host de la base de datos.
   - `DB_PORT`: Puerto de la base de datos.
   - `DB_NAME`: Nombre de la base de datos.
   - `DB_USER`: Usuario de la base de datos.
   - `DB_PASSWORD`: Contraseña de la base de datos.

2. Asegurarse de tener la base de datos creada y configurada antes de ejecutar el programa.

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/Camilorr21/literalura.git
   ```

2. Accede al directorio del proyecto:

   ```bash
   cd literalura
   ```

3. Asegúrate de tener configurado el archivo `application.properties` con las credenciales de tu base de datos.


## Dependencias utilizadas

Este proyecto utiliza las siguientes dependencias:

```
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
		<scope>runtime</scope>
		<optional>true</optional>
	</dependency>
	<dependency>
		<groupId>org.postgresql</groupId>
		<artifactId>postgresql</artifactId>
		<scope>runtime</scope>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>com.fasterxml.jackson.core</groupId>
		<artifactId>jackson-databind</artifactId>
		<version>2.18.2</version>
	</dependency>
	<dependency>
		<groupId>jakarta.validation</groupId>
		<artifactId>jakarta.validation-api</artifactId>
		<version>3.1.0</version>
	</dependency>
</dependencies>
```

## Estructura del proyecto

El proyecto está organizado de la siguiente manera:

- **apiconsumption**: Gestión de consumo de APIs externas.
- **config**: Configuraciones del proyecto.
- **dto**: Objetos de transferencia de datos.
- **model**: Modelos de datos y entidades.
- **principal**: Lógica principal de la aplicación.
- **repository**: Interfaces para interactuar con la base de datos.
- **service**: Servicios para la lógica de negocio.

### Funcionalidades
#### Funcionalidades Obligatorias
1. **Búsqueda de libros por título**:
   - Consulta la API de Gutendex para obtener el primer resultado basado en el título ingresado.
2. **Listado de todos los libros**:
   - Muestra un listado de los libros previamente buscados.
3. **Listado de autores**:
   - Presenta información sobre los autores de los libros buscados.
4. **Consulta de autores vivos en un año determinado**:
   - Lista autores que estaban vivos en un año especificado por el usuario.
5. **Estadísticas de libros por idioma**:
   - Muestra la cantidad de libros en un idioma específico.



#### Funcionalidades Adicionales
- Inserción automática de autores al guardar libros.
- Uso de consultas derivadas para facilitar la interacción con la base de datos.
- Gestión de errores y validación de entradas del usuario.
