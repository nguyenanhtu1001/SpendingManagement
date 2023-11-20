package com.learn.SpendingManagement.facade;

import com.learn.SpendingManagement.dto.base.PageResponse;
import com.learn.SpendingManagement.dto.request.User.UserRequest;
import com.learn.SpendingManagement.dto.response.User.UserResponse;

public interface UserFacadeService {
  UserResponse create(UserRequest request);

  UserResponse update(UserRequest request, String id);
}
