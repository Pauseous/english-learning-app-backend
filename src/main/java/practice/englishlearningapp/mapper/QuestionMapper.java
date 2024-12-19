package practice.englishlearningapp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import practice.englishlearningapp.entity.Question;

@Mapper
public interface QuestionMapper extends BaseMapper<Question> {
}
