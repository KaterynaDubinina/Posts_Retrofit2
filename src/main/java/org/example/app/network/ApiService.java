package org.example.app.network;

import org.example.app.entity.UserResponse;
import org.example.app.entity.UsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("api/users")
    Call<UsersResponse> getUsers();

    @GET("api/users/{id}")
    Call<UserResponse> getUserById(@Path("id") int id);
}
