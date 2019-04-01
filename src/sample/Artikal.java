package sample;
import java.util.ArrayList;



public class Artikal {
    private String šifra;
    private String naziv;
    private double cijena;

    public Artikal(String ulaz) {
        String [] ulazi = ulaz.split( ", ");
        setŠifra(ulazi[0]);
        setNaziv(ulazi[1]);
        setCijena(Double.parseDouble(ulazi[2]));
        this.šifra = šifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public String getŠifra() {
        return šifra;
    }

    public void setŠifra(String šifra) {
        this.šifra = šifra;
        if(šifra==null){
            throw new java.lang.IllegalArgumentException();
        }
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
        if(naziv==null){
            throw new java.lang.IllegalArgumentException();
        }
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
        if(cijena==null){
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return šifra + "," + naziv + "," + cijena;
    }
    public boolean equals(Object o){
        Artikal artikal = (Artikal)o;
        if(this.šifra.equals(artikal.getŠifra())) return false;
        if(this.naziv.equals(artikal.getNaziv())) return false;
        if(this.cijena!=artikal.getCijena()) return false;
        return true;
    }
    public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> lista){
        for(int i=0;i<lista.size();i++){
            for(int j=0;j<lista.size();j++){
                if(i!=j){
                    if(lista.get(i).equals(lista.get(j))){
                        lista.remove(j);
                    }
                }
            }
        }
        return lista;
    }

}
