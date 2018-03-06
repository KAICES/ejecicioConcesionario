/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.aqrSw.ejercicioServlets.tallerTres.vos;

/**
 *
 * @author cesar.ramirez
 */
public class FormularioPersonaVo {
    
    String nombre;
    int marca;
    int coutas;
    float coutaInicial;
    float valor;

    public FormularioPersonaVo(String nNombre, int nmarca, int ncoutas, float ncoutaInicial, float nvalor) {
        this.nombre = nNombre;
        this.marca = nmarca;
        this.coutas = ncoutas;
        this.coutaInicial = ncoutaInicial;
        this.valor = nvalor;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getCoutas() {
        return coutas;
    }

    public void setCoutas(int coutas) {
        this.coutas = coutas;
    }

    public float getCoutaInicial() {
        return coutaInicial;
    }

    public void setCoutaInicial(float coutaInicial) {
        this.coutaInicial = coutaInicial;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

   
    
    
}
