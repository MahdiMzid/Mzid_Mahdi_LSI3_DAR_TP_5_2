package rmiService;

import metier.Compte;

public class BanqueImpl implements IBanque{


    @Override
    public String creerCompte(Compte c) {
        return("Le compte avec le code "+c.getCode()+" est créé le "+c.getDateCreation());
    }

    @Override
    public String getInfoCompte(int code) {
        return null;
    }
}
