package echo_location.service;

import echo_location.entity.User;

import java.util.List;

public interface BaseService<T, K> {
    List<T> findAll();
    T save(T object);
}
