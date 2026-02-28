# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case demonstrates an **advanced object-oriented design** using the **Strategy Pattern**, allowing dynamic selection of different palindrome algorithms at runtime.

---

# 🚀 Use Case 12 (UC12): Strategy Pattern for Palindrome Algorithms

## 🎯 Goal

Enable dynamic selection of palindrome-checking algorithms using the Strategy Design Pattern.

---

## 🔄 Flow

1. Program starts.
2. A `PalindromeStrategy` interface is defined.
3. Multiple strategy implementations are created:
    - `StackStrategy`
    - `DequeStrategy`
4. A `PalindromeChecker` context class is created.
5. Strategy is injected at runtime.
6. Algorithm is executed.
7. Strategy can be changed dynamically.
8. Result is displayed.
9. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 Interface

Defines a common contract:

```java
interface PalindromeStrategy {
    boolean check(String input);
}