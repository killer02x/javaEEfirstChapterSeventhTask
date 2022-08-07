import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Fotballer> Footballers = new ArrayList<>();
    public static void addFootballer(Fotballer fotballer){
        Footballers.add(fotballer);
    }
    public static ArrayList<Fotballer> getAllFootballers(){
        return Footballers;
    }
}
