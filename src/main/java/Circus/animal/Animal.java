public abstract class Animal implements Asset{
    //This abstract means the animal class cannot be created

    //All child must have a speak method, but they decide how it is implemented
    public abstract String speak();
}
