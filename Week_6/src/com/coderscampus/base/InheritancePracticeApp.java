package com.coderscampus.base;

public class InheritancePracticeApp {

    // DO NOT TOUCH any of the code in this class.
    // The only code you should touch is inside of the other classes.
    // You can run the app via this "main" method
    // You'll know you have successfully configured your classes when you the
    // following output:
    //////////////////////////////////
    // Yay, User looks good!
    // Yay, NormalUser looks good!
    // Yay, SuperUser looks good!
    //////////////////////////////////
    public static void main(String[] args) {

        User user = new User();
        User superUser = new SuperUser();
        User normalUser = new NormalUser();

        shouldNotHaveWriteAccess(user);
        shouldHaveWriteAccess(normalUser);
        shouldHaveSuperUserAccess(superUser);
    }

    private static void shouldHaveSuperUserAccess(User superUser) {
        if (Boolean.TRUE.equals(superUser.getSuperUser() && Boolean.TRUE.equals(superUser.getReadAccess())
                && Boolean.TRUE.equals(superUser.getWriteAccess()))) {
            System.out.println("Yay, SuperUser looks good!");
        } else {
            System.out.println("Uh oh! SuperUser isn't configured correctly.");
        }

    }

    private static void shouldHaveWriteAccess(User normalUser) {
        if (Boolean.TRUE.equals(normalUser.getReadAccess()) && Boolean.TRUE.equals(normalUser.getWriteAccess())
                && Boolean.FALSE.equals(normalUser.getSuperUser())) {
            System.out.println("Yay, NormalUser looks good!");
        } else {
            System.out.println("Uh oh! NormalUser isn't configured correctly.");
        }

    }

    private static void shouldNotHaveWriteAccess(User user) {
        if (Boolean.TRUE.equals(user.getReadAccess()) && Boolean.FALSE.equals(user.getWriteAccess())
                && Boolean.FALSE.equals(user.getSuperUser())) {
            System.out.println("Yay, User looks good!");
        } else {
            System.out.println("Uh oh! User isn't configured correctly.");
        }

    }
}
