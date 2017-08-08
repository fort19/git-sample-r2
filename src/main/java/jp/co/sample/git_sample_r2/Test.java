package jp.co.sample.git_sample_r2;

public class Test {
	private Integer id;
	private String name;
	private String area;
	private Integer walk;
	private Integer sleep;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getWalk() {
		return walk;
	}

	public void setWalk(Integer walk) {
		this.walk = walk;
	}

	public Integer getSleep() {
		return sleep;
	}

	public void setSleep(Integer sleep) {
		this.sleep = sleep;
	}

	public Test(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
