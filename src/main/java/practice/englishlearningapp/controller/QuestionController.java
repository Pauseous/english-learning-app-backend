package practice.englishlearningapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practice.englishlearningapp.entity.Question;
import practice.englishlearningapp.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable long id) {
        return questionService.getById(id);
    }

    @GetMapping("")
    public List<Question> getQuestionsByQuantity(@RequestParam int quantity) {
        return questionService.getQuestionsByQuantity(quantity);
    }
}
