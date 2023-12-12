//Реализуйте систему управления состоянием виртуальной машины, позволяющую сохранять и восстанавливать состояние программы
public class Main {
    public static void main(String[] args) {
        // Создаем новое состояние программы
        ProgramState initialState = new ProgramState(0);

        // Увеличиваем счетчик на 1
        initialState.setCounter(initialState.getCounter() + 1);

        // Сохраняем состояние программы
        StateManager.saveState(initialState);

        // Восстанавливаем состояние программы
        ProgramState restoredState = StateManager.restoreState();

        // Выводим значение счетчика
        System.out.println("Счетчик: " + restoredState.getCounter());
    }
}
