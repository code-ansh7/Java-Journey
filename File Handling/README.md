# 📂 File Handling in Java

The **File Handling** module is one of the most practical sections of Core Java. It introduces permanent data storage by allowing Java applications to create, read, write, update, and manage files on the local system.

Unlike variables that lose data when a program stops, file handling enables applications to store information permanently. Throughout this module, every concept is implemented through hands-on coding exercises and mini projects to understand how real-world desktop applications manage data.

---

# 🎯 Topics Covered

## 📁 File Basics

* Creating File Objects
* Checking File Existence
* Creating New Files
* File Information
* Absolute File Path

---

## ✍️ File Writing

* FileWriter
* Writing Characters
* Writing Strings
* Writing ASCII Values
* Writing Multiple Lines
* Writing User Input
* Creating Files Automatically

---

## 📖 File Reading

* FileReader
* Reading Single Characters
* Reading Complete Files
* Character-by-Character Reading
* End Of File (EOF)
* ASCII Values
* Character Counting
* Line Counting
* Copying Files
* Uppercase & Lowercase Converter

---

## ➕ File Append

* Append Mode
* Overwrite vs Append
* Preserving Previous Data
* Reading Updated Files
* Combining FileReader & FileWriter
* History-Based Applications

---

# 📚 Java Classes Learned

## 📄 File

Used to represent files and directories.

### Important Methods

```java
exists()
createNewFile()
getName()
getAbsolutePath()
delete()
```

---

## ✍️ FileWriter

Used for writing data into files.

### Important Methods

```java
write()
close()
flush()
```

---

## 📖 FileReader

Used for reading data from files.

### Important Methods

```java
read()
close()
```

---

# 💡 Important Concepts

## File Creation

```java
File file = new File("demo.txt");
```

---

## File Writing

```java
FileWriter fw = new FileWriter("demo.txt");
```

---

## Append Mode

```java
FileWriter fw = new FileWriter("demo.txt", true);
```

Preserves previous data and appends new content.

---

## File Reading

```java
FileReader fr = new FileReader("demo.txt");
```

---

## End Of File (EOF)

```java
while((ch = fr.read()) != -1)
```

The value `-1` indicates that the entire file has been read.

---

## Resource Management

Every program in this module follows the professional workflow:

```text
Open Resource
      │
      ▼
Read / Write
      │
      ▼
Close Resource
```

This prevents resource leaks and keeps applications efficient.

---

# 📂 Folder Structure

```text
File Handling
│
├── 📁 Basics
│   ├── FileInfo.java
│   ├── FileExistChecker.java
│   ├── CreateFileDemo.java
│   ├── FileHandlingRevision.java
│   └── README.md
│
├── 📁 File Writing
│   ├── FileWritingDemo.java
│   ├── MultipleLineWriter.java
│   ├── CharacterWriter.java
│   ├── ASCIIWriter.java
│   ├── InputDataWriter.java
│   ├── FileWritingRevision.java
│   └── README.md
│
├── 📁 File Reading
│   ├── ReadOneChar.java
│   ├── ReadCompleteFile.java
│   ├── ReadInputFile.java
│   ├── CountCharacter.java
│   ├── LineCounter.java
│   ├── CopyFile.java
│   ├── UpperCaseLowerCaseConverter.java
│   ├── FileReadingRevision.java
│   └── README.md
│
├── 📁 File Append
│   ├── AppendDemo.java
│   ├── ExpenseHistorySaver.java
│   ├── ExpenseHistoryViewer.java
│   ├── BankTransactionHistory.java
│   ├── StudentNotesApp.java
│   ├── StudentResultHistory.java
│   ├── Notes.txt
│   └── README.md
│
└── README.md
```

---

# 🚀 Mini Applications Built

### 📂 File Information Viewer

Displays file information such as name and path.

---

### ✍️ File Writer

Stores user data permanently.

---

### 📖 File Reader

Reads complete file contents.

---

### 📊 Character Counter

Counts total characters inside a file.

---

### 📄 Line Counter

Counts the total number of lines.

---

### 📋 Copy File Utility

Copies data from one file to another.

---

### 🔠 Uppercase & Lowercase Converter

Converts file contents into uppercase and lowercase versions.

---

### 💰 Expense History Saver

Stores daily expenses permanently.

---

### 📖 Expense History Viewer

Displays complete expense history.

---

### 🏦 Bank Transaction History

Stores deposit and withdrawal transactions.

---

### 📝 Student Notes App

Stores and displays personal notes.

---

### 🎓 Student Result History

Maintains student marks permanently.

---

# 💡 Key Learnings

* Files provide permanent storage.
* FileWriter automatically creates files if required.
* FileReader reads files character by character.
* `read()` returns `-1` at End Of File.
* Append mode preserves previous data.
* FileReader and FileWriter work together to build persistent applications.
* Resources should always be closed after use.
* File handling forms the foundation of desktop applications.

---

# 🏆 Learning Outcome

After completing this module, I can:

✅ Create and manage files

✅ Read complete file contents

✅ Write and append data

✅ Copy and process files

✅ Count characters and lines

✅ Convert file contents

✅ Build history-based applications

✅ Design persistent console applications

---

# 📈 Skills Gained

* Java File I/O
* Problem Solving
* Resource Management
* Java Console Development
* Data Persistence
* Application Logging
* Practical Programming

---

# 🚀 Upcoming Modules

* BufferedReader
* BufferedWriter
* Collections Framework
* Multithreading
* Java Swing
* Console Projects
* Desktop GUI Applications

---

# 📌 Module Status

```text
Module               : File Handling

Status               : ✅ Completed

Programs Completed   : 24

Mini Applications    : 12

Difficulty           : Beginner → Intermediate
```

---

# 👨‍💻 Java Learning Journey

This module is part of my **Core Java Learning Journey**, where every concept is implemented through hands-on coding, mini projects, and professional GitHub documentation.

My goal is not just to learn Java syntax, but to build real-world applications by understanding how software stores, manages, and processes data. This strong foundation will help me transition into **Java Swing**, **Desktop Application Development**, and eventually **Flutter App Development**.
