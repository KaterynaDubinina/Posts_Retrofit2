package org.example.app.model;

import org.example.app.entity.UserResponse;
import org.example.app.entity.UsersResponse;
import org.example.app.network.ApiClient;
import org.example.app.network.ApiService;
import retrofit2.Call;
import retrofit2.Response;

import java.util.Optional;

public class UserModel {

    public Optional<Response<UsersResponse>> fetchUsers() {

        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();
        Call<UsersResponse> call = service.getUsers();
        Optional<Response<UsersResponse>> optional;

        try {
            optional = Optional.of(call.execute());
        } catch (Exception ex) {
            optional = Optional.empty();
        }

        return optional;
    }

    public Optional<Response<UserResponse>> fetchUserById(int id) {
        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();
        Call<UserResponse> call = service.getUserById(id);
        Optional<Response<UserResponse>> optional;

        try {
            optional = Optional.of(call.execute());
        } catch (Exception ex) {
            optional = Optional.empty();
        }

        return optional;
    }
}
