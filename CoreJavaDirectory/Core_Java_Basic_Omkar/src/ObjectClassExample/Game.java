package ObjectClassExample;

public class Game {//in reality its public class ObjectClass extends Object//Object is a predefined parent class of every class
	private String name;
	private String type;
	private int playerCount;
	public Game() {
		name = "Cricket";
		type = "outdoor";
		playerCount = 11;
	}
	public Game(String name, String type, int playerCount) {
		super();
		this.name = name;
		this.type = type;
		this.playerCount = playerCount;
	}
	public String getInfo() {
		return name+" "+type+" "+playerCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPlayerCount() {
		return playerCount;
	}
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", type=" + type + ", playerCount=" + playerCount + "]";
	}
	@Override
	public void finalize() {
		System.out.println("Game object is being destroyed");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + playerCount;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Game other = (Game) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (playerCount != other.playerCount)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
