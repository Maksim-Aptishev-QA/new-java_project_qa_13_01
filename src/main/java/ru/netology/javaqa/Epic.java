package ru.netology.javaqa;

public class Epic extends Task {
    public String[] getSubtasks() {
        return subtask;
    }

    protected String[] subtask;

    public Epic(int id, String[] subtasks ) {
        super(id);
        this.subtask = subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtask)
            if (subtasks.contains(query)) {
                return true;
            }
            return false;
        }
    }

