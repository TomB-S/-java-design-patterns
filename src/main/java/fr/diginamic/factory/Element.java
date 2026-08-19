package fr.diginamic.factory;

public abstract class Element {
    protected String name;
    protected double valeur;
    protected Unite unite;

    public Element(String name, double valeur, Unite unite) {
        this.name = name;
        this.valeur = valeur;
        this.unite = unite;
    }

    public static class Allergene extends Element {
        public Allergene(String name, double valeur, Unite unite) {
            super(name,valeur,unite);
        }
    }
}
