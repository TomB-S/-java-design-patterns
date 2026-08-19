package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
    private String nom;
    private List<IElement> elementList = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }

    public void addElement(IElement element) {
        elementList.add(element);
    }

    @Override
    public double calculerSalaire() {
        double salaire = 0.0;
        for (IElement element : this.elementList) {
            salaire += element.calculerSalaire();
        }
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public List<IElement> getElementList() {
        return elementList;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setElementList(List<IElement> elementList) {
        this.elementList = elementList;
    }
}
