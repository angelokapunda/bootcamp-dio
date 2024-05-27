package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int caraHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * caraHoraria;
    }


    public int getCaraHoraria() {
        return caraHoraria;
    }

    public void setCaraHoraria(int caraHoraria) {
        this.caraHoraria = caraHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "caraHoraria=" + caraHoraria +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }


}
