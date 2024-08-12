package org.example;

class StudentsGrade {
        String name;
        int id;
        int mathGrade;
        int socialGrade;
        int scienceGrade;

        StudentsGrade() {
            System.out.println("An object of Student class is created!");
        }

//        void setData(String sName, int sId, int sMathGrade, int sSocialGrade, int sScienceGrade) {
//            this.name = name;
//            this.id = id;
//            this.mathGrade = mathGrade;
//            this.socialGrade = socialGrade;
//            this.scienceGrade = scienceGrade;
//
//        }

        StudentsGrade(String name, int id, int mathGrade, int socialGrade, int scienceGrade) {
        this.name = name;
        this.id = id;
        this.mathGrade = mathGrade;
        this.socialGrade = socialGrade;
        this.scienceGrade = scienceGrade;
        }

        StudentsGrade(StudentsGrade other) {
        this.name = other.name;
        this.id = other.id;
        this.socialGrade = other.socialGrade;
        this.scienceGrade = other.scienceGrade;
        this.mathGrade = other.mathGrade;
     }

        void displayData() {
            System.out.println("I am " + name + " and my id is: " + id + " I have scored " + mathGrade + " in maths" + " , " + socialGrade + " in Social Science, " + " and " + scienceGrade + " in Science.");
        }
    }




