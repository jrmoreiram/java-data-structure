# 📚 Estruturas de Dados em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)
![Contributions](https://img.shields.io/badge/Contribuições-Bem%20vindas-blue?style=for-the-badge)

> Uma coleção completa e bem documentada de estruturas de dados fundamentais implementadas em Java puro, sem uso de bibliotecas externas.

---

## 📋 Índice

- [Visão Geral](#-visão-geral)
- [Estruturas de Dados Implementadas](#-estruturas-de-dados-implementadas)
- [Requisitos e Instalação](#-requisitos-e-instalação)
- [Guia de Uso](#-guia-de-uso)
  - [Lista Encadeada (LinkedList)](#lista-encadeada-linkedlist)
  - [Lista Duplamente Encadeada (DoublyLinkedList)](#lista-duplamente-encadeada-doublylinkedlist)
  - [Fila (Queue)](#fila-queue)
  - [Conjunto (Set)](#conjunto-set)
- [Análise de Complexidade](#-análise-de-complexidade)
- [Arquitetura do Projeto](#-arquitetura-do-projeto)
- [Testes](#-testes)
- [Diagramas](#-diagramas)
- [Guia de Contribuição](#-guia-de-contribuição)
- [Roadmap](#-roadmap)
- [Licença](#-licença)
- [Autores e Contato](#-autores-e-contato)

---

## 🎯 Visão Geral

Este projeto é uma **implementação educacional e profissional** de estruturas de dados clássicas em Java. O objetivo principal é fornecer:

- 📖 **Material de estudo** para estudantes de Ciência da Computação
- 🔧 **Referência de implementação** para desenvolvedores
- 🧪 **Base para experimentação** com algoritmos e estruturas de dados
- 💡 **Exemplos práticos** de código limpo e bem documentado

### Motivação

As estruturas de dados são fundamentais para a programação eficiente. Este projeto oferece implementações puras (sem uso de bibliotecas externas) para facilitar o entendimento dos conceitos básicos e dos mecanismos internos de cada estrutura.

### Características

- ✅ Implementações completas e funcionais
- ✅ Código bem documentado com JavaDoc
- ✅ Testes unitários abrangentes
- ✅ Análise de complexidade para cada operação
- ✅ Exemplos práticos de uso
- ✅ Sem dependências externas (Java puro)

---

## 🏗️ Estruturas de Dados Implementadas

### 1. **Lista Encadeada Simples (LinkedList)**
Uma estrutura linear onde cada elemento aponta para o próximo, permitindo inserção e remoção eficientes no início da lista.

**Características:**
- Inserção no início: O(1)
- Acesso sequencial
- Uso eficiente de memória
- Tamanho dinâmico

### 2. **Lista Duplamente Encadeada (DoublyLinkedList)**
Cada elemento possui referências para o próximo e o anterior, permitindo navegação bidirecional.

**Características:**
- Navegação em ambas as direções
- Remoção no final: O(1)
- Inserção eficiente em qualquer posição
- Maior flexibilidade que a lista simples

### 3. **Fila (Queue)**
Estrutura FIFO (First In, First Out) onde os elementos são adicionados no final e removidos do início.

**Características:**
- Ordem de processamento FIFO
- Ideal para sistemas de fila de atendimento
- Operações de enfileirar/desenfileirar eficientes
- Baseada em lista encadeada

### 4. **Conjunto (Set)**
Coleção que não permite elementos duplicados, com operações matemáticas de conjuntos.

**Características:**
- Sem duplicatas
- Operações de união, interseção e diferença
- Testes de subconjunto e superconjunto
- Baseado em lista encadeada

---

## 💻 Requisitos e Instalação

### Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- **Java Development Kit (JDK)** 8 ou superior
  ```bash
  java -version
  ```

- **Uma IDE ou editor de texto** (opcional, mas recomendado):
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)
  - [VS Code](https://code.visualstudio.com/) com extensão Java
  - [NetBeans](https://netbeans.apache.org/)

### Instalação

#### 1. Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/estruturas-dados-java.git
cd estruturas-dados-java
```

#### 2. Estrutura de Diretórios

```
estruturas-dados-java/
└── data-structure/
    └── src/
        └── ds/
            ├── linkedlist/
            │   ├── Cell.java
            │   ├── LinkedList.java
            │   └── LinkedListTest.java
            ├── doublylinkedlist/
            │   ├── Cell.java
            │   ├── DoublyLinkedList.java
            │   └── DoublyLinkedListTest.java
            ├── queue/
            │   ├── Queues.java
            │   └── QueueTest.java
            └── set/
                ├── Sets.java
                └── SetTest.java
```

#### 3. Compilar o Projeto

**Usando linha de comando:**

```bash
# Navegar até o diretório src
cd data-structure/src

# Compilar todas as classes
javac ds/*/*.java
```

**Usando IDE:**
- Abra o projeto na sua IDE favorita
- A compilação será feita automaticamente

#### 4. Executar os Testes

```bash
# Executar teste de LinkedList
java ds.linkedlist.LinkedListTest

# Executar teste de DoublyLinkedList
java ds.doublylinkedlist.DoublyLinkedListTest

# Executar teste de Queue
java ds.queue.QueueTest

# Executar teste de Set
java ds.set.SetTest
```

---

## 📖 Guia de Uso

### Lista Encadeada (LinkedList)

#### Criação e Operações Básicas

```java
import ds.linkedlist.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        // Criar uma nova lista
        LinkedList<String> lista = new LinkedList<>();
        
        // Adicionar elementos
        lista.addFirst("Primeiro");  // Adiciona no início
        lista.addLast("Último");     // Adiciona no final
        lista.add(1, "Meio");        // Adiciona em posição específica
        
        // Acessar elementos
        String elemento = lista.get(0);  // Obtém elemento no índice 0
        
        // Verificar existência
        boolean existe = lista.contains("Meio");  // true
        
        // Remover elementos
        String removido = lista.removeFirst();  // Remove do início
        lista.removeLast();                     // Remove do final
        lista.remove(0);                        // Remove por índice
        
        // Informações da lista
        int tamanho = lista.size();      // Tamanho da lista
        boolean vazia = lista.isEmpty(); // Verifica se está vazia
        
        // Limpar lista
        lista.clear();
        
        // Imprimir lista
        System.out.println(lista);  // Formato: [elem1, elem2, elem3]
    }
}
```

#### Exemplo Prático: Lista de Tarefas

```java
import ds.linkedlist.LinkedList;

public class ListaDeTarefas {
    public static void main(String[] args) {
        LinkedList<String> tarefas = new LinkedList<>();
        
        // Adicionar tarefas
        tarefas.addLast("Estudar estruturas de dados");
        tarefas.addLast("Fazer exercícios");
        tarefas.addLast("Revisar código");
        
        System.out.println("Tarefas pendentes: " + tarefas);
        
        // Completar primeira tarefa
        String tarefaCompleta = tarefas.removeFirst();
        System.out.println("Tarefa completada: " + tarefaCompleta);
        
        // Adicionar tarefa urgente no início
        tarefas.addFirst("URGENTE: Corrigir bug");
        
        System.out.println("Tarefas atualizadas: " + tarefas);
    }
}
```

---

### Lista Duplamente Encadeada (DoublyLinkedList)

#### Criação e Operações Básicas

```java
import ds.doublylinkedlist.DoublyLinkedList;

public class ExemploDoublyLinkedList {
    public static void main(String[] args) {
        // Criar uma nova lista duplamente encadeada
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        
        // Adicionar elementos
        lista.addFirst(10);      // [10]
        lista.addLast(30);       // [10, 30]
        lista.add(1, 20);        // [10, 20, 30]
        
        // Acessar elementos
        int primeiro = lista.get(0);        // 10
        int ultimo = lista.get(lista.size() - 1);  // 30
        
        // Remover elementos
        lista.removeFirst();     // Remove 10
        lista.removeLast();      // Remove 30
        
        // Navegação bidirecional
        System.out.println("Normal: " + lista.toString());
        System.out.println("Reversa: " + lista.toStringReverse());
        
        // Limpar
        lista.clear();
    }
}
```

#### Exemplo Prático: Histórico de Navegação

```java
import ds.doublylinkedlist.DoublyLinkedList;

public class HistoricoNavegacao {
    private DoublyLinkedList<String> historico;
    private int posicaoAtual;
    
    public HistoricoNavegacao() {
        this.historico = new DoublyLinkedList<>();
        this.posicaoAtual = -1;
    }
    
    public void visitar(String url) {
        // Remove páginas à frente da posição atual
        while (posicaoAtual < historico.size() - 1) {
            historico.removeLast();
        }
        
        historico.addLast(url);
        posicaoAtual++;
        System.out.println("Visitando: " + url);
    }
    
    public String voltar() {
        if (posicaoAtual > 0) {
            posicaoAtual--;
            return historico.get(posicaoAtual);
        }
        return null;
    }
    
    public String avancar() {
        if (posicaoAtual < historico.size() - 1) {
            posicaoAtual++;
            return historico.get(posicaoAtual);
        }
        return null;
    }
    
    public static void main(String[] args) {
        HistoricoNavegacao nav = new HistoricoNavegacao();
        
        nav.visitar("google.com");
        nav.visitar("github.com");
        nav.visitar("stackoverflow.com");
        
        System.out.println("Voltar: " + nav.voltar());      // github.com
        System.out.println("Voltar: " + nav.voltar());      // google.com
        System.out.println("Avançar: " + nav.avancar());    // github.com
    }
}
```

---

### Fila (Queue)

#### Criação e Operações Básicas

```java
import ds.queue.Queues;

public class ExemploQueue {
    public static void main(String[] args) {
        // Criar uma nova fila
        Queues<String> fila = new Queues<>();
        
        // Enfileirar elementos (adicionar no final)
        fila.enqueue("Cliente 1");
        fila.enqueue("Cliente 2");
        fila.enqueue("Cliente 3");
        
        // Ver o primeiro da fila sem remover
        String primeiro = fila.peek();  // "Cliente 1"
        
        // Desenfileirar (remover do início)
        String atendido = fila.dequeue();  // Remove "Cliente 1"
        
        // Verificar se contém
        boolean existe = fila.contains("Cliente 2");
        
        // Informações
        int tamanho = fila.size();
        boolean vazia = fila.isEmpty();
        
        // Limpar fila
        fila.clear();
        
        // Imprimir fila
        System.out.println(fila);
    }
}
```

#### Exemplo Prático: Sistema de Atendimento

```java
import ds.queue.Queues;

public class SistemaAtendimento {
    private Queues<Cliente> filaAtendimento;
    private int senhaAtual;
    
    public SistemaAtendimento() {
        this.filaAtendimento = new Queues<>();
        this.senhaAtual = 1;
    }
    
    public void emitirSenha(String nome) {
        Cliente cliente = new Cliente(senhaAtual++, nome);
        filaAtendimento.enqueue(cliente);
        System.out.println("Senha emitida: " + cliente.getSenha() + 
                         " - " + cliente.getNome());
    }
    
    public void atenderProximo() {
        if (!filaAtendimento.isEmpty()) {
            Cliente cliente = filaAtendimento.dequeue();
            System.out.println("Atendendo: Senha " + cliente.getSenha() + 
                             " - " + cliente.getNome());
        } else {
            System.out.println("Nenhum cliente na fila");
        }
    }
    
    public void mostrarFila() {
        System.out.println("Fila de atendimento: " + filaAtendimento);
        System.out.println("Pessoas na fila: " + filaAtendimento.size());
    }
    
    public static void main(String[] args) {
        SistemaAtendimento sistema = new SistemaAtendimento();
        
        // Emitir senhas
        sistema.emitirSenha("Maria Silva");
        sistema.emitirSenha("João Santos");
        sistema.emitirSenha("Ana Oliveira");
        
        sistema.mostrarFila();
        
        // Atender clientes
        sistema.atenderProximo();
        sistema.atenderProximo();
        
        sistema.mostrarFila();
    }
}

class Cliente {
    private int senha;
    private String nome;
    
    public Cliente(int senha, String nome) {
        this.senha = senha;
        this.nome = nome;
    }
    
    public int getSenha() { return senha; }
    public String getNome() { return nome; }
    
    @Override
    public String toString() {
        return "Senha " + senha + ": " + nome;
    }
}
```

---

### Conjunto (Set)

#### Criação e Operações Básicas

```java
import ds.set.Sets;

public class ExemploSet {
    public static void main(String[] args) {
        // Criar um novo conjunto
        Sets<String> conjunto = new Sets<>();
        
        // Adicionar elementos (duplicatas são ignoradas)
        conjunto.add("Java");       // true (adicionado)
        conjunto.add("Python");     // true
        conjunto.add("Java");       // false (já existe)
        
        // Verificar existência
        boolean existe = conjunto.contains("Java");  // true
        
        // Remover elementos
        boolean removido = conjunto.remove("Python");  // true
        
        // Informações
        int tamanho = conjunto.size();
        boolean vazio = conjunto.isEmpty();
        
        // Limpar conjunto
        conjunto.clear();
        
        // Imprimir conjunto
        System.out.println(conjunto);  // Formato: {elem1, elem2, elem3}
    }
}
```

#### Operações de Conjuntos

```java
import ds.set.Sets;

public class OperacoesConjuntos {
    public static void main(String[] args) {
        // Criar conjuntos
        Sets<Integer> A = new Sets<>();
        A.add(1); A.add(2); A.add(3); A.add(4);
        
        Sets<Integer> B = new Sets<>();
        B.add(3); B.add(4); B.add(5); B.add(6);
        
        System.out.println("Conjunto A: " + A);
        System.out.println("Conjunto B: " + B);
        
        // União (A ∪ B)
        Sets<Integer> uniao = A.union(B);
        System.out.println("A ∪ B: " + uniao);  // {1, 2, 3, 4, 5, 6}
        
        // Interseção (A ∩ B)
        Sets<Integer> intersecao = A.intersection(B);
        System.out.println("A ∩ B: " + intersecao);  // {3, 4}
        
        // Diferença (A - B)
        Sets<Integer> diferenca = A.difference(B);
        System.out.println("A - B: " + diferenca);  // {1, 2}
        
        // Subconjunto
        Sets<Integer> C = new Sets<>();
        C.add(1); C.add(2);
        
        boolean ehSubconjunto = C.isSubsetOf(A);
        System.out.println("C é subconjunto de A? " + ehSubconjunto);  // true
        
        // Superconjunto
        boolean ehSuperconjunto = A.isSupersetOf(C);
        System.out.println("A é superconjunto de C? " + ehSuperconjunto);  // true
    }
}
```

#### Exemplo Prático: Análise de Dados

```java
import ds.set.Sets;

public class AnaliseAcessos {
    public static void main(String[] args) {
        // Usuários que acessaram no mês passado
        Sets<String> mesPassado = new Sets<>();
        mesPassado.add("user1");
        mesPassado.add("user2");
        mesPassado.add("user3");
        mesPassado.add("user4");
        
        // Usuários que acessaram neste mês
        Sets<String> mesAtual = new Sets<>();
        mesAtual.add("user3");
        mesAtual.add("user4");
        mesAtual.add("user5");
        mesAtual.add("user6");
        
        System.out.println("Usuários mês passado: " + mesPassado);
        System.out.println("Usuários mês atual: " + mesAtual);
        
        // Usuários que retornaram
        Sets<String> usuariosRetornaram = mesPassado.intersection(mesAtual);
        System.out.println("\\nUsuários que retornaram: " + usuariosRetornaram);
        
        // Usuários que deixaram de acessar
        Sets<String> usuariosInativos = mesPassado.difference(mesAtual);
        System.out.println("Usuários inativos: " + usuariosInativos);
        
        // Novos usuários
        Sets<String> novosUsuarios = mesAtual.difference(mesPassado);
        System.out.println("Novos usuários: " + novosUsuarios);
        
        // Total de usuários únicos
        Sets<String> todosUsuarios = mesPassado.union(mesAtual);
        System.out.println("\\nTotal de usuários únicos: " + todosUsuarios.size());
    }
}
```

---

## ⚡ Análise de Complexidade

### Notação Big O

A complexidade de tempo indica quanto tempo uma operação leva em relação ao tamanho (n) da estrutura de dados.

| Complexidade | Descrição | Exemplo |
|--------------|-----------|---------|
| **O(1)** | Constante - tempo fixo independente do tamanho | Acesso por índice em array |
| **O(n)** | Linear - proporcional ao tamanho | Busca em lista não ordenada |
| **O(n²)** | Quadrática - proporcional ao quadrado do tamanho | Bubble sort |

---

### LinkedList (Lista Encadeada Simples)

| Operação | Complexidade | Observações |
|----------|--------------|-------------|
| `addFirst(T)` | **O(1)** | Inserção no início é instantânea |
| `addLast(T)` | **O(1)** | Mantém referência para o último elemento |
| `add(int, T)` | **O(n)** | Precisa percorrer até a posição |
| `removeFirst()` | **O(1)** | Remoção no início é instantânea |
| `removeLast()` | **O(n)** | Precisa percorrer toda a lista |
| `remove(int)` | **O(n)** | Precisa percorrer até a posição |
| `get(int)` | **O(n)** | Acesso sequencial necessário |
| `contains(T)` | **O(n)** | Pode precisar percorrer toda a lista |
| `size()` | **O(1)** | Mantém contador interno |
| `isEmpty()` | **O(1)** | Verificação simples |
| `clear()` | **O(1)** | Apenas remove referências |

---

### DoublyLinkedList (Lista Duplamente Encadeada)

| Operação | Complexidade | Observações |
|----------|--------------|-------------|
| `addFirst(T)` | **O(1)** | Inserção no início com atualização de ponteiros |
| `addLast(T)` | **O(1)** | Inserção no final é instantânea |
| `add(int, T)` | **O(n)** | Otimizado: percorre do lado mais próximo |
| `removeFirst()` | **O(1)** | Remoção no início é instantânea |
| `removeLast()` | **O(1)** | Vantagem sobre lista simples |
| `remove(int)` | **O(n)** | Otimizado: percorre do lado mais próximo |
| `get(int)` | **O(n)** | Otimizado: começa do início ou fim |
| `contains(T)` | **O(n)** | Busca sequencial |
| `size()` | **O(1)** | Contador interno |
| `isEmpty()` | **O(1)** | Verificação simples |
| `clear()` | **O(1)** | Remove referências |
| `toStringReverse()` | **O(n)** | Percorre do fim ao início |

---

### Queues (Fila)

| Operação | Complexidade | Observações |
|----------|--------------|-------------|
| `enqueue(T)` | **O(1)** | Adiciona no final (usa addLast) |
| `dequeue()` | **O(1)** | Remove do início (usa removeFirst) |
| `peek()` | **O(1)** | Apenas consulta o primeiro |
| `contains(T)` | **O(n)** | Precisa buscar na lista |
| `size()` | **O(1)** | Delegado para LinkedList |
| `isEmpty()` | **O(1)** | Verificação simples |
| `clear()` | **O(1)** | Limpa a lista interna |

---

### Sets (Conjunto)

| Operação | Complexidade | Observações |
|----------|--------------|-------------|
| `add(T)` | **O(n)** | Verifica duplicata antes de adicionar |
| `remove(T)` | **O(n)** | Precisa buscar o elemento |
| `contains(T)` | **O(n)** | Busca linear |
| `union(Sets)` | **O(n×m)** | Adiciona todos os elementos de ambos |
| `intersection(Sets)` | **O(n×m)** | Verifica elementos comuns |
| `difference(Sets)` | **O(n×m)** | Elementos em A mas não em B |
| `isSubsetOf(Sets)` | **O(n×m)** | Verifica se todos estão no outro |
| `isSupersetOf(Sets)` | **O(n×m)** | Inverso de isSubsetOf |
| `size()` | **O(1)** | Contador interno |
| `isEmpty()` | **O(1)** | Verificação simples |
| `clear()` | **O(1)** | Limpa a lista interna |

**Nota:** n e m representam os tamanhos dos conjuntos envolvidos.

---

### Comparação Geral

#### Melhor Caso

| Estrutura | Inserção | Remoção | Busca | Acesso |
|-----------|----------|---------|-------|--------|
| **LinkedList** | O(1)* | O(1)* | O(1)* | O(1)* |
| **DoublyLinkedList** | O(1)* | O(1)* | O(1)* | O(1)* |
| **Queue** | O(1) | O(1) | O(1)* | N/A |
| **Set** | O(1)* | O(1)* | O(1)* | N/A |

\* Quando o elemento está no início ou quando há sorte na busca

#### Caso Médio e Pior Caso

| Estrutura | Inserção | Remoção | Busca | Acesso |
|-----------|----------|---------|-------|--------|
| **LinkedList** | O(n) | O(n) | O(n) | O(n) |
| **DoublyLinkedList** | O(n) | O(n) | O(n) | O(n) |
| **Queue** | O(1) | O(1) | O(n) | N/A |
| **Set** | O(n) | O(n) | O(n) | N/A |

---

## 🏛️ Arquitetura do Projeto

### Estrutura de Diretórios

```
estruturas-dados-java/
│
├── .gitignore                          # Arquivos ignorados pelo Git
├── README.md                           # Este arquivo
│
└── data-structure/                     # Diretório principal
    └── src/                            # Código-fonte
        └── ds/                         # Pacote principal
            │
            ├── linkedlist/             # Lista Encadeada Simples
            │   ├── Cell.java          # Célula/Nó da lista
            │   ├── LinkedList.java    # Implementação da lista
            │   └── LinkedListTest.java # Testes da lista
            │
            ├── doublylinkedlist/       # Lista Duplamente Encadeada
            │   ├── Cell.java          # Célula com ponteiro duplo
            │   ├── DoublyLinkedList.java # Implementação
            │   └── DoublyLinkedListTest.java # Testes
            │
            ├── queue/                  # Fila
            │   ├── Queues.java        # Implementação da fila
            │   └── QueueTest.java     # Testes da fila
            │
            └── set/                    # Conjunto
                ├── Sets.java          # Implementação do conjunto
                └── SetTest.java       # Testes do conjunto
```

### Organização do Código

#### Padrão de Pacotes

Todos os arquivos seguem a convenção de pacotes Java:

```
ds.linkedlist
ds.doublylinkedlist
ds.queue
ds.set
```

#### Convenções de Nomenclatura

- **Classes**: PascalCase (ex: `LinkedList`, `DoublyLinkedList`)
- **Métodos**: camelCase (ex: `addFirst()`, `removeLast()`)
- **Variáveis**: camelCase (ex: `head`, `tail`, `size`)
- **Constantes**: UPPER_SNAKE_CASE (se aplicável)

#### Estrutura de Cada Classe

1. **Documentação JavaDoc** no início da classe
2. **Atributos privados** (encapsulamento)
3. **Construtores**
4. **Métodos públicos** (interface pública)
5. **Métodos privados** (auxiliares)
6. **Método toString()** para representação textual

---

## 🧪 Testes

### Executando os Testes

Cada estrutura de dados possui uma classe de teste dedicada:

```bash
# Navegar até o diretório src
cd data-structure/src

# Compilar (se ainda não compilado)
javac ds/*/*.java

# Executar testes individualmente
java ds.linkedlist.LinkedListTest
java ds.doublylinkedlist.DoublyLinkedListTest
java ds.queue.QueueTest
java ds.set.SetTest
```

### Script de Teste Completo

Você pode criar um script bash para executar todos os testes:

```bash
#!/bin/bash
# test_all.sh

echo "========================================="
echo "Executando todos os testes"
echo "========================================="

cd data-structure/src

echo -e "\n### Compilando arquivos Java..."
javac ds/*/*.java

if [ $? -eq 0 ]; then
    echo "✅ Compilação bem-sucedida!"
    
    echo -e "\n### Testando LinkedList..."
    java ds.linkedlist.LinkedListTest
    
    echo -e "\n### Testando DoublyLinkedList..."
    java ds.doublylinkedlist.DoublyLinkedListTest
    
    echo -e "\n### Testando Queue..."
    java ds.queue.QueueTest
    
    echo -e "\n### Testando Set..."
    java ds.set.SetTest
    
    echo -e "\n========================================="
    echo "✅ Todos os testes concluídos!"
    echo "========================================="
else
    echo "❌ Erro na compilação!"
    exit 1
fi
```

Para usar o script:

```bash
chmod +x test_all.sh
./test_all.sh
```

### Cobertura de Testes

Cada arquivo de teste cobre:

- ✅ Criação de estruturas vazias
- ✅ Adição de elementos (início, fim, posição específica)
- ✅ Remoção de elementos
- ✅ Busca e verificação de existência
- ✅ Operações especiais (para Set: união, interseção, etc.)
- ✅ Casos limite (lista vazia, um elemento, etc.)
- ✅ Métodos utilitários (size, isEmpty, clear)

### Criando Seus Próprios Testes

Você pode criar testes personalizados:

```java
import ds.linkedlist.LinkedList;

public class MeuTeste {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        
        // Seu teste aqui
        lista.addLast(1);
        lista.addLast(2);
        lista.addLast(3);
        
        assert lista.size() == 3 : "Tamanho incorreto!";
        assert lista.get(1) == 2 : "Elemento incorreto!";
        
        System.out.println("✅ Todos os testes passaram!");
    }
}
```

---

## 📊 Diagramas

### Diagrama: Lista Encadeada Simples

```
LinkedList
┌─────────────────────────────────────────┐
│ head -> [A] -> [B] -> [C] -> [D] -> null│
│         ↑                      ↑        │
│       first                  tail       │
└─────────────────────────────────────────┘

Estrutura de uma Cell:
┌──────────────┐
│   Cell<T>    │
├──────────────┤
│ element: T   │
│ next: Cell   │
└──────────────┘
```

**Visualização de Operações:**

```
addFirst(X):
Antes:  head -> [A] -> [B] -> [C] -> null
Depois: head -> [X] -> [A] -> [B] -> [C] -> null

addLast(Z):
Antes:  head -> [A] -> [B] -> [C] -> null  <- tail
Depois: head -> [A] -> [B] -> [C] -> [Z] -> null  <- tail

removeFirst():
Antes:  head -> [A] -> [B] -> [C] -> null
Depois: head -> [B] -> [C] -> null
```

---

### Diagrama: Lista Duplamente Encadeada

```
DoublyLinkedList
┌───────────────────────────────────────────────┐
│ head <-> [A] <-> [B] <-> [C] <-> [D] <- tail  │
│          ↑                           ↑        │
│        first                       last       │
└───────────────────────────────────────────────┘

Estrutura de uma Cell:
┌──────────────────┐
│    Cell<T>       │
├──────────────────┤
│ element: T       │
│ next: Cell       │
│ previous: Cell   │
└──────────────────┘
```

**Visualização de Operações:**

```
addFirst(X):
Antes:  null <- [A] <-> [B] <-> [C] -> null
Depois: null <- [X] <-> [A] <-> [B] <-> [C] -> null

removeLast():
Antes:  null <- [A] <-> [B] <-> [C] -> null
Depois: null <- [A] <-> [B] -> null
```

---

### Diagrama: Fila (Queue)

```
Queue (FIFO - First In, First Out)

enqueue(elementos)        dequeue()
       ↓                     ↑
   ┌─────┐              ┌─────┐
   │  D  │              │  A  │ <- front (próximo a sair)
   ├─────┤              ├─────┤
   │  C  │              │  B  │
   ├─────┤              ├─────┤
   │  B  │              │  C  │
   ├─────┤              ├─────┤
   │  A  │ <- rear      │  D  │ <- rear
   └─────┘              └─────┘

Implementação com LinkedList:
front/head -> [A] -> [B] -> [C] -> [D] <- rear/tail
```

**Operações:**

```
enqueue(X): Adiciona X no final (tail)
dequeue():  Remove e retorna do início (head)
peek():     Retorna do início sem remover
```

---

### Diagrama: Conjunto (Set)

```
Set (sem duplicatas)

Tentativa de adicionar:
add(5) -> {5}              ✅ Adicionado
add(3) -> {5, 3}           ✅ Adicionado
add(5) -> {5, 3}           ❌ Já existe (não adiciona)
add(7) -> {5, 3, 7}        ✅ Adicionado

Operações de Conjunto:

A = {1, 2, 3, 4}
B = {3, 4, 5, 6}

União (A ∪ B):
┌─────────────────────┐
│ {1, 2, 3, 4, 5, 6}  │
└─────────────────────┘

Interseção (A ∩ B):
┌─────────┐
│ {3, 4}  │
└─────────┘

Diferença (A - B):
┌─────────┐
│ {1, 2}  │
└─────────┘

Diferença (B - A):
┌─────────┐
│ {5, 6}  │
└─────────┘
```

---

### Diagrama de Classes (Simplificado)

```
┌─────────────────────────┐
│     LinkedList<T>       │
├─────────────────────────┤
│ - head: Cell<T>         │
│ - tail: Cell<T>         │
│ - size: int             │
├─────────────────────────┤
│ + addFirst(T): void     │
│ + addLast(T): void      │
│ + removeFirst(): T      │
│ + get(int): T           │
│ + contains(T): boolean  │
│ + size(): int           │
└─────────────────────────┘
           △
           │ usa
           │
┌──────────┴──────────────┐
│      Cell<T>            │
├─────────────────────────┤
│ - element: T            │
│ - next: Cell<T>         │
├─────────────────────────┤
│ + getElement(): T       │
│ + getNext(): Cell<T>    │
└─────────────────────────┘
```

---

## 🤝 Guia de Contribuição

Contribuições são muito bem-vindas! Este é um projeto educacional e toda ajuda é apreciada.

### Como Contribuir

#### 1. Fork do Projeto

```bash
# Clique em "Fork" no GitHub
# Clone seu fork
git clone https://github.com/seu-usuario/estruturas-dados-java.git
cd estruturas-dados-java
```

#### 2. Crie uma Branch

```bash
git checkout -b feature/nova-estrutura
# ou
git checkout -b fix/correcao-bug
```

#### 3. Faça suas Modificações

- Siga as convenções de código existentes
- Adicione documentação JavaDoc
- Crie testes para novas funcionalidades
- Mantenha o código limpo e legível

#### 4. Commit e Push

```bash
git add .
git commit -m "feat: adiciona implementação de Stack"
git push origin feature/nova-estrutura
```

#### 5. Abra um Pull Request

- Descreva suas mudanças claramente
- Referencie issues relacionadas
- Aguarde revisão

### Convenções de Commit

Seguimos o padrão [Conventional Commits](https://www.conventionalcommits.org/):

- `feat:` Nova funcionalidade
- `fix:` Correção de bug
- `docs:` Alterações na documentação
- `test:` Adição ou modificação de testes
- `refactor:` Refatoração de código
- `style:` Formatação, ponto e vírgula, etc.
- `perf:` Melhoria de performance

**Exemplos:**

```
feat: adiciona implementação de árvore binária
fix: corrige remoção em lista vazia
docs: atualiza exemplos de uso no README
test: adiciona testes para DoublyLinkedList
```

### Áreas para Contribuir

#### Novas Estruturas de Dados
- [ ] Stack (Pilha)
- [ ] Binary Tree (Árvore Binária)
- [ ] Binary Search Tree (BST)
- [ ] Heap
- [ ] Hash Table
- [ ] Graph (Grafo)
- [ ] Trie
- [ ] AVL Tree

#### Melhorias
- [ ] Adicionar mais testes unitários
- [ ] Implementar iteradores
- [ ] Adicionar benchmarks de performance
- [ ] Melhorar documentação
- [ ] Adicionar exemplos mais complexos
- [ ] Criar diagramas UML completos
- [ ] Implementar serialização

#### Documentação
- [ ] Traduzir para outros idiomas
- [ ] Adicionar tutoriais em vídeo
- [ ] Criar guias de estudo
- [ ] Adicionar exercícios práticos

### Código de Conduta

- Seja respeitoso e colaborativo
- Aceite críticas construtivas
- Foque no que é melhor para a comunidade
- Mostre empatia com outros membros

---

## 🗺️ Roadmap

### Versão Atual: 1.0.0

✅ **Concluído:**
- Lista Encadeada Simples
- Lista Duplamente Encadeada
- Fila
- Conjunto
- Documentação básica
- Testes unitários

### Versão 1.1.0 (Próxima Release)

🔄 **Em Desenvolvimento:**
- [ ] Stack (Pilha)
- [ ] Deque (Fila Dupla)
- [ ] Melhorias de performance
- [ ] Mais exemplos práticos

### Versão 1.2.0

📋 **Planejado:**
- [ ] Binary Tree (Árvore Binária)
- [ ] Binary Search Tree (BST)
- [ ] Implementação de Iterator
- [ ] Framework de testes JUnit

### Versão 2.0.0

🎯 **Futuro:**
- [ ] Estruturas avançadas (AVL, Red-Black Tree)
- [ ] Hash Table com tratamento de colisões
- [ ] Grafos (adjacência e matriz)
- [ ] Algoritmos de ordenação
- [ ] Algoritmos de busca
- [ ] Visualização gráfica das estruturas

### Ideias para o Futuro

💡 **Backlog:**
- [ ] Interface gráfica para visualização
- [ ] Comparação de performance entre estruturas
- [ ] Gerador de dados de teste
- [ ] Documentação interativa
- [ ] Integração com Maven/Gradle
- [ ] Publicação no Maven Central
- [ ] API REST para demonstração
- [ ] Aplicação web de demonstração

---

## 📄 Licença

Este projeto está licenciado sob a **Licença MIT** - veja o arquivo [LICENSE](LICENSE) para detalhes.

### MIT License

```
MIT License

Copyright (c) 2026 Estruturas de Dados Java

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

### O que isso significa?

✅ **Você pode:**
- Usar comercialmente
- Modificar
- Distribuir
- Uso privado

⚠️ **Você deve:**
- Incluir a licença e copyright
- Indicar mudanças significativas

❌ **Você não pode:**
- Responsabilizar os autores
- Usar marcas registradas do projeto

---

## 👥 Autores e Contato

### Autor Principal

**Junior Moreira Martins**
- GitHub: [@jrmoreiram](https://github.com/jrmoreiram)
- Email: jumoreiram@gmail.com
- LinkedIn: [Junior Moreira Martins](https://www.linkedin.com/in/jumoreiram/)

### Créditos

Este projeto foi desenvolvido como parte do **Curso de Estrutura de Dados: Computação na prática com Java da DevMedia**.

- **DevMedia** - Plataforma de ensino
- **Docker Inc.** - Tecnologia de containerização
- **PHP Community** - Linguagem de programação
- **Apache Foundation** - Servidor web

### Apoie o Projeto

Se este projeto te ajudou, considere:

- ⭐ Dar uma estrela no GitHub
- 🐛 Reportar bugs
- 💡 Sugerir melhorias
- 🤝 Contribuir com código
- 📢 Compartilhar com outros desenvolvedores

---

## 📚 Recursos Adicionais

### Livros Recomendados

- **"Estruturas de Dados e Algoritmos em Java"** - Robert Lafore
- **"Algorithms, 4th Edition"** - Robert Sedgewick
- **"Introduction to Algorithms"** - CLRS
- **"Data Structures and Algorithms in Java"** - Michael T. Goodrich

### Cursos Online

- [Coursera - Data Structures](https://www.coursera.org/specializations/data-structures-algorithms)
- [MIT OpenCourseWare - Introduction to Algorithms](https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/)
- [Udemy - Data Structures and Algorithms](https://www.udemy.com/topic/data-structures/)

### Referências Online

- [GeeksforGeeks - Data Structures](https://www.geeksforgeeks.org/data-structures/)
- [VisuAlgo - Visualização de Algoritmos](https://visualgo.net/)
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
- [Java Documentation](https://docs.oracle.com/en/java/)

---

## 🎓 Para Estudantes

Este projeto foi criado pensando em estudantes. Aqui estão algumas dicas:

### Como Estudar

1. **Leia o código** - Comece pelos arquivos de teste para entender o uso
2. **Experimente** - Modifique o código e veja o que acontece
3. **Desenhe** - Faça diagramas das estruturas no papel
4. **Compare** - Veja as diferenças entre LinkedList e DoublyLinkedList
5. **Implemente** - Tente criar suas próprias variações

### Exercícios Práticos

1. Implemente um método `reverse()` para LinkedList
2. Crie um método `middle()` que retorna o elemento do meio
3. Implemente uma PriorityQueue usando as estruturas existentes
4. Crie um método para detectar ciclos em uma LinkedList
5. Implemente um método `merge()` que une duas listas ordenadas

### Projetos Sugeridos

- **Sistema de Gerenciamento de Biblioteca** usando Set para livros únicos
- **Simulador de Fila de Banco** usando Queue
- **Editor de Texto Simples** com histórico usando DoublyLinkedList
- **Sistema de Cache LRU** (Least Recently Used)
- **Calculadora com histórico** usando Stack (quando implementada)

---

## ⚠️ Troubleshooting

### Problemas Comuns

#### Erro: "Could not find or load main class"

```bash
# Certifique-se de estar no diretório correto
cd data-structure/src

# Compile antes de executar
javac ds/*/*.java

# Execute com o caminho completo da classe
java ds.linkedlist.LinkedListTest
```

#### Erro: "package ds.linkedlist does not exist"

```bash
# Verifique se está no diretório src
pwd  # Deve mostrar .../data-structure/src

# Compile todos os arquivos
javac -d . ds/*/*.java
```

#### Erro: OutOfMemoryError

- Suas estruturas podem ter um loop infinito
- Verifique se não criou referências circulares
- Ajuste a memória da JVM: `java -Xmx512m`

#### Testes falhando

- Verifique se compilou todas as classes
- Execute os testes um por vez
- Leia as mensagens de erro cuidadosamente

---

## 📈 Estatísticas do Projeto

```
Total de Linhas de Código: ~2000
Número de Classes: 12
Número de Testes: 4
Estruturas Implementadas: 4
Complexidade Média: O(n)
```

---

## 🌟 Showcase

### Quem está usando?

Se você está usando este projeto, avise-nos! Adoraríamos adicionar você aqui.

---

<div align="center">

### Feito com ❤️ e Java

**⭐ Se este projeto te ajudou, considere dar uma estrela!**

[⬆ Voltar ao topo](#-estruturas-de-dados-em-java)

</div>
