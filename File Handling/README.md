 # 📂 File Handling in Java

This module contains Java programs that demonstrate how to create, write, read, and manage files using Java's File Handling API. It focuses on building a strong foundation for real-world applications like Expense Tracker, Student Management System, Bank App, and Jarvis AI.

---

## 🎯 Topics Covered

### 📁 File Basics

* Creating File Objects
* Checking File Existence
* Creating New Files
* Getting File Name
* Getting Absolute File Path

### ✍️ File Writing

* Writing Text to Files
* Writing Multiple Lines
* Writing Characters
* Writing ASCII Values
* Taking User Input and Storing in Files

### 📖 File Reading

* Reading One Character
* Reading Complete File
* Reading User Selected File
* Reading ASCII Values
* Reading Characters
* Character Counting
* Line Counting
* Copying File Content
* Uppercase & Lowercase File Conversion
* Understanding File Pointer
* End Of File (EOF)

---

## 📚 Concepts Learned

### 📄 File Class

Used to represent files and directories.

**Important Methods**

```java
exists()
createNewFile()
getName()
getAbsolutePath()
```

---

### ✍️ FileWriter Class

Used to write data into files.

**Important Methods**

```java
write()
close()
```

---

### 📖 FileReader Class

Used to read data from files character by character.

**Important Methods**

```java
read()
close()
```

---

### 🔤 Character Class

Used to perform operations on single characters.

**Important Methods**

```java
Character.toUpperCase()
Character.toLowerCase()
```

---

## 📂 Folder Structure

```text
File Handling
│
├── Basics
│   ├── FileInfo.java
│   ├── FileExistChecker.java
│   ├── CreateFileDemo.java
│   ├── FileHandlingRevision.java
│   └── README.md
│
├── File Writing
│   ├── FileWritingDemo.java
│   ├── MultipleLineWriter.java
│   ├── CharacterWriter.java
│   ├── ASCIIWriter.java
│   ├── InputDataWriter.java
│   ├── FileWritingRevision.java
│   └── README.md
│
├── File Reading
│   ├── ReadOneChar.java
│   ├── ReadCompleteFile.java
│   ├── ReadInputFile.java
│   ├── CountCharacter.java
│   ├── LineCounter.java
│   ├── CopyFile.java
│   ├── UpperCaseLowerCaseConverter.java
│   └── README.md
```

---

## 💡 Key Learnings

* Files can be created using `File`.
* File existence can be checked using `exists()`.
* `FileWriter` automatically creates files if they don't exist.
* `FileReader` reads one character at a time.
* `read()` returns the ASCII value of the character.
* End Of File (EOF) is represented by `-1`.
* Every `read()` moves the file pointer to the next character.
* Once EOF is reached, a new `FileReader` object is required to read the file again.
* `Character.toUpperCase()` and `Character.toLowerCase()` work with single characters.
* `close()` releases system resources and should always be called after file operations.

---

## 🚀 Programs Built

### 📁 File Basics

* File Information
* File Existence Checker
* Create New File
* File Handling Revision

### ✍️ File Writing

* File Writing Demo
* Multiple Line Writer
* Character Writer
* ASCII Writer
* User Input File Writer
* File Writing Revision

### 📖 File Reading

* Read One Character
* Read Complete File
* Read File from User Input
* Character Counter
* Line Counter
* File Copy
* Uppercase & Lowercase Converter

---

## 💼 Real World Applications

* 💰 Expense Tracker
* 🏦 Bank Management System
* 🎓 Student Management System
* 🤖 Java Jarvis
* 📝 Notes Manager
* 📚 Library Management System
* 📋 Attendance System
* 🏫 School Management Software

---

## 🧠 Skills Developed

* File Creation
* File Reading
* File Writing
* Character Processing
* ASCII Handling
* File Copying
* File Pointer Understanding
* Exception Handling
* Dynamic File Access
* Resource Management

---

## 🚀 Upcoming Topics

* File Append Mode
* BufferedReader
* BufferedWriter
* File Serialization
* Mini File Handling Projects

---

## 🏆 Learning Outcome

After completing this module, I can:

✅ Create and manage files

✅ Read data from files

✅ Write data into files

✅ Copy one file into another

✅ Count characters and lines

✅ Convert file content into uppercase and lowercase

✅ Understand File Pointer & EOF

✅ Store and retrieve user data permanently

✅ Build basic file-based Java applications

---

### 👨‍💻 Java Learning Journey

Part of my Core Java learning roadmap where I practice every concept through hands-on coding, build mini projects, document my progress, and maintain everything on GitHub.
