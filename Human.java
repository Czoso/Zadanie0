public class Human {

    private String name;
    private double salary;
    Animal pet;
    private Car car;

    public Human(String name, double salary, Animal pet, Car car) {
        this.name = name;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    public void getSalary() {
        System.out.println("Informacje o wyplacie w kwocie " + salary + "PLN pobrane dnia " + LocalDate.now());
    }

    public Car getCar() {
        return car;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            salary = this.salary;
            System.out.println("Error! Cannot add salary < 0");
        } else {
            System.out.println("Dane zostaly wyslane do systemu ksiegowego...");
            System.out.println("Odbierz aneks do umowy od pani Hani");
            System.out.println("ZUS i US juz wiedza, nie ukrywaj dochodu ;)");
            this.salary = salary;
            System.out.println("Twoja pensja wynosi teraz : " + salary + " PLN");
        }
    }

    public void setCar(Car car) {
        if (salary > car.getPrice()) {
            System.out.println("Wlasnie kupiles swoj samochod ze srodkow wlasnych.Gratulacje!");
            this.car = car;
        } else if (salary > (car.getPrice() / 12)) {
            System.out.println("Wlasnie kupiles swoj samochod z pomocą niewielkiego kredytu");
            this.car = car;
        } else {
            System.out.println("Zapisz sie na studia, znajdz nowa robote, albo idz po podwyzke!");
        }
    }
}