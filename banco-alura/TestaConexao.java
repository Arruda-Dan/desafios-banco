
public class TestaConexao {

	public static void main(String[] args) {

		Conexao conexao = null;

		try {
			conexao = new Conexao();
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao ");
		} finally {
			System.out.println("Finally");
			if (conexao != null) {
				conexao.fecha();	
			}
			
		}

	}

}
