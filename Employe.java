public class Employe implements IEmploye{

    private int id;
    private String nom_complet;
    private String date_Embauche;
   

    private static int nbreEmployee;

    //Navigation
    //* to 1 Plusieurs employes associes a un service
    private Service service;

    public Service getService(){
        return service;
    }
    public void setService(Service service){
        this.service=service;
    }

    //Constructeur par defaut
    public Employe(){
        nbreEmployee++;
        //Auto incrementation du nombre de personnes
        id=nbreEmployee;
    }

    //Constructeur surchage
    public Employe(String nom_complet, String date_Embauche, Service service){
        nbreEmployee++;
        id=nbreEmployee;
        setNom_complet(nom_complet);
        setDate_Embauche(date_Embauche);
        setService(service);
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getNom_complet(){
        return nom_complet;
    }
    public String getDate_Embauche(){
        return date_Embauche;
    }
    public static int getNbreEmploye(){
        return nbreEmployee;
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setNom_complet(String nom_complet){
        this.nom_complet=nom_complet;
    }
    public void setDate_Embauche(String date_Embauche){
        this.date_Embauche=date_Embauche;
    }
    public static void setNbreEmploye(int nbreEmployee){
        Employe.nbreEmployee=nbreEmployee;
    }

   

    //Methode Métiers
    @Override
    public  String affiche(){
        return "Id: "+id+"\n Nom Complet: "+nom_complet+"\n Date d'embauche: "+date_Embauche;
    }
    public void compare(){

    }

}