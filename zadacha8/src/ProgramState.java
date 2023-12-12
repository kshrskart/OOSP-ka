import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Класс, представляющий состояние программы
public class ProgramState implements Serializable {
    private static final long serialVersionUID = 1L;
    private int counter;

    public ProgramState(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

// Класс, отвечающий за управление состоянием программы
class StateManager {
    private static final String SAVE_FILE = "program_state.ser";

    // Метод для сохранения состояния программы
    public static void saveState(ProgramState state) {
        try {
            FileOutputStream fileOut = new FileOutputStream(SAVE_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(state);
            out.close();
            fileOut.close();
            System.out.println("Состояние программы сохранено в файле " + SAVE_FILE);
        } catch (Exception e) {
            System.out.println("Ошибка при сохранении состояния программы: " + e.getMessage());
        }
    }

    // Метод для восстановления состояния программы
    public static ProgramState restoreState() {
        ProgramState state = null;
        try {
            FileInputStream fileIn = new FileInputStream(SAVE_FILE);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            state = (ProgramState) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Состояние программы восстановлено из файла " + SAVE_FILE);
        } catch (Exception e) {
            System.out.println("Ошибка при восстановлении состояния программы: " + e.getMessage());
        }
        return state;
    }
}