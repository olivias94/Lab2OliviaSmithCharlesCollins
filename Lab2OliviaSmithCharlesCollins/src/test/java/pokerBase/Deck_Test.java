package pokerBase;
import pokerEnums.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {
	Hand NewHand;
	Deck NewDeck;
	Card Card1;
	Card Card2;
	Card Card3;
	Card Card4;
	Card Card5;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		NewHand = null;
		NewDeck = null;
		Card1 = null;
		Card2 = null;
		Card3 = null;
		Card4 = null;
		Card5 = null;
	}

	@Test
	public void testFullDeck1() {
		//first make a Deck
		NewDeck  = new Deck();
		//do assertTrue for the number of cards in the deck
		assertTrue("Deck was not created with 52 cards", NewDeck.getTotalCards()==52);
		
		//Draw a Hand from that deck, then assertTrue
		NewHand = new Hand(NewDeck);
		assertTrue("Five cards were not properly removed from the deck", NewDeck.getTotalCards()==47);
	}
	
	@Test
	public void testFullDeck2(){
		//first make a Deck
		NewDeck  = new Deck();
		//do assertTrue for the number of cards in the deck
		assertTrue("Deck was not created with 52 cards", NewDeck.getTotalCards()==52);
				
		//draw from deck, then assertTrue
		NewDeck.drawFromDeck();
		assertTrue("One card was not properly removed from the deck", NewDeck.getTotalCards()==51);			
	}
	
	@Test
	public void testRoyalFlush(){
		//Construct a hand with a Royal Flush then use assertTrue to test it 
		Card Card1 = new Card(eSuit.SPADES, eRank.TEN, false);
		Card Card2 = new Card(eSuit.SPADES, eRank.JACK, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.QUEEN, false);
		Card Card4 = new Card(eSuit.SPADES, eRank.KING, false);
		Card Card5 = new Card(eSuit.SPADES, eRank.ACE, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Royal Flush", NewHand.getHandStrength()==100);	
	}

	@Test
	public void testStraightFlush(){
		//Construct a hand with a Straight Flush then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.THREE, false);
		Card Card2 = new Card(eSuit.DIAMONDS, eRank.FOUR, false);
		Card Card3 = new Card(eSuit.DIAMONDS, eRank.FIVE, false);
		Card Card4 = new Card(eSuit.DIAMONDS, eRank.SIX, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Straight Flush", NewHand.getHandStrength()==90);
		
		
	}
	
	@Test
	public void testFourOfAKind1(){
		//Construct a hand with a Four of a Kind then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.SEVEN, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.SEVEN, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Four of a Kind", NewHand.getHandStrength()==80);
		
		
	}
	
	@Test
	public void testFourOfAKind2(){
		//Construct a hand with a Four of a Kind then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.EIGHT, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Four of a Kind", NewHand.getHandStrength()==80);
		
		
	}
	
	@Test
	public void testFullHouse1(){
		//Construct a hand with a Full House then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.SEVEN, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Full House", NewHand.getHandStrength()==70);
		
		
	}
	@Test
	public void testFullHouse2(){
		//Construct a hand with a Full House then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Full House", NewHand.getHandStrength()==70);
		
		
	}
	
	@Test
	public void testFlush(){
		//Construct a hand with a Flush then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.DIAMONDS, eRank.FIVE, false);
		Card Card3 = new Card(eSuit.DIAMONDS, eRank.JACK, false);
		Card Card4 = new Card(eSuit.DIAMONDS, eRank.THREE, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.ACE, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Flush", NewHand.getHandStrength()==60);
	}
	
	@Test
	public void testStraight(){
		//Construct a hand with a Straight then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.EIGHT, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.NINE, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.TEN, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.JACK, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Straight", NewHand.getHandStrength()==50);	
	}
	
	@Test
	public void testThreeOfAKind1(){
		//Construct a hand with a Three of a Kind then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.THREE, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.SEVEN, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.SEVEN, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Three of a Kind", NewHand.getHandStrength()==40);
	}
	
	@Test
	public void testThreeOfAKind2(){
		//Construct a hand with a Three of a Kind then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.SEVEN, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.NINE, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.QUEEN, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Three of a Kind", NewHand.getHandStrength()==40);
	}
	
	@Test
	public void testThreeOfAKind3(){
		//Construct a hand with a Three of a Kind then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.TWO, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.FOUR, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Three of a Kind", NewHand.getHandStrength()==40);
	}
	
	@Test
	public void testTwoPair1(){
		//Construct a hand with a Two Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.QUEEN, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Two Pair", NewHand.getHandStrength()==30);
	}
	
	@Test
	public void testTwoPair2(){
		//Construct a hand with a Two Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.TWO, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.SEVEN, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Two Pair", NewHand.getHandStrength()==30);
	}
	
	@Test
	public void testTwoPair3(){
		//Construct a hand with a Two Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.NINE, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.QUEEN, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.QUEEN, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a Three of a Kind", NewHand.getHandStrength()==30);
	}
	
	@Test
	public void testOnePair1(){
		//Construct a hand with a One Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.SEVEN, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.TEN, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.KING, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a One Pair", NewHand.getHandStrength()==20);
	}
	
	@Test
	public void testOnePair2(){
		//Construct a hand with a One Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.NINE, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.NINE, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.TEN, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.ACE, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a One Pair", NewHand.getHandStrength()==20);
	}
	
	@Test
	public void testOnePair3(){
		//Construct a hand with a One Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.THREE, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.FIVE, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.QUEEN, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a One Pair", NewHand.getHandStrength()==20);
	}
	
	@Test
	public void testOnePair4(){
		//Construct a hand with a One Pair then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.TWO, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.THREE, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.SIX, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.EIGHT, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.EIGHT, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a One Pair", NewHand.getHandStrength()==20);
	}
	
	@Test
	public void testHighCard(){
		//Construct a hand with a High Card then use assertTrue to test it 
		Card Card1 = new Card(eSuit.DIAMONDS, eRank.SEVEN, false);
		Card Card2 = new Card(eSuit.HEARTS, eRank.FIVE, false);
		Card Card3 = new Card(eSuit.SPADES, eRank.EIGHT, false);
		Card Card4 = new Card(eSuit.CLUBS, eRank.TWO, false);
		Card Card5 = new Card(eSuit.DIAMONDS, eRank.TEN, false);
		NewHand = new Hand();
		NewHand.AddCardToHand(Card1);
		NewHand.AddCardToHand(Card2);
		NewHand.AddCardToHand(Card3);
		NewHand.AddCardToHand(Card4);
		NewHand.AddCardToHand(Card5);
		NewHand.EvalHand();
		System.out.println(NewHand.getHandStrength());
		//AssertTrue to check the value of HandStrength
		assertTrue("The EvalHand test did not work for a High Card", NewHand.getHandStrength()==10);
	}
	
}


