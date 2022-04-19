# junit-introduction - Mentorama
> Esse projeto é destinado aos meus alunos do curso [Java do Zero ao PRO da Mentorama](https://mentorama.com.br/java-developer)

# Contexto
No dia 19 de abril de 2022 ministrei uma aula sobre testes unitários com JUnit para os alunos do curso Java do Zero da Mentorama.

Esse projeto utiliza o [JUnit](https://junit.org/junit5/) como biblioteca de testes, que pode ser adicionado como uma dependência aos projetos [Maven](https://maven.apache.org/)

O JUnit foi adicionado como [dependência](https://mvnrepository.com/artifact/junit/junit/4.5) no arquivo `pom.xml` presente na raíz do projeto.

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.5</version>
    <scope>test</scope>
</dependency>

```

O diretório `src/test/java` contém os testes que foram criados com propósitos educacionais.
