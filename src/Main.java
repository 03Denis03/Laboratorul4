import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeesList = new ArrayList<Employee>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti un numar de angajati: ");
        int numberOfEmployee = myObj.nextInt();
        myObj.nextLine();
        for(int i = 0; i < numberOfEmployee; i++)
        {
            System.out.println("Introduceti numele angajatului " + (i+1) + ": ");
            String name = myObj.nextLine();
            System.out.println("Introduceti adresa de email angajatului " + (i+1) + ": ");
            String email = myObj.nextLine();
            System.out.println("Introduceti venitul pe ora a angajatului " + (i+1) + ": ");
            int hourRate = myObj.nextInt();
            System.out.println("Introduceti cate ore lucreaza pe zi angajatul " + (i+1) + ": ");
            int capacity = myObj.nextInt();
            System.out.println("Introduceti cate zile libere are angajatul " + (i+1) +" pe luna: ");
            int freeDays = myObj.nextInt();
            myObj.nextLine();
            Employee emp = new Employee();
            emp.setName(name);
            emp.setEmail(email);
            emp.setHourRate(hourRate);
            emp.setCapacity(capacity);
            emp.setFreeDays(freeDays);
            employeesList.add(emp);
        }
        int di, mi;
        for(Employee i: employeesList){

            di = i.calculateDailyIncome();
            mi = i.calculateMonthlyIncome();
            String name = i.getName();
            System.out.println("Nume: "+ name + " " + "Venit zilnic: " + di + " " + "Venit Lunar: " + mi);
        }

    }
}