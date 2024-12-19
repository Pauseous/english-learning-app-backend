package practice.englishlearningapp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("question")
public class Question {
    public Long id;
    public String word;
    public String sequence;
    public String options;
    public String answer;
}
