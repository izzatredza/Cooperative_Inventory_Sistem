# Cooperative Inventory System

A desktop-based management application built during my 2nd year at Uni for the *Object-Oriented Software Engineering* course. 

The system transitions traditional, manual paper-based inventory tracking within school cooperatives into a digital platform, reducing human error, misplaced records, and unsorted data management.

## 📌 Project Overview
School cooperatives ("Koperasi") often struggle with manual bookkeeping, making it difficult to retrace storage stocks, update incoming items, and organize shifting schedules. This solution provides a simple desktop graphical interface backed by data structures to manage items, check stock levels, and securely handle staff access.

### Key Architecture & Software Engineering Practices
Rather than just focusing on code, this project was built following a structured **Object-Oriented Software Engineering (OOSE)** lifecycle, including:
* **Domain Modeling & Use Case Design** to capture precise user functional requirements.
* **System Sequence Diagrams (SSD)** to map exact software interactions for step-by-step logic.
* **Class Diagram Representation** to enforce encapsulation, clean relationships, and robust modular programming.

---

## 🛠️ Features & Functional Modules

### 1. Authentication & Role Management
* **Multi-Role Access Control:** Differentiates system screens and actions between **Admin** and **Staff** actors.
* **Input Validation:** Prevents empty or invalid credential processing with reactive error alerts.

### 2. Inventory & Stock Control (Staff Level)
* **Add Item:** Easily insert brand new products specifying Name, Quantity, and Price.
* **Update Stock:** Instantly refresh item counts and unit pricing when new supplier batches arrive.
* **Remove Item:** Delete items no longer actively sold or tracked in the inventory.
* **List / Print Inventory:** Pulls up a clean structural view summarizing active stock sheets.

### 3. Account Supervision (Admin Level)
* Full CRUD features to **Add**, **Update (Edit)**, **Remove**, and **List** registered Staff logins to smoothly delegate cooperative desk shifts.

---

## 💻 Tech Stack
* **Language:** Java
* **GUI Framework:** Java Swing & AWT

---

## 📊 Software Engineering Artifacts

### Domain Model
The design builds clean structural associations between an `Admin`, `Staff`, `Supplier`, and `Item`.

### Class Diagram
The core logic relies on an object-oriented approach utilizing distinct structural classes:
* `Item`: Models product properties (ID, name, quantity, price).
* `Inventory`: Manages execution logic (`addItem`, `removeItem`, `updateItem`) utilizing structural lists.
* `Login` / `Admin` / `Staff`: Handles behavioral structures and account arrays.

---

## 📸 Application Preview
*(Tip: Take screenshots of your running Swing application windows and drop them here)*

| Login Window | Inventory Dashboard |
|---|---|
| ![Login UI](path/to/login_screenshot.png) | ![Main UI](path/to/main_screenshot.png) |

---

## ⚙️ How To Run Locally

1. **Clone the repository:**
```bash
   git clone [https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git) ```


