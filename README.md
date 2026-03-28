# Estruturas de Dados em Java

## 1. 📖 Visão Geral
Este projeto tem como objetivo implementar e demonstrar, de forma prática, as principais estruturas de dados utilizando a linguagem Java. Ele foi desenvolvido como material de apoio ao curso **"Estrutura de Dados: Computação na Prática com Java"**, servindo como referência didática e técnica.

O sistema contém implementações próprias de estruturas fundamentais, permitindo compreender seu funcionamento interno, comportamento e aplicações.

---

## 2. 🎯 Objetivos
- Demonstrar o funcionamento interno das estruturas de dados
- Implementar estruturas clássicas sem uso direto de bibliotecas prontas
- Facilitar o aprendizado prático de conceitos de computação
- Servir como base para estudos e aprimoramento em Java

---

## 3. 🧱 Escopo do Sistema
O projeto contempla as seguintes estruturas de dados:

- Arrays (Vetores)
- Listas Ligadas (simples e duplamente ligadas)
- Pilhas (Stack)
- Filas (Queue)
- Conjuntos (Set)

Cada estrutura inclui:
- Implementação
- Operações básicas
- Classes de teste

---

## 4. 🛠️ Tecnologias Utilizadas
- **Java** (versão X ou superior)
- IDE recomendada:
  - IntelliJ IDEA
  - Eclipse
  - Visual Studio Code

---

## 5. 📂 Arquitetura do Projeto

```
/data-structure
│
├── /src
│   ├── /ds
│   ├── /doublylinkedlist
│   │   ├── Cell.java
│   │   ├── DoublyLinkedList.java
│   │   └── DoublyLinkedListTest.java
│   ├── /linkedlist
│   │   ├── Cell.java
│   │   ├── LinkedList.java
│   │   └── LinkedListTest.java
│   ├── /queue
│   │   ├── Queues.java
│   │   └── QueueTest.java
│   ├── /set
│   │   ├── Sets.java
│   │   └── SetTest.java
│   ├── /stack
│   │   ├── Stacks.java
│   │   └── StackTest.java
│   ├── /vector
│   │   ├── Student.java
│   │   ├── Vector.java
│   │   └── VectorTest.java
│
├── README.md
└── LICENSE
```

---

## 6. ⚙️ Funcionalidades

### 6.1 Vetores (Arrays)
- Armazenamento sequencial em memória
- Acesso direto por índice
- Inserção e remoção controladas

### 6.2 Listas Ligadas
- Estrutura dinâmica baseada em nós
- Inserção e remoção eficientes

### 6.3 Listas Duplamente Ligadas
- Navegação bidirecional
- Maior flexibilidade nas operações

### 6.4 Pilhas (Stack)
- Estrutura LIFO (Last In, First Out)
- Operações: push, pop, peek

### 6.5 Filas (Queue)
- Estrutura FIFO (First In, First Out)
- Operações de enfileiramento e desenfileiramento

### 6.6 Conjuntos (Set)
- Armazenamento sem elementos duplicados
- Operações de verificação e inserção

---

## 7. ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/jrmoreiram/java-data-structure.git
```

2. Importe o projeto em uma IDE Java

3. Execute as classes de teste (`*Test.java`) para validar as estruturas

---

## 8. 🧪 Testes
Cada estrutura possui classes de teste dedicadas que demonstram:
- Uso das operações principais
- Comportamento esperado
- Casos básicos de validação

---

## 9. 🤝 Contribuição
Contribuições são bem-vindas. Para colaborar:

1. Fork do projeto  
2. Criação de branch (`feature/nova-funcionalidade`)  
3. Commit das alterações  
4. Abertura de Pull Request  

---

## 10. 📜 Licença
Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

## 11. 📌 Observações Finais
Este projeto é voltado principalmente para fins educacionais e pode ser utilizado como base para estudos mais avançados em algoritmos e estruturas de dados.
