package practice.englishlearningapp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.englishlearningapp.entity.Question;
import practice.englishlearningapp.mapper.QuestionMapper;
import practice.englishlearningapp.service.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    public List<Question> getQuestionsByQuantity(int quantity) {
        LambdaQueryWrapper<Question> queryWrapper = new LambdaQueryWrapper<>();
            return questionMapper.selectList(queryWrapper.last("LIMIT " + quantity));
    }
}
