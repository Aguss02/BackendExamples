package main.com.dto;

public class Computadora {

    private Integer ram;
    private Integer discoDuro;

    public Computadora(Integer ram, Integer discoDuro) {
        this.ram = ram;
        this.discoDuro = discoDuro;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(Integer discoDuro) {
        this.discoDuro = discoDuro;
    }


    @Override
    public String toString() {
        return "Computadora{" +
                "ram=" + ram +
                ", discoDuro=" + discoDuro +
                '}';
    }
}
