# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case demonstrates the behavioral difference between two fundamental linear data structures — **Stack (LIFO)** and **Queue (FIFO)** — and uses them together to validate palindrome logic.

---

# 🚀 Use Case 6 (UC6): Queue + Stack Based Palindrome Check

## 🎯 Goal

Demonstrate the difference between FIFO and LIFO principles using Queue and Stack to validate whether a string is a palindrome.

---

## 🔄 Flow

1. Program starts.
2. A string is defined.
3. Characters are pushed into a stack.
4. Characters are enqueued into a queue.
5. Characters are popped from the stack.
6. Characters are dequeued from the queue.
7. The popped and dequeued characters are compared.
8. Result is displayed.
9. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 Queue
A linear data structure that follows the **First In First Out (FIFO)** principle.

### 🔹 Stack
A linear data structure that follows the **Last In First Out (LIFO)** principle.

### 🔹 Enqueue & Dequeue Operations
- `add()` → Insert into queue
- `remove()` → Remove from queue

### 🔹 Push & Pop Operations
- `push()` → Insert into stack
- `pop()` → Remove from stack

### 🔹 Stack vs Queue
This use case clearly demonstrates how:
- Queue maintains original order (FIFO)
- Stack reverses order (LIFO)

Comparing both outputs validates palindrome logic.

---

## 🗂️ Data Structures Used

- `Stack<Character>`
- `Queue<Character>` (Implemented using `LinkedList`)

---

