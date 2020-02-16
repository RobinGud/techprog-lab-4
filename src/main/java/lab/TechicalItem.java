package lab;

/**
 * TechicalItem
 */
public class TechicalItem extends GenericItem {

    short warrantyTime;

    TechicalItem(int ID, String name, float price, int AnalogID, Category category, short warrantyTime) {
        super(ID, name, price, AnalogID, category);
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, analog ID: %d, Category: %s, warranty time: %d \n", ID,
                name, price, AnalogID, category, warrantyTime);
    }
}