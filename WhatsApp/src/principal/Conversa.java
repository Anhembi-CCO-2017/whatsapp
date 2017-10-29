package principal;

import java.util.ArrayList;

public class Conversa {
    
    private static ArrayList<Mensagem>listaMensagens = new ArrayList<>();
    private String contato;
    private String onlineUltimaVez;

    public Conversa(String contato, String onlineUltimaVez) {
        this.contato = contato;
        this.onlineUltimaVez = onlineUltimaVez;
    }
    
    public void addConversa(ArrayList<Mensagem>listaMensagens, String autor, Mensagem mensagem){
    
        listaMensagens.add(mensagem);
    }
    
    public String buscarConversa(ArrayList<Mensagem>listaMensagens, String palavra){
    
        String saida = "";
        for (Mensagem msg : listaMensagens) {
            String [] tokens = msg.getTexto().split(" ");
            if (tokens.equals(msg)) 
                saida = saida +msg.getTexto()+"\n";
            
        }
        
        return saida;
    }
    public String retornarConversa(){
    
        String saida = "";
        
        for (Mensagem msg : listaMensagens) {
        
            saida = saida + msg.getTexto()+"\n";
        }
        
        return saida;
    }
}
