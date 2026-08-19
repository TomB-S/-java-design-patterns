package fr.diginamic.factory;


public class ElementFactory {
    public Element getElement(TypeElement typeElement, String name, double valeur, Unite unite) {
        if( typeElement == TypeElement.ALLERGENE ) {
            return new Allergene(name, valeur, unite);
        } else if (typeElement == TypeElement.ADDITIF) {
            return new Additif(name, valeur, unite);
        } else if (typeElement == TypeElement.INGREDIENT) {
            return new Ingredient(name, valeur, unite);
        }
        return null;
    }
}
