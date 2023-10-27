package ObjectEqualsEx;

public class Member {

	public String id;
	
	public Member(String id)	{
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {	// obj2
		if(obj instanceof Member)	{
			Member member = (Member)obj;
			if(id.contentEquals(member.id))	{	// id 필드값이 동일한지 검사
				// 여기 equals는 String class equals()임
				return true;
			}
		}
		return false;
	}
}
