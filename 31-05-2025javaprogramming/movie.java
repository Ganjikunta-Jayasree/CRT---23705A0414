class Movie{
  String name;
  Float rating;
  String duration;
  Movie(String name,Float rating,String duration ){
    this.name=name;
    this.rating=rating;
    this.duration=duration;
  }
  void Ishit(){
    System.out.println("Movie name:"+name);
   System.out.println("Movie rating:"+rating);
    System.out.println("Movie duration:"+duration);
    

    if(rating>9){
     System.out.println("movie is hit");
    }
  }
  }
  public class Main {
    public static void main(String[] args) {
      Movie m1=new Movie("kalki",9.1f,"01hr30m");
      m1.Ishit();
  }
}