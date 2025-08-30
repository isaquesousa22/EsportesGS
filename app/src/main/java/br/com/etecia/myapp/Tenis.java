package br.com.etecia.myapp;

public class Tenis {
    private int imgCardTenis;
    private String nomeTenis;

    public Tenis(int imgCardTenis, String nomeTenis) {
        this.imgCardTenis = imgCardTenis;
        this.nomeTenis = nomeTenis;
    }

    public int getImgCardTenis() {
        return imgCardTenis;
    }

    public void setImgCardTenis(int imgCardTenis) {
        this.imgCardTenis = imgCardTenis;
    }

    public String getNomeTenis() {
        return nomeTenis;
    }

    public void setNomeTenis(String nomeTenis) {
        this.nomeTenis = nomeTenis;

    }
}
