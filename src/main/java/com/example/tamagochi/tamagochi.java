package com.example.tamagochi;

public class tamagochi {

    private String name;
    private Integer nivel;
    private String estado;
    private int tiempoMinutos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public tamagochi(){
        this.nivel= 0;
        this.tiempoMinutos= 0;
    }

    public void comer(){
        switch (this.estado){
            case "contenta":
                this.nivel++;
                break;

            case "hambrienta": this.estado = "contenta";
                break;

            case "aburrida": if(this.tiempoMinutos>80){
                this.estado = "Contenta";
            }else
                this.estado = estado;
            break;

        }
    }

    public void jugar(){
        if(this.puedeJugar()) {
            switch (this.estado) {
                case "contenta":
                    this.nivel += 2;
                    break;
                case "aburrida":
                    this.estado = "contenta";
                    break;
                default:
                    System.out.println("No hago nada");
            }
        }else{
            System.out.println("No puedo jugar");
        }

    }

    public Boolean puedeJugar(){
        /*if(this.estado == "contenta"){
            return true;
        }else{
            return false;
        }*/
        return this.estado.equals("hambrienta") ? false : true;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        if(this.nivel < 0){
            this.nivel = 0;
        }
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }
}
