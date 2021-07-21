# Spring Boot Kafka
Esse projeto tem como objetivo publicar e consumir uma mensagem no Kafka da forma mais simples possivel
## Rodando o projeto

Para simplificar, vamos rodar o Kafka no docker, dessa forma nao sera necessario nenhuma instalacao do Kafka
### Kafka
No diretorio raiz do projeto, utilize:
```bash
docker-compose up -d
```
Para parar os containers, utilize:
```bash
docker-compose down
```

### Spring Boot
Para subir o spring via linha de comando, utilize:
```bash
gradle bootRun
```
Voce pode subir o projeto normalmente utilizando sua IDE

## Testando o projeto
Vamos fazer um POST da mensagem e a partir dos logs sera possivel ver o producer enviando a mensagem e o consumer consumindo a mesma:
```bash
curl --location --request POST 'localhost:8081/messages?message=ola%20kafka'
```
