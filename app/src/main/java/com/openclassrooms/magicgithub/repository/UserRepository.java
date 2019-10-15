package com.openclassrooms.magicgithub.repository;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user);
    }
}
