@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
    
    private final int age;
    private final boolean expectedResult;

    public CheckIsAdultTest(int age, boolean expectedResult) {
        this.age = age;
        this.expectedResult = expectedResult; // Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
            {17, false},
            {18, true},
            {20, true},
            {21, true} // Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age); // Передай сюда возраст пользователя
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Ожидаемый результат " + expectedResult + " для возраста " + age, expectedResult, isAdult);
    }
}
