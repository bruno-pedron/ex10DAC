docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4-management

cd consumidor
mvn spring-boot:run

cd produtor
mvn spring-boot:run

curl -X POST http://localhost:8080/mensagens \
  -H "Content-Type: text/plain" \
  -d "Olá, RabbitMQ!"

A resposta esperada no terminal será algo parecido com:

Mensagem enviada para a fila: Olá, RabbitMQ!

E no console do consumidor deve aparecer:

Mensagem recebida: Olá, RabbitMQ!
