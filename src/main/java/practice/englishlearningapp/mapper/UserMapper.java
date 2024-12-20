package practice.englishlearningapp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import practice.englishlearningapp.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
