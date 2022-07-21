ARG VERSION=17

FROM gradle:jdk${VERSION}-alpine as builder

WORKDIR /build/

COPY src src
COPY build.gradle.kts settings.gradle ./

RUN gradle --no-daemon clean bootJar

FROM eclipse-temurin:${VERSION}-jre-alpine

COPY --from=builder /build/build/libs/*.jar /app/app.jar
WORKDIR /app

CMD ["java","-jar","app.jar"]