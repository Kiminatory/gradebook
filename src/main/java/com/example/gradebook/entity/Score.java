package com.example.gradebook.entity;

import com.example.gradebook.adapter.controller.StudentController;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

/**
 * Сущность "Оценка" — соответствует таблице "scores" в базе данных.
 *
 * Зачем: хранит оценку конкретного студента по конкретному предмету.
 * Каждая строка в таблице scores — одна оценка (например: студент Иван, предмет MATH, балл 95).
 *
 * Поля:
 * - id: уникальный идентификатор оценки, генерируется базой.
 *
 * - subject: предмет (enum Subject). @Enumerated(EnumType.STRING) говорит JPA хранить
 *   в базе текст "MATH", а не число 0. Без этой аннотации JPA хранит порядковый номер enum,
 *   и если ты поменяешь порядок значений — все данные сломаются.
 *
 * - value: числовой балл от 0 до 100. Валидация диапазона делается в сервисе, не здесь.
 *
 * - student: ссылка на студента, которому принадлежит оценка. Это обратная сторона связи
 *   @ManyToOne — много оценок принадлежат одному студенту.
 *   fetch = FetchType.LAZY: данные студента подгружаются только когда ты к ним обращаешься,
 *   а не при каждом запросе оценки (экономия ресурсов).
 *   @JoinColumn(name = "student_id") указывает имя столбца внешнего ключа в таблице scores.
 */
@Entity
@Table(name = "scores")
public class Score {
    // TODO: @Entity, @Table(name = "scores")
    // Поля: id, subject, value, student
    // Пустой конструктор, конструктор с subject и value, геттеры и сеттеры
    Subject subject;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private Value value;

    public Score() {
    }

    public Score(Subject subject) {
        this.subject = subject;
    }

    public Score(Value value) {
        this.value = value;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
