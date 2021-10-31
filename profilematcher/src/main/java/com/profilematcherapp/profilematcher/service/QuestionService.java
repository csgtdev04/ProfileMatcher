package com.profilematcherapp.profilematcher.service;

import com.profilematcherapp.profilematcher.entity.Question;
import com.profilematcherapp.profilematcher.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    // POST
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    // GET
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionRepository.findAllByCategory(category);
    }

    // PUT
    public Question updateQuestion(Question newQuestion) {
        Question currQuestion = questionRepository.findById(newQuestion.getId()).orElse(null); //
        // new person has same id
        currQuestion.setQuestion(newQuestion.getQuestion());
        currQuestion.setCategory(newQuestion.getCategory());
        currQuestion.setPoints(newQuestion.getPoints());
        return questionRepository.save(currQuestion);
    }

    // DELETE
    public void deleteQuestion(int id) {
        questionRepository.deleteById(id);
    }
}
