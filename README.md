# testfalabella

Ejecutar en postman:

http://localhost:8080/api/encode?word=9Mel

Debiese arrojar "Falabella es el mejor retail" y por consola debiese salir la palabra codificada "OU1lbA=="

para decodificar , ejecutar lo siguiente en postman

http://localhost:8080/api/decode?codedword=OU1lbA==

donde "codedword" es la palabra devuelta por consola


Para Dockers , construir la imagen docker en la raiz del proyecto con el comando

docker build -t "nombre de la imagen" .

y luego correrla con el comando

docker run -p 8080:8080 "nombre de la iamgen"
