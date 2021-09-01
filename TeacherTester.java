package com.syntax.class20Task3;

public class TeacherTester {
    public static void main(String[] args) {

        ChemTeacher chemTeacher= new ChemTeacher();

        chemTeacher.name="Michael";
        chemTeacher.teach();

        PianoTeacher pianoTeacher=new PianoTeacher();

        pianoTeacher.name="Aziz";
        pianoTeacher.teachPiano();

        MathTeacher mathTeacher=new MathTeacher();

        mathTeacher.name= "Ronaldo";
        mathTeacher.teachMath();




    }
}
