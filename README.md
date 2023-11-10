# Итоговая контрольная работа

## Задание 1. _Использование команды cat в Linux_

* Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
```
cat > Pets.txt && cat > Pack\ animals.txt    ## Ctrl + D to exit from cat
```
* Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
```
cat Pets.txt Pack\ animals.txt > somefile.txt && cat somefile.txt
```
* Переименовать получившийся файл в "Human Friends".
```
cat somefile.txt > Human\ Friends.txt
```
## Задание 2. _Работа с директориями в Linux_

* Создать новую директорию и переместить туда файл "Human Friends".

## Задание 3. _Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”_

* Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.

## Задание 4. _Управление deb-пакетами_

* Установить и затем удалить deb-пакет, используя команду `dpkg`.

## Задание 5. _История команд в терминале Ubuntu_

* Сохранить и выложить историю ваших терминальных команд в Ubuntu.

## Задание 6. _Диаграмма классов_

* Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".

* В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы.

* Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д).

* Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart, Draw.io, Microsoft Visio и других.

## Задание 7. _Работа с MySQL_

 ```sql
CREATE TABLE mobilephones
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Product_name VARCHAR(30) NOT NULL,
    Manufacturer VARCHAR(20) NOT NULL,
    Product_count INT DEFAULT 0,
    Price DECIMAL NOT NULL
);
  ```

* Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”
* После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.). 
* В ранее подключенном MySQL создать базу данных с названием "Human Friends".
* Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
* Заполнить таблицы данными о животных, их командах и датами рождения.
* Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
* Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
* Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

## Задание 8. _ООП и Java_

* Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 6(Диаграмма классов).

## Задание 9. _Программа-реестр домашних животных_

* Написать программу на Java, которая будет имитировать реестр домашних животных. 
* Добавление нового животного: реализовать функциональность для добавления новых животных в реестр, животное должно определяться в правильный класс (например, "собака", "кошка", "хомяк" и т.д.)
* Вывести список команд, которые может выполнять добавленное животное (например, "сидеть", "лежать").
* Добавить возможность обучать животных новым командам.
* Вывести список животных по дате рождения
* Реализовать консольный пользовательский интерфейс с меню для навигации между вышеуказанными функциями.

## Задание 10. _Счетчик животных_

* Создать механизм, который позволяет вывести на экран общее количество созданных животных любого типа (Как домашних, так и вьючных), то есть при создании каждого нового животного счетчик увеличивается на “1”. 
