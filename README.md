# Hierarquia Militar em Java

Este projeto implementa um sistema de hierarquia militar em Java, utilizando os conceitos de orientação a objetos como **herança**, **polimorfismo** e **interfaces**.

## 🚀 Objetivo

Modelar diferentes patentes militares (Soldado, Capitão e General) com base em sua hierarquia e tipo de arma, permitindo comparações entre eles como:
- Um militar é superior a outro?
- Um militar é inferior?
- Os dois são equivalentes?

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Programação Orientada a Objetos (POO)
- Interface e Classe Abstrata

## 📦 Estrutura do Projeto

```

├── src/
│   ├── TipoDeArma.java          # Enum com os tipos de arma
│   ├── Hierarquia.java          # Interface com métodos de comparação
│   ├── PessoaMilitar.java       # Classe abstrata base
│   ├── Soldado.java             # Classe para patente de soldado
│   ├── Capitao.java             # Classe para patente de capitão
│   ├── General.java             # Classe para patente de general
│   └── Main.java                # Classe principal com exemplos de uso

````

## 📌 Exemplo de Uso

```java
Soldado soldadoAssis = new Soldado(TipoDeArma.INFANTARIA);
Capitao capitaoAmerica = new Capitao(TipoDeArma.ARTILHARIA);
General generalJulio = new General(TipoDeArma.CAVALARIA);

System.out.println("General > Soldado? " + generalJulio.superiorA(soldadoAssis)); // true
System.out.println("Capitao < Soldado? " + capitaoAmerica.inferiorA(soldadoAssis)); // false
System.out.println("Soldado == Soldado? " + soldadoAssis.equivalenteA(new Soldado(TipoDeArma.ARTILHARIA))); // true
````

## 📚 Conceitos Aplicados

* **Herança**: Todas as classes militares estendem a classe abstrata `PessoaMilitar`.
* **Interface**: A interface `Hierarquia` define o contrato para comparação entre patentes.
* **Polimorfismo**: Uso de `instanceof` e casting para determinar o nível hierárquico.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

👨‍💻 Desenvolvido por Diego Roberto Aragan Aoki
📘 Projeto acadêmico relacionado à ODS 4 – Educação de Qualidade.

```

