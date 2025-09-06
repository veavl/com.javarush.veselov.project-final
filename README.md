## [REST API](http://localhost:8080/doc)

## Концепция:

- Spring Modulith
    - [Spring Modulith: достигли ли мы зрелости модульности](https://habr.com/ru/post/701984/)
    - [Introducing Spring Modulith](https://spring.io/blog/2022/10/21/introducing-spring-modulith)
    - [Spring Modulith - Reference documentation](https://docs.spring.io/spring-modulith/docs/current-SNAPSHOT/reference/html/)

```
  url: jdbc:postgresql://localhost:5432/jira
  username: jira
  password: JiraRush
```

- Есть 2 общие таблицы, на которых не fk
    - _Reference_ - справочник. Связь делаем по _code_ (по id нельзя, тк id привязано к окружению-конкретной базе)
    - _UserBelong_ - привязка юзеров с типом (owner, lead, ...) к объекту (таска, проект, спринт, ...). FK вручную будем
      проверять

## Аналоги

- https://java-source.net/open-source/issue-trackers

## Тестирование

- https://habr.com/ru/articles/259055/

Список выполненных задач:

2. `+`  Удалить социальные сети: vk, yandex
3. `+`  Вынести чувствительную информацию в отдельный проперти файл
5. `+`  Написать тесты для всех публичных методов контроллера ProfileRestController
6. `+`  Сделать рефакторинг метода com.javarush.jira.bugtracking.attachment.FileUtil#upload
7. `+`  Добавить новый функционал: добавления тегов к задаче (REST API + реализация на сервисе). 
`Протестировал операции (добавление, удаление) для тегов через браузер и JavaScript консоль! ✅`
9. `+`  Написать Dockerfile для основного сервера
- ✅ Создан Dockerfile
- ✅ Образ собирается без ошибок: `docker build -t jira-app .`
- ✅ Контейнер запускается:       `docker run -p 8080:8080 jira-app`  
- ✅ Spring Boot инициализируется	
  

` PS
` Регистрация - понимаю, что скорее всего не будет учитываться. 
- Но на это было потрачено время и может это будет как небольшой "+", если вдург мне не хватит немного до какой-то из задач. 
Как у меня заработала регистрация:
1.1	Указать реальный адрес ---@gmail – куда приходят письма подтверждения.
1.2	На этом адресе создать пароль для приложений App Password. И он же указывается в application.yaml 
2. При регистрации также указывается реальный адрес ---@gmail – можно тот же.

! Правда выкладывать свой реальный App Password на публичный репозиторий - не стоит. Потом я сменил App Password.












  