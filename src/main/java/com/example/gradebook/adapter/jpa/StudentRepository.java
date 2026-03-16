package com.example.gradebook.adapter.jpa;

/**
 * Репозиторий для доступа к таблице students в базе данных.
 *
 * Зачем: это посредник между приложением и базой данных. Вместо того чтобы писать
 * SQL-запросы вручную (INSERT INTO students ..., SELECT * FROM students WHERE id = ...),
 * ты наследуешь JpaRepository — и Spring автоматически создаёт реализацию с готовыми методами:
 * save(), findById(), findAll(), deleteById(), existsById().
 *
 * Это интерфейс, а не класс — реализацию создаёт Spring Data JPA при запуске приложения.
 * Тебе не нужно писать ни одного SQL-запроса. JpaRepository<Student, Long> означает:
 * "работай с сущностью Student, у которой первичный ключ типа Long".
 *
 * @Repository — аннотация, которая помечает интерфейс как репозиторий. Spring находит
 * его при сканировании пакетов и создаёт реализацию автоматически.
 */
public interface StudentRepository {
    // TODO: наследовать JpaRepository<Student, Long>
    // Аннотация @Repository
}
