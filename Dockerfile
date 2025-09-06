# Используем готовый JAR файл
FROM openjdk:17-alpine

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем JAR файл приложения
COPY target/jira-1.0.jar app.jar

# Устанавливаем переменные окружения
ENV SPRING_PROFILES_ACTIVE=prod
ENV JAVA_OPTS="-Xmx1g -Xms512m"
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/jira
ENV SPRING_DATASOURCE_USERNAME=jira

# Открываем порт 8080
EXPOSE 8080

# Команда запуска приложения
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]


