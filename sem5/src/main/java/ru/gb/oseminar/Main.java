package ru.gb.oseminar;


import ru.gb.oseminar.controller.UserController;
import ru.gb.oseminar.model.FileOperation;
import ru.gb.oseminar.model.FileOperationImpl;
import ru.gb.oseminar.model.Repository;
import ru.gb.oseminar.model.RepositoryFile;
import ru.gb.oseminar.view.ViewUser;

public class Main 
{
    public static void main( String[] args ) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        // FileOperation fileOperationXML = new FileOperationXML("users.xml");
        Repository repository = new RepositoryFile(fileOperation);
        // Repository repositoryXML = new RepositoryFileXML(fileOperationXML);
        UserController controller = new UserController(repository);
        // UserController controllerXML = new UserController(repositoryXML);
        ViewUser view = new ViewUser(controller);
        // ViewUser viewXML = new ViewUser(controllerXML);
        view.run();
        // viewXML.run();
    }

}
