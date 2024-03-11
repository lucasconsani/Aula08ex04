public class Student {

    public String name;
    public double firstTri, secondTri, thirdTri;

    public double finalGrade() {
        return firstTri + secondTri + thirdTri;
    }

    public String toString (){
        if(finalGrade() < 60.0){
            double missing = 60.0 - finalGrade();
            return name
                + String.format("FINAL GRADE: %.2f%n", finalGrade())
                + "FAILED"
                + String.format("%nMISSING: %.2f", missing)
                + "POINTS";

        }else {
            return name
                    + String.format("FINAL GRADE: %.2f%n", finalGrade())
                    + "PASS";
        }
    }
}
