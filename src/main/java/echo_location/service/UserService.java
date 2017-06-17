package echo_location.service;

import echo_location.entity.User;
import echo_location.entity.UserDTO;
import echo_location.exeption.EmailExistsException;

public interface UserService extends BaseService<User, String>{

    User findByEmail(String username);
    User registerNewUserAccount(UserDTO accountDto) throws EmailExistsException, EmailExistsException;
}
