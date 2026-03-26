package com.example.gradebook.adapter.dto;

/**
 * DTO для создания студента — то, что клиент отправляет в теле POST-запроса.
 *
 * Зачем нужен отдельный класс, а не сам Student?
 * Клиент не должен знать о внутренней структуре базы данных. Он не отправляет id
 * (его генерирует база), не отправляет список оценок (студент создаётся без оценок).
 * Клиент отправляет только имя — значит DTO содержит только поле name.
 *
 * DTO — это "Data Transfer Object". Его единственная задача: перенести данные из JSON
 * в Java-объект. Никаких аннотаций JPA (@Entity, @Column) здесь нет — этот класс
 * не связан с базой данных.
 *
 * Spring (через Jackson) автоматически преобразует JSON {"name": "Иван"} в этот объект,
 * используя сеттер или конструктор.
 */
public class StudentCreateDto {
    // TODO: поле name (String)
    // Пустой конструктор, конструктор с name, геттер и сеттер

    String name;

    public StudentCreateDto() {
    }

    public StudentCreateDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
