package com.learn.SpendingManagement.service.user;

import com.learn.SpendingManagement.dto.base.PageResponse;
import com.learn.SpendingManagement.dto.request.User.UserRequest;
import com.learn.SpendingManagement.dto.response.User.UserResponse;
import com.learn.SpendingManagement.entity.user.User;

public interface UserService {
  UserResponse create(UserRequest request);

  UserResponse update(UserRequest request, String id);

  PageResponse<UserResponse> list(String keyword, int size, int page, boolean isAll);

  void delete(String id);
  UserResponse detail(String id);
}
