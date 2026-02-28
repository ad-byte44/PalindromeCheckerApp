# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case introduces an **Object-Oriented Design approach**, where palindrome logic is encapsulated inside a dedicated service class, following core OOPS principles.

---

# 🚀 Use Case 11 (UC11): Object-Oriented Palindrome Service

## 🎯 Goal

Encapsulate palindrome validation logic inside a separate class and expose a public method for checking palindromes.

---

## 🔄 Flow

1. Program starts.
2. `PalindromeChecker` service class is created.
3. `checkPalindrome()` method is exposed.
4. Main application creates an object of the service class.
5. The method is invoked.
6. Result is displayed.
7. Program exits.

---

## 🧠 Key Concepts Used (OOPS)

### 🔹 Encapsulation

Palindrome logic is hidden inside the `PalindromeChecker` class.  
The internal implementation is not exposed to the main application.

---

### 🔹 Single Responsibility Principle (SRP)

- `PalindromeChecker` → Responsible only for palindrome logic.
- `UseCase11PalindromeCheckerApp` → Responsible only for execution and display.

Each class has a single clear responsibility.

---

### 🔹 Abstraction

The main program interacts only with:

```java
checker.checkPalindrome(input);