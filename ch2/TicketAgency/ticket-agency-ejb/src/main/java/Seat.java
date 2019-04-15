
public class Seat {
	@Override
	public String toString() {
		return "Seat [id=" + id + ", price=" + price + ", name=" + name + ", booked=" + booked + "]";
	}

	private int id, price;
	private String name;
	private boolean booked;

	public Seat(int id, String name, int price, boolean booked) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.booked = booked;
	}

	public Seat(int id, String name, int price) {
		this(id, name, price, false);
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	public Seat getBookedSeat() {
		return new Seat(getId(), getName(), getPrice(), true);
	}
}
