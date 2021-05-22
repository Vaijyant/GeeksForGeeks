package Random;



public class B extends  A {

    public static void main(String[] args) {
        int mask = 0x000F;
        int value = 0x2222;
    }
    @Override
    Integer add(int a, int b) {
        return a+b;
    }
}


class Customer {
    private String id;
    private String name;
    private String city;
    private String country;
    private String cPerson;
    private Integer emplCnt;
    private String contrCnt;
    private Float contrCost;

    public Customer(String id, String name, String city, String country, String cPerson, Integer emplCnt, String contrCnt, Float contrCost) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.cPerson = cPerson;
        this.emplCnt = emplCnt;
        this.contrCnt = contrCnt;
        this.contrCost = contrCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getcPerson() {
        return cPerson;
    }

    public void setcPerson(String cPerson) {
        this.cPerson = cPerson;
    }

    public Integer getEmplCnt() {
        return emplCnt;
    }

    public void setEmplCnt(Integer emplCnt) {
        this.emplCnt = emplCnt;
    }

    public String getContrCnt() {
        return contrCnt;
    }

    public void setContrCnt(String contrCnt) {
        this.contrCnt = contrCnt;
    }

    public Float getContrCost() {
        return contrCost;
    }

    public void setContrCost(Float contrCost) {
        this.contrCost = contrCost;
    }
}