public class filme{

    public static void main(String[] args){
        System.out.println("Bem vindos ao TecFlix");
        System.out.println("Filme: Pica-Pau o filme");

        int anoDeLancamento = 2017;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.1;

        //Média calculada pela notas do Pitro, Luiz, Bruno
        double media = (10 + 8.9 + 9.0) / 3;
        System.out.println("A Média que o Segundo Tec deu " + media);

        String sinopse;

        sinopse = """
                Filme do Pica-Pau
                Estrelado por Alex Zamm
                O fim tem nota Baixa
                e foi lançado em
                """ + anoDeLancamento;
                 
        System.out.println(sinopse);         
    }
}