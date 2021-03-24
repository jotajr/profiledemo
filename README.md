# Exemplo de Profile

### Introdução
Este projeto é um exemplo de como utlilizar profiles para diferentes ambientes utilizando maven e spring. O projeto é executado utilizando o intellij, para isso, no perfil de execução da aplicação maven deve-se colocar uma variável de ambriente para a VM Options com o ambiente a ser utilizado na execução, por exemplo:

```-Dspring.profiles.active=local```

Será adicionado neste projeto tambem arquivos de logback para cada ambiente.

