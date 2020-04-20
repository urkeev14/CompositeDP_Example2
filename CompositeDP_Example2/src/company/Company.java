/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import employee.Employee;
import employee.impl.Developer;
import employee.impl.Manager;
import employee.impl.Manager;

/**
 *
 * @author urosv
 */
public class Company {

    public static void main(String[] args) {

        Manager engeneeringManager = makeEngeneeringManager();
        Manager generalManager = makeGeneralManager();
        
        generalManager.addEmployee(engeneeringManager);
        
    }

    private static Manager makeEngeneeringManager() {
        Employee dev1 = new Developer("Uros Veljkovic", 100, "Ugly developer");
        Employee dev2 = new Developer("Nikola Nikolic", 101, "Good developer");

        Manager engeneeringManager = new Manager("Mike Mikelangelo", 25000);

        engeneeringManager.addEmployee(dev1);
        engeneeringManager.addEmployee(dev2);

        return engeneeringManager;
    }

    private static Manager makeGeneralManager() {
        Employee dev3 = new Developer("Bobana Pavlovic", 200, "Pro developer");
        Manager generalManager = new Manager("Antonio", 50000);

        generalManager.addEmployee(dev3); 

        return generalManager;
    }

}
