package com.example.gradebook.adapter.dto;

import com.example.gradebook.entity.Subject;
import org.springframework.beans.factory.annotation.Value;

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
    String name;
    String subject;
    int value;

    public ScoreCreateDto() {
    }
    public ScoreCreateDto(String subject, int value) {
        this.subject = subject;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
