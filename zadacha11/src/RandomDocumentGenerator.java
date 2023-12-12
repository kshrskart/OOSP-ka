//Реализуйте на основании паттерна "Прототип" генератор случайных текстовых документов, который клонирует существующие документы с разным текстовым содержанием
public class RandomDocumentGenerator {
    private DocumentPrototype prototype;

    public RandomDocumentGenerator(DocumentPrototype prototype) {
        this.prototype = prototype;
    }

    public DocumentPrototype generateRandomDocument() {
        DocumentPrototype newDocument = prototype.clone();
        // Генерация случайного содержания документа
        String randomContent = generateRandomContent();
        newDocument.setContent(randomContent);
        return newDocument;
    }

    private String generateRandomContent() {
        // Генерация случайного текстового содержания
        // В этом методе можно использовать различные методы для генерации случайного текста, например, генераторы случайных слов, предложений и т.д.
        return "Random content";
    }

    public static void main(String[] args) {
        // Использование генератора случайных текстовых документов
        TextDocument prototype = new TextDocument("Содержание прототипа");
        RandomDocumentGenerator generator = new RandomDocumentGenerator(prototype);

        // Генерация случайного документа
        DocumentPrototype randomDocument = generator.generateRandomDocument();
        System.out.println(randomDocument.getContent());
    }
}