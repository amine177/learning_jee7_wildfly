
public interface TheatreBookerRemote {
	public int getAccountBalance();
	public String bookSeat(int seatId) throws SeatBookedException, NotEnoughMoneyException, NoSuchSeatException;
}
