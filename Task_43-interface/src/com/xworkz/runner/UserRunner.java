package com.xworkz.runner;

import com.xworkz.interfaceClass.Remote;
import com.xworkz.interfaceClass.TataRemote;
import com.xworkz.newImplement.AdaniRemote;
import com.xworkz.usage.User;

public class UserRunner {
    public static void main(String[] args) {
        //old implementation
        Remote remote = new TataRemote();
        //new implementation
        Remote remote1 = new AdaniRemote();

        User user = new User(remote1);

        user.work();
    }
}
