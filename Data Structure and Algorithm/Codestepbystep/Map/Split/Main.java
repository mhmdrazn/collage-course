// Write a method named split that accepts a Set of strings as a parameter and returns the result of splitting the strings into different sets based on the length of the strings. In particular, your method should return a map whose keys are integers representing string lengths, and whose values are sets of strings of that length. Within each set in your result, the strings should be sorted in alphabetical order. For example, if a variable called words contains the following set of strings:

// [to, be, or, not, that, is, the, question]
// Then the call of split(words) should return the following map:

// {2=[be, is, or, to], 3=[not, the], 4=[that], 8=[question]}
// Do not modify the set passed in as the parameter.

public class Main() {
    public static void main(String[] args) {
        String [] input = {"to", "be", "or", "not", "that", "is", "the", "question"};
        Set<String> in = new HashSet<String>();
        
        for (String a : in){
            in.add(a);
        }

        System.out.println(split(in));
    }

    public static Map<Integer, Set<String>> split(){Set<String> s}{
        Map<Integer, Set<String>> m = new TreeMap<Integer, Set<String>>();
        Set<Integer> l = new TreeSet<Integer>();
    
        for (String data : s){
            l.add(data.length());
        }
    
        for (Integer i : l){
            Set<String> a = new TreeSet<String>();
            for (data : s){
                if (data.length() == i){
                    a.add(data);
                }
            }
        }
    
        return m;
    }
    
    
    
    
}