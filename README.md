# 📚 SmartLibrary+ — Java OOP-Based Library Management System

A fully-featured console-based Library Management System developed in Java using Object-Oriented Programming principles. This project is part of a Java Developer Internship task.

---

## 🚀 Features

- 🔐 Admin and user roles (basic)
- 📖 Add and view books
- 🎯 Issue and return books (with status tracking)
- 🧠 Tracks issued date, user, and availability
- 📦 Designed for extensibility (file storage, login system, fines, etc.)

---

## 🧱 Tech Stack

- **Language:** Java  
- **IDE:** VS Code / IntelliJ  
- **Concepts Used:** OOP (Abstraction, Inheritance, Polymorphism, Encapsulation)

---

## 📸 Screenshots

### 🖥️ Main Menu and Book Listing

![Main Menu](./screenshot1.png)

### 📖 Issuing a Book and Viewing Issued Books

![Issue Book](./screenshot2.png)

---

## 🧩 Class Overview

- `Person` *(Abstract)* — base class for `User` and `Admin`
- `User` *(extends Person, implements LibraryActions)* — can issue and return books
- `Admin` *(extends Person)* — placeholder for admin-specific actions
- `Book` — stores book details (title, author, genre, issued status)
- `Library` — manages books and users
- `LibrarySystem` — main class with command-line UI
- `LibraryActions` *(Interface)* — defines book actions



