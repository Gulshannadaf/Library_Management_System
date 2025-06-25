# 🎓 Advanced Student Record Management System

> A full-featured Java CLI application for managing student records — built using object-oriented principles, collections, and smart data processing.

---

## 📌 Project Overview

This project simulates a real-world **Student Record Management System** using Java. It allows users to add, view, update, delete, and analyze student records via an interactive command-line interface.

Each student record includes:
- Auto-generated unique ID
- Name, Department, Email
- Marks in 5 subjects
- Auto-calculated Average
- Auto-assigned Grade (A+ to F)

---

## 🛠 Features

| Feature                     | Description                                                  |
|----------------------------|--------------------------------------------------------------|
| ➕ Add Student              | Collects all details and calculates average + grade          |
| 📄 View All Students        | Displays list of all records with complete details           |
| 🔍 View by ID              | Search and view specific student by unique ID                |
| ✏️ Update Marks             | Modify all 5 subject marks, updates average + grade          |
| ❌ Delete Record            | Remove student by ID                                         |
| 🏆 Top & Lowest Performer   | Shows students with highest and lowest average marks         |

---

## 🧱 Code Structure

```bash
📦 Student-Management-System/
├── Student.java            # Defines the Student class with all fields & logic
├── StudentManager.java     # Manages all CRUD operations and analytics
├── MainApp.java            # CLI interface and main program loop
└── README.md               # Project documentation

## 📷 Screenshots

### 1️⃣ Adding a Student
![Student](screenshots/screenshot1.png)

### 2️⃣ Viewing All Students
![Student](screenshots/screenshot2.png)

### 3️⃣ Top and Lowest Scorer Report
![Student](screenshots/screenshot3.png)
