package cn.itcast.core.pojo;

public class QueryVo {

	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public QueryVo(User user) {
		super();
		this.user = user;
	}

	public QueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
