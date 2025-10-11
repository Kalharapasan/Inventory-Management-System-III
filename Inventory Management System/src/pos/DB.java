package pos;

import static com.lowagie.text.pdf.PdfFileSpecification.url;
import com.mysql.jdbc.Connection;


public class DB {
    
   public static Connection mycon(){
       Connection con =null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url)
       } catch (Exception e) {
       }
   }
  
}
