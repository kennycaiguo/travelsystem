package zrk.learning.service;

import zrk.learning.domain.User;

public interface UserService {

     boolean regist(User user);

    boolean active(String code);

    User login(User user);
}
