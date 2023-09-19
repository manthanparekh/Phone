package Iphone;

// TODO: Create a iphone five class also make it a sub class of phone
public class IphoneFive extends Phone{
    // TODO: Create a method Specs and print out name and model number
    public void Specs() {
        System.out.println("The type is " + name + " and the model number is " + modelNumber);
    }

    // TODO: override ios software for the new version
    @Override
    // TODO: recall the software version method with new output
    public void IOS_Software() {
        System.out.println("This iphone is running on IOS 4.5.1.");
    }
}
