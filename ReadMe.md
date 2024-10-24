# Питомник для животных

## Описательная часть проект веб приложения:

![Структура проекта AnimalHouse](https://github.com/user-attachments/assets/b10c0f04-24a8-45aa-a49a-895af3e14bf3)
Здесь отражена структура всего проекта

Здесь описывается основной объект класс программы
![Animal-объект класса_1](https://github.com/user-attachments/assets/39b83fad-5d65-4ca4-b993-2783bc13c7c2)
![Animal-объект класса_2](https://github.com/user-attachments/assets/b0387812-aaec-4c33-a959-4ac3924b60a7)

Класс создает подклассы животных, подразделяя их на Домашних и Вьючных.
![Данный класс AnimalBuilder создает подклассы животных](https://github.com/user-attachments/assets/0a0daa22-6e8c-4a65-a5b4-6b364caf5761)

Интерфейс нам необходим для наследования артефакты интерфейса от SpringBoot
![Интерфейс TreeNode наследуемый от JPARepository](https://github.com/user-attachments/assets/1996f1b1-dc69-448e-9a76-290d405b6ab4)

Класс необходим для наследования функций интерфейса и создания методов для объектов класса
![Наследник AnimalTree интерфейса TreeNode для реализации методов программы_1](https://github.com/user-attachments/assets/ea86bf21-b77a-4009-8b5c-048e2901632f)
![Наследник AnimalTree интерфейса TreeNode для реализации методов программы_2](https://github.com/user-attachments/assets/04a18b32-ff3b-419a-a1fd-5b2164f24452)
![Наследник AnimalTree интерфейса TreeNode для реализации методов программы_3](https://github.com/user-attachments/assets/cfbdd8af-1fd8-4d1c-bb83-fbcf78b28fb2)

Сервис программы служит для реализации созданных для объектов класса методов и использования
в среде SpringBoot
![Главный сервис программы с аннотацией Service от SpringBoot_1](https://github.com/user-attachments/assets/f15c49cc-877c-4518-8b25-b9b3ad970188)
![Главный сервис программы с аннотацией Service от SpringBoot_2](https://github.com/user-attachments/assets/f3c959fc-d21b-4ee3-934b-15e066b929b0)

AnimalController необходим для связывания интерфейсов SpringBoot с веб интерфейсом.
![AnimalController для связывания сервиса и основой логики программы_1](https://github.com/user-attachments/assets/69f379da-4b25-4f2b-8e28-2854b0705b77)
![AnimalController для связывания сервиса и основой логики программы_2](https://github.com/user-attachments/assets/77d286cb-c91f-481f-8bcf-bd4ffe21859f)


Файлы с настройками: необходимы, чтобы установить связи и зависимости с артефактами структуры SpringBoot.
Также задаются параметры подключения к базе данных и портам подключения к веб интерфейсы, для вывода графики веб приложения
на браузер, с помощью файла application.properties
![Файл_pom xml-зависимости(dependencies)_1](https://github.com/user-attachments/assets/aa7c61e8-2a60-4eed-a796-19e060c405bb)
![Файл_pom xml-зависимости(dependencies)_2](https://github.com/user-attachments/assets/9eb355aa-a2cc-4854-a326-143d15141001)
![Файл_pom xml-зависимости(dependencies)_3](https://github.com/user-attachments/assets/cd08e648-16b6-4046-9a01-c257c48eeb88)
![С помощью файла application properties заданы настройки для интегрирования со средой SpringBoot](https://github.com/user-attachments/assets/e6894a52-4213-4eac-882a-a50d4104d945)

Тестовый запуск для ознакомления с работой приложения:
Запуск приложения на SpringBoot  с аутентификацией пользователя user (генерация пароля автоматически)
![Запуск приложения на SpringBoot  с аутентификацией пользователя user (генерация пароля автоматически)](https://github.com/user-attachments/assets/58dc7442-8d6d-465b-8281-e4ee60027b1e)
Подключение к системе AnimalHouse
![Подключение к системе AnimalHouse](https://github.com/user-attachments/assets/58d0067c-5e5e-47e3-b2ec-2c186138c831)

Вывод графики в веб интерфейсе для браузера Google Chrome
![Запуск основного меню приложения AnimalHouse](https://github.com/user-attachments/assets/001824fe-04ae-4811-bd20-17c3a4d94c32)

Тестирование завершено!

Теоритическая часть и практическая прописаны в файле Дипломной работы
