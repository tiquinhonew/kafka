# Consumidor de Mensagens Kafka com Spring

Este projeto foi desenvolvido no curso [Aprenda a usar o Apache Kafka em seus serviços
](https://picpay.udemy.com/course/apache-kafka-valdir/learn/). Seu objetivo é produzir e consumir mensagens no ecosistema Kafka usando Spring Boot. Além disso, o projeto inclui um arquivo Docker Compose para facilitar a configuração e execução da infraestrutura necessária, incluindo Zookeeper, Kafka, Kafdrop e os serviços relacionados.

## Funcionalidades Principais

- Consumo assíncrono de mensagens Kafka.
- Processamento de mensagens provenientes do tópico Kafka.
- Utilização do Docker Compose para subir toda a infraestrutura necessária.

## Pré-requisitos

- Docker
- Docker Compose

## Configuração e Execução

1. Clone o repositório para o seu ambiente local:

    ```none
    git clone https://github.com/tiquinhonew/kafka
    ```

2. Navegue até o diretório do projeto:

    ```none
    cd nome-do-repositorio
    ```

3. Execute o Docker Compose para iniciar a infraestrutura:

    ```none
    docker-compose up -d
    ```

4. Aguarde até que todos os serviços estejam em execução.

---

## Contribuindo

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
