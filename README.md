# calculadoraAES
Calculadora con peraciones basicas

Webservices calculadora con imagen docker 

1. Ubicarse dentro de la ruta de la carpeta calculadoraAES
2. Compilar y generar la imagen con el comando docker build -f Dockerfile -t calculadora .
3. Verificar que se haya cargado la imagen con el comando docker image ls
4. Correr la aplicación con el comando docker run -p 8080:8080 calculadora
en caso que el puerto se este usando con otra aplicacion cambiar por el que se tenga disponible

Para consumir el servicio debe ingresar de la siguiente forma: http://192.168.99.100:8080/services/calculadoraAES/v1/

Para visualizar la definicion del servicio ver el archivo swagger.json que se encuentra en la raiz del proyecto o ir a http://192.168.99.100:8080/swagger-ui.html
