package dio.padroes.projetos;


public class SingletonLazyHolder {
	private static class InstaciaHolder {
		public static SingletonLazyHolder instacia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstacia() {
		return InstaciaHolder.instacia;
	}
}
