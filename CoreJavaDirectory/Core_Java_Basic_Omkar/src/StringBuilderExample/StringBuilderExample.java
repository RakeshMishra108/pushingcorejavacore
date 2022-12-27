package StringBuilderExample;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello James, your age is ");//appending String
		builder.append(53);//appending int
		builder.append("years nad your weight is ");
		builder.append(67.33f);
		builder.append("and your vaccination status is");
		builder.append(true);//appending boolean
		
		//no new object is created, same object is updated(appended)//increasing performance
		System.out.println(builder);
		String finalOutput = builder.toString();
		System.out.println("Using toString() method --> "+finalOutput);
	}

}
