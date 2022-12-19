public class RoundedShapeFactory extends AbstractFactory{

    public Shape getShape(String shapeType){
        if (shapeType == "CIRCLE"){
            return new Circle();
        }else if (shapeType == "SPHERE") {
            return new Sphere();
        }
        return null;
    }

}
