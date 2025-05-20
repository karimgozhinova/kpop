# Используем OpenJDK 17
FROM openjdk:17

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем зависимости (JAR файл) в контейнер
COPY ./backend/target/kpop-app-0.0.1-SNAPSHOT.jar /app/backend.jar

# Открываем порт для бэкенда
EXPOSE 8080

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/backend.jar"]

