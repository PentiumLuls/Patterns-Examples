#Паттерн Наблюдатель
##Проблема
Необходимо динамическое добавление нового функционала 

##Решение
Создание обертки для компонента, содержащей ссылку на компонент и расширяющюю его логику

![uml](../assets/img/decoratorUML.png)
UML классов на примере приложения Starbuzz caffe

##Применимость
 - Когда вам нужно добавлять обязанности объектам на лету, незаметно для кода, который их использует.
 
  - Объекты помещают в обёртки, имеющие дополнительные поведения. Обёртки и сами объекты имеют 
  одинаковый интерфейс, поэтому клиентам без разницы, с чем работать — с обычным объектом данных или с обёрнутым.
 
  - Когда нельзя расширить обязанности объекта с помощью наследования. 
  
##Преимущества
 - Большая гибкость, чем у наследования.
 
 - Позволяет добавлять обязанности на лету.
 
 - Можно добавлять несколько новых обязанностей сразу.
 
##Недостатки
 - Трудно работать с многократно обёрнутыми объектами.
 
 - Куча крошечных классов.