public class App {
    public static void main(String[] args) throws Exception {
        // declaração e instanciação de um objeto da classe Employee
        Employee employee2 = new Employee("Leonardo", "Trevelin", 10000);

        // imprimir
        System.out.println(employee2.getName());
        System.out.println(employee2);
        System.out.printf("Novo salário após 5 anos: R$%.2f\n", employee2.calculateNewSalary(5));
    }
}