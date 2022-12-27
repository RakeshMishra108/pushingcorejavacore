package example.string_builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello James, your age is ");//Appending String
		builder.append(57);//Appending int
		builder.append(" years and your weight is ");
		builder.append(67.33f);//Appending float
		builder.append(" and your vaccination status is ");
		builder.append(true);//Appending boolean
		
		System.out.println(builder);
		String finalOutput = builder.toString();
		System.out.println(finalOutput);

	}

}
