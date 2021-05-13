package com.test;

public class MultiClasses {
    private class ClassOne {
        void one() {
            System.out.println("MultiClasses.ClassOne.hello()");
        }

        public class ClassTwo {
            void two() {
                System.out.println("MultiClasses.ClassOne.ClassTwo.two()");
            }

            private class ClassThree {
                void three() {
                    System.out.println("MultiClasses.ClassOne.ClassTwo.ClassThree.three()");
                }
            }
        }
    }

    public static void main(String[] args) {
        MultiClasses m = new MultiClasses();
        ClassOne m1 = m.new ClassOne();
        ClassOne.ClassTwo m2 = m1.new ClassTwo();
        ClassOne.ClassTwo.ClassThree m3 = m2.new ClassThree();
        m1.one();
        m2.two();
        m3.three();
    }
}
