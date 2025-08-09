fun main() {
    // Criando 3 autores
    val autor1 = Autor("J.K. Rowling", "123.456.789-00")
    val autor2 = Autor("George R. R. Martin", "987.654.321-11")
    val autor3 = Autor("J.R.R. Tolkien", "456.789.123-22")

    // Criando 3 editoras
    val editora1 = Editora("Editora Rocco", "Rua Fictícia, 123", "12.345.678/0001-99")
    val editora2 = Editora("Editora Leya", "Avenida Imaginária, 456", "98.765.432/0001-11")
    val editora3 = Editora("Editora Martins Fontes", "Praça da Literatura, 789", "56.789.123/0001-33")

    // Criando 3 livros
    val livro1 = Livro("Harry Potter e a Pedra Filosofal", 1997, autor1, editora1)
    val livro2 = Livro("A Guerra dos Tronos", 1996, autor2, editora2)
    val livro3 = Livro("O Senhor dos Anéis: A Sociedade do Anel", 1954, autor3, editora3)

    // Exibindo informações dos livros
    println("Informações dos Livros:\n")

    livro1.exibirInformacoes()
    println("\n----------------------\n")

    livro2.exibirInformacoes()
    println("\n----------------------\n")

    livro3.exibirInformacoes()
}
