// Nama 	: Kaila Talitha Putri
// Nim 	: 24060123140179
// Lab 	: C1

public class Student extends Person{
    public Student(String name)
    {
        super(name);
    }

    public boolean isAsleep(int hr) // override
    {
        return 2 < hr && 8 > hr;
    }
}
