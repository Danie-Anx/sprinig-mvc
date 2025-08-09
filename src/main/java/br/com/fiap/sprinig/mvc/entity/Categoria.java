package br.com.fiap.sprinig.mvc.entity;

public enum Categoria {
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Comédia"),
    FICCAO("Ficção"),
    SUSPENSE("Suspense"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecnológia");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


