package practice.englishlearningapp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    public Long id;
    public String avatar;
    public String phoneNumber;
}
