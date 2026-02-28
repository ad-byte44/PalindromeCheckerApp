# 📘 Palindrome Checker App

## 📌 Project Overview

The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This use case focuses on **performance comparison** between different palindrome-checking algorithms to understand their practical efficiency.

---

# 🚀 Use Case 13 (UC13): Performance Comparison

## 🎯 Goal

Compare the execution performance of multiple palindrome algorithms.

---

## 🔄 Flow

1. Program starts.
2. A test string is defined.
3. Multiple palindrome algorithms are executed:
   - Two-Pointer Approach
   - Stack-Based Approach
   - Deque-Based Approach
4. Execution time is captured using `System.nanoTime()`.
5. Results and execution times are displayed.
6. Program exits.

---

## 🧠 Key Concepts Used

### 🔹 System.nanoTime()

Used to capture high-precision execution time.

Example:

```java
long startTime = System.nanoTime();
boolean result = twoPointerCheck(input);
long endTime = System.nanoTime();
long executionTime = endTime - startTime;