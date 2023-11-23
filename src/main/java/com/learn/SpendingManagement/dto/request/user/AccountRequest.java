package com.learn.SpendingManagement.dto.request.user;

import com.learn.SpendingManagement.annotation.ValidationPassword;
import com.learn.SpendingManagement.annotation.ValidationUsername;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountRequest {
  @ValidationUsername
  private String username;
  @ValidationPassword
  private String password;
//  @NotBlank(message = "RoleId not blank")
  private String roleId;
}