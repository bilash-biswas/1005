fn main(){
   let mut line1 = String::new();
   std::io::stdin().read_line(&mut line1).unwrap();
   let num1: f32 = line1.trim().parse().ok().expect("Try");
   let mut line2 = String::new();
   std::io::stdin().read_line(&mut line2).unwrap();
   let num2: f32 = line2.trim().parse().ok().expect("Try");

   println!("MEDIA = {0:.5}", (num1 * 3.5 + num2 * 7.5)/11.0)
}
