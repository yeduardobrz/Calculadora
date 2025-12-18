# 📘 Documentação – Calculadora em Java

## 📌 Visão Geral

Este programa implementa uma **calculadora simples em Java**, executada no terminal, que permite ao usuário realizar operações matemáticas básicas entre dois números.

As operações disponíveis são:

* Soma
* Subtração
* Multiplicação
* Divisão

A interação ocorre via entrada padrão (`Scanner`), onde o usuário escolhe a operação desejada e informa dois números.

---

## 🧱 Estrutura do Programa

### Pacote

```java
package exercicios;
```

O código está organizado dentro do pacote `exercicios`, usado para agrupar classes relacionadas.

---

### Importações

```java
import java.util.Scanner;
```

A classe `Scanner` é utilizada para capturar dados digitados pelo usuário no console.

---

### Classe Principal

```java
public class Calculadora
```

A classe `Calculadora` contém toda a lógica do programa e é responsável pela execução da aplicação.

---

### Método `main`

```java
public static void main(String[] args)
```

O método `main` é o ponto de entrada do programa. Toda a execução acontece dentro dele.

---

## 🔄 Fluxo de Execução

### 1️⃣ Inicialização do Scanner

```java
Scanner sc = new Scanner(System.in);
```

Cria um objeto `Scanner` para ler entradas do teclado.

---

### 2️⃣ Escolha da Operação

```java
System.out.println("digite 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir");
int calc = sc.nextInt();
```

O usuário escolhe a operação desejada digitando um número de 1 a 4.

---

### 3️⃣ Declaração das Variáveis

```java
double soma, sub, mult, div;
double n1, n2;
```

* `n1` e `n2`: números informados pelo usuário
* `soma`, `sub`, `mult`, `div`: armazenam o resultado das operações

---

### 4️⃣ Entrada dos Números

```java
System.out.println("agora digite 2 numeros para a operacao");
n1 = sc.nextDouble();
n2 = sc.nextDouble();
```

O usuário informa dois números que serão usados na operação escolhida.

---

### 5️⃣ Estrutura `switch case`

```java
switch (calc)
```

A estrutura `switch` decide qual operação executar com base na escolha do usuário.

#### ➕ Caso 1 – Soma

```java
case 1:
    System.out.println(soma = n1 + n2);
    break;
```

#### ➖ Caso 2 – Subtração

```java
case 2:
    System.out.println(sub = n1 - n2);
    break;
```

#### ✖️ Caso 3 – Multiplicação

```java
case 3:
    System.out.println(mult = n1 * n2);
    break;
```

#### ➗ Caso 4 – Divisão

```java
case 4:
    System.out.println(div = n1 / n2);
    break;
```

---

### 6️⃣ Encerramento do Scanner

```java
sc.close();
```

Fecha o objeto `Scanner`, liberando recursos do sistema.

---

