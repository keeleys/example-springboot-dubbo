package cc.sitec.example.web.controller;

import cc.sitec.example.response.UserResponse;
import cc.sitec.example.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sitec.cc.example.common.request.ByIdRequest;
import sitec.cc.example.common.response.CommonResponse;

@RestController
public class UserController {
    @DubboReference(version = "dev")
    private UserService userService;

    @RequestMapping("/")
    public CommonResponse<UserResponse> index() {
        ByIdRequest byIdRequest = new ByIdRequest();
        byIdRequest.setId(1);
        return userService.findById(byIdRequest);
    }
}
