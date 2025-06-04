# Subscription Page Backend

A subscription page for Qrencia using React JS for frontend and spring  boot and JDK 17 for backend
 
A **Spring Boot** backend designed for managing subscriptions, built using **JDK 17** and optimized for seamless integration with a **ReactJS frontend**. This backend is powered by **H2 (default)** for quick local testing, with **MySQL available for persistence and Dockerized development**.

---

## 🔥 Features  
✅ Spring Boot-based backend to handle subscriptions  
✅ H2 database for local development (default)  
✅ Optional MySQL integration for persistent data storage  
✅ RESTful APIs for seamless frontend communication  
✅ Dockerized for **development**  

---

## 🗄️ Database Configuration  

By default, the application uses **H2**, an in-memory database that resets on restart. If you prefer **MySQL**, update your Spring Boot configuration.  

### **H2 Configuration (Default)**  
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

### **MySQL Configuration (Optional)**  
```properties
# Uncomment these lines to use MySQL instead of H2
# spring.datasource.url=jdbc:mysql://mysql_db:3306/subscription_db
# spring.datasource.username=
# spring.datasource.password=
# spring.jpa.hibernate.ddl-auto=update
# spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

✅ **H2 is lightweight and requires no setup**  
✅ **MySQL is available for persistent storage**  

---

## 🏃 Running Locally  
To run the backend **without Docker**, follow these steps:

1️⃣ **Install Dependencies**  
Make sure you have **JDK 17** and **Maven** installed.

2️⃣ **Clone the Repository**  
```sh
git clone https://github.com/AfshanAlamEngg/subscription-page-backend.git
cd subscription-page-backend
cd subscription
```

3️⃣ **Run the Application**  
```sh
mvn spring-boot:run
```

4️⃣ **Play with the H2 database**  
```sh
http://localhost:8080//h2-console/
```
![image](https://github.com/user-attachments/assets/fe65c8be-ebf6-4050-91ce-23b27dabb65c)

Springboot Entities in H2 as Tables
![image](https://github.com/user-attachments/assets/6950c01c-993f-4fc1-9346-205f600ed191)


5️⃣ **Play with APIs using SWAGGER UI**  
```sh
http://localhost:8080/swagger-ui/index.html
```
![image](https://github.com/user-attachments/assets/46d4e060-1c81-41a8-8375-117c226c17ca)

```sh
http://localhost:8080/swagger-ui/index.html#/hello-world-controller/index
```
![image](https://github.com/user-attachments/assets/71b1de6b-7cdb-47b5-9997-1eb59f177b0b)

This will start the backend server locally using **H2 by default**.  

---

## 🔧 Development Environment (DevContainer)  
To streamline setup, a **DevContainer** configuration is included. This provides a **pre-configured development environment** for Java and MySQL.

```json
{
	"name": "Java",
	"image": "mcr.microsoft.com/devcontainers/java:1-17-bookworm",
	"features": {
		"ghcr.io/devcontainers/features/java:1": {
			"version": "none",
			"installMaven": "true",
			"installGradle": "false"
		},
		"ghcr.io/devcontainers-extra/features/mysql-homebrew:1": {}
	}
}
```

This ensures an easy, consistent setup for development.

---

## 🤝 Contribution Guidelines  
1. Fork the repository.  
2. Create a feature branch (`git checkout -b feature-name`).  
3. Commit your changes (`git commit -m "Added new feature"`).  
4. Push to GitHub (`git push origin feature-name`).  
5. Open a Pull Request.  

---

## 📜 License  
Licensed under **MIT License**. Feel free to use and modify it.

---

## 🎯 Questions?
Need help? Open an issue or contact us at [afshanalamengg@gmail.com](mailto:afshanalamengg@gmail.com).

---
