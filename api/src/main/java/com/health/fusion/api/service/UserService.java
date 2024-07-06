package com.health.fusion.api.service;

import com.health.fusion.api.exception.DuplicateEntityException;
import com.health.fusion.api.dao.UserDao;
import com.health.fusion.api.model.User;
import com.health.fusion.api.util.ErrorConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserDao userDao;

    public User createUser(User user) {
        var optionalUser = userDao.findByEmail(user.getEmail());
        if (optionalUser.isPresent()) {
            throw new DuplicateEntityException(ErrorConstants.ENTITY_ALREADY_EXISTS, ErrorConstants.USER_ALREADY_EXISTS,
                    ErrorConstants.EMAIL);
        }
        var optionalPhoneNumber = userDao.findByPhoneNumber(user.getPhoneNumber());
        if (optionalPhoneNumber.isPresent()) {
            throw new DuplicateEntityException(ErrorConstants.ENTITY_ALREADY_EXISTS, ErrorConstants.USER_ALREADY_EXISTS,
                    ErrorConstants.PHONE_NUMBER);
        }
        return userDao.save(user);
    }


}
