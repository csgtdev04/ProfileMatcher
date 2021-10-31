package com.profilematcherapp.profilematcher.controller;

import com.profilematcherapp.profilematcher.entity.Person;
import com.profilematcherapp.profilematcher.entity.Question;
import com.profilematcherapp.profilematcher.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    // POST
    @PostMapping("/addQuestion")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }

    // GET
    @GetMapping("/getAllQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/getAllQuestionsBy/{category}")
    public List<Question> getAllQuestionsByCategory(@PathVariable String category) {
        return questionService.getAllQuestionsByCategory(category);
    }

    //PUT
    @PutMapping("/updateQuestion")
    public Question updateQuestion(@RequestBody Question question) {
        return questionService.updateQuestion(question);
    }

    // DELETE
    @DeleteMapping("/delete/question/{id}")
    public void deleteCourse(@PathVariable int id) {
        questionService.deleteQuestion(id); // might not work - return type is void
    }

}
