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
    Long coutaInicial;
    String valor;

    public FormularioPersonaVo(String nNombre, int nmarca, int ncoutas, Long ncoutaInicial, String nvalor) {
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

    public Long getCoutaInicial() {
        return coutaInicial;
    }

    public void setCoutaInicial(Long coutaInicial) {
        this.coutaInicial = coutaInicial;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
 
    
    
}
