import 'dart:io';
void main(){
  double num1,num2;

  num1 = double.parse(stdin.readLineSync());
  num2 = double.parse(stdin.readLineSync());
  double mul = ((num1 * 3.5) + (num2 * 7.5)) / 11;
  var num = mul.toStringAsFixed(5);
  print("MEDIA = $num");
}
