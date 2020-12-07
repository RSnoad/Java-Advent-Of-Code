import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;


public class Day02_2017 {
    public static void main(String[] args) {

        System.out.println(checksum(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13, row14, row15, row16));
        System.out.println(divisionsum(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13, row14, row15, row16));
    }

    // Function that takes a row and returns the difference between its largest and smallest values.
    public static int difference(String row) {
        // Splits string into array using regex for whitespace.
        String[] splitrow = row.split("\\s+");

        // Create to list to of digits (think this converts from string to array to list, doesn't seem reasonable)
        List<Integer> introw = new ArrayList<>();
        for (String s : splitrow) introw.add(Integer.parseInt(s));

        // Find maximum and minimum by sorting the list and taking first and final element.
        Collections.sort(introw);

        int minimum = (int) introw.get(0);
        int maximum = (int) introw.get(introw.size() - 1);

        // Perform final subtraction.

        return maximum - minimum;
    }

    // Function that uses the difference function to calculate the checksum of any number of input rows, i.e. the sum
    // of the difference between the man and min of each row.
    public static int checksum(String... rows) {
        int total = 0;
        for (String row : rows) {
            total += difference(row);

        }
        return total;
    }

    // Function that takes an input row, finds the only present evenly divisible pair value, and returns that division
    // (or 0 if nothing is found).
    public static int evendivion(String row) {
        String[] splitrow = row.split("\\s+");

        for (int listiterator = 0; listiterator < splitrow.length; listiterator++) {
            for (int digititerator = 0; digititerator < splitrow.length; digititerator++) {
                // Ensure that a number is not checked against itself.
                if (digititerator == listiterator)
                    continue;
                if (Integer.parseInt(splitrow[listiterator]) % Integer.parseInt(splitrow[digititerator]) == 0) {
                    return Integer.parseInt(splitrow[listiterator]) / Integer.parseInt(splitrow[digititerator]);
                }
            }
        }
        return 0;
    }

    //  Takes any number of input rows and returns the sum of the even divisions. (Very similar to checksum function above,
    // only taking different function, could be merged?)
    public static int divisionsum(String... rows) {
        int total = 0;
        for (String row : rows) {
            total += evendivion(row);
        }
        return total;
    }


    public static String row1 = "4168 3925 858 2203 440 185 2886 160 1811 4272 4333 2180 174 157 361 1555";
    public static String row2 = "150 111 188 130 98 673 408 632 771 585 191 92 622 158 537 142";
    public static String row3 = "5785	5174	1304	3369	3891	131	141	5781	5543	4919	478	6585	116	520	673	112";
    public static String row4 = "5900	173	5711	236	2920	177	3585	4735	2135	2122	5209	265	5889	233	4639	5572";
    public static String row5 = "861	511	907	138	981	168	889	986	980	471	107	130	596	744	251	123";
    public static String row6 = "2196	188	1245	145	1669	2444	656	234	1852	610	503	2180	551	2241	643	175";
    public static String row7 = "2051	1518	1744	233	2155	139	658	159	1178	821	167	546	126	974	136	1946";
    public static String row8 = "161	1438	3317	4996	4336	2170	130	4987	3323	178	174	4830	3737	4611	2655	2743";
    public static String row9 = "3990	190	192	1630	1623	203	1139	2207	3994	1693	1468	1829	164	4391	3867	3036";
    public static String row10 = "116	1668	1778	69	99	761	201	2013	837	1225	419	120	1920	1950	121	1831";
    public static String row11 = "107	1006	92	807	1880	1420	36	1819	1039	1987	114	2028	1771	25	85	430";
    public static String row12 = "5295	1204	242	479	273	2868	3453	6095	5324	6047	5143	293	3288	3037	184	987";
    public static String row13 = "295	1988	197	2120	199	1856	181	232	564	1914	1691	210	1527	1731	1575	31";
    public static String row14 = "191	53	714	745	89	899	854	679	45	81	726	801	72	338	95	417";
    public static String row15 = "219	3933	6626	2137	3222	1637	5312	238	5895	222	154	6649	169	6438	3435	4183";
    public static String row16 = "37	1069	166	1037	172	258	1071	90	497	1219	145	1206	143	153	1067	510";


}

