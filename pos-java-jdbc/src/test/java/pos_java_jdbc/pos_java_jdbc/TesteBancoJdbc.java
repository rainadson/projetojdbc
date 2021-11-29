package pos_java_jdbc.pos_java_jdbc;

import org.junit.jupiter.api.Test;

import DAO.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc{
	
	@Test
	public void initBanco(){
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5);
		userposjava.setNome("paulo");
		userposjava.setEmail("pauloampaios@gmail.com");
		
		userPosDAO.salvar(userposjava);
		
		
	}
	/*	UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userPosDAO.salvar(userposjava);
	}*/

}
