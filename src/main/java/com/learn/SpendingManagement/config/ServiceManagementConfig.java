package com.learn.SpendingManagement.config;

import com.learn.SpendingManagement.facade.UserFacadeService;
import com.learn.SpendingManagement.facade.impl.UserServiceFacadeServiceImpl;
import com.learn.SpendingManagement.repository.user.AccountRepository;
import com.learn.SpendingManagement.repository.user.AddressRepository;
import com.learn.SpendingManagement.repository.user.RoleRepository;
import com.learn.SpendingManagement.repository.user.UserRepository;
import com.learn.SpendingManagement.service.MessageService;
import com.learn.SpendingManagement.service.impl.user.AccountServiceImpl;
import com.learn.SpendingManagement.service.impl.MessageServiceImpl;
import com.learn.SpendingManagement.service.impl.user.AddressServiceImpl;
import com.learn.SpendingManagement.service.impl.user.RoleServiceImpl;
import com.learn.SpendingManagement.service.impl.user.UserServiceImpl;
import com.learn.SpendingManagement.service.user.AccountService;
import com.learn.SpendingManagement.service.user.AddressService;
import com.learn.SpendingManagement.service.user.RoleService;
import com.learn.SpendingManagement.service.user.UserService;
import com.learn.SpendingManagement.utils.BCryptUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class ServiceManagementConfig {
  @Bean
  public MessageService messageService(MessageSource messageSource) {
    return new MessageServiceImpl(messageSource);
  }

  @Bean
  public AccountService accountService(AccountRepository repository, PasswordEncoder passwordEncoder) {
    return new AccountServiceImpl(repository, passwordEncoder);
  }

  @Bean
  public RoleService roleService(RoleRepository repository) {
    return new RoleServiceImpl(repository);
  }

  @Bean
  public AddressService addressService(AddressRepository repository) {
    return new AddressServiceImpl(repository);
  }

  @Bean
  public UserService userService(UserRepository repository) {
    return new UserServiceImpl(repository);
  }

  @Bean
  public UserFacadeService userFacadeService(
        UserService userService,
        AccountService accountService,
        AddressService addressService,
        RoleService roleService

  ) {
    return new UserServiceFacadeServiceImpl(userService, accountService, addressService, roleService);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return BCryptUtils.getPasswordEncoder();
  }
}
