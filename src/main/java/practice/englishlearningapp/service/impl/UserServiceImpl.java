package practice.englishlearningapp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import practice.englishlearningapp.entity.User;
import practice.englishlearningapp.mapper.UserMapper;
import practice.englishlearningapp.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
