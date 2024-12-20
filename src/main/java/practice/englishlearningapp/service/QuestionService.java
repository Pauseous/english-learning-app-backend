package practice.englishlearningapp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import practice.englishlearningapp.entity.Question;

import java.util.List;

public interface QuestionService extends IService<Question> {
    List<Question> getQuestionsByQuantity(int quantity);
}
