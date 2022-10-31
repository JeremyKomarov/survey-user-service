package com.userService.repository;

import com.userService.model.User;
import com.userService.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String USER_TABLE_NAME = "user";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO " + USER_TABLE_NAME + " (first_name, last_name, email, age, address, register_date) VALUES (?, ?, ?, ?, ?,?)";
        jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(),user.getEmail(), user.getAge(), user.getEmail(), user.getRegisterDate());
    }

    @Override
    public User getUserById(Long id) {
        String sql = "SELECT * FROM " + USER_TABLE_NAME + " WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
        } catch (EmptyResultDataAccessException error){
        return null;
    }
    }

    @Override
    public void updateUserById(Long id, User user) {
        String sql = "UPDATE " + USER_TABLE_NAME + " SET first_name=?, last_name=?, email=?, age=?, address=? " +
                "WHERE id=?";

        jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getAge(), user.getAddress(), id);
    }

    @Override
    public void deleteUserById(Long id) {
        String sql = "DELETE FROM " + USER_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }
}
