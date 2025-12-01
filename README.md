# Microsserviço Notificação SMS - Backend Java API RESTful


## Índice

- [Descrição](#descrição)
- [Tecnologias e Ferramentas](#tecnologias-e-ferramentas)
- [Estrutura do Projeto](#estrutura-do-projeto)
  - [Configuração](#configuração)
  - [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Recursos Adicionais](#recursos-adicionais)
- [Implementações Futuras](#implementações-futuras)
- [Contato](#contato)

## Descrição

Este repositório contém um microsserviço desenvolvido em Java 17 para envio de notificações SMS. Ele consome mensagens de uma fila RabbitMQ, processa essas mensagens e envia notificações SMS para os clientes mencionados em cada mensagem.

Esse microsserviço faz parte de um sistema maior de CRM e é integrado com outro microsserviço, que é responsável pelo gerenciamento de clientes e tickets.

Para saber mais sobre o microsserviço CRM, que se comunica com este através de mensageria RabbitMQ AMPQ, consulte o repositório CRM Microsserviço disponível em [https://github.com/JoabioVilela/java-restful-api-crm](https://github.com/JoabioVilela/java-restful-api-crm).


## Tecnologias e Ferramentas

- Java 17
- Microsserviços
- RabbitMQ
- Maven
- Spring Framework

  
## Estrutura do Projeto

### Configuração

- As configurações para RabbitMQ e MySQL estão no arquivo:
  `src/main/resources/application-dev.properties`
- O arquivo `compose.yaml` na raiz do projeto contém o serviço **MySQL** configurado para execução com **Docker Compose**.
- Para o envio de SMS, o serviço pode ser configurado para integração com APIs de SMS de terceiros.
 
### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas na sua máquina:

- **Java 17+**
- **Maven**


## Como Executar

### 1. Clone o repositório
 
bash

`git clone <URL_DO_REPOSITORIO>`

`cd <PASTA_DO_REPOSITORIO>`

isto é:

bash

`git clone git@github.com:JoabioVilela/notificacaosms.git`

`cd notificacaosms`

### 2. Inicie os serviços necessários

- ### Banco de dados MySQL:

bash

`docker compose up -d`

- ### RabbitMQ:

bash

`docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management`

### 3. Compile e execute

Execute o microsserviço. Ele estará ouvindo a fila RabbitMQ.


## Recursos Adicionais

### Mensageria

- Este microsserviço consome mensagens da fila RabbitMQ para enviar notificações SMS.

- Utiliza a Dead Letter Queue para mensagens que não puderam ser processadas.

- Garantia de alta disponibilidade com dois níveis de resiliência.

### Integração com Microsserviço CRM

 - O microsserviço CRM é responsável por gerar as mensagens que serão consumidas por este microsserviço.

- As mensagens contêm os dados do cliente e os detalhes da notificação que precisa ser enviada.

## Implementações Futuras

- Testes unitários com JUnit
- Implementação de Frontend utilizando Angular

## Contato

Se precisar de suporte ou tiver dúvidas, entre em contato ou abra uma Issue neste repositório.

Atenciosamente,

Joabio Vilela

Email: joabio.vilela@gmail.com

LinkedIn: https://www.linkedin.com/in/joabiovilela
