# Controle de investimentos
Aplicação sendo desenvolvida no laboratório de Engenharia de Software - C214.

## Descrição
Projeto desenvolvido na linguagem Java, na IDE Eclipse utilizando dos conceitos de POO e Engenharia de Software. O objetivo da aplicação é fazer o gerenciamento e cadastro de uma carteira de investimentos.

## Funcionalidades
A aplicação contém algumas funcionalidades, como:
 - [X] Cadastro de Renda fixa
 - [ ] Cadastro de Renda variável
 - [X] Gerar um arquivo Json
 - [X] Gerar um arquivo CSV
 
 ## Bibliotecas
 As seguintes bibliotecas estão sendo utilizadas na construção do projeto:
 - [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)
 - [CSV](https://mvnrepository.com/artifact/com.opencsv/opencsv)
 
 ## Ferramentas
 As seguintes ferraments estão sendo utilizadas na construção do projeto:
  - [Maven](https://maven.apache.org)
  
  ## Como usar?
  
  ## Requisitos
   - Maven-bin
   - Java versão 11+
   ### Obs: Certifique-se de ter todas as variáveis de ambiente configuradas
   
   ### Clone
   Clone este repositório na sua máquina local
   ```sh
   git clone https://github.com/jpgSouza/carteira-investimentos.git
   ```
   
   ### Comandos
   Dentro da pasta do projeto, na raíz onde se encontra o arquivo __pom.xml__
   ```sh
   mvn clean package
   ```
   Entre na pasta __target__ e execute o __.jar__
   ```sh
   java -jar maven-project.jar
   ```

   
