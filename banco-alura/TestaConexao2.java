public class TestaConexao2 {

	public static void main(String[] args) {
		

		try (Conexao2 conexao = new Conexao2()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao ");
		}

	}

}
