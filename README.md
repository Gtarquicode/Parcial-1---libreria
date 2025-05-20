# Parcial-1---libreria
Libreria
Nota: Un disclaimer o aviso, el primer proyecto que había creado resulto con errores tal vez en las jerarquias y en como lo fui haciendo, eso impidió hacer una lectura clara de los errores y que el código no pudiera correr, por lo tanto cree un nuevo proyecto que está en la mismo link "Libreria" y desde allí permitió correr bien y corregir cualquier error de escritura.
Objetivo
El objetivo del parcial es crear una estructura que permite tanto a estudiantes como docentes tener acceso a su cuenta privada en la librería y desde ella consultar el catálogo, pero además subir también nuevos libros.
Evaluando eso, tenemos estos 3 items en los que:
![image](https://github.com/user-attachments/assets/c85b46b1-9220-4b50-a65c-5f9eab4353ca)

Cada uno de ellos marcados y explicado el código en las siguientes capturas de pantalla, inicialmente se piensa en una división de clases que permitan diferenciar la accesibilidad del usuario (Dependiendo si es estudiante o docente). Posteriormente y siguiendo la lógica de que si es una universidad el docente sería quien debe subir el material y no el estudiante. 
Simulador de una biblioteca universitaria desarrollado en Java, que permita el registro de usuarios (profesores y estudiantes), gestión de libros y búsqueda de libros por título, todo a través de una interfaz de consola.

Yo quise dividir las principales funciones en estos puntos

Registro de usuarios (profesores y estudiantes).

Registro de libros (solo profesores).

Búsqueda de libros por título (profesores y estudiantes).

Visualización de detalles del libro encontrado.

git clone https://github.com/Gtarquicode/Parcial-1---libreria.git

👥 Roles de Usuario

Profesor: Puede registrar nuevos libros y puede buscar libros por título.
Estudiante: Puede buscar libros por título.
A continuación una presentación con ejemplos de lo que se puede hacer en este programa:

En este ejemplo el profesor "Camilo" Da el registro de dos libros de categorías diferentes, posteriormente podría hacer la búsqueda de ellos.

![image](https://github.com/user-attachments/assets/28cda8a2-8409-4c86-a453-a2ca5d12a68d)

EJEMPLO 2 (Estudiante)

En este ejemplo se registra un estudiante y busca un libro que no está registrado en la biblioteca

![image](https://github.com/user-attachments/assets/ead824f7-af86-453f-a937-2ecc4dc2411d)

EJEMPLO 3 (Encuentra el libro)

Encuentra el libro que ha registrado

![image](https://github.com/user-attachments/assets/be7746ba-37ef-40a7-889d-14bc1e0c7179)


=== Fin del programa ===

Notas Adicionales:
Los profesores pueden registrar múltiples libros en una sola sesión.
La búsqueda de libros no distingue entre mayúsculas y minúsculas.
Si el libro no se encuentra, se mostrará un mensaje indicando que no fue encontrado.
