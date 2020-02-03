/**
 * 
 */
package projet.Projet;

import java.util.List;

import com.google.common.collect.Lists;


			/***********************************************************************************************************************
			 * Classe Partition pour la partition d'une liste en utilisant la librarie GUAVA ==> dépendance dans le fichier pom.xml*
			 * 																													    *
			 * @author Chokri CHALGHOUM																								*
			 *																														*
			 ************************************************************************************************************************/
public class Partition {

	/**
	 * 
	 * @param list
	 * @param size
	 * @return
	 * @throws IllegalArgumentException
	 */
	public List<List<Integer>> getUnderListPartitionInteger(List<Integer> list, int size)
			throws IllegalArgumentException {
		if (size <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}

		List<List<Integer>> lists = Lists.partition(list, size);
		return lists;
	}

	/**
	 * 
	 * @param list
	 * @param size
	 * @return
	 * @throws IllegalArgumentException
	 */
	public List<List<String>> getUnderListPartitionString(List<String> list, int size) throws IllegalArgumentException {
		if (size <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}

		List<List<String>> lists = Lists.partition(list, size);
		return lists;
	}

	/**
	 * 
	 * @param list
	 * @param size
	 * @return
	 * @throws IllegalArgumentException
	 */
	@SuppressWarnings("unchecked")
	public List<List<? extends Object>> getUnderListPartitionObject(List<? extends Object> list, int size)
			throws IllegalArgumentException {
		if (size <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}

		List<?> result = Lists.partition(list, size);
		return (List<List<? extends Object>>) result;
	}

}
