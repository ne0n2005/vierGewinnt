package de.tobias.vierGewinnt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class GameBoardTest {

	@InjectMocks
	GameBoard gameBoard;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPutStone() {
		// ACT
		boolean allowed = gameBoard.put(ChipColor.YELLOW, 3);

		// ASSERT
		Assert.assertTrue(allowed);
		ChipColor newStoneColor = gameBoard.get(0, 3);
		Assert.assertEquals(ChipColor.YELLOW, newStoneColor);
	}

	@Test
	public void testPutSecondStone() {
		// ARRANGE
		gameBoard.put(ChipColor.YELLOW, 3);

		// ACT
		boolean allowed = gameBoard.put(ChipColor.RED, 3);

		// ASSERT
		Assert.assertTrue(allowed);
		ChipColor newStoneColor = gameBoard.get(1, 3);
		Assert.assertEquals(ChipColor.RED, newStoneColor);
	}
}
