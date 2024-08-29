
# 📋 Task Manager

Task Manager — это простое приложение для управления задачами, разработанное с использованием Spring Boot. Оно позволяет пользователям создавать, обновлять, просматривать и удалять задачи через RESTful API. В проекте используется встроенная база данных H2 для хранения задач, что делает его легким и простым в развертывании.

---

## 🚀 Возможности

- **Создание задач**: Добавляйте новые задачи с заголовком и описанием.
- **Просмотр задач**: Просматривайте список всех задач.
- **Обновление задач**: Редактируйте детали задач, такие как заголовок, описание и статус выполнения.
- **Удаление задач**: Удаляйте ненужные задачи.
- **Встроенная база данных H2**: Использует базу данных H2 для хранения задач.

---

## 🛠️ Технологии

- **Java 17**
- **Spring Boot 3.0**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## 📦 Начало работы

### 📋 Предварительные требования

Убедитесь, что у вас установлено следующее:

- **Java 17** или выше
- **Maven 3.6** или выше

### 💻 Установка

1. Клонируйте репозиторий:

   \`\`\`bash
   git clone https://github.com/ваш-юзернейм/task-manager.git
   cd task-manager
   \`\`\`

2. Соберите проект:

   \`\`\`bash
   mvn clean install
   \`\`\`

3. Запустите приложение:

   \`\`\`bash
   mvn spring-boot:run
   \`\`\`

---

## 🌐 API Endpoints

Доступны следующие эндпоинты:

- **GET** `/api/tasks` - Получить все задачи.
- **GET** `/api/tasks/{id}` - Получить задачу по ID.
- **POST** `/api/tasks` - Создать новую задачу.
- **PUT** `/api/tasks/{id}` - Обновить задачу по ID.
- **DELETE** `/api/tasks/{id}` - Удалить задачу по ID.

### 🔍 Примеры запросов

Вы можете использовать инструменты, такие как Postman, или утилиту \`curl\` для тестирования API. Примеры ниже:

- **Создание задачи**:

  \`\`\`bash
  curl -X POST http://localhost:8080/api/tasks -H "Content-Type: application/json" -d "{"title":"Новая задача", "description":"Описание задачи"}"
  \`\`\`

- **Получение всех задач**:

  \`\`\`bash
  curl -X GET http://localhost:8080/api/tasks
  \`\`\`

- **Обновление задачи**:

  \`\`\`bash
  curl -X PUT http://localhost:8080/api/tasks/1 -H "Content-Type: application/json" -d "{"title":"Обновленная задача", "description":"Обновленное описание", "completed":true}"
  \`\`\`

- **Удаление задачи**:

  \`\`\`bash
  curl -X DELETE http://localhost:8080/api/tasks/1
  \`\`\`

---

## 💾 Консоль базы данных H2

Для доступа к консоли H2, откройте браузер и перейдите по адресу `http://localhost:8080/h2-console`. Используйте следующие настройки:

- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Имя пользователя**: `sa`
- **Пароль**: оставьте пустым