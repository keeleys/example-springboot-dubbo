package cc.sitec.example.service;

import cc.sitec.example.request.UserRequest;
import cc.sitec.example.request.UserUpdateRequest;
import cc.sitec.example.response.UserResponse;
import sitec.cc.example.common.request.ByIdRequest;
import sitec.cc.example.common.response.CommonResponse;

import java.util.List;

public interface UserService {
    Integer insert(UserRequest request);
    Integer update(UserUpdateRequest request);
    Integer deleteById(ByIdRequest request);
    CommonResponse<UserResponse> findById(ByIdRequest request);
    List<UserResponse> selectByUser(UserRequest userUpdateRequest);
}
