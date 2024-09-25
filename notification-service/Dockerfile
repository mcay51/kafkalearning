# 1. Temel imaj olarak JDK 17 kullanılıyor
FROM openjdk:17-jdk-slim

# 2. Uygulama için çalışma dizini oluşturuluyor
WORKDIR /app

# 3. Maven build sonucu oluşturulmuş JAR dosyasını çalışma dizinine kopyala
COPY target/notification-service.jar /app/notification-service.jar

# 4. Uygulama başlatılıyor
ENTRYPOINT ["java", "-jar", "notification-service.jar"]
