# 🌊 Stream API Java - Repositório Educacional

Este repositório foi criado com o intuito de **auxiliar residentes a entenderem como funciona a API Stream do Java**. O conteúdo está organizado com exemplos práticos e claros que demonstram o funcionamento de diversas `Functional Interfaces`, como `Predicate`, `Consumer`, `Supplier`, `BinaryOperator` e `Function`.

---

## ❓ **O que é o Stream API do Java?**

A Stream API foi introduzida no Java 8 e é uma ferramenta poderosa para **manipulação e processamento de coleções** (listas, mapas, conjuntos, etc.) de maneira declarativa e funcional.

Ela permite:

- ⚙️ Processamento em **pipeline** (sequências de operações);
- 🔗 Manipulação e transformação de dados de maneira **imutável**;
- 💡 Uso de operações funcionais como `filter`, `map`, `reduce`, entre outras;
- 🚀 Possibilidade de processamento paralelo.

---

## 🛠️ **Como a Stream API funciona?**

O Stream API trabalha em dois passos:

1. **Criação do Stream**: Usando métodos como `.stream()`, ou gerando Streams infindáveis (`Stream.generate`, etc.);
2. **Pipelines de Operações**:
    - 🌀 **Intermediárias**: Como `.map()`, `.filter()` (criando transformações no fluxo);
    - ✅ **Finais**: Como `.collect()`, `.forEach()`, que consomem os dados ao final do pipeline.

---

### ✨ **Exemplos neste Repositório**

A seguir, estão exemplos das principais funções e casos de uso da API Stream.

### 🔍 **1. Predicate: Filtragem de Animes**

Nesta funcionalidade, utilizamos um `Predicate`, que é uma **interface funcional que retorna um valor booleano**, para filtrar uma lista de animes de acordo com um critério.

```java
List<Anime> animesFantasias = animes.stream()
    .filter(filtroAnimesFantasia)
    .toList();
```

- 🏷️ **Objetivo**: Filtrar animes exclusivamente do tipo "Fantasia" e mostrá-los.
- 📘 **Como aprender?**:
    - Veja como `Predicate` é usado para encapsular condições.
    - Entenda como `.filter()` aplica o `Predicate` sobre o Stream.

---

### 🔄 **2. Consumer: Impressão de Números Pares e Ímpares**

O `Consumer` é uma interface funcional que **executa operações em objetos sem retornar nenhum valor**.

#### **Imprimindo números pares**
```java
numeros.stream()
    .filter(numero -> numero % 2 == 0)
    .forEach(System.out::println);
```

#### **Imprimindo números ímpares**
```java
numeros.forEach(numero -> {
    if (numero % 2 != 0) {
        System.out.print(numero + " ");
    }
});
```

- 🏷️ **Objetivo**: Mostrar como `Consumer` pode ser usado para iterar e processar Streams.

---

### 🌱 **3. Supplier: Gerador de Verdades Absolutas**

O `Supplier` é uma interface funcional que **não recebe nenhum parâmetro, mas retorna um valor**.

```java
Supplier<String> verdadeAbsoluta = () -> "Java é a melhor linguagem, exceto para o front-end";

List<String> verdades = Stream.generate(verdadeAbsoluta).limit(10).toList();
verdades.forEach(System.out::println);
```

- 🏷️ **Objetivo**: Ensinar como usar `Supplier` para criar valores dinâmicos e gerar listas a partir disso.

---

### ➗ **4. BinaryOperator: Soma de Números**

O `BinaryOperator` é uma especialização da interface funcional `BiFunction` e serve para executar **operações binárias** (recebe dois valores iguais e retorna um resultado do mesmo tipo).

```java
BinaryOperator<Integer> somar = Integer::sum;

Integer resultado = numeros.stream()
    .reduce(0, somar); // Soma todos os elementos no Stream
```

- 🏷️ **Objetivo**: Demonstrar como reduzir dados de um Stream a um único valor, usando somas como exemplo.

---

### 🔄 **5. Function: Transformação de Elementos**

O `Function` é uma interface funcional que **recebe um parâmetro e retorna um valor transformado**.

```java
Function<Integer, Double> multiplicar = numero -> numero * 2.2;

numeros.forEach(numero -> {
    Double numeroMultiplicado = multiplicar.apply(numero);
    System.out.printf("Original: %d -> Multiplicado: %.2f%n", numero, numeroMultiplicado);
});
```

- 🏷️ **Objetivo**: Demonstrar como transformar elementos de um Stream utilizando operações declarativas.

---

### 🎮 **Exemplo Interativo (Interactive.java)**
Este repositório também inclui uma interface interativa para que os residentes possam explorar, de maneira prática, cada funcionalidade explicada:
``` plaintext
=== Escolha uma Functional Interface para aprender e executar ===

1 - Predicate (Filtragem de Animes)
2 - Consumer (Imprimir Números Pares e Ímpares)
3 - Supplier (Gerador de Verdades Absolutas)
4 - BinaryOperator (Somar Números)
5 - Function (Multiplicação de Números)
0 - Sair

Digite sua opção:
```

📟 O programa é executado no console e, a cada interação, aprofunda o aprendizado de uma `Functional Interface`.

---

### 🚀 **Como Executar este Repositório**

1. Clone o repositório:
```
git clone https://github.com/Boyce22/stream-api
``` 

2. Execute o programa:
```
./gradlew run
``` 

3. Explore as opções interativas descritas no menu.

---

### 🏆 **Benefícios para os Residentes**

- 🌟 Familiaridade com **paradigmas funcionais** em Java.
- 📚 Entendimento prático de várias funções da Stream API.
- 🛠️ Exposição a cenários reais de uso das `Functional Interfaces`.

Se você deseja explorar mais sobre Stream API ou tem dúvidas sobre este repositório, fique à vontade para contribuir ou abrir uma issue! 😊

---
> ✍️ **Nota**: Este conteúdo foi desenvolvido com fins educativos para reforçar a compreensão de conceitos como programação funcional e Stream API em Java.

