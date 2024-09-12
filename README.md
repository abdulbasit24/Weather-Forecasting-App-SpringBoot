# Weather Forecasting App 🌦️

A responsive weather forecasting web application that provides real-time weather data based on city name inputs. The app is built using Java, Spring Boot, Thymeleaf, and integrates Lottie animations to provide dynamic weather-related animations based on the current weather conditions.

## Features ✨
- **Real-time Weather Data**: Fetches and displays weather information like temperature, humidity, wind speed, cloudiness, and sunrise/sunset times.
- **Dynamic Weather Animations**: Provides visual weather animations (e.g., sunny, cloudy, rainy) using Lottie animations for a better user experience.
- **Responsive UI**: The app is fully responsive, with weather data displayed in two neat columns, optimized for both desktop and mobile views.
- **City-based Weather Search**: Users can search for the weather in any city using a simple input form.

## Tech Stack 🛠️

- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap 5
- **Animations**: Lottie for weather-based animations
- **API**: OpenWeatherMap API for fetching weather data

## Screenshots 📸

## Getting Started 🚀

### Prerequisites
To run this application locally, ensure you have the following installed:
- Java 8 or higher
- Maven
- OpenWeatherMap API Key (sign up [here](https://openweathermap.org/api) to get your key)

### Setup Instructions

1. **Clone the repository**:
    ```bash
    git clone https://github.com/abdulbasit24/Weather-Forecasting-App-SpringBoot.git
    cd weather-forecasting-app
    ```

2. **Update API Key**:
   - Open the `application.properties` file in `src/main/resources/` and replace the placeholder value with your actual OpenWeatherMap API key.
   ```properties
   weather.api.key=YOUR_OPENWEATHERMAP_API_KEY
   Mention your API KEY otherwise code will not work properly
   ```

3. **Build and Run the Application**:
   Run the app using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the App**:
   Once the app is running, visit it in your browser at:
   ```
   http://localhost:8081/weather
   ```

## Usage 📝

1. Enter the name of any city in the input field and click the **Search** button.
2. The app will fetch and display the weather details for the city, including temperature, humidity, wind speed, cloudiness, and more.
3. Weather-specific animations will be shown dynamically based on the current weather conditions (e.g., sunny, cloudy, rainy).

## Lottie Animations 🎨
This app uses Lottie animations to enhance user experience. The animations are dynamically loaded based on the weather condition returned by the OpenWeatherMap API. You can explore and customize these animations from [LottieFiles](https://lottiefiles.com).

## Project Structure 🗂️

```bash
weather-forecasting-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── weatherapp/
│   │   │               ├── WeatherAppApplication.java       # Main entry point for the Spring Boot app
│   │   │               ├── controller/
│   │   │               │   └── WeatherController.java       # Handles requests and sends responses
│   │   │               ├── model/
│   │   │               │   └── WeatherResponse.java         # Model for mapping the weather API response
│   │   │               ├── service/
│   │   │               │   └── WeatherService.java          # Service layer for interacting with the OpenWeatherMap API
│   │   │               ├── config/
│   │   │               │   └── WeatherConfig.java           # Configuration class for handling external API setup
│   │   │               └── exception/
│   │   │                   └── WeatherNotFoundException.java # Custom exception for handling errors when city not found
│   │   ├── resources/
│   │   │   ├── application.properties                       # Application configuration properties
│   │   │   └── templates/
│   │   │       └── weather.html                             # Thymeleaf template for displaying weather data and UI
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── weatherapp/
│   │                   └── WeatherAppTests.java             # Unit and integration tests for the application
├── pom.xml                                                  # Maven build file
```

### Key Files:
- **`WeatherAppApplication.java`**: The main entry point for running the Spring Boot application.
- **`WeatherController.java`**: Handles HTTP requests and fetches weather data from the OpenWeatherMap API.
- **`WeatherService.java`**: The service layer that interacts with the external weather API.
- **`WeatherResponse.java`**: Java model class to map the weather data received from the API.
- **`weather.html`**: Thymeleaf template responsible for displaying weather information and the UI.
- **`WeatherNotFoundException.java`**: Custom exception for handling scenarios when the city is not found.

## Contributing 🤝

Feel free to fork this repository, make improvements, and submit pull requests. Contributions, suggestions, and feature requests are always welcome!

### Steps to Contribute:
1. Fork the project
2. Create a feature branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Open a pull request

---

**Enjoy coding!** 😎
