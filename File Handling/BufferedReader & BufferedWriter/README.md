# 🚀 BufferedReader & BufferedWriter in Java

This module covers the **buffered file I/O classes** in Java, which provide faster and more efficient file operations than basic `FileReader` and `FileWriter`.

Instead of processing data character by character, buffered streams temporarily store data in memory (buffer), reducing disk access and improving performance.

This module focuses on understanding the working of buffers through practical programs and real-world examples.

---

# 🎯 Topics Covered

## 📖 BufferedReader

* Reading Complete Files
* Reading Line by Line
* `readLine()` Method
* End Of File (`null`)
* Skipping Lines
* Displaying Line Numbers
* Reading First N Lines
* Counting Total Lines

---

## ✍️ BufferedWriter

* Writing Text Efficiently
* `write()`
* `newLine()`
* Resource Management
* Writing Multiple Lines
* Append Mode with Buffer

---

# 📚 Concepts Learned

## BufferedReader

Used to read text files efficiently.

### Syntax

```java
BufferedReader br = new BufferedReader(new FileReader(fileName));
```

### Important Methods

```java
readLine()
close()
```

---

## BufferedWriter

Used to write text efficiently.

### Syntax

```java
BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
```

### Important Methods

```java
write()
newLine()
close()
```

---

# 📂 Folder Structure

```text
Day_29 (BufferedReader & BufferedWriter)
│
├── ReadCompleteFileUsingBufferedReader.java
├── CountLines.java
├── DisplayLineWithNumbers.java
├── ReadFirstNLines.java
├── SkipFirstLine.java
├── BufferedWriterInOneFile.java
├── ansh.txt
└── README.md
```

---

# 💡 Key Learnings

* Buffer improves file reading and writing performance.
* `BufferedReader` reads one complete line at a time.
* `readLine()` returns `null` at the end of the file.
* `BufferedWriter` provides faster writing than `FileWriter`.
* `newLine()` is preferred over `"\n"` because it is platform-independent.
* Always close file resources after use.
* Buffered streams are widely used in real-world Java applications.

---

# 🛠 Programs Implemented

### 📖 BufferedReader

* Read Complete File
* Count Total Lines
* Display Line Numbers
* Read First N Lines
* Skip First Line

---

### ✍️ BufferedWriter

* Write Multiple Lines
* Resource Management Demo
* BufferedWriter Revision Program

---

# 🏆 Learning Outcome

After completing this module, I can:

✅ Read files line by line

✅ Write files efficiently

✅ Count file lines

✅ Display numbered output

✅ Skip unwanted lines

✅ Read selected portions of files

✅ Build optimized file-based applications

---

# 🚀 Real World Applications

* Log Readers
* Student Record Systems
* Notes Applications
* Banking Systems
* Expense Managers
* Configuration File Readers
* Report Generators

---

# 📌 Module Status

```text
Module : BufferedReader & BufferedWriter

Status : ✅ Completed

Programs : 6+

Difficulty : Beginner → Intermediate
```

---

## 👨‍💻 Java Learning Journey

This module is part of my Core Java roadmap where every concept is learned through coding, practical exercises, mini applications, and GitHub documentation. My goal is to build a strong Java foundation before moving to Java Swing and Flutter App Development.
