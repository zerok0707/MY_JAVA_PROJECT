package icehs.science.chapter07;

public class Publication {
	private int price;
	private int page;
	private String title;
	static int numberOfObjects = 0;
	
	public Publication() {
		this.numberOfObjects++;
	}
	public Publication(int price, int page, String title) {
		this.numberOfObjects++;
		this.price = price;
		this.page = page;
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price < 0)
		{
			System.out.println("[에러] 가격 정보는 음수를 입력할 수 없습니다.");
		}
		else
		{
			this.price = price;
		}
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if (page < 0)
		{
			System.out.println("[에러] 페이지 정보는 음수를 입력할 수 없습니다.");
		}
		else
		{
			this.page = page;
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}