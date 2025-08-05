# 💼 SmartBill360

**SmartBill360** is an enterprise-grade invoice management system built using **Spring Boot**, designed to simplify billing operations. It allows businesses to create, manage, send, and track invoices, consignees, and user authentication securely and efficiently.

---

## 🚀 Features

- ✅ Create, update, and delete invoices
- 📩 Send invoices via email as PDF attachments
- 🧾 Consignee registration and search functionality
- 🔐 JWT-based authentication and role-based authorization
- 🔁 Password reset and OTP-based login
- 📦 Product-wise invoice item management
- 📂 Modular and scalable project structure

---

## 🛠️ Tech Stack

| Layer        | Technology                          |
|--------------|--------------------------------------|
| Backend      | Java 17, Spring Boot, Spring Security|
| Persistence  | Spring Data JPA, Hibernate, MySQL    |
| PDF Utility  | iText PDF                            |
| Email        | JavaMailSender                       |
| Validation   | Jakarta Validation (JSR-380)         |
| Build Tool   | Maven                                |
| Testing      | JUnit, Mockito (planned)             |

---


---

## 🔐 Authentication & Authorization

- Login is secured with JWT tokens.
- Roles: `ADMIN`, `ACCOUNTANT`, and `USER`
- Certain routes are protected with `@PreAuthorize` annotations.

---

## 📤 Email Functionality

- Uses `JavaMailSender` to send invoice PDFs to consignees.
- Sender email is configurable in `application.properties`.

---

## 🧪 API Endpoints (Sample)

| Method | Endpoint                       | Description                 |
|--------|--------------------------------|-----------------------------|
| POST   | `/create/invoice`              | Create a new invoice        |
| GET    | `/get/invoice/id/{id}`         | View invoice PDF            |
| PUT    | `/update/invoice/{id}`         | Update invoice              |
| DELETE | `/remove/invoice/{id}`         | Delete invoice              |
| GET    | `/send/invoice/{id}`           | Email invoice to consignee  |
| POST   | `/register/consignee`          | Add a consignee             |
| GET    | `/search/consignee?keyword=xyz`| Search consignee by name    |

---

📷 Screenshots (Optional)
 - Bill Sample - /samples/invoice
 - Email Sample - /samples/email

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/mehul1908/smartbill360.git
cd smartbill360
