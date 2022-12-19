public class Main {
    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory1 = factoryProducer.getFactory(true);

        Shape shape1 = abstractFactory1.getShape("CIRCLE");
        shape1.draw();

        AbstractFactory abstractFactory2 = factoryProducer.getFactory(false);

        Shape shape2 = abstractFactory2.getShape("RECTANGLE");
        shape2.draw();

    }
}