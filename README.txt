# Sistema Puxada Articulada (Java - POO)

Este projeto foi feito para praticar os conceitos básicos de **Programação Orientada a Objetos em Java** durante as aulas.

## Aula 1 – Classes e Objetos

Na primeira aula aprendemos o conceito de **classe e objeto**.

Criamos a classe **PuxadaArticulada**, que representa uma máquina de academia.
Ela possui algumas características:

* `estrutura`
* `cargaAtualKG`

Depois criamos objetos dessa classe no `SistemaPrincipal`.

Exemplo:

```java
PuxadaArticulada minhaPuxadaArticulada = new PuxadaArticulada();
```

---

## Aula 2 – Métodos e Comportamentos

Na segunda aula aprendemos que os objetos também possuem **comportamentos (métodos)**.

No projeto foram criados os métodos:

* `aumentarCarga()`
* `diminuirCarga()`
* `mostrarInformacoes()`

Esses métodos permitem alterar a carga da máquina e mostrar suas informações.

---

## Aula 3 – Encapsulamento

Na terceira aula aprendemos a **proteger os dados da classe** usando encapsulamento.

Para isso:

* Os atributos foram alterados para `private`
* Criamos **getters e setters**

Exemplo:

```java
private String estrutura;

public String getEstrutura() {
    return estrutura;
}
```

Assim os dados da classe ficam protegidos e só podem ser acessados pelos métodos.

---

## Objetivo

Praticar os conceitos básicos de **POO em Java**:

* Classes
* Objetos
* Métodos
* Encapsulamento
* Getters e Setters
