# IDE de desenvolvimento #

https://spring.io/tools


# Subindo o projeto em um conteiner Docker #

O Spotify criou um plugin para o maven que quando executado sobe um docker pronto com o seu projeto.

https://github.com/spotify/docker-maven-plugin

### Para gerenciar os Containder utilizar (Portainer) ###

https://portainer.io/

Para executa-lo: 

```
docker run -d -p 9000:9000 -v /var/run/docker.sock:/var/run/docker.sock portainer/portainer
```

# Banner #

Podemos colocar uma imagem como start do projeto para isso crie uma imagem PNG com o nome banner.png

Adicionar a imagem no diretório: src/main/resources

E automaticamente o springboot transforma em ASCII e coloca printa no console.


# Actuator #

Actuator é um subprojeto do springboot que ajuda a monitorar e gerenciar a aplicação 

O Actuator permite que sejam monitoradas informações do servidor rodando, muito útil para ver o ambiente em produção. Sua ativação é feita adicionando a dependência: spring-boot-starter-actuator


```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId> 
</dependency>
```

Existem várias ferramentas disponíveis dentro do Actuator através de serviços ReST, vamos destacar algumas: 

* actuator - Lista todos os links disponíveis; 
* dump - Faz um thread dump; 
* env - Mostra properties do ConfigurableEnvironment do Spring; 
* health - Mostra informações do status da aplicação; 
* metrics - Mostra métricas da aplicação; 
* mappings - Exibe os caminhos dos @RequestMapping ; 
* trace - Exibe o trace dos últimos 100 requests HTTP.


# Definindo Profiles #

Podemos definir uma classe especifica de um ambiente usando apenas a annotation @Profile("prod")

**Definindo profile padrão:**

no arquivo application.properties adicione: 

```properties
# profile
spring.profile.active=dev
```


