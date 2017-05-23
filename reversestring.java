class reversestring {
    
    String reverse(String s) {
      int legnth = s.length();
      char[] arrayCh = s.toCharArray();
      for(int i=0; i< length/2; i++) {
          char ch = s.charAt(i);
          arrayCh[i] = arrayCh[legnth-1-i];
          arrayCh[legnth-1-i] = ch;
      } 
    return new String(arrayCh);
    }
}