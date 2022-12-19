public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String shapeType){
        if (shapeType == "RECTANGLE"){
            return new Rectangle();
        }else if (shapeType == "SQUARE") {
            return new Square();
        }
        return null;
    }

}
