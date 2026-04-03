package com.example.gradebook.app;

import com.example.gradebook.adapter.dto.ScoreCreateDto;
import com.example.gradebook.adapter.dto.ScoreResponseDto;
import com.example.gradebook.adapter.dto.StudentCreateDto;
import com.example.gradebook.adapter.dto.StudentResponseDto;
import com.example.gradebook.adapter.jpa.StudentRepository;
import com.example.gradebook.entity.Score;
import com.example.gradebook.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Реализация сервиса — здесь живёт вся бизнес-логика приложения.
 *
 * Зачем: контроллер не должен содержать логику (валидацию, вычисления, преобразования).
 * Он только принимает HTTP-запрос и передаёт данные сюда. Сервис делает всю работу:
 * - преобразует DTO в Entity и обратно (пересечение границ слоёв)
 * - вызывает репозиторий для сохранения/получения данных из базы
 * - валидирует данные (балл 0-100, предмет существует)
 * - вычисляет средний балл и рейтинг
 *
 * @Service — аннотация говорит Spring: "создай экземпляр этого класса и управляй им".
 * Spring создаст один объект StudentServiceImpl и будет подставлять его везде,
 * где нужен StudentService (через Dependency Injection).
 *
 * @Transactional — оборачивает метод в транзакцию базы данных. Если в середине метода
 * произойдёт ошибка, все изменения откатятся и база останется в консистентном состоянии.
 * Ставится на методы, которые изменяют данные: create, update, delete, addScore.
 *
 * Конструктор принимает StudentRepository — Spring сам найдёт и подставит его.
 * Это Dependency Injection: ты не пишешь new StudentRepository(), а просто объявляешь
 * что тебе нужно, и Spring предоставляет.
 *
 * Приватные методы mapToResponseDto() и mapToScoreResponseDto() преобразуют Entity в DTO.
 * Они используются во всех публичных методах, чтобы не дублировать код маппинга.
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    // TODO: @Service, implements StudentService
    // Поле: StudentRepository (final)
    // Конструктор с StudentRepository
    // Реализация всех 7 методов из интерфейса
    // Приватные методы: mapToResponseDto(Student), mapToScoreResponseDto(Score)

    final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public StudentResponseDto createStudent(StudentCreateDto studentCreateDto) {
        return null;
    }

    @Override
    public StudentResponseDto getStudentById(Long id) {
        return null;
    }

    @Override
    public List<StudentResponseDto> getAllStudents() {
        return List.of();
    }

    @Override
    public StudentResponseDto updateStudent(Long id, StudentCreateDto dto) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public ScoreResponseDto addScore(Long studentId, ScoreCreateDto dto) {
        return null;
    }

    @Override
    public List<ScoreResponseDto> getScores(Long studentId) {
        return List.of();
    }

    private void mapToResponseDto(Student student) {

    }

    private void mapToScoreResponseDto(Score score) {
    }
}
