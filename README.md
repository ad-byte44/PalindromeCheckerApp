# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application that validates whether a given string is a palindrome.

This project strengthens core Java programming fundamentals and introduces important concepts like string immutability and content comparison.

---

# 🚀 Use Case 3 (UC3): Palindrome Check Using String Reverse

## 🎯 Goal

Check whether a string is a palindrome by reversing it.

---

## 🔄 Flow

1. Program starts.
2. A string is defined.
3. The string is reversed using a `for` loop.
4. The original string is compared with the reversed string.
5. The result is displayed.
6. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 Loop (for loop)
Used to iterate through the characters of the string in reverse order.

### 🔹 String Immutability
In Java, `String` objects are immutable.  
Each concatenation creates a new `String` object in memory.

### 🔹 String Concatenation (+)
Used to build the reversed string character by character.

> Note: This approach is simple but not memory efficient for large strings. It prepares us to later learn `StringBuilder`.

### 🔹 equals() Method
Used to compare the actual content of two `String` objects rather than their memory references.

---

## 🗂️ Data Structure Used

### String

The `String` class in Java is an immutable sequence of characters.

In this use case:
- It stores the original text.
- It is reversed manually using a loop.
- It is compared using the `equals()` method.

---

## 📂 Project Structure
