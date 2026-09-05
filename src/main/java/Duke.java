public class Duke {
    private String commandType = "";

    /**
     * Simulates generating a response and determining the command type.
     */
    public String getResponse(String input) {
        String lowerInput = input.toLowerCase();

        if (lowerInput.startsWith("add")) {
            commandType = "AddCommand";
            return "Got it. I've added this task: " + input.substring(3).trim();
        } else if (lowerInput.startsWith("delete")) {
            commandType = "DeleteCommand";
            return "Noted. I've removed this task.";
        } else if (lowerInput.startsWith("mark")) {
            commandType = "ChangeMarkCommand";
            return "Nice! I've marked this task as done.";
        } else {
            commandType = "UnknownCommand";
            return "Duke heard: " + input;
        }
    }

    public String getCommandType() {
        return commandType;
    }
}
