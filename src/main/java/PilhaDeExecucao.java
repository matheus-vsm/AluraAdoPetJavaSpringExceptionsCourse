public class PilhaDeExecucao {

    public static void metodo1() {
        System.out.println("[Inicio] - metodo1");

        metodo2();

        System.out.println("[Fim] - metodo1");
    }

    public static void metodo2() {
        System.out.println("[Inicio] - metodo2");

//        Usuario usuario = new Usuario("Vinicius")
//        System.out.println(usuario.nome);
        Usuario usuario = null;

        try {
            System.out.println(usuario.nome);
        } catch (NullPointerException e) {
            System.out.println("Usuário não encontrado! Metodo2");
        }

        System.out.println("[Fim] - metodo2");
    }

    public static void main(String[] args) {
        System.out.println("[Inicio] - main");
//        metodo1();
        try { // ambos funcionam. tirar o try catch de cima para esse funcionar.
            metodo1();
        } catch (NullPointerException e) {
            System.out.println("Usuário não encontrado! Main");
        }

        System.out.println("[Fim] - main");
    }

}

class Usuario {
    public String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
}