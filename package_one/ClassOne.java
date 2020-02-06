package package_one; 
  
public class ClassOne { 
    public static String reqResp(String req) {
        // System.out.printf("Printing request received in Java method:");
        // System.out.printf(req);
        String resp = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>"+
"<operation>"+
"    <container type=\"GLOBAL\">"+
"        <field id=\"ACTION\" value=\"RESELLER\" />"+
"        <field id=\"FUNCTION\" value=\"W.CST.LST\" />"+
"        <field id=\"LANGID\" value=\"E\" />"+
"        <field id=\"REQUESTCODE\" value=\"\" />"+
"        <field id=\"SCREEN\" value=\"RW7004\" />"+
"        <field id=\"THREAD\" value=\"1\" />"+
"    </container>"+
"    <container type=\"REQUESTCODELIST\">"+
"        <array type=\"button\">"+
"            <item id=\"REFRESH\" value=\"Refresh\" />"+
"            <item id=\"SEARCH\" value=\"Search\" />"+
"            <item id=\"SELECT\" value=\"SELECT\" />"+
"            <item id=\"ADDCST\" value=\"Add Prospect\" />"+
"        </array>"+
"    </container>"+
"    <container type=\"SCREEN\">"+
"        <caption value=\"Customer Listing\" />"+
"        <field id=\"USRID\" value=\"MDTEST\" editable=\"false\" visible=\"false\" />"+
"        <field id=\"FCSTS\" value=\"\" label=\"Customer Status\" editable=\"true\" />"+
"        <field id=\"FNAM\" value=\"\" label=\"Name\" editable=\"true\" />"+
"        <grid id=\"SFL01\" pagenr=\"1\" maxpages=\"1\">"+
"            <header>"+
"                <item id=\"CSTNAM\" value=\"Name\" />"+
"                <item id=\"CSTSTA\" value=\"State\" />"+
"                <item id=\"CSTLND\" value=\"Country\" />"+
"                <item id=\"CSTSTS\" value=\"Status\" />"+
"                <item id=\"CSTNBR\" value=\"\" />"+
"            </header>"+
"            <rows>"+
"                <row nr=\"1\">"+
"                    <item id=\"CSTNAM\" value=\"Test Customer 1\" editable=\"false\" />"+
"                    <item id=\"CSTSTA\" value=\"\" editable=\"false\" />"+
"                    <item id=\"CSTLND\" value=\"CH\" editable=\"false\" />"+
"                    <item id=\"CSTSTS\" value=\"0\" editable=\"false\" />"+
"                    <item id=\"CSTNBR\" value=\"226\" editable=\"false\" visible=\"false\" />"+
"                </row>"+
"                <row nr=\"2\">"+
"                    <item id=\"CSTNAM\" value=\"Test Customer 2\" editable=\"false\" />"+
"                    <item id=\"CSTSTA\" value=\"\" editable=\"false\" />"+
"                    <item id=\"CSTLND\" value=\"CH\" editable=\"false\" />"+
"                    <item id=\"CSTSTS\" value=\"0\" editable=\"false\" />"+
"                    <item id=\"CSTNBR\" value=\"227\" editable=\"false\" visible=\"false\" />"+
"                </row>"+
"            </rows>"+
"        </grid>"+
"    </container>"+
"</operation>";
        return resp;
  } 
} 