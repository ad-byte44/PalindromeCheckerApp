# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case demonstrates a **Linked List-based palindrome validation technique**, strengthening understanding of dynamic data structures and pointer manipulation.

---

# 🚀 Use Case 8 (UC8): Linked List Based Palindrome Checker

## 🎯 Goal

Check whether a string is a palindrome using a **Singly Linked List** by reversing the second half and comparing both halves.

---

## 🔄 Flow

1. Program starts.
2. A string is defined.
3. The string is converted into a singly linked list.
4. The middle of the list is found using the **Fast and Slow Pointer technique**.
5. The second half of the list is reversed in-place.
6. The first half and reversed second half are compared.
7. Result is displayed.
8. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 Singly Linked List

A dynamic data structure where each element (node) contains:
- Data
- Reference to the next node

### 🔹 Node Traversal

Sequential access to elements using `next` references.

### 🔹 Fast and Slow Pointer Technique

- `Slow` pointer moves one step at a time.
- `Fast` pointer moves two steps at a time.
- Used to efficiently find the middle of the list in **O(n)** time.

### 🔹 In-Place Reversal

The second half of the list is reversed without using extra memory, improving efficiency.

---

## 🗂️ Data Structure Used

### Singly Linked List

- Custom `Node` class created.
- Nodes connected using `next` references.
- No built-in collections used.
- Demonstrates manual memory and pointer handling.

---

