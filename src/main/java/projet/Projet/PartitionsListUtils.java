package projet.Projet;

import java.util.List;

import org.apache.commons.collections4.ListUtils;

/***********************************************************************************************************************
 * Classe Partition pour la partition d'une liste en utilisant la librarie Apache Common Collections ==> 				*
 * 	 dépendance dans le fichier pom.xml								*													*
 * 																													    *
 * @author Chokri CHALGHOUM																								*
 *																														*/


public class PartitionsListUtils {

	/**
	 * 
	 * @param list
	 * @param size
	 * @return
	 */
	public List<List<String>> partition(List<String> list, int size) throws IllegalArgumentException {
		if (size <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}
		return ListUtils.partition(list, size);
	}

	/**
	 * 
	 * @param list
	 * @param size
	 * @return
	 */
	public List<List<Integer>> partitionInteger(List<Integer> list, int size) throws IllegalArgumentException {
		if (size <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}
		return ListUtils.partition(list, size);
	}

	/**
	 * 
	 * @param listTestObject
	 * @param size
	 * @return
	 */
	public List<List<Object>> partitionObject(List<Object> listTestObject, int size) throws IllegalArgumentException {
		if (size <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}
		return ListUtils.partition(listTestObject, size);
	}
}
