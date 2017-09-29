//*************************************************************
//   Count.java      Author: Erik Hays
//
//   Counts to five in three different languages
//*************************************************************
public class Count
{
    public static void main (String[] args)
    {
        //
        //English
        System.out.println ("one two three four five");
        //
        //French
        System.out.println ("un deux trois quatre cinq");
        //
        //Spanish
        System.out.println ("uno dos tres cuatro cinco");
        // 2. It leaves more space, but I don't think the extra space is necessary, as it seems almost too spaced out.
        // 3. When you take out a slash, it returns two errors: "illegal start of expression" and "';' expected".
        // 4. When you add an extra slash, no errors occur. Everything within the initial "//" is considered a comment.
    }
}