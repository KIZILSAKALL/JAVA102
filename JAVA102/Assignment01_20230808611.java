package JAVA102;

public class Assignment01_20230808611{
    public static void main(String[] args) {
            Teacher tch=new Teacher("YAVSAK MÜSLÜM", "YAVSALMSLM@GMAİL.COM", 22452549876045L, "3", 4);
            System.out.println(tch.getDepartmentCode());
    }

}


   class Course{
    private String departmentCode;
    private int courseNumber;
    private String title;
    private String description;
    private int AKTS;

    public Course(String departmentCode,int courseNumber,String title,String description,int AKTS){

            setDepartmentCode(departmentCode);
            setCourseNumber(courseNumber);
            setAKTS(AKTS);
            this.title=title;
            this.description=description;
           
            
    }


    public int getCourseNumber() {
        return courseNumber;
    }


    public void setCourseNumber(int courseNumber) {
        if(courseNumber>=100 && courseNumber<=999 ||
           courseNumber>=5000 && courseNumber<=5999 ||
           courseNumber>=7000 && courseNumber<=7999){
           this.courseNumber = courseNumber;

        }else{
            throw new IllegalArgumentException();
        }
        
        
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public int getAKTS() {
        return AKTS;
    }

    public void setAKTS(int AKTS){
        if(AKTS>0){
            this.AKTS=AKTS;
        }
    }


    public String getDepartmentCode(){
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode){
        if(departmentCode.length()<=4 && departmentCode.length()>=3){
        this.departmentCode=departmentCode;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String courseCode(){
        return this.departmentCode+this.courseNumber;
    }

    public String toString(){
       return "["+ departmentCode+courseNumber+"] - ["+title+"] ("+AKTS+")";
   }

}
   
   class Person{
        private String name;
        private String eMail;
        private long iD;
        private String departmentCode;

        

        public Person(String name, String eMail, long iD, String departmentCode) {
            this.name = name;
            this.eMail = eMail;
            this.iD = iD;
            setDepartmentCode(departmentCode);
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String geteMail() {
            return eMail;
        }
        public void seteMail(String eMail) {
            this.eMail = eMail;
        }
        public long getiD() {
            return iD;
        }

        public void setiD(long iD){
            this.iD=iD;
        }
        
        public String getDepartmentCode() {
            return departmentCode;
        }
        
        public void setDepartmentCode(String departmentCode){
            if(departmentCode.length()<=4 && departmentCode.length()>=3)
            this.departmentCode=departmentCode;
            else{
                throw new IllegalArgumentException();
                }
        }
        
        public String toString(){
            return "["+ name + "  ("+iD+")] - ["+eMail+"]";
        }

    }

   class Teacher extends Person{
    
        private int rank;

        public Teacher(String name, String eMail, long iD, String departmentCode, int rank) {
            super(name, eMail, iD, departmentCode);
            this.rank = rank;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            if(rank<=4 && rank >=1){
                this.rank=rank;
            }
        }

        public String getTitle(){

            
                if(this.rank==1){
                    return "Lecturer";

                }else if(this.rank==2){
                    return "Assistant Professor";
                    
                }else if(this.rank==3){
                    return "Associate Professor";
                    
                }else if(this.rank==4){
                    return "Professor";   
                }else{
                    throw new IllegalArgumentException();
                }
            
        }

        public void promote(){
            if(this.rank<=1 && this.rank<4){
                this.rank++;
            }
        }

        public void demote(){
            if(this.rank>1 && this.rank<=4){
                this.rank--;
            }
        }

        public String toString(){
            return this.getTitle()+" "+super.toString();
        }
    }
   
   class Student extends Person{
    
        private int AKTS;
       

        public Student(String name, String eMail, long iD, String departmentCode, int AKTS) {
            super(name, eMail, iD, departmentCode);
            this.AKTS =0;
        }

        public int getAKTS() {
            return AKTS;
        }

        public void passCourse(Course course){
            this.AKTS+=course.getAKTS();
        }

        public String toString(){
            return super.toString();
        }
   }

   class GradStudent extends Student{

        private int rank;
        private String thesisTopic;
        
        public GradStudent(String name, String eMail, long iD, String departmentCode, int AKTS, int rank,
                String thesisTopic) {
            super(name, eMail, iD, departmentCode, AKTS);
            this.rank = rank;
            this.thesisTopic = thesisTopic;
        }

        public void setRank(int rank) {
            if(rank==1 || rank==2 || rank==3){}
            this.rank = rank;
        }

        public String getThesisTopic() {
            return thesisTopic;
        }

        public void setThesisTopic(String thesisTopic) {
            this.thesisTopic = thesisTopic;
        }

        public String getLevel(){
            if(this.rank==1){
                return "Master's Student";
            }else if(this.rank==2){
                return "Doctoral Student";
            }else if(this.rank==3){
                return "Doctoral Candidate";
            }else{
                throw new IllegalArgumentException();
            }
        }

        public String toString(){
            return super.toString();
        }

   }
   
   





        


     


        

   
   



