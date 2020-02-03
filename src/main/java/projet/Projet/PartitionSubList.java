/**
 * 
 */
package projet.Projet;

import java.util.ArrayList;
import java.util.List;

/***********************************************************************************************************************
 * Classe Partition pour la partition d'une liste en utilisant la  fonctionnalité SubList 								*
 * 																													    *
 * @author Chokri CHALGHOUM																								*
 ************************************************************************************************************************/
public class PartitionSubList {

	/**
	 * 
	 * @param list
	 * @param n
	 * @return
	 */
	public List<List<String>> partition(List<String> list, int n) throws IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}
		// get size of the list
		int sizeList = list.size();

		// calculate number of partitions m of size n each
		int m = sizeList / n;
		if (sizeList % n != 0)
			m++;

		// create m empty lists and initialize it using List.subList()
		List<List<String>> partition = new ArrayList<List<String>>();
		for (int i = 0; i < m; i++) {
			int fromIndex = i * n;
			int toIndex = (i * n + n < sizeList) ? (i * n + n) : sizeList;
			partition.add(new ArrayList<String>(list.subList(fromIndex, toIndex)));
		}

		// return the lists
		return partition;
	}

	/**
	 * 
	 * @param list
	 * @param n
	 * @return
	 */
	public List<List<Integer>> partitionInteger(List<Integer> list, int n) throws IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}

		int sizeList = list.size();
		int m = sizeList / n;
		if (sizeList % n != 0)
			m++;

		List<List<Integer>> partition = new ArrayList<List<Integer>>();
		for (int i = 0; i < m; i++) {
			int fromIndex = i * n;
			int toIndex = (i * n + n < sizeList) ? (i * n + n) : sizeList;
			partition.add(new ArrayList<Integer>(list.subList(fromIndex, toIndex)));
		}

		return partition;
	}

	/**
	 * 
	 * @param list
	 * @param n
	 * @return
	 */
	public List<List<Object>> partitionObject(List<Object> list, int n) throws IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException("the size cannot be a null value or a negative value");
		}

		int sizeList = list.size();
		int m = sizeList / n;
		if (sizeList % n != 0) {
			m++;
		}

		List<List<Object>> partition = new ArrayList<List<Object>>();
		for (int i = 0; i < m; i++) {
			int fromIndex = i * n;
			int toIndex = (i * n + n < sizeList) ? (i * n + n) : sizeList;
			partition.add(new ArrayList<Object>(list.subList(fromIndex, toIndex)));
		}
		return partition;
	}
}
