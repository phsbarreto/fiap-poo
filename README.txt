# Projeto FiapRide - Filippo

## Informações do Aluno

- [cite_start]**Nome:** Filippo [cite: 97]
- [cite_start]**RM:** [Seu RM] [cite: 99]
- [cite_start]**Turma:** [Sua Turma] [cite: 101]
- [cite_start]**Curso:** Ciência da Computação [cite: 103]
- [cite_start]**GitHub:** [@seu-usuario] [cite: 106]

## Descrição do Projeto

[cite_start]Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos [cite: 8][cite_start], onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana)  [cite_start]e também aplicamos os mesmos conceitos em um Desafio Pessoal paralelo[cite: 144].

## Checklist de Implementação

- [x] [cite_start]Aula 1 - Classes e Objetos [cite: 121, 122]
- [x] [cite_start]Aula 2 - Métodos [cite: 124, 125]
- [x] [cite_start]Aula 3 - Encapsulamento [cite: 127, 128]
- [x] [cite_start]Aula 4 - Construtores [cite: 129, 130]
- [x] [cite_start]Aula 5 - Associação [cite: 131, 132]
- [x] [cite_start]Aula 6 - Herança [cite: 134, 135]
- [x] [cite_start]Aula 7 - Polimorfismo [cite: 137, 138]
- [x] [cite_start]Aula 8 - Classes Abstratas [cite: 140, 141]
- [x] [cite_start]Aula 9 - Interfaces [cite: 143, 144]

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe 'Passageiro'? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`? Pense: E se o FiapRide tiver 1 milhão de usuários? [cite_start]Como a Classe ajuda a resolver isso? [cite: 152, 158, 159]

**Sua Resposta:**
Se o sistema escalar para milhões de usuários, criar variáveis soltas no `main` tornaria o código impossível de manter, cheio de redundâncias e propenso a erros. A classe resolve isso funcionando como um "molde". Ao criar a classe `Passageiro`, definimos uma única vez a estrutura de dados (nome, saldo) e os comportamentos. Assim, o sistema apenas instancia milhões de objetos estruturados na memória usando esse mesmo molde, mantendo o estado de cada usuário isolado.

### Aula 2 - Métodos

**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100.0` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? [cite_start]Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente? [cite: 169]

**Sua Resposta:**
O risco de alterar o saldo diretamente é a perda total de controle sobre a regra de negócio. Sem um método específico, qualquer parte do código poderia atribuir valores negativos ou fraudar o saldo de um passageiro. O método `adicionarSaldo(valor)` encapsula a inteligência: ele recebe o valor, verifica se é uma quantia válida e só então atualiza o saldo interno, protegendo a integridade da aplicação.

### Aula 3 - Encapsulamento

**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o 'get' público, mas perigoso deixar o atributo original público? [cite_start]Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar? [cite: 178, 180, 182]

**Sua Resposta:**
Deixar um atributo público é como entregar o documento original: qualquer parte externa do sistema pode modificá-lo livremente, quebrando a integridade do objeto. Ao usar o modificador `private` no atributo e liberar apenas um método `get` como `public`, nós entregamos apenas uma "cópia" do valor (somente leitura). Assim, o sistema pode consultar a informação, mas não tem poder para alterá-la diretamente.

### Aula 4 - Construtores

**Pergunta:** Na nossa classe 'Veiculo', nós tomamos duas decisões arquitetônicas muito importantes: (1) Nós não criamos o método `setModelo()`. (2) O `setPlaca()` foi criado como privado, e criamos um método público chamado `atualizarPlaca()` para acessá-lo. Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo automaticamente' na sua IDE? [cite_start]Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica? [cite: 194, 197, 198, 200, 201]

**Sua Resposta:**
Gerar "Getters e Setters" automaticamente fere a regra de negócios. O modelo de um carro não muda após sua fabricação, portanto, não deve existir um `setModelo()` – a informação nasce com o construtor. Já a placa do veículo exige validação. Se o `setPlaca` for público, qualquer um altera facilmente. Ocultando o `setter` original como `private` e exigindo o uso do `atualizarPlaca()`, nós obrigamos o sistema a passar por validações antes de permitir a alteração.

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo? [cite_start]Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? [cite: 213, 214, 216]

