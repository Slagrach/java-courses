/* класс реалезует калькулятор */
public class Calculator {
	/* реалезует вычесления */
	private int result;
	/* суммируем аргументы */
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	/* получаем результат */
	public int getResult() {
		return this.result;
	}
	/* отчистить результат вычесления */
	public void cleanResult() {
		this.result = 0;
	}
}