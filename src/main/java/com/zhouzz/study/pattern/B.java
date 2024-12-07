package com.zhouzz.study.pattern;

//懒汉式单例模式
public class B {

        private static B instance = null;

        private B() {
        }

        public static B getInstance() {
            if (instance == null) {
                instance = new B();
            }
            return instance;
        }

}
