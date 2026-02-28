# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case demonstrates an optimized approach using a **Deque (Double Ended Queue)** to efficiently compare characters from both ends without creating additional reversal structures.

---

# 🚀 Use Case 7 (UC7): Deque-Based Optimized Palindrome Checker

## 🎯 Goal

Use a Deque to compare front and rear elements of a string to validate palindrome logic efficiently.

---

## 🔄 Flow

1. Program starts.
2. A string is defined.
3. Characters are inserted into a Deque.
4. First and last characters are removed.
5. Characters are compared.
6. Comparison continues until Deque is empty or mismatch is found.
7. Result is displayed.
8. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 Deque (Double Ended Queue)

A data structure that allows insertion and deletion from both front and rear ends.

### 🔹 Front and Rear Access

- `addLast()` → Insert at rear
- `removeFirst()` → Remove from front
- `removeLast()` → Remove from rear

This enables direct comparison of first and last characters.

### 🔹 Optimized Data Handling

Unlike Stack + Queue approach:
- No separate reversal string required
- No duplicate storage structures
- Cleaner and more efficient logic

---

## 🗂️ Data Structure Used

### Deque

Implemented using:

```java
Deque<Character> deque = new ArrayDeque<>();