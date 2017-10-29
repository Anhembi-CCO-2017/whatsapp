package principal;

import java.util.ArrayList;

public class WhatsApp {

    private static ArrayList<Conversa>listaConversas = new ArrayList<>();
    private String nomeUsuario;
    private String telefoneUsuario;
    private String status;

    public WhatsApp(String nomeUsuario, String telefoneUsuario, String status) {
        this.nomeUsuario = nomeUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.status = status;
    }

    public static ArrayList<Conversa> getListaConversas() {
        return listaConversas;
    }

    public static void setListaConversas(ArrayList<Conversa> listaConversas) {
        WhatsApp.listaConversas = listaConversas;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    public void iniciarConversa(String telefone){
    
        boolean controle = false;
        for (Conversa cnv : listaConversas) {
            
            if(cnv.getContato().equals(telefone)) {
            
                System.out.println("Esta concversa ja existe!");
                controle = false;
            }else{
            
                controle = true;
            }
        }
        
        if (controle) {
            
           
        }
    }
    
    public void mandarMensagem(String telefone, String texto){
    
        
        System.out.println(telefone);
        System.out.println(texto);
        
    }
    
}
