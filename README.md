# 📚 Library Management System

A console-based Library Management System built in Java that demonstrates core Object-Oriented Programming (OOP) principles and data management techniques.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)

## 🎯 Overview

This application provides a comprehensive solution for managing library operations, including book inventory management, student registration, and book borrowing/returning processes. Built with educational purposes in mind, it showcases fundamental programming concepts while solving real-world library management challenges.

## ✨ Features

### 📖 Book Management
- **Add New Books**: Register books with unique serial numbers, titles, authors, and quantities
- **Update Inventory**: Modify book quantities to reflect new acquisitions
- **Smart Search**: Find books by serial number or author name
- **Inventory Display**: View complete catalog with availability status

### 👨‍🎓 Student Management  
- **Student Registration**: Add new students with unique registration numbers
- **Student Directory**: Browse all registered students
- **Borrowing Limits**: Enforce 3-book limit per student

### 🔄 Circulation System
- **Check Out**: Allow registered students to borrow available books
- **Check In**: Process book returns and update inventory
- **Real-time Tracking**: Monitor book availability and student borrowing history

## 🚀 Quick Start

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- **IDE** (IntelliJ IDEA, Eclipse, VS Code, or similar)
- **Git** for version control

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/mohith1976/Library-Management-System.git
   cd src/Library
   ```

2. **Open in your IDE**
   - Import the project into your preferred Java IDE
   - Ensure JDK is properly configured

3. **Compile and run**
   ```bash
   javac Library.java
   java Library
   ```

## 🏗️ Project Structure

```
library-management-system/
├── src/Library/
│   ├── Library.java      # Main application entry point
│   ├── book.java         # Book entity class
│   ├── books.java        # Book collection manager
│   ├── student.java      # Student entity class
│   └── students.java     # Student collection manager
├── README.md

```

### Class Architecture

| Class | Responsibility |
|-------|----------------|
| `Library.java` | Main menu interface and user interaction handling |
| `book.java` | Book entity with properties (serial, name, author, quantity) |
| `books.java` | Book collection operations (add, search, update) |
| `student.java` | Student entity with borrowing history tracking |
| `students.java` | Student management and circulation operations |

## 💡 Usage Examples

### Adding a New Book
```
1. Select "Add Book" from main menu
2. Enter book serial number: B001
3. Enter book name: Clean Code
4. Enter author name: Robert Martin
5. Enter quantity: 5
```

### Registering a Student
```
1. Select "Register Student" from main menu
2. Enter student name: John Doe
3. Enter registration number: S2024001
```

### Checking Out a Book
```
1. Select "Check Out Book"
2. Enter student registration number: S2024001
3. Enter book serial number: B001
4. Book successfully checked out!
```

## 🎓 Learning Objectives

This project demonstrates:
- **Object-Oriented Programming**: Encapsulation, classes, and objects
- **Data Management**: Array-based data storage and manipulation
- **User Interface Design**: Console-based menu systems
- **Business Logic**: Library operation workflows
- **Input Validation**: Basic error handling and data validation

## 🔧 Future Enhancements

- [ ] Database integration (SQLite/MySQL)
- [ ] GUI interface using JavaFX or Swing
- [ ] Advanced search filters (genre, publication year)
- [ ] Fine calculation for overdue books
- [ ] Book reservation system
- [ ] Export/import functionality
- [ ] Multi-user authentication
- [ ] RESTful API development

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request






---
