Dưới đây là một số bài tập Java có liên quan đến **database (SQL + JDBC)**, mô phỏng các tình huống thực tế khi làm việc với cơ sở dữ liệu.  

---

## **Bài 1: Quản lý Khách Hàng với MySQL và JDBC**  
Viết một chương trình Java để quản lý thông tin khách hàng bằng MySQL.  

### **Yêu cầu:**  
1. **Tạo bảng trong MySQL**:  
   ```sql
   CREATE TABLE customers (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       email VARCHAR(100) UNIQUE NOT NULL,
       phone VARCHAR(20),
       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );
   ```
2. **Viết các chức năng trong Java** sử dụng **JDBC**:  
   - Thêm khách hàng mới.  
   - Cập nhật thông tin khách hàng.  
   - Xóa khách hàng theo ID.  
   - Lấy danh sách khách hàng từ database và hiển thị ra màn hình.  

👉 **Gợi ý:**  
- Sử dụng **PreparedStatement** để tránh SQL Injection.  
- Viết class `CustomerDAO` để quản lý các thao tác với DB.  
- Dùng **MySQL Connector/J** (`mysql-connector-java`) để kết nối database.  

---

## **Bài 2: Ứng dụng Quản lý Sản phẩm với Spring Boot và JPA**  
Xây dựng một **REST API CRUD** để quản lý sản phẩm sử dụng **Spring Boot, Spring Data JPA và MySQL**.  

### **Yêu cầu:**  
1. **Tạo bảng sản phẩm trong MySQL**:  
   ```sql
   CREATE TABLE products (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       price DECIMAL(10,2) NOT NULL,
       stock INT NOT NULL
   );
   ```
2. **Xây dựng API với Spring Boot**:  
   - `GET /products` → Lấy danh sách sản phẩm.  
   - `GET /products/{id}` → Lấy chi tiết một sản phẩm.  
   - `POST /products` → Thêm sản phẩm mới.  
   - `PUT /products/{id}` → Cập nhật sản phẩm.  
   - `DELETE /products/{id}` → Xóa sản phẩm.  

👉 **Gợi ý:**  
- Dùng **Spring Boot + Hibernate (JPA)** để thao tác database.  
- Tạo class `ProductRepository` kế thừa `JpaRepository<Product, Long>`.  
- Viết `ProductController` để xử lý request.  

---

## **Bài 3: Hệ Thống Đặt Vé Máy Bay (Java Swing + MySQL)**  
Xây dựng một ứng dụng **Java Swing** cho phép người dùng đặt vé máy bay.  

### **Yêu cầu:**  
1. **Tạo bảng trong MySQL**:  
   ```sql
   CREATE TABLE flights (
       id INT AUTO_INCREMENT PRIMARY KEY,
       flight_number VARCHAR(20) UNIQUE NOT NULL,
       departure VARCHAR(100),
       destination VARCHAR(100),
       departure_time DATETIME,
       available_seats INT
   );
   ```
2. **Tính năng trong ứng dụng Java**:  
   - Hiển thị danh sách chuyến bay có sẵn.  
   - Cho phép người dùng tìm kiếm chuyến bay theo điểm đi/điểm đến.  
   - Đặt vé nếu còn chỗ trống.  

👉 **Gợi ý:**  
- Sử dụng **JDBC + Java Swing** để xây dựng giao diện.  
- Viết class `FlightDAO` để thao tác với database.  

---

## **Bài 4: Hệ Thống Quản Lý Đơn Hàng (Spring Boot + PostgreSQL)**  
Xây dựng một hệ thống đơn giản để quản lý đơn hàng bằng **Spring Boot, JPA và PostgreSQL**.  

### **Yêu cầu:**  
1. **Thiết kế bảng trong PostgreSQL**:  
   ```sql
   CREATE TABLE orders (
       id SERIAL PRIMARY KEY,
       customer_name VARCHAR(100) NOT NULL,
       order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
       total_price DECIMAL(10,2) NOT NULL
   );
   ```
2. **Viết API RESTful**:  
   - `POST /orders` → Tạo đơn hàng mới.  
   - `GET /orders` → Lấy danh sách đơn hàng.  
   - `GET /orders/{id}` → Lấy chi tiết đơn hàng.  
   - `DELETE /orders/{id}` → Xóa đơn hàng.  

👉 **Gợi ý:**  
- Dùng **Spring Data JPA** để mapping với PostgreSQL.  
- Viết class `OrderService` để xử lý logic đơn hàng.  

---

## **Bài 5: Hệ Thống Đăng Nhập & Đăng Ký (Spring Security + JWT + MySQL)**  
Xây dựng hệ thống đăng nhập và đăng ký tài khoản bảo mật bằng **Spring Security + JWT**.  

### **Yêu cầu:**  
1. **Tạo bảng user trong MySQL**:  
   ```sql
   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(100) UNIQUE NOT NULL,
       password VARCHAR(255) NOT NULL,
       role VARCHAR(50) NOT NULL
   );
   ```
2. **Chức năng trong API**:  
   - `POST /auth/register` → Đăng ký tài khoản mới.  
   - `POST /auth/login` → Đăng nhập, trả về token JWT.  
   - `GET /users/profile` → Lấy thông tin user (yêu cầu token hợp lệ).  

👉 **Gợi ý:**  
- Dùng **BCryptPasswordEncoder** để mã hóa mật khẩu.  
- Dùng **Spring Security** để bảo vệ API.  
- Sử dụng **JWT** để xác thực người dùng.  

---

Bạn muốn bắt đầu với bài nào? Mình có thể hướng dẫn từng bước để hoàn thành! 🚀