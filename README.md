Task3
=====

Spring boot application

## Start up

```
docker-compose up --build
```

or

```
docker build
docker-compose up
```

Created two profiles local and dev

### Swagger

http://localhost:8081/auth/swagger-ui/index.html

## Задание:

Реализация аутентификации и авторизации с использованием Spring Security и JWT

## Цель задания:

Создать базовое веб-приложение с использованием Spring Security и JWT для аутентификации и авторизации пользователей.

## Шаги задания:

### Настройка проекта:

Создайте новый проект Spring Boot.

### Настройка конфигурации безопасности:

Настройте базовую конфигурацию Spring Security для вашего приложения.
Используйте JWT для аутентификации пользователей.
Создайте класс для генерации и проверки JWT токенов.

### Реализация контроллеров:

Создайте контроллеры для аутентификации и регистрации пользователей.
Реализуйте методы для создания нового пользователя и генерации JWT токена при успешной аутентификации.
Реализуйте сохранение пользователей в базу данных PostgreSQL.
Добавьте поддержку ролей пользователей и настройте авторизацию на основе ролей.

### Тестирование:

Напишите модульные тесты для контроллеров и сервисов.
Убедитесь, что аутентификация и авторизация работают корректно.
Проверьте, что только аутентифицированные пользователи имеют доступ к защищенным ресурсам.

### Документация:

Добавьте краткую документацию к вашему API с использованием Swagger или OpenAPI.

### Результат задания:

Рабочее веб-приложение с базовой аутентификацией и авторизацией на основе Spring Security и JWT,
сопровождаемое модульными тестами и краткой документацией к API.