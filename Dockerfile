# 使用 Maven + JDK 17 來 build
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

# 先複製 pom.xml（利用快取）
COPY pom.xml .

# 下載依賴（加快後續 build）
RUN mvn dependency:go-offline

# 再複製全部程式碼
COPY . .

# 打包 jar
RUN mvn clean package -DskipTests

# ------------------------

# 使用輕量 JDK 17 執行
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# 從 build 階段拿 jar
COPY --from=build /app/target/*.jar app.jar

# Render 需要用這個 port
EXPOSE 8080

# 啟動 Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]