# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This project strengthens core programming fundamentals and introduces efficient data structure concepts such as character arrays and the two-pointer technique.

---

# 🚀 Use Case 4 (UC4): Character Array Based Palindrome Check

## 🎯 Goal

Convert a string into a character array and check whether it is a palindrome using an efficient comparison method.

---

## 🔄 Flow

1. Program starts.
2. A string is defined.
3. The string is converted into a `char[]`.
4. Two pointers are initialized (start and end).
5. Characters at both ends are compared.
6. If all characters match, the string is a palindrome.
7. Result is displayed.
8. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 Character Array (`char[]`)
A primitive array used to store individual characters of a string for direct index-based access.

### 🔹 Array Indexing
Accessing characters using index positions starting from 0.

### 🔹 Two-Pointer Technique
One pointer starts from the beginning and the other from the end.  
This avoids unnecessary comparisons and improves efficiency.

### 🔹 Time Complexity Awareness
Efficient comparison without creating additional String objects.

---

## 🗂️ Data Structure Used

### char[]

In this use case:
- The string is converted using `toCharArray()`.
- Characters are accessed directly via indices.
- Comparison is done in-place using two pointers.

---

## 📂 Project Structure
