package com.example.gradebook.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Сущность "Студент" — соответствует таблице "students" в базе данных.
 *
 * Зачем: это главный объект нашей предметной области. Каждая строка в таблице students —
 * это один студент. JPA (Hibernate) автоматически создаст эту таблицу при запуске приложения
 * благодаря аннотации @Entity.
 *
 * Поля:
 * - id: уникальный идентификатор, генерируется базой автоматически (@GeneratedValue).
 *   Мы никогда не задаём его вручную — при save() база сама назначит следующий номер.
 *
 * - name: имя студента. nullable = false означает, что база не позволит сохранить студента без имени.
 *
 * - scores: список оценок студента. Это связь "один ко многим" (@OneToMany) — у одного студента
 *   может быть много оценок. mappedBy = "student" указывает, что связь управляется полем student
 *   в классе Score (именно там хранится внешний ключ student_id).
 *   cascade = CascadeType.ALL означает: если мы сохраняем/удаляем студента, все его оценки
 *   тоже сохраняются/удаляются автоматически.
 *   orphanRemoval = true: если оценка удалена из списка — она удалится и из базы.
 *
 * Метод addScore(Score) нужен для правильного управления связью: он добавляет оценку в список
 * И устанавливает обратную ссылку score.setStudent(this) — без этого JPA не сохранит связь.
 *
 * Пустой конструктор обязателен — JPA создаёт объекты через рефлексию.
 */

@Entity
@Table(name = "students")
public class Student {
    // TODO: @Entity, @Table(name = "students")
    // Поля: id (Long, @Id, @GeneratedValue), name (String, @Column(nullable = false)), scores (List<Score>, @OneToMany)
    // Пустой конструктор, конструктор с name, метод addScore(Score), геттеры и сеттеры

    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)


    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)

    List<Score> scores = new ArrayList<>();

    public void addScore(Score score) {
        scores.add(score);
    };



    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
