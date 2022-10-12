package Employee;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int hireYear, int workHours, int salary) {
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.name = name;
    }

    double tax() {
        if (salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    int bonus() {
        if (workHours > 40) {

            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (2021 - hireYear < 10) {
            return (this.salary * 0.05);
        }
        if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return (this.salary * 0.1);
        }
        if (2021 - hireYear > 19) {
            return (this.salary * 0.15);
        }
        return 0;
    }

    public String toString() {

        System.out.println("================================");
        System.out.println("Adý : " + this.name);
        System.out.println("Maaþý : " + this.salary);
        System.out.println("Çalýþma Saati : " + this.workHours);
        System.out.println("Baþlangýç Yýlý : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaþ artýþý : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaþ : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaþ : " + (salary - tax() + bonus() + raiseSalary()));

        return null;
    }
}
