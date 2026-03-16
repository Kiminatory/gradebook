package com.example.gradebook.adapter.controller;

/**
 * REST-контроллер — точка входа для HTTP-запросов от клиента.
 *
 * Зачем: когда клиент (Postman, браузер, мобильное приложение) отправляет запрос
 * на адрес /api/students, Spring направляет его сюда. Контроллер — это маршрутизатор:
 * он определяет, какой метод вызвать в зависимости от HTTP-метода и URL.
 *
 * @RestController = @Controller + @ResponseBody. Это значит: все методы возвращают
 * данные напрямую (JSON), а не имя HTML-страницы.
 *
 * @RequestMapping("/api/students") — базовый путь для всех эндпоинтов в этом контроллере.
 * Все методы внутри будут начинаться с /api/students.
 *
 * Контроллер должен быть "тонким": он не содержит логики, не вычисляет ничего,
 * не работает с базой напрямую. Он просто:
 * 1. Принимает запрос
 * 2. Вызывает нужный метод сервиса
 * 3. Возвращает результат с правильным HTTP-статусом
 *
 * Конструктор принимает StudentService (интерфейс, не реализацию) — Spring сам
 * подставит StudentServiceImpl, потому что это единственная реализация.
 */
public class StudentController {
    // TODO: @RestController, @RequestMapping("/api/students")
    // Поле: StudentService (final)
    // Конструктор с StudentService
    // Методы:
    // create       — @PostMapping, @RequestBody StudentCreateDto, return ResponseEntity 201 Created
    // getAll       — @GetMapping, return ResponseEntity.ok(список)
    // getById      — @GetMapping("/{id}"), @PathVariable Long id
    // update       — @PutMapping("/{id}"), @PathVariable + @RequestBody
    // delete       — @DeleteMapping("/{id}"), return ResponseEntity.noContent().build() — 204
    // addScore     — @PostMapping("/{id}/scores"), id из пути + ScoreCreateDto из тела
    // getScores    — @GetMapping("/{id}/scores")
}
