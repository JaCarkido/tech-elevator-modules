package com.techelevator;

/**
 * This class models an auction with an additional set price (the 'buyout' price) that any bidder 
 * can accept at any time during the auction, thereby immediately ending the auction and winning 
 * the item.  If no bidder chooses to utilize the buyout option before the end of bidding the 
 * highest bidder wins.
 */
public class BuyoutAuction extends Auction {

	private int buyoutPrice;

	/**
	 * @param description the description of the auction
	 * @param buyoutPrice the set price that immediately wins the auction
	 */
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale); //the derived class MUST call a base class ctor to initialize the data from the base class
		this.buyoutPrice = buyoutPrice;
	}
	
	/*
	 * This class overrides the default placeBid behavior of the parent class.
	 * If the offeredBid meets or exceeds the buyout price, the bid is set
	 * to the buyout price and all future bids are ignored.
	 */
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		if(getHighBid().getBidAmount() < buyoutPrice) {
			if(offeredBid.getBidAmount() >= buyoutPrice) {
				offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
			}
			isCurrentWinningBid = super.placeBid(offeredBid); // going to run the super class placeBid() methods
		}
		return isCurrentWinningBid;
	}

	public int getBuyoutPrice() {
		return buyoutPrice;
	}

}
