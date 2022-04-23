package cvicenie9;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    public Manager(String nickname, String email, char[] password) {
        super(nickname, email, password);
    }

    //listy
    private List<Employee> listOfEmplyees = new ArrayList<Employee>(); //zamestnanci
    private List<Employee> listOfRelationships = new ArrayList<Employee>(); //nastavenie vztahov

    public List<Employee> getListOfEmplyees() {
        return listOfEmplyees;
    }

    public void setListOfEmplyees(List<Employee> listOfEmplyees) {
        this.listOfEmplyees = listOfEmplyees;
    }

    public List<Employee> getListOfRelationships() {
        return listOfRelationships;
    }

    public void setListOfRelationships(List<Employee> listOfRelationships) {
        this.listOfRelationships = listOfRelationships;
    }

    //pridanie zamestnanca do listu zamestnancov
    public void addEmployee(Employee em){
        listOfEmplyees.add(em);
    }

    public void addRelation(Employee sec){
        listOfRelationships.add(sec);
    }

    public void vypis1(){
        for (int i = 0; i < listOfEmplyees.size(); i++){ //iteracia listu zamestnancov
            System.out.println(listOfEmplyees.get(i)); //print
        }
    }

    public void vypis2(){
        for (int i = 0; i < listOfRelationships.size(); i++){ //iteracia listu zamestnancov
            System.out.println(listOfRelationships.get(i)); //print
        }
    }
}
