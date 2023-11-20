package com.learn.SpendingManagement.dto.request.User;

import com.learn.SpendingManagement.annotation.ValidationEmail;
import com.learn.SpendingManagement.annotation.ValidationPhoneNumber;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {
  @NotBlank
  private String addressId;
  @NotBlank
  private String accountId;
  @NotBlank
  private String roleId;
  @ValidationEmail
  private String email;
  @ValidationPhoneNumber
  private String phone;
  @NotBlank
  private String fullName;

}
