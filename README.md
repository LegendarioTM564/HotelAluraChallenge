# Hotel App

Aplicación de escritorio que permite poder registrar, consultar, editar y eliminar reservas de un Hotel.

![Pantalla Inicio](https://i.imgur.com/RksK8RV.png)
## Caracteristicas

- Diseño Escritorio.
- Conexion a base de datos MySQL.
- Permite buscar Huespedes por Apellido.
- Permite buscar reservas por su Numero.
- Sistema de login.




## Tecnologias

- [IntelliJ](https://www.jetbrains.com/es-es/idea/)
- Swing (Interfaz grafica)
- [Maven](https://maven.apache.org/)
- [Jcalendar](https://toedter.com/jcalendar/)
- [MySQL Driver](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.29)
- JPA (Mapeo de Entidades)
## Screenshots

![Pantalla Login](https://i.imgur.com/gbyl7p2.gif)


![Pantalla Login_error](https://i.imgur.com/XPL7MOt.png)

![Pantalla Reservas](https://i.imgur.com/Ovhgwo7.gif)

![Pantalla Reservas_error](https://i.imgur.com/0RtnNCo.png)

![Pantalla Reservas_error](https://i.imgur.com/lwIjk40.png)

![Pantalla Reservas_error](https://i.imgur.com/lwIjk40.png)

![Pantalla Huespedes](https://i.imgur.com/5d5J7rg.gif)

![Pantalla Busqueda](https://i.imgur.com/B12KScl.gif)

![Pantalla Busqueda_Lista](https://i.imgur.com/qIIIcc2.png)



## Descargar e Inicio

Para poder utilizar el programa en su ordenador deberan descargar el proyecto y abrirlo con su IDE (Recomiendo intelliJ).
Una vez descargue las dependencias necesarias para abirir el programa, deberan configurar su base de datos MySQL en el archivo persistence.xml (usuario, contraseña y nombre de la base de datos.)

![Persistence](https://i.imgur.com/3RGPUIT.png)

Deberan crear una tabla "usuario" en su base de datos para poder insertar el "nombre de usuario y password" del login correspondiente. 

Dejo la sentencia en SQL para la creacion de la tabla:

CREATE TABLE usuario(

ID INT AUTO_INCREMENT,

USUARIO VARCHAR(60) NOT NULL,

PASSWORD VARCHAR(150) NOT NULL,

PRIMARY KEY(ID)
)

Sentencia para insertar el nombre de usuario y password:

INSERT INTO usuario (usuario,password) VALUE ("admin","admin123");

Una vez configurado todo, podran darle ReBuild a su proyecto e iniciarlo en su IDE o realizar su JAR correspondiente.
