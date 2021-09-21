package laboratirio2.excecoes;
public class DisciplinaNaoEncontradaException extends RuntimeException {
	private String Titulo;
	private String Detalhes;
	public DisciplinaNaoEncontradaException(String titulo, String detalhes) {
		super();
		Titulo = titulo;
		Detalhes = detalhes;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDetalhes() {
		return Detalhes;
	}
	public void setDetalhes(String detalhes) {
		Detalhes = detalhes;
	}
	
}
