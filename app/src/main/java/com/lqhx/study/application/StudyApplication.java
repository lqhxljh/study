package com.lqhx.study.application;

import android.app.Application;

/**
 * @author liaojinhua
 */
    public class StudyApplication extends Application {
        private static   StudyApplication instance;
        public static int Tag = 1;
    @Override
    public void onCreate() {
        super.onCreate();
        System.err.println("StudyApplication 被创建");
        setInstance(this);
    }

    public static StudyApplication getInstance() {
        return instance;
    }

    public static void setInstance(StudyApplication instance) {
        StudyApplication.instance = instance;
    }

}
