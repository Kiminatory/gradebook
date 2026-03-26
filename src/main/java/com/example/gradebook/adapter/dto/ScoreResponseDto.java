package com.example.gradebook.adapter.dto;

/**
 * DTO для ответа клиенту с данными оценки.
 *
 * Зачем: клиенту не нужна вся Entity Score (с JPA-связью на Student, аннотациями и т.д.).
 * Ему нужны только понятные данные: id оценки, предмет, его русское название и балл.
 *
 * displayName берётся из Subject.getDisplayName() — например для MATH это "Математика".
 * Клиент получает и код предмета ("MATH") и его человеческое название ("Математика"),
 * чтобы можно было и отобразить пользователю, и отправить обратно на сервер при необходимости.
 */
public class ScoreResponseDto {
    // TODO: поля: id (Long), subject (String), displayName (String), value (int)
    // Геттеры и сеттеры для всех полей

    long id;
    String subject;
    String displayName;
    int value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
