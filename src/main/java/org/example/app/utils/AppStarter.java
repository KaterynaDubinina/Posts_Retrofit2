package org.example.app.utils;

import org.example.app.controller.AppController;
import org.example.app.model.AppModel;
import org.example.app.view.AppView;

public class AppStarter {

    public static void startApp() {
        AppModel appModel = new AppModel();
        AppView appView = new AppView();
        AppController controller = new AppController(appModel, appView);
        controller.runApp();
    }
}
