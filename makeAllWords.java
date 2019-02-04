import java.util.*;
public class makeAllWords{
  public static ArrayList<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> a = new ArrayList();
    return mAW(k, maxLetter, a, "");
  }

  public static ArrayList<String> mAW(int k, int maxLetter, ArrayList data, String word){
    if (k == 0){
      data.add(word);
    } else {
      for (int i = 0; i < maxLetter; i++){
        mAW(k - 1, maxLetter, data, word + (char)(i + 97));
      }
    }
    return data;
  }

  public static void main(String[] args){
    System.out.println("makeAllWords(3, 3)" + makeAllWords(3,3));
  }
}
