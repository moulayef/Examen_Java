import java.util.Scanner;
public class Main{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        UseCase ue=new UseCase();
        do {
            choix=menu();
            switch (choix) {
                case 1:
                System.out.println("Entrez le libelle");
                String libelle=scanner.nextLine();
                Service se=new Service();
                se.setLibelle(libelle);
                ue.ajoutService(se);
                    break;

                case 2:
                ue.listerService();
                    break;

                case 3:  
                System.out.println("Entrez le nom complet");
                String nom_complet=scanner.nextLine();
                System.out.println("Entrez la date d'embauche");
                String date_Embauche=scanner.nextLine();
                Employe emp=new Employe();
                emp.setNom_complet(nom_complet);
                emp.setDate_Embauche(date_Embauche);
                ue.ajoutEmploye(emp);     
                    break;

                case 4:
                System.out.println("Affectation d'un employe a un service");
                Service sv = new Service();
                sv.setLibelle(libelle);
                emp.addService(service);
                    break;
                    
                case 5: 
                    break;

                case 6:
                    System.out.println("A la prochaine !");
                    break;
                   
                default:
                    System.out.println("Veuillez faire un choix");
                    break;
            }

        }
        while(choix!=6);
    }

        public static int menu(){
            System.out.println("1-Ajouter un service"
                                +"\n2-lister Service"
                                +"\n3-Ajouter un employe"
                                +"\n4-Affecter un service a un employe"
                                +"\n5-Afficher les employes d'un service"
                                +"\n6-Quitter"
                                +"\nVeuillez faire votre choix: ");
            String choix;
            
            choix=scanner.nextLine();
            return Integer.parseInt(choix);
        }
        

    }