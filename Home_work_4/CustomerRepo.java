package Home_work_4;

// Интерфейс для репозитория покупателей
public interface CustomerRepo {
    void addCustomer(Customer customer);
    Customer getCustomer(int customerId);

}
