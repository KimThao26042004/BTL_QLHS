package studentmanagementsystem;

public class StudentGrade {
	    private Double firstSem;
	    private Double secondSem;
	    private Double finals;

	    public StudentGrade( Double firstSem, Double secondSem, Double finals) {
	        this.firstSem = firstSem;
	        this.secondSem = secondSem;
	        this.finals = finals;
	    }


	    public Double getFirstSem() {
	        return firstSem;
	    }

	    public void setFirstSem(Double firstSem) {
	        this.firstSem = firstSem;
	    }

	    public Double getSecondSem() {
	        return secondSem;
	    }

	    public void setSecondSem(Double secondSem) {
	        this.secondSem = secondSem;
	    }

	    public Double getFinals() {
	        return finals;
	    }

	    public void setFinals(Double finals) {
	        this.finals = finals;
	    }


}
