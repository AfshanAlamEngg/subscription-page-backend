# Subscription Page Backend

A subscription page for Qrencia using React JS for frontend and spring  boot and JDK 17 for backend

A **Spring Boot** backend for managing subscriptions, built using **JDK 17** and designed to work seamlessly with a **ReactJS frontend**. The backend includes MySQL as the database and is fully Dockerized for easy deployment.

## 📌 Features
- Spring Boot-based backend for handling subscriptions.
- MySQL integration for storing user data.
- RESTful APIs for frontend communication.
- Dockerized environment for both **development** and **production**.
- Built-in support for **Prometheus monitoring**.

---

## ⚙️ Project Setup

### **1. Clone the Repository**
```sh
git clone https://github.com/AfshanAlamEngg/subscription-page-backend.git
cd subscription-page-backend
```

### **2. Set Up Environment Variables**
Create a `.env` file in the root directory and define your database credentials:
```env
MYSQL_ROOT_PASSWORD=
MYSQL_DATABASE=
MYSQL_USER=
MYSQL_PASSWORD=
```

### **3. Build and Run the Application**

#### **Using Maven (Without Docker)**
```sh
./mvnw clean package
java -jar target/subscription-service.jar
```

#### **Using Docker (Recommended)**
##### **Development Mode**
```sh
docker-compose -f docker/docker-compose.dev.yml up --build
```

##### **Production Mode**
```sh
docker-compose -f docker/docker-compose.prod.yml up --build
```

✅ **Ensures a consistent, isolated environment**  
✅ **Automates backend & database setup**  

---
<!--
## 🛠️ API Endpoints
### **Subscription Management**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/api/subscriptions` | Create a new subscription |
| `GET` | `/api/subscriptions/{id}` | Retrieve subscription details |
| `PUT` | `/api/subscriptions/{id}` | Update subscription details |
| `DELETE` | `/api/subscriptions/{id}` | Remove a subscription |

Use tools like **Postman** or **Curl** for testing.
---
-->

## 🔍 Database Configuration
The application uses **MySQL** as the database. Below is the **`application.properties`** configuration:

```properties
spring.datasource.url=jdbc:mysql://mysql_db:3306/subscription_db
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

✅ **Uses Docker-defined MySQL container**  
✅ **Persists data for seamless restarts**  

---

<!--
## 🔬 Monitoring with Prometheus
The backend is configured for **Prometheus monitoring**. To enable it:
```sh
docker-compose -f docker/docker-compose.prod.yml up --build
```
Then access Prometheus at:
```
http://localhost:9090
```

---
--->

## 📝 Contribution Guidelines
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m "Added new feature"`).
4. Push to GitHub (`git push origin feature-name`).
5. Open a Pull Request.

---

## 📜 License
This project is licensed under **MIT License**. Feel free to use and modify it.

---

## 🎯 Questions?
Need help? Open an issue or contact us at [afshanalamengg@gmail.com](mailto:afshanalamengg@gmail.com).

---