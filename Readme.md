# Car Booking Application

## Introduction

The Car Booking Application is a project aimed at providing users with a seamless platform to book cars for their travel needs. The application will feature robust functionalities, including user registration, car search, booking, and payment integration.

---

### Features

### Phase 1 (Current Development Phase):

- User Registration and Login System
- Car Listings with Basic Information (Model, Price, Availability)
- Search Functionality for Cars
- Basic Booking Flow

### Future Enhancements:

- Payment Integration (e.g., PayPal, Stripe, UPI)
- Real-time Notifications for Bookings
- Admin Panel for Managing Cars and Bookings
- Integration with Google Maps for Location-based Car Search
- Advanced Filters (Car Type, Price Range, Availability)

---

## Tech Stack

### Backend:

- **Language:** Java
- **Framework:** Spring Boot (REST APIs)
- **Database:** MySQL
- **Build Tool:** Maven

### Frontend:

- **Framework:** Angular
- **Styling:** TailwindCSS

### Other Tools:

- **Version Control:** Git
- **API Testing:** Postman
- **IDE:** IntelliJ IDEA

---

## Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/sangam-maurya/CarBooking
   cd CarBooking
   ```

2. **Setup Backend:**

    - Navigate to the backend folder:
      ```bash
      cd backend
      ```
    - Configure `application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/car_booking_db
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      ```
    - Run the application:
      ```bash
      mvn spring-boot:run
      ```

3. **Setup Frontend:**

    - Navigate to the frontend folder:
      ```bash
      cd frontend
      ```
    - Install dependencies:
      ```bash
      npm install
      ```
    - Start the development server:
      ```bash
      ng serve
      ```

---

## API Endpoints

| Method | Endpoint            | Description              |
| ------ | ------------------- | ------------------------ |
| GET    | /api/cars           | Get list of all cars     |
| POST   | /api/users/register | Register a new user      |
| POST   | /api/bookings       | Book a car               |
| GET    | /api/bookings/{id}  | Get details of a booking |

---

## Contribution Guidelines

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes with a clear message.
4. Push your branch to your forked repository.
5. Submit a pull request for review.

---

## Authors

- **Your Name** - [Maurya Sangam](https://github.com/sangam-maurya)
- **Team Members** - [SIngh Harsh](https://github.com/harshsinghcs)
---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

For queries or feedback, please email us at: [share.harshsingh@gmail.com](mailto\:share.harshsingh@gmail.com)

