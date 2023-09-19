package Iphone;

// TODO: Create Phone class
public class Phone {
    // TODO: Create two variables name as type string and modelNumber as integer
    String name;
    int modelNumber;

    // TODO: create a which print current software version
    public void IOS_Software() {
        System.out.println("This iphone is running on IOS 3.1.");
    }
}

// TODO: Create a main class
class main {
    public static void main(String[] args) {
        // TODO: Create objects
        IphoneFive ifive = new IphoneFive();
        IphoneEleven ieleven = new IphoneEleven();

        // TODO: Add data to both objects
        ifive.name = "Iphone 5";
        ifive.modelNumber = 43487390;

        ieleven.name = "Iphone 11";
        ieleven.modelNumber = 94589843;

        // TODO: print outputs for both subclass methods
        ifive.Specs();
        ifive.IOS_Software();

        ieleven.Specs();
        ieleven.IOS_Software();
    }
}
