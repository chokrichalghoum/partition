/**
 * 
 */
package projet.Projet;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class PartitionTest {

	@InjectMocks
	public Partition paritionMock;

	@Test
	public void testPartition_empty() throws IllegalArgumentException {
		
		List<Integer> source = Collections.emptyList();
		List<List<Integer>> partitions = paritionMock.getUnderListPartitionInteger(source, 1);
		assertEquals(0, partitions.size());
		assertEquals(Collections.emptyList(), partitions);
	}

	@Test
	public void testPartition_1_1() throws IllegalArgumentException {
		List<Integer> source = Collections.singletonList(1);
		List<List<Integer>> partitions = paritionMock.getUnderListPartitionInteger(source, 1);
		assertEquals(1, partitions.size());
		assertEquals(Collections.singletonList(1), partitions.get(0));
	}

	@Test
	public void testPartition_1_2() throws IllegalArgumentException {
		List<Integer> source = Collections.singletonList(1);
		List<List<Integer>> partitions = paritionMock.getUnderListPartitionInteger(source, 2);
		assertEquals(1, partitions.size());
		assertEquals(Collections.singletonList(1), partitions.get(0));
	}

	@Test
	public void testPartition_2_1() throws IllegalArgumentException {
		List<Integer> source = Arrays.asList(1, 2);
		List<List<Integer>> partitions = paritionMock.getUnderListPartitionInteger(source, 1);
		assertEquals(2, partitions.size());
		assertEquals(Collections.singletonList(1), partitions.get(0));
		assertEquals(Collections.singletonList(2), partitions.get(1));
	}

	@Test
	public void testPartition_3_2() throws IllegalArgumentException {
		List<Integer> source = Arrays.asList(1, 2, 3);
		List<List<Integer>> partitions = paritionMock.getUnderListPartitionInteger(source, 2);
		assertEquals(2, partitions.size());
		assertEquals(Arrays.asList(1, 2), partitions.get(0));
		assertEquals(Arrays.asList(3), partitions.get(1));
	}
	
	
	@Test
	public void testPartition_n_n() throws IllegalArgumentException {
		List<Integer> source = Arrays.asList(1, 2, 3 , 5 , 6 , 7 , 8 , 9 , 11 , 12 , 1, 2, 3 , 5 , 6 , 7 , 8 , 9 , 11 , 12,
				1, 2, 3 , 5 , 6 , 7 , 8 , 9 , 11 , 12,1, 2, 3 , 5 , 6 , 7 , 8 , 9 , 11 , 12);
		List<List<Integer>> partitions = paritionMock.getUnderListPartitionInteger(source, 200);
		assertEquals(1, partitions.size());
	}
	

}
