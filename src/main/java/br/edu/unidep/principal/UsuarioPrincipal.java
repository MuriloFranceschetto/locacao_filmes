package br.edu.unidep.principal;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.edu.unidep.model.Usuario;
import br.edu.unidep.util.LocacaoFilmesUtil;

//import br.edu.unidep.model.Usuario;

public class UsuarioPrincipal {

	public static void main(String[] args) {

		EntityManager em = new LocacaoFilmesUtil().getEntityManager();

//		try {
////			Usuario usuario = new Usuario("Jo�o", Calendar.getInstance(), true);
//			Usuario usuario = new Usuario("J�lia", Calendar.getInstance(), true);
//
//			em.getTransaction().begin();
//
//			em.persist(usuario);
//
//			em.getTransaction().commit();
//
//			em.close();
//
//			System.out.println("Usu�rio cadastrado: " + usuario.toString());
//		} catch (Exception e) {
//			System.out.println("Error" + e);
//		}

		try {
			em.getTransaction().begin();

			Usuario usuario = em.find(Usuario.class, 3);

			em.close();

			System.out.println("Usuario: " + usuario);
		} catch (Exception e) {
			System.out.println("Error" + e);
		}

	}

}
