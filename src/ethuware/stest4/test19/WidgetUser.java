package ethuware.stest4.test19;

class Widget {

    String data = "data";
    public void doWidgetStuff() {
        System.out.println(data);
    }

}

class GoodWidget extends Widget{
    String data = "big data";

    public void doWidgetStuff() {
        System.out.println(data);
    }
}

public class WidgetUser{
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        w.doWidgetStuff();
        System.out.println(w.data);
        System.out.println(((GoodWidget)w).data);
    }

}