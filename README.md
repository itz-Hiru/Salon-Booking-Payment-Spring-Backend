
# 💇‍♀️ Salon Booking System - Payment Service API 💼

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white)
![REST API](https://img.shields.io/badge/REST%20API-005571?style=for-the-badge&logo=protocols&logoColor=white)

> A backend service offering built with **Spring Boot** for managing payments in a Salon Booking System. This microservice handles payments via REST APIs.

---

## 🚀 Features

- ✅ Create a payment (with stripe)
- 🧑 Payment management (Update/Fetch details)

---

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot 3+**
- **Spring Security**
- **MySQL** (Database)
- **Lombok**
- **Spring Data JPA**
- **Maven**
- **Stripe 28.1.0**

---

## 🗂️ API Endpoints Overview

| Method | Endpoint                                | Description                     |
|--------|-----------------------------------------|---------------------------------|
| POST   | `/payments/create`                      | Create a payment                |
| GET    | `/payments/{paymentOrderId}`            | Get payment from payment order  |
| PATCH  | `/payments/proceed`                     | Proceed payment order           |

> 🛡️ All sensitive routes are secured with JWT-based authentication.

---

## 🏁 Getting Started

```bash
# Clone the project
git clone https://github.com/itz-Hiru/Salon-Booking-Payment-Spring-Backend.git
cd Salon-Booking-Payment-Spring-Backend

# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

⚡ App runs on: `http://localhost:5006`

---

## ⚙️ Configuration

Edit your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/salon_booking_payment_db
spring.datasource.username=your_user_name
spring.datasource.password=your_password

stripe.api.key="your stripe api key"
```

---

## 📦 Database Schema Example

```sql
CREATE DATABASE salon_booking_payment_db;
```

---

## 🧪 Testing

You can test APIs using:
- 🧪 **Postman**

---

## 📬 Contact

📧 Email: hirumithakuladewanew@gmail.com  
🌐 GitHub: [itz-Hiru](https://github.com/itz-Hiru)

---

## 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](./LICENSE) file for details.
