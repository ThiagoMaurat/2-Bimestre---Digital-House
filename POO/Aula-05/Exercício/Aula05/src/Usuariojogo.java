public class Usuariojogo {
    
    private String nome;
    private String nickname;
    private int pontuação;
    private int nivel;
       
    
    public Usuariojogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuação = 0;
        this.nivel = 1;
      }

      public void aumentarpontuacao(){
        this.pontuação++;
        }
        
        public void subirnivel(){
            this.nivel++;
        }

        public void bonus(int valor){
            this.pontuação+=valor;
        }

        public int getpontuacao(){
            return this.pontuação;
        }

        public int setpontuacao(int valaor){
            return this.pontuação += valaor;
        }

        public int getnivel(){
            return this.nivel;
        }
        public int setnivel(int valor){
            return this.nivel += valor;
        }
        public String getNome(){
            return this.nome;
        }
        public String getNickname(){
            return this.nickname;
        }
    
    
    }
       

