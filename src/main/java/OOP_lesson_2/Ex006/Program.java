package OOP_lesson_2.Ex006;


import OOP_lesson_2.Ex006.Applications.Notepad;
import OOP_lesson_2.Ex006.Format.Doc;
import OOP_lesson_2.Ex006.Format.Md;
import OOP_lesson_2.Ex006.Format.Txt;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
}
