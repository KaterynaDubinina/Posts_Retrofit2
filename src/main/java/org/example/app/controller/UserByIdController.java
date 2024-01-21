package org.example.app.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.app.entity.User;
import org.example.app.entity.UserResponse;
import org.example.app.entity.UsersResponse;
import org.example.app.model.UserModel;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.UserByIdView;
import retrofit2.Response;

import java.util.List;
import java.util.Optional;

public class UserByIdController {

    UserModel model;
    UserByIdView view;

    public UserByIdController(UserModel model, UserByIdView view) {
        this.model = model;
        this.view = view;
    }

    public void getUserById() {
        view.getOutput(readUserById(
                Integer.parseInt(view.getData())
        ));
        AppStarter.startApp();
    }

// Завантажую всю інформацію загалом, пошук за ID відбувається,
// але якщо записів буде мільон, то це буде невиправдано довго оброблятися(


//    private String readUserById(int id) {
//        Optional<Response<UsersResponse>> optional = model.fetchUsers();
//
//        if (optional.isEmpty()) {
//            return Constants.NO_DATA_MSG;
//        } else {
//            Gson gson = new Gson();
//
//            List<User> users = gson.fromJson(String.valueOf(optional.get().body()),
//                    new TypeToken<List<User>>() {}.getType());
//
//            StringBuilder stringBuilder = new StringBuilder();
//
//            Optional<User> userOptional = users.stream()
//                    .filter(user -> user.getId() == id)
//                    .findFirst();
//
//            userOptional.ifPresent(user -> stringBuilder.append("User: id ")
//                    .append(user.getId())
//                    .append(", ")
//                    .append(user.getLastName())
//                    .append(" ")
//                    .append(user.getFirstName())
//                    .append(", ")
//                    .append(user.getEmail())
//                    .append("\n"));
//
//            return stringBuilder.toString();
//        }
//    }

    private String readUserById(int id) {
        Optional<Response<UserResponse>> optional = model.fetchUserById(id);

        if (optional.isEmpty()) {
            return Constants.NO_DATA_MSG;
        } else {
            Gson gson = new Gson();
            User user = gson.fromJson(String.valueOf(optional.get().body()),
                    new TypeToken<User>() {}.getType());
            return "User: id " + user.getId() + ", " + user.getLastName() +
                    " " + user.getFirstName() + ", " + user.getEmail();
        }
    }
}
