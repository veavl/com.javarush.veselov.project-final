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

` Юра привет. Я решил не все задачи. Но все равно решил выложить проект.
` Проверь пожалуйста те что есть. Так я буду знать хотя бы что-то!
...

** 1. Не в счет
## 2. Удалить социальные сети: vk, yandex. 
  `+`
## 3. Вынести чувствительную информацию в отдельный проперти файл
  `+`
** 4. Переделать тесты так, чтоб во время тестов использовалась in memory БД (H2), а не PostgreSQL. 
   "-"  
## 5. Написать тесты для всех публичных методов контроллера ProfileRestController
  `+`
## 6. Сделать рефакторинг метода com.javarush.jira.bugtracking.attachment.FileUtil#upload
  `+`  
  

` PS
` Регистрация - понимаю, что скорее всего не будет учитываться. 
#  Но на это было потрачено время и может это будет как небольшой "+", если вдург мне не хватит немного до какой-то из задач. 
Так у меня заработала регистрация:
1.1	Указать реальный адрес ---@gmail – куда приходят письма подтверждения.
1.2	На этом адресе создать пароль для приложений App Password. И он же указывается в application.yaml 
2. При регистрации также указывается реальный адрес ---@gmail – можно тот же.

** Правда выкладывать свой реальный App Password на публичный репозиторий - не стоит. Потом я сменил App Password.












  