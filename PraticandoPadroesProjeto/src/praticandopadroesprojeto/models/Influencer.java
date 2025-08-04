package praticandopadroesprojeto.models;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bruno
 */
public class Influencer {
   private static Influencer instance;
   
   private List<String> videos = new ArrayList<String>();
 
   private Influencer () {}
   
   private synchronized static Influencer getInstance() { 
       if (instance == null) instance = new Influencer();
       return instance;
   }
   
   public boolean setVideos(String video) {
       if (!video.isBlank()) {
           videos.add(video);
           System.out.println("Vídeo adicionado com sucesso!");
           return true;
       }
       System.out.println("Ocorreu um problema ao publicar o vídeo.");
       return false;
   }
   
   public void getVideos() {
       for(String video : videos) {
           System.out.println(video);
       }
   }
   
}
