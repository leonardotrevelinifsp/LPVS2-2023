public class Employee {
    // atributos
    private String name;
    private String surname;
    private double salary;

    // construtor com argumentos
    public Employee(String name, String surname, double salary){
        setSurname(surname);
        setName(name);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null && !name.equalsIgnoreCase(surname)){
            this.name = name;
        }else{
            this.name = "";
        }
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        if(surname != null){
            this.surname = surname;
        }else{
            this.surname = "";
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
        else{
            this.salary = 0;
        }
    }

    // customização do método toString()
    @Override
    public String toString(){
        return String.format("Nome: %s \nSobrenome: %s \nSalary: R$%.2f", name, surname, salary);
    }

    // metodo simular aumento salary
    public double calculateNewSalary(int years){
        double newSalary = salary;
        for(int i=0; i < years; i++){
            newSalary += newSalary * 0.02;
        }
        return newSalary;
    }
}