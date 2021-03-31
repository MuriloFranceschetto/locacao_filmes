package br.edu.unidep.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LocacaoFilmesUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocacaoFilmes");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
