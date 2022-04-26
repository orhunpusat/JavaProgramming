package week5;

public class Locators {

    String locator;
    public Locators(String locator){
        this.locator=locator;
    }
}
    class ID extends Locators{
        public ID(String locator) {
            super(locator);
        }
    }