**Sua Resposta:**
Não seria viável usar apenas a String do nome porque o sistema perderia a referência do objeto principal. A `Viagem` executa ações financeiras. Se passarmos apenas a String, não temos como acessar os métodos do objeto. Exigindo o objeto `Passageiro`, a Viagem consegue acionar métodos vitais do usuário, como `passageiro.descontarSaldo()`.

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de Carro NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`. Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? [cite_start]Qual o princípio das aulas passadas que isso está protegendo? [cite: 231, 233, 234, 235, 236, 237]

**Sua Resposta:**
O Java impede isso para proteger o Encapsulamento. Um atributo `private` pertence unicamente à classe onde foi declarado. Se as classes filhas pudessem mexer nessas variáveis, contornariam todas as validações de segurança da superclasse. Usar `super()` ou métodos garante que os dados da mãe sejam manipulados apenas pelas vias seguras estabelecidas.

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do Carro e da Moto? [cite_start]Por que o contrato precisa existir na base da hierarquia? [cite: 246]

**Sua Resposta:**
Não conseguiríamos chamá-lo. O compilador só tem garantia de que existem os comportamentos definidos na classe mãe. O contrato precisa existir na base para que o polimorfismo funcione: a superclasse diz "O QUE" todos devem fazer, permitindo que o sistema chame aquela ação confiando que cada filha específica vai saber "COMO" fazer através da sobrescrita.

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo especifico? Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? [cite_start]Pense: Se esquecermos de colocar 'abstract', qual o risco que corremos? [cite: 258, 260, 261, 262]

**Sua Resposta:**
Não faz sentido; "Veículo" é apenas um conceito. Se esquecermos o `abstract`, corremos o risco de permitir o `new Veiculo()`. Isso geraria objetos incompletos no sistema, sem regras específicas, quebrando a lógica do aplicativo. A palavra `abstract` proíbe instâncias vazias de significado real.

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)? Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`? [cite_start]Como as interfaces resolvem esse problema? [cite: 272, 274, 275, 277, 278]

**Sua Resposta:**
A herança múltipla gera ambiguidade: o compilador não saberia qual método `ligar()` executar. As interfaces resolvem isso porque definem "contratos" sem implementação. A classe pode implementar várias interfaces sem conflito, pois o código real do método será escrito exclusivamente pela própria classe.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)
[cite_start]**Qual foi o domínio que você escolheu para seu projeto pessoal?** [cite: 144]
Domínio de gestão de hipertrofia e equipamentos de academia (Bodybuilding), com foco em uma máquina de `PuxadaArticulada`.

[cite_start]**Quais classes você criou?** [cite: 147]
- `Ajustavel` (Interface - Contrato de ajustes biomecânicos)
- `MaquinaAcademia` (Classe Abstrata - Base da hierarquia focada em grupos musculares)
- `PlanoManutencao` (Associação)
- `PuxadaArticulada` (Subclasse que consolida as regras de carga e estrutura)
- `SistemaPrincipal` (Classe com método Main para execução)

[cite_start]**Qual foi o maior desafio técnico que você enfrentou?** [cite: 150]
O maior desafio técnico foi entender como migrar os dados de uma classe simples para uma arquitetura com Classes Abstratas e Interfaces, e ainda fazer sentido dentro do contexto de treinamento. Tive que estruturar a classe `PuxadaArticulada` para utilizar corretamente o `super()` herdando de `MaquinaAcademia`, implementar a obrigatoriedade da interface `Ajustavel`, e garantir o encapsulamento correto ao associar o `PlanoManutencao` para verificar se a máquina está liberada para uso seguro no treino.

---

## Conclusão

[cite_start]**O que você aprendeu nestas 9 aulas?** [cite: 157]
Aprendi a pensar de forma "orientada a objetos", modelando o mundo real em Classes. Entendi como proteger as regras de negócio através do Encapsulamento, e como estruturar sistemas que podem crescer de forma organizada aplicando Herança, Interfaces e Polimorfismo.

[cite_start]**Qual conceito foi mais difícil de entender?** [cite: 160]
A diferença entre quando usar uma Classe Abstrata e quando usar uma Interface. Consegui entender quando percebi que a Herança (Abstrata) reflete "o que o objeto É" (a puxada articulada É uma máquina de academia), enquanto a Interface reflete "o que o objeto FAZ" ou "um contrato que ele obedece" (ela é ajustável).

[cite_start]**O que você melhoraria no seu projeto se pudesse refazer?** [cite: 161]
Eu adicionaria uma lógica mais avançada para rastreamento de treinos, como associar a `PuxadaArticulada` diretamente a uma classe `Usuario` para automatizar o histórico de sobrecarga progressiva (volume de treino) a cada sessão.