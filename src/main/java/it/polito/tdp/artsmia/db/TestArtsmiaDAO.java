package it.polito.tdp.artsmia.db;

import java.util.HashMap;
import java.util.Map;

import it.polito.tdp.artsmia.model.ArtObject;

public class TestArtsmiaDAO {

	public static void main(String[] args) {

		ArtsmiaDAO dao = new ArtsmiaDAO();
		Map<Integer, ArtObject> m = new HashMap<>();
		dao.listObjects(m);
		System.out.println(m.get(0));
		System.out.println(m.values().size());
	}

}
