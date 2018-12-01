import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LaptopList")

public class LaptopList extends HttpServlet {

	/* laptop Page Displays all the laptops and their Information in Game Speed */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = null;
		String CategoryName = request.getParameter("name");

			HashMap<String, Laptop> hm = new HashMap<String, Laptop>();
		/* Checks the Tablets type whether it is microsft or sony or nintendo */

		// for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
		// {
		// 	hm.put(entry.getValue().getId(),entry.getValue());
		// }
		if(CategoryName==null){
			hm.putAll(SaxParserDataStore.laptops);
			name = "";
		 }
		else
		{
			if(CategoryName.equals("Apple"))
			{
				for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
				{
				 if(entry.getValue().getName().equalsIgnoreCase("Apple"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
				}
			   	 name = "Apple";
			}	 
			else if(CategoryName.equals("asus"))
		    {
			for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
				{
				 if(entry.getValue().getName().equalsIgnoreCase("asus"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
				}
				 name = "asus";
			}
		   else if(CategoryName.equals("acer"))
		   {
			 for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
			 {
				if(entry.getValue().getName().equalsIgnoreCase("acer"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
			 }
				name = "acer";
		   }
		   
			else if(CategoryName.equals("HP"))
			{
				for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
				{
				 if(entry.getValue().getName().equalsIgnoreCase("HP"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
				}
			   	 name = "HP";
			}
			else if(CategoryName.equals("Dell"))
			{
				for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
				{
				 if(entry.getValue().getName().equalsIgnoreCase("Dell"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
				}
			   	 name = "Dell";
			}
			else if(CategoryName.equals("Microsoft"))
			{
				for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
				{
				 if(entry.getValue().getName().equalsIgnoreCase("Microsoft"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
				}
			   	 name = "Microsoft";
			}
			else if(CategoryName.equals("Razer"))
			{
				for(Map.Entry<String,Laptop> entry : SaxParserDataStore.laptops.entrySet())
				{
				 if(entry.getValue().getName().equalsIgnoreCase("Razer"))
				 {
					 hm.put(entry.getValue().getId(),entry.getValue());
				 }
				}
			   	 name = "Razer";
			}
			
		}


		/* Header, Left Navigation Bar are Printed.

		All the laptop and laptop information are dispalyed in the Content Section

		and then Footer is Printed*/

		Utilities utility = new Utilities(request,pw);
		utility.printHtml("Header.html");
		utility.printHtml("LeftNavigationBar.html");
		pw.print("<div id='content'><div class='post'><h2 class='title meta'>");
		pw.print("<a style='font-size: 24px;'>"+name+" laptops</a>");
		pw.print("</h2><div class='entry'><table id='bestseller'>");
		int i = 1; int size= hm.size();
		for(Map.Entry<String, Laptop> entry : hm.entrySet())
		{
			Laptop laptop = entry.getValue();
			if(i%3==1)
			pw.print("<tr>");
			pw.print("<td><div id='shop_item'>");
			pw.print("<h3>"+laptop.getName()+"</h3>");
			pw.print("<strong>$"+laptop.getPrice()+"</strong><ul>");
			pw.print("<li id='item'><img src='images/laptop/"+laptop.getImage()+"' alt='' /></li>");

			pw.print("<li><form method='post' action='Cart'>" +
					"<input type='hidden' name='name' value='"+entry.getKey()+"'>"+
					"<input type='hidden' name='type' value='laptop'>"+
					//"<input type='hidden' name='maker' value='"+CategoryName+"'>"+
					"<input type='hidden' name='access' value=''>"+
					"<input type='submit' class='btnbuy' value='Buy Now'></form></li>");
			// pw.print("<li><form method='post' action='WriteReview'>"+"<input type='hidden' name='name' value='"+entry.getKey()+"'>"+
			// 		"<input type='hidden' name='type' value='laptops'>"+
			// 		//"<input type='hidden' name='maker' value='"+CategoryName+"'>"+
			// 		"<input type='hidden' name='access' value=''>"+
			// 	    "<input type='submit' value='WriteReview' class='btnreview'></form></li>");
			// pw.print("<li><form method='post' action='ViewReview'>"+"<input type='hidden' name='name' value='"+entry.getKey()+"'>"+
			// 		"<input type='hidden' name='type' value='laptops'>"+
			// 		//"<input type='hidden' name='maker' value='"+CategoryName+"'>"+
			// 		"<input type='hidden' name='access' value=''>"+
			// 	    "<input type='submit' value='ViewReview' class='btnreview'></form></li>");
			pw.print("</ul></div></td>");
			if(i%3==0 || i == size)
			pw.print("</tr>");
			i++;
		}
		pw.print("</table></div></div></div>");

		utility.printHtml("Footer.html");

	}
}
