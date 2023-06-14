package seminar4_HW4.service;

import seminar4_HW4.model.Teacher;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class TeacherGroupIterator implements Iterator<Teacher> {

    private final List<Teacher> teacherList;
    private int position;

    public TeacherGroupIterator(List<Teacher> teachersList) {
        this.teacherList = teachersList;
    }

    @Override
    public boolean hasNext() {
        return position < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return teacherList.get(position++);
    }

    @Override
    public void remove() {
        teacherList.remove(--position);
    }
}