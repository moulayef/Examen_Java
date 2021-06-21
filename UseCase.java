public class UseCase{
private final int TAILLE=4;
    private int nbreSvc;
    private Service[] tabService= new Service[TAILLE];

    private Employe[] tabEmploye= new Employe[TAILLE];
    private int nbreEmploy;
    private ArrayList listService = new ArrayList();
   
    //Use case Ajouter service
    public void ajoutService(Service sr){
        if(nbreSvc<TAILLE){
            tabService[nbreSvc]=sr;
        nbreSvc++;
        }else{
            System.out.println("The table is full");
        }
    }

    //Use case Lister service
    public void listerService(){
        for(Service sr:tabService){
            if(sr!=null)
                System.out.println(sr.affiche());
        }
    }

    //Use case ajouter employee
    public void ajoutEmploye(Employe ep){
        if(nbreEmploy<TAILLE){
            tabEmploye[nbreEmploy]=ep;
        nbreEmploy++;
        }else{
            System.out.println("The table is full");
        }
    }

    //Use case affecter employe a un service
    public void addService(Service service) {
        listService.add(service);
        }
}