package com.xworkz.runner;

import com.xworkz.interfaceClass.Remote;
import com.xworkz.interfaceClass.TataRemote;
import com.xworkz.usage.User;

public class UserRunner {
    public static void main(String[] args) {
        Remote remote = new TataRemote();

        User user = new User(remote);

        user.work();
    }
}
