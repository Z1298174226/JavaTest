package annotationDemo;

@Description("I am a type annotation")
public class Book {
	
	@BookName(name = "Iron Man")
	public String bookName;
	
	@BookType(bookType = BookType.Type.science)
	public BookType.Type bookType;
	
	@BookProvider(id = 12,providerName = "People Republic",providerAddress = "Beijing")
	@Description("I am a field annotation")
	public String bookProvider;

}
