import dao.DestinationDAO;
import dao.ExtraItemDAO;
import domain.Destination;
import domain.ExtraItem;

public class App {
    public static void main(String[] args) {
        DestinationDAO destinationDAO = new DestinationDAO();
//        destinationDAO.save(new Destination("Porto Alegre"));
//        destinationDAO.save(new Destination("Santa Catarina"));
//        destinationDAO.save(new Destination("Bahia"));
//        destinationDAO.save(new Destination("São Paulo"));


        ExtraItemDAO extraItemDAO = new ExtraItemDAO();
        extraItemDAO.save(new ExtraItem("Carro",90.0));

    }
}
