#Паттерн Одиночка
##Проблема
Необходим механизм гарантированого создания единственного 
екземпляра класа(уникальный обьект)

##Решение
Сделать конструктор приватным и создать публичный статический метод,
к которому и будут обращаться за екземпляром.

![simuduck uml](../assets/img/singletonUML.png)

##Применимость
 - Когда в программе должен быть единственный экземпляр какого-то класса, доступный всем клиентам
  (например, общий доступ к базе данных из разных частей программы).
  
 - более гибкий контроль над глобальными переменными (Отложенное создание, глобальная точка доступа)
  
##Преимущества
 - Гарантирует наличие единственного экземпляра класса.

 - Предоставляет к нему глобальную точку доступа.
 
 - Реализует отложенную инициализацию одиночки.
 
##Недостатки
 - Нарушает принцип единственной ответственности класса.
 
 - Проблемы мультипоточности - решается с помощью ключевого слова synchronized.
