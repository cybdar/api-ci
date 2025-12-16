# API-CI Project | Настройка CI

[![Build status](https://ci.appveyor.com/api/projects/status/exfo9k3y11wfo1i1?svg=true)](https://ci.appveyor.com/project/cybdar/api-ci)

Учебный проект по настройке Continuous Integration (AppVeyor) для REST API тестов.

Технологии: Java 11, Gradle, JUnit 5, REST Assured.

Локальный запуск:
```bash
java -jar ./artifacts/app-mbank.jar &
./gradlew test