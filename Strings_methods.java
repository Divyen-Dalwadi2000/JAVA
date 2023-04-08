// # Strings MEthods in java :-

class Strings_methods {

  public static void main(String[] args) {
    // ------------------------------------------------------------------------------
    //  Index= 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |  10 |  11 |  12 |  13 |  14 |
    // -------------------------------------------------------------------------
    //  name = D | i | v | y | e | n |   | D | a |  l  |  w  |  a  |  d  |  i  |
    // -----------------------------------------------------------------------------

    String name = "Divyen Dalwadi";

    // 1) name.length() : Returns lengnth of String name
    //# O/P :- (14 in this case starts with 1 index)
    int value = name.length();
    System.out.println(value);

    // 2) name.toLowerCase() : Return a new string which has all lowercase characters from the string name
    //# O/P :-(divyen dalwadi)
    String lc = name.toLowerCase();
    System.out.println(lc);

    // 3) name.toUpperCase() : Return a new string which has all upercase characters from the string name
    //# O/P :-(DIVYEN DALWADI)
    String uc = name.toUpperCase();
    System.out.println(uc);

    // ==========================================
    String n = "      Divyen       ";

    // 4) n.trim() : Returns a new string after remaining all the leading and trailing spaces from the original string
    String t = n.trim();
    System.out.println(t);

    // ------------------------------------------------------------------------------
    //  Index=  0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10  |  11 |  12 |  13 |
    // ------------------------------------------------------------------------------
    //  name = D | i | v | y | e | n |    | D | a | l |  w  |  a  |  d  |  i  |
    // ------------------------------------------------------------------------------

    // 5) name.substring(int start) : REturns a substring From  start to the end substring(3)
    // NOTE [THAT INDEX STARTS FROM{0} ]
    //# O/P :-(en Dalwadi)
    String ss = name.substring(4);
    System.out.println(ss);

    // 6) name.substring(int start, int end) : Returns a substring From satrt index to the end  index . statr is included and end is Excluded
    //# O/P :-(en Dal)
    String ss2 = name.substring(4, 10);
    System.out.println(ss2);

    // 7) name.replace('old char' , 'new char') : Retuns a new string after replacing "old chcaracter" with " new character ".
    //# O/P :-(bivyen balwadi)
    String r = name.replace('D', 'b');
    System.out.println(r);

    // 8) name.startsWith("string") : Returns true if name starts with "string"
    //# O/P :-(True)
    System.out.println(name.startsWith("Di"));

    // 9) name.endssWith("string") : Returns true if name Ends with "string"
    //# O/P :-(True)
    System.out.println(name.endsWith("di"));

    // 10) name.charAt(int ) : Returns character at a given index position .
    //# O/P :-(v)
    System.out.println(name.charAt(2));

    // 11) name.indexOf("string") : Returns the index of the given String Returns 1 which is the first occurnce of 'D' (or 'Di' both same only first character is important ) -1 otherwise ;
    //# O/P :-(0)
    System.out.println(name.indexOf('D'));

    // 12) name.indexOf("string" , int) : REturns the index of te given string starting from the index 'INT' . -1 return in this case .
    //# O/P :-(7)
    System.out.println(name.indexOf('D', 5));

    // 13) Return the last inde of the given string (છેલ્લો character પછડથી જે આવે ને એનો index print કરે)
    //# O/P :-(7)
    System.out.println(name.lastIndexOf('D'));

    // (અહી 6 પહેલનો character no index પ્રિન્ટ થશે )
    //# O/P :-(0)
    System.out.println(name.lastIndexOf('D', 6));

    // (both strings are matched is strings are equa then print true otherwise fsalse)
    //# O/P :-(false)
    System.out.println(name.equals("Divyen"));

    // name.equalsIgnoreCase("string")  
    //# O/P :-(True)
    System.out.println(name.equalsIgnoreCase("divyen dalwadi"));

    System.out.println("Divyen ");
 
  }
}
