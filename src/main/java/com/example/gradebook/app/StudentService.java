package com.example.gradebook.app;

/**
 * Интерфейс сервиса для работы со студентами.
 *
 * Зачем интерфейс, а не сразу класс?
 * Контроллер зависит от этого интерфейса, а не от конкретной реализации (StudentServiceImpl).
 * Это принцип чистой архитектуры: внешние слои знают только об интерфейсах внутренних слоёв.
 *
 * Преимущество: если завтра нужно заменить реализацию (например, для тестов подставить заглушку),
 * контроллер не нужно менять — он продолжит работать с любым классом, который реализует
 * этот интерфейс. Spring сам подставит нужную реализацию через Dependency Injection.
 *
 * Здесь объявлены только сигнатуры методов (что принимают и что возвращают),
 * без какой-либо логики. Логика будет в StudentServiceImpl.
 */
public interface StudentService {
    // TODO: объявить методы:
    // StudentResponseDto createStudent(StudentCreateDto dto)
    // StudentResponseDto getStudentById(Long id)
    // List<StudentResponseDto> getAllStudents()
    // StudentResponseDto updateStudent(Long id, StudentCreateDto dto)
    // void deleteStudent(Long id)
    // ScoreResponseDto addScore(Long studentId, ScoreCreateDto dto)
    // List<ScoreResponseDto> getScores(Long studentId)
}
