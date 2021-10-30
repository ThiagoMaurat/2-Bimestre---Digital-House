public class App {
    public static void main(String[] args) throws Exception {
        Usuariojogo usuariojogo = new Usuariojogo("Thiago", "Maurat");
        Usuariojogo usuariojogo2 = new Usuariojogo("Teste", "Maurat");

        usuariojogo.setpontuacao(50);
        usuariojogo2.setpontuacao(100);
        usuariojogo.subirnivel();
        usuariojogo2.subirnivel();
        usuariojogo.aumentarpontuacao();
        usuariojogo2.aumentarpontuacao();
        System.out.println("O nome do primeiro jogador é " + usuariojogo.getNome() + ", seu sobrenome é "
        + usuariojogo.getNickname()+ " e sua pontuação: " + usuariojogo.getpontuacao() + ". Seu nível é " 
        + usuariojogo.getnivel());
        System.out.println("O nome do segundo jogador é " + usuariojogo2.getNome() + ", seu sobrenome é "
        + usuariojogo2.getNickname()+ " e sua pontuação: " + usuariojogo2.getpontuacao() + ". Seu nível é " 
        + usuariojogo2.getnivel());;
    }
}
