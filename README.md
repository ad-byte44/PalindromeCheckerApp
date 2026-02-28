# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case enhances the palindrome logic by ignoring spaces, special characters, and case differences using string preprocessing and regular expressions.

---

# 🚀 Use Case 10 (UC10): Case-Insensitive & Space-Ignored Palindrome

## 🎯 Goal

Check whether a string is a palindrome while:
- Ignoring uppercase and lowercase differences
- Ignoring spaces
- Ignoring special characters

---

## 🔄 Flow

1. Program starts.
2. A string with spaces and mixed case is defined.
3. The string is normalized:
    - Convert to lowercase.
    - Remove non-alphanumeric characters.
4. Apply palindrome checking logic.
5. Display result.
6. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 String Preprocessing

Before checking for palindrome:
- `toLowerCase()` is used to normalize case.
- `replaceAll()` is used to remove unwanted characters.

Example:
```java
String normalized = original.toLowerCase().replaceAll("[^a-z0-9]", "");