package studentobj;

public class Studentm {
    public static void main(String args[]) {
        String filepath = "G:\\java projects\\students.txt";
        String filepath1 = "G:\\java projects\\studento.txt";
        StudentObj sobj = new StudentObj();
       // StudentR stur = new StudentR();

        StudentR stu1 = new StudentR();
        String filecontents = stu1.fileRead(filepath);
        System.out.println("the content of the file is:\n" + filecontents);
        System.out.println();

        String[] details = filecontents.split("\n");
        String[] data;
        String outputline = " ";
        for (String s : details) {
            data = s.split(",");
            outputline += sobj.setRollno(data[0]);
            outputline += sobj.setName(data[1]);
            outputline += sobj.setAge(data[2]);

            outputline += "\n";
            System.out.println(sobj.getRollno() + " " + sobj.getName() + " " + sobj.getAge());
        }



        Studentw stw = new Studentw();
        stw.fileWrite(outputline, filepath1);


    }


}
