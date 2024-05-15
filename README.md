# Dio - Trilha Java Básico

### Autor
- [Leandro Sousa](link do repositório)

## Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Criei um projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, foi criado a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revisando as regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48

###### Foi revisado sobre terminal, main args e a classe Scanner
2. Assim, foi permitindo que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, de acordo com o exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revisei sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema consegue exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*
