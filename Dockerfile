# Usando a imagem base do OpenJDK 21
FROM openjdk:21-jdk-slim

# Instalando o Git e o Maven para baixar o código-fonte e construir o projeto
RUN apt-get update && apt-get install -y git maven

# Definindo o diretório de trabalho no container
WORKDIR /opt/df-bootcamp-arq-software

# Clonando o repositório Git do código-fonte
RUN git clone https://github.com/carlospauluk/df-bootcamp-arq-software.git .

# Certificando-se de que o Maven está corretamente configurado e o projeto seja compilado
RUN mvn clean install -DskipTests

# Expondo a porta 8080
EXPOSE 8080

# Comando para rodar a aplicação após o build
CMD ["java", "-jar", "target/desafiofinal-0.0.1-SNAPSHOT.jar"]
