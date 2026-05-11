package com.xworkz.runner;

import com.xworkz.work.Tool;
import com.xworkz.work.ToolInfo;

public class ToolInfoRunner {
    public static void main(String[] args) {
        Tool tool = new ToolInfo();

        System.out.println(Tool.tool_name);
        System.out.println(Tool.version);
        System.out.println(Tool.active);

        tool.open();
        tool.close();

        tool.login();
        tool.logout();

        Tool.info();
    }


}
