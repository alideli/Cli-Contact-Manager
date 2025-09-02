# 📒 Contact List (Java Console Application)

This project is a **Java console-based contact management system**.  
It allows users to **store, search, and display contacts** with additional features such as operator detection (IR-MCI, Irancell, Rightel).

---

## ✨ Features
- Add new contacts with:
  - **Name**
  - **National ID**
  - **Phone Number**
  - **Operator** (automatically detected)
- Operator detection based on phone number prefixes:
  - **IR-MCI** (Hamrah Aval)
  - **Irancell**
  - **Rightel**
- Search contacts by:
  - National ID (`sbnid`)
  - Operator (`sbop`)
  - Digits of phone number (`sbn`)
- Display all contacts sorted alphabetically by name
- Exit the program gracefully

---

## 📂 Project Structure
```
Contact_List/
│── MainClass.java # Main program with menu-driven operations
│── Contacts.java # Contact model (Name, NID, PHN, OP)
│── Search.java # Search utilities (by ID, operator, phone digits)
```
---

## 🛠 Requirements
- **Java 8 or higher**
- Any IDE (IntelliJ IDEA, Eclipse, NetBeans) or simply the Java CLI (`javac`, `java`)

---

## 🚀 How to Run
1. Clone the repository or copy the project files.
2. Open a terminal and navigate to the project directory.
3. Compile the Java files:
   ```bash
   javac Contact_List/*.java
4. Run the program.
```bash
java Contact_List.MainClass
