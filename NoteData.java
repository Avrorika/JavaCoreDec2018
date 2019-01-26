package t06;

import java.util.ArrayList;
import java.util.List;

class NoteData {

    private List<String> note = new ArrayList<>();

    /**
     * Add the task in the list.
     *
     * @param task task that should be added to a list
     * @param date data of the task that should be added
     */
    void addMessage(String task, String date) {
        note.add(task);
        note.add(date);
    }

    /**
     * Delete the task from the list.
     *
     * @param task task to be removed
     */
    void deleteMessage(String task) {
        note.remove(task);
    }

    /**
     * Edit the task from the list.
     *
     * @param index index of the task to edit
     * @param task  task to edit
     */
    void editMessage(int index, String task) {
        note.set(index, task);

    }

    void print() {
        for (String aNote : note) {
            System.out.println(aNote);
        }


    }

}
