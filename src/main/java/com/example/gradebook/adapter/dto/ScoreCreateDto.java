package com.example.gradebook.adapter.dto;

/**
 * DTO для создания оценки — то, что клиент отправляет в теле POST-запроса.
 *
 * Зачем: клиент отправляет предмет как строку "MATH", а не как enum Subject.
 * JSON не знает про Java-enum, поэтому мы принимаем строку и в сервисе
 * преобразуем её в enum через Subject.valueOf(). Если клиент отправит
 * несуществующий предмет ("BIOLOGY"), valueOf() бросит исключение — и мы
 * вернём 400 Bad Request.
 *
 * value — числовой балл. Валидация (0-100) выполняется в сервисе.
 */
public class ScoreCreateDto {
    // TODO: поля: subject (String), value (int)
    // Пустой конструктор, конструктор с subject и value, геттеры и сеттеры
}
