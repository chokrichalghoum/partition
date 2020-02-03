package projet.Projet;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */

public class App {


	private static final List<? extends Object> LIST_TEST_OBJECT = Arrays.asList("1", "aa", "2, 7", 2.3, 2.6, 2.9, 3.9,
			4.9, 5.9, 5, 9);
	private static final List<Integer> LIST_TEST_INTEGER = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3,
			4);
	private static final List<String> LIST_TEST_STRING = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J");
	private static final Integer SIZE = 2;

	public static void main(String[] args) throws Exception {

		Partition partition = new Partition();
		PartitionSubList partitionSubList = new PartitionSubList();
		PartitionsListUtils partitionsListUtils = new PartitionsListUtils();

		try {


			long startTime = System.currentTimeMillis();
			List<List<Integer>> underListInteger = partition.getUnderListPartitionInteger(LIST_TEST_INTEGER, SIZE);
			long stopTime = System.currentTimeMillis();
			System.out.println("Le temps de réponse pour la méthode Partition est  ******** " + (stopTime - startTime) + "   mellisecond.");
			System.out.println("En utilisant la fonction Partitition Integer:" + underListInteger.toString());

			
			List<List<String>> underListString = partition.getUnderListPartitionString(LIST_TEST_STRING, SIZE);
			System.out.println("En utilisant la fonction Partitition String:" + underListString.toString());
			

			List<?> underListObject = partition.getUnderListPartitionObject(LIST_TEST_OBJECT, SIZE);
			System.out.println("En utilisant la fonction Partitition Object : " + underListObject.toString());

			/**
			 * En utilisant subList
			 */
			
			System.out.println("****************************************************************************************************************");

			long startTimeSubList = System.currentTimeMillis();
			List<List<Integer>> underListBySubListInteger= partitionSubList.partitionInteger(LIST_TEST_INTEGER, SIZE);
			long stopTimeSubList = System.currentTimeMillis();
			System.out.println("Le temps de réponse pour la méthode Partition SubList est  ******** " + (stopTimeSubList - startTimeSubList) + "   mellisecond.");
			
			System.out.println("En utilisant la fonction Partitition Integer de la méthode SubList :"
					+ underListBySubListInteger.toString());
			
			List<List<String>> underListBySubList = partitionSubList.partition(LIST_TEST_STRING, SIZE);
			System.out.println("En utilisant la fonction Partitition String de la méthode SubList:"
					+ underListBySubList.toString());
			
			@SuppressWarnings("unchecked")
			List<List<String>> underListBySubListObject = partitionSubList.partition((List<String>) LIST_TEST_OBJECT, SIZE);
			System.out.println("En utilisant la fonction Partitition Object de la méthode SubList  :"
					+ underListBySubListObject.toString());



			System.out.println("****************************************************************************************************************");

			/**
			 * En utlisant ListUtils 
			 */

			
			
			long startTimeListUtils = System.currentTimeMillis();
			List<List<Integer>> underListByListUtilsInteger = partitionsListUtils.partitionInteger(LIST_TEST_INTEGER, SIZE);
			long stopTimeListUtils = System.currentTimeMillis();
			System.out.println("Le temps de réponse pour la méthode Partition ListUtils est  ******** " + (stopTimeListUtils - startTimeListUtils) + "   mellisecond.");			
			System.out.println("En utilisant la fonction partitions Integer de la méthode ListUtils:"
					+ underListByListUtilsInteger.toString());
			
			List<List<String>> underListByListUtilsString = partitionsListUtils.partition(LIST_TEST_STRING, SIZE);
			System.out.println("En utilisant la fonction partitions String de la méthode ListUtils:"
					+ underListByListUtilsString.toString());
			
			
			@SuppressWarnings("unchecked")
			List<List<Object>> underListByListUtils = partitionsListUtils.partitionObject((List<Object>) LIST_TEST_OBJECT, SIZE);
			System.out.println("En utilisant la fonction partitions Object de la méthode ListUtils:"
					+ underListByListUtils.toString());			
		

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
