package cc.sitec.example.service.impl;

import cc.sitec.example.service.UserService;
import cc.sitec.example.dao.UserMapper;
import cc.sitec.example.entity.User;
import cc.sitec.example.request.UserRequest;
import cc.sitec.example.request.UserUpdateRequest;
import cc.sitec.example.response.UserResponse;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import sitec.cc.example.common.request.ByIdRequest;
import sitec.cc.example.common.response.CommonResponse;
import sitec.cc.example.util.CacheBeanCopier;

import java.util.List;

@DubboService(version = "dev")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insert(UserRequest request) {
        User user = CacheBeanCopier.copy(request,User.class);
        return userMapper.insert(user);
    }

    @Override
    public Integer update(UserUpdateRequest request) {
        User user = CacheBeanCopier.copy(request,User.class);
        return userMapper.updateById(user);
    }

    @Override
    public Integer deleteById(ByIdRequest request) {
        return userMapper.deleteById(request.getId());
    }

    @Override
    public CommonResponse<UserResponse> findById(ByIdRequest request) {
        User user = userMapper.selectById(request.getId());
        UserResponse userResponse =  CacheBeanCopier.copy(user,UserResponse.class);
        return CommonResponse.success(userResponse);
    }

    @Override
    public List<UserResponse> selectByUser(UserRequest request) {
        User user = CacheBeanCopier.copy(request,User.class);
        Wrapper<User> wrapper = new QueryWrapper<>(user);
        List<User> list = userMapper.selectList(wrapper);
        return CacheBeanCopier.copyList(list,UserResponse.class);
    }
}
