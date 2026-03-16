package com.example.gradebook.adapter.errors;

/**
 * Глобальный обработчик ошибок для всех контроллеров.
 *
 * Зачем: без этого класса, если в контроллере или сервисе вылетает исключение,
 * Spring вернёт клиенту стандартную HTML-страницу с ошибкой или непонятный JSON.
 * Мы хотим всегда возвращать аккуратный JSON с полями: timestamp, status, error, message.
 *
 * @RestControllerAdvice — аннотация говорит Spring: "перехватывай все исключения
 * из всех контроллеров и обрабатывай их здесь". Это централизованная обработка ошибок —
 * не нужно писать try-catch в каждом методе каждого контроллера.
 *
 * Каждый метод с @ExceptionHandler обрабатывает свой тип исключения:
 * - StudentNotFoundException → 404 Not Found (студент не найден)
 * - IllegalArgumentException → 400 Bad Request (невалидные данные: балл вне 0-100, неизвестный предмет)
 * - Exception → 500 Internal Server Error (всё остальное — непредвиденные ошибки)
 *
 * Метод возвращает ResponseEntity<Map<String, Object>> — это позволяет задать и HTTP-статус,
 * и тело ответа. Map превращается в JSON автоматически.
 */
public class GlobalExceptionHandler {
    // TODO: @RestControllerAdvice
    // Метод handleStudentNotFound(StudentNotFoundException ex) — @ExceptionHandler, статус 404
    // Метод handleIllegalArgument(IllegalArgumentException ex) — @ExceptionHandler, статус 400
    // Метод handleGeneral(Exception ex) — @ExceptionHandler, статус 500
    // Каждый метод возвращает ResponseEntity<Map<String, Object>> с полями: timestamp, status, error, message
}
