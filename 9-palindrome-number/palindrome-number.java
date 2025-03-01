class Solution {
  public boolean isPalindrome(int x) {
    String numero = Integer.toString(x);
    String numero2 = new StringBuilder(numero).reverse().toString();
    boolean Palindromo = numero.equals(numero2);
    if (Palindromo) {
      return true;
    } else {
      return false;
    }
  }
}
