package com.aditya;

public class TaskLinkedList {
    private TaskNode head;

    // Add task at end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + task);
    }

    // Traverse list
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Search by taskId
    public Task searchTask(int id) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Delete by taskId
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.getTaskId() == id) {
            System.out.println("Deleted: " + head.task);
            head = head.next;
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == id) {
                System.out.println("Deleted: " + current.next.task);
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found with ID " + id);
    }
}
